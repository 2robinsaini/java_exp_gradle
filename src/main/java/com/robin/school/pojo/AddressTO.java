package com.robin.school.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressTO {

    @JsonProperty("address_id")
    private Integer addressId;

    @JsonProperty("house_flat_number")
    private Integer houseFlatNum;

    @JsonProperty("floor_number")
    private Integer floorNum;

    @JsonProperty("street_or_society")
    private String streetOrSociety;

    private Integer sector;

    private String city;

    @JsonProperty("state_name")
    private String stateName;

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

    @JsonProperty("pin_number")
    private Long pinNum;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}
