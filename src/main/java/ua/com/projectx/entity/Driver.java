package ua.com.projectx.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.annotation.Transient;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Driver extends AbstractPersistable<Integer> {

	private static final long serialVersionUID = 7106132631371844913L;
	
	private String username;
    private String firstName;
    private String lastName;
    private String longitude;
    private String latitude;
    private String machineId;
    @Transient
    private byte[] image;
    @ManyToOne
	@JoinColumn(name="automotiveEnterprice_id")
    private AutomotiveEnterprice automotiveEnterprice;

    @ManyToOne
    @JoinColumn(name="route_id")
    @JsonBackReference
    private Route route;

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

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }
}
