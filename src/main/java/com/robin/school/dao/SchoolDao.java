package com.robin.school.dao;

import com.robin.school.pojo.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDao extends JpaRepository<Address,Integer> {
}
