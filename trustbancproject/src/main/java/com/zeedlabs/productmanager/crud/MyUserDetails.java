/*
 * package com.zeedlabs.productmanager.crud;
 * 
 * import java.util.ArrayList; import java.util.Collection; import
 * java.util.List; import java.util.Set;
 * 
 * import org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails;
 * 
 * import com.zeedlabs.productmanager.crud.entity.Duties; import
 * com.zeedlabs.productmanager.crud.entity.Staff;
 * 
 * public class MyUserDetails implements UserDetails {
 * 
 *//**
	* 
	*//*
		 * private static final long serialVersionUID = 1L; private Staff staff;
		 * 
		 * public MyUserDetails(Staff staff) { this.staff = staff; }
		 * 
		 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
		 * 
		 * Set<Duties> duties = staff.getDuties(); List<SimpleGrantedAuthority>
		 * authorities = new ArrayList<>();
		 * 
		 * for (Duties duties1 : duties) { authorities.add(new
		 * SimpleGrantedAuthority(duties1.getName())); } return authorities; }
		 * 
		 * @Override public String getPassword() { return staff.getPassword(); }
		 * 
		 * @Override public String getUsername() { return staff.getUsername(); }
		 * 
		 * @Override public boolean isAccountNonExpired() { return true; }
		 * 
		 * @Override public boolean isAccountNonLocked() { return true; }
		 * 
		 * @Override public boolean isCredentialsNonExpired() { return true; }
		 * 
		 * @Override public boolean isEnabled() { return staff.isEnabled(); } }
		 */