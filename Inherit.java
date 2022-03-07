package com.company;


    class Abc
    {
        String name="ram";
        int roll=9;

        public void show()
        {
            System.out.println(name+"and "+roll);
        }
    }
public class Inherit extends Abc {
        int a=10;
        int b=20;
        public void sum()
        {
            System.out.println(a+b);
        }
    public static void main(String[] args) {
        Inherit obj=new Inherit();
        obj.show();
        obj.sum();

    }


}
