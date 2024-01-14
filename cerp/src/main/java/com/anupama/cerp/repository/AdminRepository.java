package com.anupama.cerp.repository;

import com.anupama.cerp.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long>{
    Admin findByEmailAndPassword(String email , String password);

}