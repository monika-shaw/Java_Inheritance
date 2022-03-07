package com.company;


class Family
{

   String name;
   public Family(String nm)
    {
        this.name=nm;
        System.out.println("Parent class"+name);
    }
}
public class Reuse extends Family {

    int n;
   public Reuse(int n)
    {
        super("Family");
        this.n=n;
        System.out.println("Main constrcutor"+n);
    }
    public static void main(String[] args) {
        Reuse obj=new Reuse(6);

    }

}
