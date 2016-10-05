package ua.com.projectx.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="automotive_enterprice")
public class AutomotiveEnterprice extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -8198676194021334088L;

	private String name;
	@OneToOne(mappedBy = "automotiveEnterprice")
	@JoinColumn(name="director_id")
	private Director director;
	@OneToMany(mappedBy = "automotiveEnterprice")
	private List<Driver> drivers;
	@OneToMany(mappedBy = "automotiveEnterprice")
	private List<Driver> routes;
	private String city;
	private String street;
	private String building;
	private String phoneNumber;
	private String email;
	
	
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
