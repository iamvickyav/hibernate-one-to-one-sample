# hibernate-one-to-one-sample

## One-to-One using Foreign Key reference

We have two tables student & address which shares one-to-one relationship using Foreign Key reference

```
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
```

Here is how one to one relationship is maintained in entity object

```
@Entity
@Table(name = "student")
class Student {

    ....

    @OneToOne(mappedBy= "student")
    Address address
}
```

```
@Entity
@Table(name = "address")
class Address {

    ....  

    @JoinColumn(name = "stud_id", referencedColumnName = "s_id")
    @OneToOne(cascade = CascadeType.ALL)
    Student student
}
```

## One-to-One using shared Primary Key reference

We have two more tables staff & bank_details which shares one-to-one relationship using shared Primary Key

```
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
```

```
@Entity
@Table(name = "staff")
class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    Integer id

    ....  

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    BankDetails bankDetails
}
```

```
@Entity
@Table(name = "bank_details")
class BankDetails {

    @Id
    @Column(name = "staff_id")
    Integer id

    ....  

    @OneToOne(mappedBy="bankDetails", cascade= CascadeType.ALL)
    Staff staff
}
```


