package com.app.playlist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.playlist.dto.Admin;
import com.app.playlist.exception.AdminException;
@Service
public interface AdminService {
	public Admin addAdmin(Admin admin) throws AdminException;
	public void deleteAdminById(Integer id);
	public Admin updateAdminById(Admin admin) throws AdminException;
	public List<Admin> getAllAdmins();
	public Optional<Admin> getAdminById(Integer id) throws AdminException;
	


}
