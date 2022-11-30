package com.surya.controllers;

import java.net.BindException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.surya.domain.User;

public class SimpleFController extends SimpleFormController {
	@Override
	protected Map referenceData(HttpServletRequest httpServletRequest)
	{
		Map<String,Object> map=new HashMap<String, Object>();
		return map;
		
	}
	@Override
	protected org.springframework.web.servlet.ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, org.springframework.validation.BindException errors)
			throws Exception {
		User user=(User) command;
		return new org.springframework.web.servlet.ModelAndView("registrationdetails","user",user);
	}

}
