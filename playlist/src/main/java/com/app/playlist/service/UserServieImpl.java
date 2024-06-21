package com.app.playlist.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.playlist.dao.PlaylistRepository;
import com.app.playlist.dao.UserRepository;
import com.app.playlist.dto.Playlist;
import com.app.playlist.dto.User;
import com.app.playlist.exception.UserException;
@Service
public class UserServieImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	PlaylistRepository playlistRepository;

	@Override
	public User createUser(User user) throws UserException, SQLException {
		// TODO Auto-generated method stub
		if(user==null) {
			throw new UserException("User cannot be null");
		}
		/*
		 * Optional<User> foundUser=this.userRepository.findById(user.getUserId());
		 * if(!foundUser.isEmpty()) { throw new UserException("User already exists");
		 * 
		 * }
		 */
		
		User saveUser=this.userRepository.save(user);
		return saveUser;
		
	}

	@Override
	public User getUserById(Integer userId) throws UserException, SQLException {
		// TODO Auto-generated method stub
		Optional<User> user=this.userRepository.findById(userId);
		if(user.isEmpty()) {
			throw new UserException("Given user id does not exist");
		}
			else
			{
		// TODO Auto-generated method stub
		return user.get();
			}
	}
	

	@Override
	public void deleteUserById(Integer userId) throws UserException, SQLException {
		// TODO Auto-generated method stub
		Optional<User> user =this.userRepository.findById(userId);
		if(user.isEmpty()) {
			throw new UserException("Given User id does not exist");
		}
		else
		{
			 this.userRepository.deleteById(userId);
		}
		
		
		
	}

	@Override
	public List<User> getAllUser() throws UserException, SQLException {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}

}
