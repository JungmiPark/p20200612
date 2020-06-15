package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.vo.BoardVO;


public interface BoardDAO {
	public int insertBoard(BoardVO obj); //글쓰기
	public List<BoardVO> selectBoard(HashMap<String, Object> map);
	public BoardVO selectBoardOne(int no);
	public int updateBoard(BoardVO obj);
	public int deleteBoard(BoardVO obj);
	
	public int countBoard(); //전체 게시글 수 구하기
	public int updateHit(int no);// 조회수 - 글번호가 넘어오면 1증가
	
	public int insertBatch(List<BoardVO> list);
	
	public BoardVO selectBoardImg(int no);
	public List<BoardVO> selectBoardList(HashMap<String, Object> map);
	}