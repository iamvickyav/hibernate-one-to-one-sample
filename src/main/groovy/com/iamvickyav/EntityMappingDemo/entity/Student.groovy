package com.iamvickyav.EntityMappingDemo.entity

import com.fasterxml.jackson.annotation.JsonManagedReference

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "student")
class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    Integer sId

    @Column(name = "s_name")
    String sName

    @Column(name = "s_class")
    String sClass

    @OneToOne(mappedBy= "student")
    @JsonManagedReference
    Address address
}
