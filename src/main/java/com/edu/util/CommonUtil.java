package com.edu.util;

import org.springframework.stereotype.Component;

/**
 * 이 클래스는 이 프로젝트에서 공통으로 사용하는 유틸리티기능을 모아놓은 클래스.
 * @author 최치원
 * 컨트롤러 기능 @Controller(jsp와 바인딩명시)
 * 콤포넌트 @Component는 MVC가 아닌 기능들을 모아놓은 스프링빈 메서드
 */
@Component
public class CommonUtil {
	//RestAPI서버 맛보기 @RestCOntroller
	@RequestMapping(value="/id_check", method=RequestMethod.GET)
	public 
}
