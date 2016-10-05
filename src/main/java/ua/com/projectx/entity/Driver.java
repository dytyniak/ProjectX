package ua.com.projectx.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Driver extends AbstractPersistable<Integer> {

	private static final long serialVersionUID = 7106132631371844913L;
	
	private String username;
    private String firstName;
    private String lastName;
    private String longitude;
    private String latitude;
    @ManyToOne
	@JoinColumn(name="automotiveEnterprice_id")
    private AutomotiveEnterprice automotiveEnterprice;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
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
}
