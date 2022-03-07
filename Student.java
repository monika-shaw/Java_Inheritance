package com.company;

class Address
{
    int StreetNum;
    String city;
    String state;
    String country;


    Address(int street, String c, String s, String co)
    {
        this.StreetNum=street;
        this.city=c;
        this.state=s;
        this.country=co;
    }
}
public class Student {

    int roll;
    String name;

    Address studentadress;
    Student(int r, String n, Address addr)
    {
        this.roll=r;
        this.name=n;
        this.studentadress=addr;
    }

    public static void main(String[] args) {
        Address ad=new Address(55,"ranchi","jh","india");
        Student obj=new Student(34,"ashu",ad);
        System.out.println(obj.studentadress.city);
    }
}
