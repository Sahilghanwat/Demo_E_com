package com.demo_ecom_info.model;

import com.ecommers.system.model.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Records")
public class User {
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @Column(name="name")
 private String name;
 @Column(name="email")
 private String email;
 @Column(name="password")
 private String password;

 @ManyToOne
 private Role role;
}
