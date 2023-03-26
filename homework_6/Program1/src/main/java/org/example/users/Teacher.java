package org.example.users;

import java.util.Date;
import java.util.List;

/**
 * Single responsibility principle (принцип единственной ответственности)
 * Класс Teacher наследуется от User и только этот класс имеет в качестве поля список предметов, который актуален для преподавателя
 */

/**
 * Liskov substitution principle (принцип подстановки Лисков)
 * Родительский класс имеет только самые общие поля, которые будут справедливы для всех наследников
 * (фамилия имя и дата рождения),
 * а уже наследники добавляют свой расширенный функционал
 */
public class Teacher extends User{
    public List<String> subjects;

    public Teacher(int id, String firstLastName, Date dateBirth, List<String> subjects) {
        super(id, firstLastName, dateBirth);
        this.subjects = subjects;
    }
    public double getSalary(double bid){
        return bid;
    }
}

/**
 * Open-closed principle (принцип открытости/закрытости)
 * Добавил наследников в виде учителя кандидата наук и учителя профессора,
 * у каждого растет ставка по зарплате от его ученой степени
 */
class PhDTeacher extends Teacher{

    public PhDTeacher(int id, String firstLastName, Date dateBirth, List<String> subjects) {
        super(id, firstLastName, dateBirth, subjects);
    }

    @Override
    public double getSalary(double bid) {
        return super.getSalary(bid) * 1.1;
    }
}
class Professor extends PhDTeacher{

    public Professor(int id, String firstLastName, Date dateBirth, List<String> subjects) {
        super(id, firstLastName, dateBirth, subjects);
    }

    @Override
    public double getSalary(double bid) {
        return super.getSalary(bid) * 1.15;
    }
}
