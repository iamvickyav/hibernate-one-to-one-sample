package com.iamvickyav.EntityMappingDemo.dao

import com.iamvickyav.EntityMappingDemo.entity.BankDetails
import org.springframework.data.jpa.repository.JpaRepository

interface BankDao extends JpaRepository<BankDetails, Integer>{
}