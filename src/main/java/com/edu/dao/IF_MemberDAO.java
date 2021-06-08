package com.edu.dao;

import java.util.List;

import com.edu.vo.MemberVO;

/**
 * 이 인터페이스는 회원관리에 관련된 CRUD 메서드 명세가 포함되는 파일.
 * 이 인터페이스는 메서드명만 있고, {구현내용} 이 없는 목록파일.
 * @author 최치원
 *
 */
public interface IF_MemberDAO {
	//List<제네릭타입> : MemberVO1개레코드를 List클래스형 감싸주면
	//다수의 레코드를 지정할 수 가 있는 형태가 됩니다.
	public List<MemberVO> selectMember() throws Exception;
}