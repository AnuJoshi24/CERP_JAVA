package com.anupama.cerp.repository;

import com.anupama.cerp.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Long>{
    Admin findByEmailAndPassword(String email , String password);
    Optional<Admin> findByEmail(String email);

}