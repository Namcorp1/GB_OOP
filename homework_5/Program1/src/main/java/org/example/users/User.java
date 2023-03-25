package org.example.users;

import java.util.Date;

abstract public class User {
    public int id;
    public String firstLastName;
    public Date dateBirth;

    public User(int id, String firstLastName, Date dateBirth) {
        this.id = id;
        this.firstLastName = firstLastName;
        this.dateBirth = dateBirth;
    }
}
