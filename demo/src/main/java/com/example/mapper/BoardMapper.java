package com.example.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import com.example.vo.BoardVO;

public interface BoardMapper {

		@Delete("DELETE FROM BOARD WHERE BRD_NO = #{obj.brd_no}") //.XML 역할
		public int deleteBoard(@Param("obj") BoardVO obj); //DAO역할
		
		//@Insert
		
		//@Select
		
		//@Update
}
