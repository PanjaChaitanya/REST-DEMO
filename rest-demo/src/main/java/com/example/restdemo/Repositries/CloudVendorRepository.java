package com.example.restdemo.Repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restdemo.Model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
