package com.iamvickyav.EntityMappingDemo

import com.iamvickyav.EntityMappingDemo.entity.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressDao extends JpaRepository<Address, Integer>{
}
