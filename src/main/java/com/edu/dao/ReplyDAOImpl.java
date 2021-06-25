package com.edu.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.edu.vo.PageVO;
import com.edu.vo.ReplyVO;

/**
 * 이 클래스는 sqlSession탬플릿을 이용해서 쿼리를 실행하는 클래스입니다.
 * @author 최치원
 *
 */
@Repository 
public class ReplyDAOImpl implements IF_ReplyDAO{
	@Inject//자바8부터 지원됨, 이전@Autowired, @Resource 스프링빈을 주입
	private SqlSession sqlSession;
	
	@Override
	public void deleteReplyAll(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteReply(Integer rno) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReply(ReplyVO replyVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void replyCountUpdate(Integer bno, int count) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertReply(ReplyVO replyVO) throws Exception {
		// TODO 아래와 동일
		sqlSession.insert("replyMapper.insertReply", replyVO);
	}

	@Override
	public int countReply(Integer bno) throws Exception {
		// TODO 아래와 동일
		return sqlSession.selectOne("replyMapper.countReply", bno);
	}

	@Override
	public List<ReplyVO> selectReply(PageVO pageVO) throws Exception {
		// TODO sqlSession탬플릿사용("매퍼쿼리명","매개변수명")
		return sqlSession.selectList("replyMapper.selectReply", pageVO);
	}

}
