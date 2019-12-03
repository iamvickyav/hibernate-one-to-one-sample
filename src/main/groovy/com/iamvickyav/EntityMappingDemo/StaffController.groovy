package com.iamvickyav.EntityMappingDemo

import com.iamvickyav.EntityMappingDemo.dao.BankDao
import com.iamvickyav.EntityMappingDemo.dao.StaffDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class StaffController {

    @Autowired
    StaffDao staffDao

    @Autowired
    BankDao bankDao

    @RequestMapping(value = "/staff/all", method = RequestMethod.GET)
    def getAllStaffDetails() {
        staffDao.findAll()
    }

    @RequestMapping(value = "/staff/bank/all", method = RequestMethod.GET)
    def getAllStaffBankDetails() {
        bankDao.findAll()
    }
}
