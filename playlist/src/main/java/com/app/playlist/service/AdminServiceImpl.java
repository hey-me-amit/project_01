package com.app.playlist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.playlist.dao.AdminRepository;
import com.app.playlist.dto.Admin;
import com.app.playlist.exception.AdminException;





@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin addAdmin(Admin admin) throws AdminException {
		if (admin == null)
			throw new AdminException("Admin cant be null");
		return adminRepository.save(admin);

	}

		// TODO Auto-generated method stub
	
	

	@Override
	public void deleteAdminById(Integer id) {
		
		// TODO Auto-generated method stub
	    this.adminRepository.deleteById(id);
	}

	@Override
	public Admin updateAdminById(Admin admin) throws AdminException {
		Integer id = admin.getAdminId();
		if (adminRepository.existsById(id)) {
			adminRepository.save(admin);
		} else {
			throw new AdminException("No customer with the data exists to be updated!! Create new Admin ");
		}
		return admin;
	}
		// TODO Auto-generated method stub
	

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return this.adminRepository.findAll();
	}

	@Override
	public Optional<Admin> getAdminById(Integer id) throws AdminException {
		Optional<Admin> admin = adminRepository.findById(id);
		if (admin.isEmpty()) {
			throw new AdminException("Admin with admin id " + id + " does not exist");
		}
		return admin;
	}
		// TODO Auto-generated method stub
		
	

}
