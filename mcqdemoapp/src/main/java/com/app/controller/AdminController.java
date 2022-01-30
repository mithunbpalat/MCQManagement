package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Admin;
import com.app.service.AdminService;

@RestController
@CrossOrigin("*")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping(value="postadmin")
	public List<Admin> saveAdmin(@RequestBody Admin admin){
		System.out.println("Admin works");
		adminService.saveAdmin(admin);
		return adminService.getAllAdmins();
	}
	@PutMapping(value="updateadmin")
	public List<Admin> updateAdmin(@RequestBody Admin admin){
		System.out.println("Admin update works");
		adminService.updateAdmin(admin);
		return adminService.getAllAdmins();
	}
	@GetMapping(value="getalladmins")
	public List<Admin> getAllAdmin(){
		return adminService.getAllAdmins();
	}
	@DeleteMapping(value="deleteadminbyid")
	public List<Admin> deleteAdmin(@RequestParam int aid){
		adminService.deleteAdmin(aid);
		return adminService.getAllAdmins();
	}
	@GetMapping(value="getadminbyid")
	public Admin getAdminById(@RequestParam int aid){
		return adminService.findAdminByAid(aid);
	}
	@GetMapping(value="getadminbyusername")
	public Admin getAdminByUsername(@RequestParam String username){
		return adminService.findAdminByUsername(username);
	}
}
