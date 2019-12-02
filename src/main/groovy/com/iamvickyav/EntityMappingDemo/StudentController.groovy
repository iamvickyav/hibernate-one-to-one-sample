package com.iamvickyav.EntityMappingDemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {

    @Autowired
    StudentDao studentDao

    @Autowired
    AddressDao addressDao

    @RequestMapping(value = "/stud/all", method = RequestMethod.GET)
    def getAllStudents() {
        studentDao.findAll()
    }

    @RequestMapping(value = "/address/all", method = RequestMethod.GET)
    def getAllAddress() {
        addressDao.findAll()
    }
}
