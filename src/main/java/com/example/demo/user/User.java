package com.example.demo.user;

public class User {
    public User(Long id, String firstName, String lastName, String password, String createdAt, String updatedAt,
			String deletedAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
	}
    private Long id;
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public String getDeletedAt() {
		return deletedAt;
	}
	
	public void setDeletedAt(String deletedAt) {
		this.deletedAt = deletedAt;
	}
	
	private String firstName;
    
	private String lastName;
    
	private String password;
    
	private String createdAt;
    
	private String updatedAt;
    
	private String deletedAt;    
}
