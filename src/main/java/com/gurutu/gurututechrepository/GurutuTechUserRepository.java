package com.gurutu.gurututechrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gurutu.gurututechentity.GurutuTechUserEntity;

@Repository
public interface GurutuTechUserRepository extends JpaRepository<GurutuTechUserEntity, Integer> {

	public GurutuTechUserEntity findAllByUserId(Integer userId);
}
