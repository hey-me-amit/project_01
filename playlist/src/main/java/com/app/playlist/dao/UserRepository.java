package com.app.playlist.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.playlist.dto.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	

}
