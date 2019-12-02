create table student (
	s_id int PRIMARY KEY AUTO_INCREMENT,
	s_name varchar(20) NOT NULL,
	s_class varchar(20)
);

create table address (
	address_id int PRIMARY KEY AUTO_INCREMENT,
    street varchar(40) NOT NULL,
    city varchar(40) NOT NULL,
    pincode int,
    stud_id int,
    FOREIGN KEY (stud_id) REFERENCES student(s_id)
);

create table staff (
	staff_id int PRIMARY KEY AUTO_INCREMENT,
	staff_name varchar(20) NOT NULL,
	staff_dept varchar(20) NOT NULL
);

create table bank_details (
	staff_id int PRIMARY KEY,
	account_number varchar(20) NOT NULL,
	ifsc_code varchar(20) NOT NULL,
	bank_name varchar(20) NOT NULL
);