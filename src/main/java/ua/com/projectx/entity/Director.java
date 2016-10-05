package ua.com.projectx.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Director extends AbstractPersistable<Integer> {

	private static final long serialVersionUID = 7106132631371844913L;
	
	private String username;
	private String password;
    private String firstName;
    private String lastName;
    @OneToOne
    private AutomotiveEnterprice automotiveEnterprice;

    public AutomotiveEnterprice getAutomotiveEnterprice() {
		return automotiveEnterprice;
	}

	public void setAutomotiveEnterprice(AutomotiveEnterprice automotiveEnterprice) {
		this.automotiveEnterprice = automotiveEnterprice;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
