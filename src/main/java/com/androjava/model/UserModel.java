package com.androjava.model;

 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class UserModel 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name,email,mobile,password;

}
