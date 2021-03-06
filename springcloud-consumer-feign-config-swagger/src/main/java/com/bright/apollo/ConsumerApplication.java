package com.bright.apollo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;



@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrix
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

//	@Bean
//	public HttpMessageConverters fastJsonHttpMessageConverters(){
//		//1、定义convert转换消息对象
//		FastJsonHttpMessageConverter fasConverter  = new  FastJsonHttpMessageConverter();
//		//2、添加fastJson的配置信息，比如：是否要格式化返回json数据
//		FastJsonConfig fastJsonConfig = new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		//3、再convert中添加配置信息
//		List<MediaType> fastMediaTypes = new ArrayList<MediaType>();
//		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//		fasConverter.setSupportedMediaTypes(fastMediaTypes);
//		fasConverter.setFastJsonConfig(fastJsonConfig);
//		HttpMessageConverter<?> converter = fasConverter;
//		return new HttpMessageConverters(converter);
//	}
}
