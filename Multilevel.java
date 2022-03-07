package com.company;



class A
{
    String name="abc";
    int roll=9;

    public void show()
    {
        System.out.println(name+ "and " +roll);
    }
}

class B extends A
{
    int c=6;
    public void show1()
    {
        System.out.println(c);
    }
}
public class Multilevel extends B{

    String address="China Town";
     public  void show3()
     {
         System.out.println(address);
     }

    public static void main(String[] args) {
        Multilevel obj=new Multilevel();
        obj.show();
        obj.show1();
        obj.show3();
    }
}
