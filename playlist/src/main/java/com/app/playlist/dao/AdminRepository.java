package com.app.playlist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.playlist.dto.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
