package com.robin.school.util;

import com.robin.school.pojo.Address;
import com.robin.school.pojo.AddressTO;

public class SchoolUtils {

    public static Address getAddressFromAddressTO(AddressTO addressTO){
        Address address = new Address();
        address.setCity(addressTO.getCity());
        address.setFloorNum(addressTO.getFloorNum());
        address.setHouseFlatNum(addressTO.getHouseFlatNum());
        address.setPinNum(addressTO.getPinNum());
        address.setSector(addressTO.getSector());
        address.setStateName(addressTO.getStateName());
        address.setStreetOrSociety(addressTO.getStreetOrSociety());
        return address;
    }



    public static Address updateAddressFromAddressTO(Address addressDB, AddressTO address) {
        addressDB.setCity(address.getCity());
        addressDB.setFloorNum(address.getFloorNum());
        addressDB.setHouseFlatNum(address.getHouseFlatNum());
        addressDB.setPinNum(address.getPinNum());
        addressDB.setSector(address.getSector());
        addressDB.setStateName(address.getStateName());
        addressDB.setStreetOrSociety(address.getStreetOrSociety());
        return addressDB;
    }
}
