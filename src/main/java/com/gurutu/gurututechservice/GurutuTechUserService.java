package com.gurutu.gurututechservice;

import java.util.List;

import com.gurutu.gurututechentity.GurutuTechUserEntity;

public interface GurutuTechUserService {
	
	public int saveUsers(List<GurutuTechUserEntity> gurutuTechUserEntity);
	public GurutuTechUserEntity getUser(Integer userId);
	public List<GurutuTechUserEntity> getAllUSer();

}
