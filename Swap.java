package com.company;

public class Swap {

    public static void main(String[] args) {


        Swap obj=new Swap();
        obj.s(1,2);



    }

    public void s(int a,int b)
    {
     int temp=0;
     temp=a;
     a=b;
     b=temp;
        System.out.println(a+"and"+b);

    }





}
