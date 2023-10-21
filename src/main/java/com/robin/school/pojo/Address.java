package com.robin.school.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "address")
@Data
public class Address implements Serializable {

    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    @Column(name = "house_flat_number")
    private Integer houseFlatNum;

    @Column(name = "floor_number")
    private Integer floorNum;

    @Column(name = "street_or_society")
    private String streetOrSociety;

    private Integer sector;
    private String city;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "pin_number")
    private Long pinNum;


    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getHouseFlatNum() {
        return houseFlatNum;
    }

    public void setHouseFlatNum(Integer houseFlatNum) {
        this.houseFlatNum = houseFlatNum;
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
    }

    public String getStreetOrSociety() {
        return streetOrSociety;
    }

    public void setStreetOrSociety(String streetOrSociety) {
        this.streetOrSociety = streetOrSociety;
    }

    public Integer getSector() {
        return sector;
    }

    public void setSector(Integer sector) {
        this.sector = sector;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Long getPinNum() {
        return pinNum;
    }

    public void setPinNum(Long pinNum) {
        this.pinNum = pinNum;
    }
}
