package com.robin.school.service;

import com.robin.school.pojo.Address;
import com.robin.school.pojo.AddressTO;

import java.util.List;

public interface SchoolService {
    List<Address> getAddressDetails();

    Address addAddressDetails(AddressTO address);

    Address updateAddressDetails(AddressTO address) throws Exception;
    List<String> getCitySectorDetails();

}
