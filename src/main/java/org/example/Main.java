package org.example;

import java.util.Scanner;
class shapes{
    public double tri_angle,rect_angle,circle;
    public double length_tri1,length_tri2,length_tri3;
    public double length_rect,width_rect;
    public double radius_circle;
    public double breadth_tri,height_tri;
    Scanner sc2=new Scanner(System.in);
    shapes(int ch)
    {
        if(ch==1)
        {
            System.out.println("Enter your choice to perform area operation for the shapes?\n1.Area for Rectangle\n2.Area for Triangle\n3.Area for Circle\n");
            int a=sc2.nextInt();
            this.area_shapes(a);
        }
        else if(ch==2){
            System.out.println("Enter your choice to perform Perimeter operation for the shapes?\n1.Perimeter for Rectangle\n2.Perimeter for Triangle\n3.Perimeter for Circle\n");
            int b=sc2.nextInt();
            this.perimeter_shapes(b);
        }
        else{
            System.out.println("Please Enter correct choice");
        }
    }
    void area_shapes(int shape)
    {
        if(shape==1)
        {
            System.out.println("Enter the length and width of a Rectangle");
            length_rect=sc2.nextDouble();
            width_rect=sc2.nextDouble();
            rect_angle=length_rect*width_rect;
            System.out.println("The Area of Rectangle is:"+rect_angle);
        }
        if(shape==2){
            System.out.println("Enter the breadth and height of a Triangle");
            breadth_tri=sc2.nextDouble();
            height_tri=sc2.nextDouble();
            tri_angle=(breadth_tri*height_tri)/2;
            System.out.println("The Area of Triangle is:"+tri_angle);
        }
        if(shape==3){
            System.out.println("Enter the radius for a circle");
            radius_circle=sc2.nextDouble();
            circle=Math.PI*radius_circle*radius_circle;
            System.out.println("The Area of Circle is:"+circle);
        }
    }
    void perimeter_shapes(int shape){
        if(shape==1){
            System.out.println("Enter the length and width of a Rectangle");
            length_rect=sc2.nextDouble();
            double breadth_rect=sc2.nextDouble();
            rect_angle=2*(length_rect+breadth_rect);
            System.out.println("The Perimeter of Rectangle is:"+rect_angle);
        }
        if(shape==2){
            System.out.println("Enter the breadth and height of a Triangle");
            length_tri1=sc2.nextDouble();
            length_tri2=sc2.nextDouble();
            length_tri3=sc2.nextDouble();
            tri_angle=length_tri1*length_tri2*length_tri3;
            System.out.println("The Perimeter of Triangle is:"+tri_angle);
        }
        if(shape==3){
            System.out.println("Enter the radius for a circle");
            radius_circle=sc2.nextDouble();
            circle=2*Math.PI*radius_circle;
            System.out.println("The Perimeter of Circle is:"+circle);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Which choice you want to choose? \n1.Area for shapes\n2.Perimeter for shapes\n");
        int ch=sc.nextInt();
        new shapes(ch);
    }
}