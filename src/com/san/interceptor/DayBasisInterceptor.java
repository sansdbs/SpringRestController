package com.san.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayBasisInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar cal = Calendar.getInstance();

		int holiday = cal.get(cal.DAY_OF_WEEK);

		if (holiday == 1) {

			response.getWriter().write("<center><h2>This webside is closed today for mentainance.. please try another day......</h2></center>");
			return false;
		}

		return true;

	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		System.out.println("HandlerInterceptorAdaptor:Spring mvc called postHandle method for"+ request.getRequestURI().toString());

	}

 	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("HandlerInterceptorAdaptor:Spring mvc called afterCompletion method for"+ request.getRequestURI().toString());

	}
 
}