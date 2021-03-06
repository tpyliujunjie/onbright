package com.bright.apollo.redis;
/**
 * @Title: RedisBussines.java 
 * @Package com.bright.apollo.redis  
 * @Description: TODO 
 * @author Liujj
 * @date 2017骞�10鏈�30鏃� 涓嬪崍3:49:26
 * @version V1.0   
 * @param <T>
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by on 2017/3/1.
 */
@Component
public class RedisBussines {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

     
    public void delete(String... key){
        if(key!=null && key.length > 0){
            if(key.length == 1){
                redisTemplate.delete(key[0]);
            }else{
                redisTemplate.delete(Arrays.asList(key));
            }
        }
    }


   
    public void setValueWithExpire(String key, Object value, long time){
        redisTemplate.opsForValue().set(key, value.toString());
        if(time > 0){
            redisTemplate.expire(key, time, TimeUnit.SECONDS);
        }
    }

  
    public void set(String key, Object value){
        redisTemplate.opsForValue().set(key, value.toString());
    }

  
    public String get(String key){
        return (String) redisTemplate.opsForValue().get(key);
    }

   
    public double decr(String key, double by){
        return redisTemplate.opsForValue().increment(key, -by);
    }
 
    public double incr(String key, double by){
        return redisTemplate.opsForValue().increment(key, by);
    }

  
    public <T> void setMapWithExpire(String key, Map<String, Object> map, long time){
        redisTemplate.opsForHash().putAll(key, map);
        if(time > 0){
            redisTemplate.expire(key, time , TimeUnit.SECONDS);
        }
    }

   
    public <T> void setMap(String key, Map<String, Object> map){
        redisTemplate.opsForHash().putAll(key, map);
    }

   
    public Map<String, Object> getMap(String key){
        HashOperations<String, String, Object> hashOperations = redisTemplate.opsForHash();
        Map<String, Object> map = hashOperations.entries(key);
        return map;
    }

    
    public void expire(String key, long time) {
             redisTemplate.expire(key, time, TimeUnit.SECONDS);
     }

     //插入list
     public <T> void  setList(String listName,List<T> list){
         List<T> redisList = (List<T>)redisTemplate.opsForValue().get(listName);
         if (redisList !=null){
             redisTemplate.delete(listName);
         }
         for( T t :list){
             redisTemplate.opsForList().rightPush(listName,t);
         }
     }

    //取list
     public <T> List<T> getList(String listName){
        return (List<T>)redisTemplate.opsForList().range(listName,0,-1);
     }
}