package com.examly.springapp.controller;

import com.examly.springapp.model.AdminUser;
import com.examly.springapp.repository.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminUserController {
    
    @Autowired
    private AdminUserRepository adminUserRepository;
    
    @PostMapping("/create")
    public AdminUser addAdmin(@RequestBody AdminUser adminUser) {
        return adminUserRepository.save(adminUser);
    }
    
    @GetMapping("/{id}")
    public AdminUser getAdminById(@PathVariable Long id) {
        return adminUserRepository.findById(id).orElse(null);
    }
    
    @PutMapping("/{id}")
    public AdminUser updateAdmin(@PathVariable Long id, @RequestBody AdminUser adminUser) {
        adminUser.setId(id);
        return adminUserRepository.save(adminUser);
    }
    
    @GetMapping
    public List<AdminUser> getAllAdmins() {
        return adminUserRepository.findAll();
    }
}