package com.app.playlist.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.playlist.dto.Admin;
import com.app.playlist.exception.AdminException;
import com.app.playlist.service.AdminService;


@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping("admin")
	public Admin addAdmin(@RequestBody Admin admin) throws AdminException {
		return this.adminService.addAdmin(admin);
	}

	@GetMapping("admin/{id}")
	public Optional<Admin> getAdmin(@PathVariable("id") Integer id) throws AdminException {
		return this.adminService.getAdminById(id);
	}

	

	@DeleteMapping("deleteAdmin/{id}")
	public void deleteAdmin(@PathVariable("id") Integer id) {
		this.adminService.deleteAdminById(id);
	}
	
	@GetMapping("admins")
	public List<Admin> getAllAdmins(){
		return this.adminService.getAllAdmins();
		
	}
	

}
