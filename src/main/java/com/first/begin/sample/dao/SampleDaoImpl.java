package com.first.begin.sample.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("sampleDao")
public class SampleDaoImpl implements SampleDao {

	@Autowired
	protected SqlSessionTemplate sqlSession;
	
	@Override
	public String selectSampleData() throws Exception {
		return sqlSession.selectOne("spl.selectDisposableTable");
	}

}
