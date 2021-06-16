package com.edu.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.edu.vo.BoardTypeVO;

/**
 * 이 클래스는 게시판생성관리 쿼리의 인터페이스를 구현메서드가 있는 클래스 입니다.
 * @author user
 *
 */
@Repository
public class BoardTypeDAOImpl implements IF_BoardTypeDAO {
	//sqlSession탬플릿(틀) 의존성을 주입
	@Inject //자바8부터 신규로 나온 애노테이션 입니다.
	private SqlSession sqlSession;

	@Override
	public void deleteBoardType(String board_type) throws Exception {
		// TODO sqlSession탬플릿(틀)을 이용해서 매퍼쿼를 실행
		sqlSession.delete("boardTypeMapper.delteBoardType", board_type);
		//
	}

	@Override
	public void updateBoardType(BoardTypeVO boardTypeVO) throws Exception {
		// TODO 아래 주석 동일
		sqlSession.update("boardTypeMapper.updateVOardType", boardTypeVO);
	}

	@Override
	public BoardTypeVO readBOardType(String board_type) throws Exception {
		// TODO 아래 주석 동일
		return sqlSession.selectOne("boarTypeMapper.readBoardType", board_type);
	}

	@Override
	public void insertBoardType(BoardTypeVO boardTypeVO) throws Exception {
		// TODO 아래 주석 동일
		sqlSession.insert("boardTypeMapper.insertBoardType", boardTypeVO);
		
	}

	@Override
	public List<BoardTypeVO> selectBoardType() throws Exception {
		// TODO 매퍼쿼리를 실행 sqlSession탬플릿(틀)을 이용해서
		return sqlSession.selectList("boardTypeMapper.selectBoardType");
	}

}
