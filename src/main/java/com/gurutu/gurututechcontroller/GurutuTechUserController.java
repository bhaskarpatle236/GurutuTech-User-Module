package com.gurutu.gurututechcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gurutu.gurututechentity.GurutuTechUserEntity;
import com.gurutu.gurututechservice.GurutuTechUserService;

@RestController
@RequestMapping("/gurutuTechUser")
public class GurutuTechUserController {

	
	@Autowired
	GurutuTechUserService gts;

	@PostMapping("/addUsers")
	private ResponseEntity<String> addUsers(@RequestBody List<GurutuTechUserEntity> users)
	{
		if(!users.isEmpty())
		{
			gts.saveUsers(users);
			return new ResponseEntity<String>("All Users added succesfully", HttpStatus.CREATED);
			
		}
		return new ResponseEntity<String>("No users to add", HttpStatus.BAD_REQUEST);
		
	}
	
	@GetMapping("getUser/{userId}")
	private ResponseEntity<GurutuTechUserEntity> getUser(@PathVariable Integer userId )
	{
		if(userId!= null)
		{
			GurutuTechUserEntity gte=gts.getUser(userId);
			return new ResponseEntity<GurutuTechUserEntity>(gte, HttpStatus.CREATED);
		}
		return null;
		
	}
	
	@GetMapping("/getAllData")
	private ResponseEntity<List<GurutuTechUserEntity>> getAllUSer()
	
	{
		List<GurutuTechUserEntity> entities=gts.getAllUSer();
		
		return new ResponseEntity<List<GurutuTechUserEntity>>(entities, HttpStatus.CREATED);
		
	}
}
