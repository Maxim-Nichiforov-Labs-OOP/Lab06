package com.company;

import com.company.Utils.*;
import java.util.Date;


public class Person {
    public String title;
    //public String givenName;
    //public String middleName;
    //public String familyName;
    public Date birthDate;
    public Gender gender;
    public Phone phone;

    public FullName name;
    public Address homeAddress;
    

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
}
