package com.iamvickyav.EntityMappingDemo.dao

import com.iamvickyav.EntityMappingDemo.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentDao extends JpaRepository<Student, Integer> {
}