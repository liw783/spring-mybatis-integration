package com.liw.persistence;

import java.util.List;
import java.util.Map;

import com.liw.model.AppFdRrUser;
import com.liw.model.AppFdRrUserExample;
import com.liw.model.AppFdRrUserWithBLOBs;

public interface AppFdRrUserMapper {
	
	
	
    int countByExample(AppFdRrUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppFdRrUserWithBLOBs record);

    int insertSelective(AppFdRrUserWithBLOBs record);

    List<AppFdRrUserWithBLOBs> selectByExampleWithBLOBs(AppFdRrUserExample example);

    List<AppFdRrUser> selectByExample(AppFdRrUserExample example);

    AppFdRrUserWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AppFdRrUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AppFdRrUserWithBLOBs record);

    int updateByPrimaryKey(AppFdRrUser record);
	
    
    
}