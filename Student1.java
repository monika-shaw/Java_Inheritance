package com.company;


class X
{
    public void show()
    {
        System.out.println("Hello parent");
    }
}
public class Student1 extends X{
    public void show()
    {

        System.out.println("Hello child");
    }

    public static void main(String[] args) {
        Student1 obj=new Student1();
        obj.show();
        X o=new X();
        o.show();


    }
}
