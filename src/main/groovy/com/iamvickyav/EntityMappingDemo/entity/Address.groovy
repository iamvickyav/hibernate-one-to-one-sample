package com.iamvickyav.EntityMappingDemo.entity

import com.fasterxml.jackson.annotation.JsonBackReference

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "address")
class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    Integer id

    @Column
    String street

    @Column
    String city

    @Column
    Integer pincode

    @JoinColumn(name = "stud_id", referencedColumnName = "s_id")
    @OneToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    Student student
}
