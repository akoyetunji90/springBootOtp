package com.zeedlabs.productmanager.crud;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	
	public static void main (String[] args) {
	BCryptPasswordEncoder passwordEncoder = new  BCryptPasswordEncoder();
String rawPassword = "seun";
String encodedPassword = passwordEncoder.encode(rawPassword);

System.out.println(encodedPassword);
}
 }
