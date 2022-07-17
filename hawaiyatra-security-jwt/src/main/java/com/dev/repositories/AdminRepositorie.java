package com.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.models.AdminDetails;


public interface AdminRepositorie extends JpaRepository<AdminDetails, String>  {

}
