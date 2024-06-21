package com.app.playlist.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.playlist.dto.User;
import com.app.playlist.exception.UserException;

@Service
public interface UserService {
	
	
	
    User createUser(User user) throws UserException, SQLException;
	
	User getUserById(Integer userId) throws UserException, SQLException;
	
	void deleteUserById(Integer userId) throws UserException, SQLException;
	
	List<User> getAllUser() throws UserException, SQLException;
	

}