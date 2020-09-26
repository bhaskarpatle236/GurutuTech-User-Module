package com.gurutu.gurututechserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurutu.gurututechentity.GurutuTechUserEntity;
import com.gurutu.gurututechrepository.GurutuTechUserRepository;
import com.gurutu.gurututechservice.GurutuTechUserService;

@Service
public class GurutuTechUserServiceImpl implements GurutuTechUserService {
	
	@Autowired
	GurutuTechUserRepository gtr;

	@Override
	public int saveUsers(List<GurutuTechUserEntity> gurutuTechUserEntity) {
		
		gtr.saveAll(gurutuTechUserEntity);
		
		return 1;
	}

	@Override
	public GurutuTechUserEntity getUser(Integer userId) {
		GurutuTechUserEntity gt= gtr.findAllByUserId(userId);
		return gt;
	}

}
