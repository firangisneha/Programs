#Program - Print the area of a circle
--> import java.util.Scanner;
    class Demo{
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the radius of circle");
    double radius=scan.nextDouble();
    System.out.println("area of circle is"+(Math.PI*radius*radius));
    }
    }
    
OUTPUT:
enter the radius of circle:5
area of circle is:78.53981633974483.