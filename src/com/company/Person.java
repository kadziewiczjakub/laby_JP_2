package com.company;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

public class Person {


    private String name;
    private String surname;
    private int age;
    private Job job;


    public Person()
    {
        Scanner in=new Scanner(System.in);
        try{
            System.out.println("Podaj imie: ");
            this.name=in.next();
            System.out.println("Podaj nazwisko: ");
            this.surname=in.next();
            System.out.println("Podaj wiek: ");
            this.age=in.nextInt();
            System.out.println("Podaj prace: ");
            this.job=Job.valueOf(in.next());
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public int hashCode() {
        int r=name.hashCode();
        r=r*31+surname.hashCode();
        r=r*31+age;
        r=r*31+job.hashCode();
        return r;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null||getClass()!=obj.getClass())return false;
        Person person=(Person) obj;
        if(age != person.age) return false;
        if(!name.equals(person.name))return false;
        if(!surname.equals(person.surname))return false;
        return job.equals(person.job);
    }

}
