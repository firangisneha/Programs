#Program - Check whether the given input number is even or odd
--> import java.util.Scanner;
    class Demo1{
    public static void main(String[]args)
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the input number");
    int num=scan.nextInt();
    if(num%2==0){
    System.out.println("the given number is even");
    }else{
    System.out.println("the given number is odd");
    }
    }
    }
    
OUTPUT:
enter input number:4
the given number is even
enter input number:3
the given number is odd.