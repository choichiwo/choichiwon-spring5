package com.edu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.service.IF_ReplyService;

/**
 * 이 클래스는 RestFull 서비스 Endpoint(게이트웨이,URL매핑)를  만드는 클래스임.
 * 간단하게 말하면, RestAPI서버 만드는 클래스 입니다.
 * @author 최치원
 *
 */
@RestController
public class ReplyController {
	@Inject
	private IF_ReplyService replyService;
	
	@RequestMapping(value="/reply/reply_list/{bno}/{page}", method=RequestMethod.POST)
	public ResponseEntity<Map<String,Object>> reply_list() {
		//ResponseEntity는 일반 Controller클래스에서 사용했던 ResponseBody와 같은 역활.
		//URL주소가 아니고, Json데이터형으로 자료를 반환.
		Map<String,Object> dummyMap1 = new HashMap<String,Object>();
		Map<String,Object> dummyMap2 = new HashMap<String,Object>();
		Map<String,Object> dummyMap3 = new HashMap<String,Object>();
		dummyMap1.put("rno", 1);
		dummyMap1.put("reply_text", "댓글테스트1");
		dummyMap1.put("reply", "admin");
		dummyMap1.put("bno", 59);
		
		dummyMap2.put("rno", 2);
		dummyMap2.put("reply_text", "댓글테스트1");
		dummyMap2.put("reply", "admin");
		dummyMap2.put("bno", 59);
		
		dummyMap3.put("rno", 3);
		dummyMap3.put("reply_text", "댓글테스트1");
		dummyMap3.put("reply", "admin");
		dummyMap3.put("bno", 59);
		/* json데이터 출력 예 
		resultMap =
		[ //ResponseEntity형태는 대괄호는 자료를 묶어서[배열로] 반환합니다.
		{"rno":"1","reply_text":"댓글테스트1","replyer":"admin","bno":59}, //<== Map<Sring,Object>1개레코드
		{"rno":"1","reply_text":"댓글테스트2","replyer":"admin","bno":59},
		{"rno":"1","reply_text":"댓글테스트3","replyer":"admin","bno":59}
		]
		*/
	}
}
