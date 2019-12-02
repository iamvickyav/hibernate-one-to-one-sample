package com.iamvickyav.EntityMappingDemo.entity

import com.fasterxml.jackson.annotation.JsonBackReference

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "bank_details")
class BankDetails {

    @Id
    @Column(name = "staff_id")
    Integer id

    @Column(name = "account_number")
    String accountNumber

    @Column(name = "ifsc_code")
    String ifsc

    @Column(name = "bank_name")
    String bankName

    @OneToOne(mappedBy="bankDetails", cascade= CascadeType.ALL)
    @JsonBackReference
    Staff staff
}
