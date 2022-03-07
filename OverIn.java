package com.company;

class Z
{
    Z()
    {
        System.out.println("Parent Constructor");
    }
    public void show()
    {
        System.out.println("Parent class");
    }
}


public class OverIn extends Z {

    OverIn()
    {
        System.out.println("child constructor");
    }

    public void show()
    {
        super.show();
        System.out.println("child class");
    }

    public static void main(String[] args) {
        OverIn obj=new OverIn();
        obj.show();
    }
}
