package com.app.playlist.contoller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.playlist.dto.User;
import com.app.playlist.exception.UserException;
import com.app.playlist.service.UserService;


@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("user/{id}")
	public User getUserById(@PathVariable("id") Integer id) throws UserException, SQLException {
		return this.userService.getUserById(id);
	}
	@PostMapping("user")
	public User addUser(@RequestBody User user) throws UserException, SQLException{
		return this.userService.createUser(user);
	}
	@GetMapping("user/All")
	public List<User> getAllUser() throws UserException, SQLException
	{
		return this.userService.getAllUser();
	}
	@DeleteMapping("user/{id}")
	public void deleteUserById(@PathVariable("id") Integer id) throws UserException, SQLException
	{
		this.userService.deleteUserById(id);
	}
	

}