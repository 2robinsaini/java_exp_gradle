package com.robin.school.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SchoolDaoImpl{

    @Autowired
    private DataSource dataSource;

    @Cacheable(value = "address")
    public List<String> getAddressList(){
        List<String> result = new ArrayList<>();
        try {
           ResultSet rs = dataSource.getConnection().prepareStatement("select * from address").executeQuery();
           while(rs.next()){
               result.add(rs.getString("sector")+" "+ rs.getString("city"));
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;

    }

}
