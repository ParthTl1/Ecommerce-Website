package com.oops.project.dto.user;

import com.oops.project.enums.Role;

public class UserCreateDto {

    private String firstName;
    private String lastName;
    private String email;
    private Role role;
    private String password;
    private Double wallet;
    private String address;
    private Long number;
    
    
    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	public Long getNumberLong() {
		return numberLong;
	}

	public void setNumberLong(Long numberLong) {
		this.numberLong = numberLong;
	}

	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}

	private String addressString;
    private Long numberLong;

    public double getWallet() {
		return wallet;
	}

	public void setWallet(double wallet) {
		this.wallet = wallet;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
