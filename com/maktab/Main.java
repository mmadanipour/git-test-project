package com.maktab;

import com.maktab.entitiy.Person;
import com.maktab.entitiy.Student;
import com.maktab.entitiy.Teacher;

import java.util.Arrays;
import java.util.List;

/*
 * @author M.Madanipour
 */
public class Main {


    public static void main(String[] args) {

        Student student = new Student();
        Teacher teacher = new Teacher();
        List<Person> personList = Arrays.asList(teacher, student);

        for (Person p:
                personList) {
            p.introduceYourself();
        }

    }
}
