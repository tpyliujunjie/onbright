package com.bright.apollo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bright.apollo.feign.FeignUserClient;
import com.bright.apollo.response.ResponseEnum;
import com.bright.apollo.response.ResponseObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

/**
 * @Title:
 * @Description:
 * @Author:JettyLiu
 * @Since:2018年3月10日
 * @Version:1.1.0
 */
@Api("user Controller")
@RequestMapping("user")
@RestController
public class UserController {
	private Logger logger = Logger.getLogger(getClass());
	@Autowired
	private FeignUserClient feignUserClient;

	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "register user", httpMethod = "GET", produces = "application/json")
	@ApiResponse(code = 200, message = "success", response = ResponseObject.class)
	@GetMapping("/register/{mobile}")
	public ResponseObject register(@PathVariable String mobile) {
		ResponseObject res = null;
		try {
			res = feignUserClient.register(mobile);
			return res;
		} catch (Exception e) {
			logger.error(e.getMessage());
			res = new ResponseObject();
			res.setCode(ResponseEnum.RequestTimeout.getCode());
			res.setMsg(ResponseEnum.RequestTimeout.getMsg());
			return res;
		}
	}

	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "forget password", httpMethod = "GET", produces = "application/json")
	@ApiResponse(code = 200, message = "success", response = ResponseObject.class)
	@GetMapping("/forget/{mobile}")
	public ResponseObject forget(@PathVariable String mobile) {
		ResponseObject res = null;
		try {
			res = feignUserClient.forget(mobile);
			return res;
		} catch (Exception e) {
			logger.error(e.getMessage());
			res = new ResponseObject();
			res.setCode(ResponseEnum.RequestTimeout.getCode());
			res.setMsg(ResponseEnum.RequestTimeout.getMsg());
			return res;
		}
	}

	   

}
