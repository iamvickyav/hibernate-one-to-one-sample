package com.iamvickyav.EntityMappingDemo.dao

import com.iamvickyav.EntityMappingDemo.entity.Staff
import org.springframework.data.jpa.repository.JpaRepository

interface StaffDao extends JpaRepository<Staff, Integer>{
}
