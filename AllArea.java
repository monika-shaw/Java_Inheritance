package com.company;

class AreaCal{
    public int Area(int x, int y){
        int area = x*y;
        return area;
    }

    public int Area(int x){
        int area = x*x;
        return area;
    }

    public float Area(float a, float b){
        float area = (a*b)*0.5f;
        return area;
    }
}

public class AllArea {
    public static void main(String[] args) {
        AreaCal obj = new AreaCal();
        obj.Area(5);
        obj.Area(2,3);
        obj.Area(3f,4f);
    }
}