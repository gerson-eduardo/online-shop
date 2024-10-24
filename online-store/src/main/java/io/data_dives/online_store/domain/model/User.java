package io.data_dives.online_store.domain.model;

import java.time.ZonedDateTime;

import io.data_dives.online_store.domain.types.Role;
import io.data_dives.online_store.domain.types.Gender;

public class User{
	private String firstName;
	private String lastName;
	private String cpf;
	private String email;
	private String phone;
	private String username;
	private String password;
	private String address;
	private Gender gender;
	private Role role;
	private ZonedDateTime birthDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGenero() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Role getRole(){
		return role;
	}

	public void setRole(Role role){
		this.role = role;
	}

	public ZonedDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(ZonedDateTime birthDate) {
		this.birthDate = birthDate;
	}

	
	public static Builder builder(){
		return new Builder();
	}

	public static class Builder{
		private String firstName;
		private String lastName;
		private String cpf;
		private String email;
		private String phone;
		private String username;
		private String password;
		private String address;
		private Gender gender;
		private Role role;
		private ZonedDateTime birthDate;

		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public Builder setCpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}
		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		public Builder setUsername(String username) {
			this.username = username;
			return this;
		}
		public Builder etPassword(String password) {
			this.password = password;
			return this;
		}
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		public Builder etGender(Gender gender) {
			this.gender = gender;
			return this;
		}
		public Builder setRole(Role role) {
			this.role = role;
			return this;
		}
		public Builder setBirthDate(ZonedDateTime birthDate) {
			this.birthDate = birthDate;
			return this;
		}

		public User build(){
			User user = new User();
			user.setFirstName(this.firstName);
			user.setLastName(this.lastName);
			user.setCpf(this.cpf);
			user.setEmail(this.email);
			user.setPhone(this.phone);
			user.setUsername(this.username);
			user.setPassword(this.password);
			user.setAddress(this.address);
			user.setGender(this.gender);
			user.setRole(this.role);
			user.setBirthDate(this.birthDate);

			return user;
		}
	}


}
