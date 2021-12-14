package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AdminRepository;
import com.app.model.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	public Admin updateAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	public List<Admin> getAllAdmins() {
		return (List<Admin>) adminRepository.findAll();
	}
	public void deleteAdmin(int aid) {
		adminRepository.deleteById(aid);
	}
	public Admin findAdminByAid(int aid) {
		return adminRepository.findById(aid).get();
	}
	public Admin findAdminByUsername(String username) {
		return adminRepository.findByUsername(username);
	}
}
