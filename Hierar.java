package com.company;

class D
{
    String n="Parent class";

    public void show()
    {
        System.out.println(n);
    }
}

class E extends D
{
    String n1="Child class";
    public void show1()
    {
        System.out.println(n1);
    }
}

public class Hierar extends D {
    String n2="Main";
    public void show2()
    {
        System.out.println(n2);
    }

    public static void main(String[] args) {
       E obj=new E();
       obj.show1();
       obj.show();
    }
}
