package com.company;

public class Person {
    public String title;
    public String givenName;
    public String middleName;
    public String familyName;
    

    public String name() {
        return this.givenName + " " + this.middleName + " " + this.familyName;
    }
}
