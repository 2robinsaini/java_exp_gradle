package com.robin.school.controller;

import com.robin.school.pojo.Address;
import com.robin.school.pojo.AddressTO;
import com.robin.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "school")
public class SchoolResource {

    @Autowired
    private SchoolService schoolService;

    @GetMapping(value = "ping")
    public String health(){
        return "Application is up and time is: " + LocalDate.now().toString();
    }

    @GetMapping(value = "getAddress",produces = "application/json")
    public List<Address> getAddress(){
        return schoolService.getAddressDetails();
    }

    @GetMapping(value = "getCitySectorDetails",produces = "application/json")
    public List<String> getCitySectorDetails(){
        return schoolService.getCitySectorDetails();
    }

    @PostMapping(value = "addAddress",produces = "application/json",consumes = "application/json")
    public Address addAddress(@RequestBody AddressTO address){
        return schoolService.addAddressDetails(address);
    }

    @PutMapping(value = "updateAddress",produces = "application/json",consumes = "application/json")
    public Address updateAddress(@RequestBody AddressTO address){
        try {
            return schoolService.updateAddressDetails(address);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
