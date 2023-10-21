package com.robin.school.service;

import com.robin.school.pojo.Address;
import com.robin.school.util.SchoolUtils;
import com.robin.school.dao.SchoolDao;
import com.robin.school.dao.SchoolDaoImpl;
import com.robin.school.pojo.AddressTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

@Service
public class SchoolServiceImpl implements  SchoolService{

    @Autowired
    private SchoolDao schoolDao;

    @Autowired
    private SchoolDaoImpl schoolDaoImpl;

    @Override

    public List<Address> getAddressDetails() {
        return schoolDao.findAll();
    }

    public List<String> getCitySectorDetails() {
        return schoolDaoImpl.getAddressList();
    }

    @Override
    @CacheEvict(value = "address",allEntries = true)
    public Address addAddressDetails(AddressTO address) {
        return schoolDao.save(SchoolUtils.getAddressFromAddressTO(address));
    }

    @Override
    @CacheEvict(value = "address", allEntries = true)
    public Address updateAddressDetails(AddressTO address) throws SQLException {
        if(Objects.isNull(address.getAddressId())){
            throw new SQLException("Null Address Id");
        }
        Address addressDB = schoolDao.getReferenceById(address.getAddressId());
        return schoolDao.save(SchoolUtils.updateAddressFromAddressTO(addressDB,address));
    }
}
