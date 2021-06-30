package com.edu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 이 클래스는 스프링시큐리티의/login처리한 결과를 받아서 /login_success
 * 를 처리하는 클래스 입니다.
 * @author 최치원
 *
 */
@Controller
public class LoginController {

	@RequestMapping(value="/login_success", method=RequestMethod.GET)
	public String login_success(HttpServletRequest request, RedirectAttributes rdat) throws Exception {
		//request는 목적: 세션객체를 만들기 위해서(로그인정보를 화면이 이동하더라도 유지하기 위해서)
		//rdat의 목적: model객체로 값을 전송할 수 없는 상황일때, 값을 jsp로 전송하기 위해서
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String userid = "";
		String levels = "";
		return "";
	}
}
