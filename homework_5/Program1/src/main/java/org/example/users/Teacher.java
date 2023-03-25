package org.example.users;

import java.util.Date;
import java.util.List;

public class Teacher extends User{
    public List<String> subjects;

    public Teacher(int id, String firstLastName, Date dateBirth, List<String> subjects) {
        super(id, firstLastName, dateBirth);
        this.subjects = subjects;
    }
}
