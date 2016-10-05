package ua.com.projectx.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Route extends AbstractPersistable<Integer>{

	private static final long serialVersionUID = -8290791370291788951L;

	private String name;
	@ManyToOne
	@JoinColumn(name="automotive_enterprice_id")
	private AutomotiveEnterprice automotiveEnterprice;
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
}
