package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.vo.ItemVO;



@Service
@Transactional
public class ItemDAOImpl implements ItemDAO{
	
	@Autowired
	private SqlSessionFactory sqlFactory = null;

	@Override
	public int insertItem(ItemVO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ItemVO> selectItem(HashMap<String, Object> map) {
		return sqlFactory.openSession().selectList("Item.selectList", map); //.xml 파일에 설정한대로
	}

	@Override
	public ItemVO selectItemOne(int no) {
		
		return sqlFactory.openSession().selectOne("Item.selectOne", no);
	}

	@Override
	public List<ItemVO> selectItemSearch(String txt) {

		return sqlFactory.openSession().selectList("Item.selectSearch", txt);
	}
	@Override
	public int insertItemBatch(List<ItemVO> list) {
		return sqlFactory.openSession().insert("Item.insertItemBatch", list);
	}

	@Override
	public List<ItemVO> selectItemWhere(int[] itemno){
		return sqlFactory.openSession().selectList("Item.selectItemWhere", itemno);
	}
	@Override
	public int updateItemBatch(List<ItemVO> list) {		
		return sqlFactory.openSession().update("Item.updateItemBatch", list);
	}

	@Override
	public int deleteItemBatch(int[] no) {		
		return sqlFactory.openSession().delete("Item.deleteItemBatch", no);
	}
	@Override
	public int deleteItemOne(int no) {
		return sqlFactory.openSession().delete("Item.deleteItemOne", no);
	}	

}
