package ua.com.projectx.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.List;

@Entity
public class Route extends AbstractPersistable<Integer>{

	private static final long serialVersionUID = -8290791370291788951L;

	private String name;
	@ManyToOne
	@JoinColumn(name="automotive_enterprice_id")
	@JsonBackReference
	private AutomotiveEnterprice automotiveEnterprice;

	@OneToMany(mappedBy="route")
	@JsonManagedReference
	private List<Driver> drivers;

	private String originalLatitude;
	private String originalLongitude;
	private String destinationLatitude;
	private String destinationLongitude;
	
	public String getOriginalLatitude() {
		return originalLatitude;
	}
	public void setOriginalLatitude(String originalLatitude) {
		this.originalLatitude = originalLatitude;
	}
	public String getOriginalLongitude() {
		return originalLongitude;
	}
	public void setOriginalLongitude(String originalLongitude) {
		this.originalLongitude = originalLongitude;
	}
	public String getDestinationLatitude() {
		return destinationLatitude;
	}
	public void setDestinationLatitude(String destinationLatitude) {
		this.destinationLatitude = destinationLatitude;
	}
	public String getDestinationLongitude() {
		return destinationLongitude;
	}
	public void setDestinationLongitude(String destinationLongitude) {
		this.destinationLongitude = destinationLongitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}

	public AutomotiveEnterprice getAutomotiveEnterprice() {
		return automotiveEnterprice;
	}

	public void setAutomotiveEnterprice(AutomotiveEnterprice automotiveEnterprice) {
		this.automotiveEnterprice = automotiveEnterprice;
	}
}
