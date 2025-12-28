package com.examly.springapp.service;

import com.examly.springapp.model.AdminUser;
import java.util.List;

public interface AdminUserService {
    AdminUser save(AdminUser adminUser);
    AdminUser findById(Long id);
    List<AdminUser> findAll();
}