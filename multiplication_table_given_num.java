#Program- Printing the multiplication table of the given input number
--> import java.util.Scanner;
    class Demo2{
    public static void main(String[]args)
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the any number:");
    int num=scan.nextInt();
    for(int i=0;i<=10;i++){
    System.out.println(num+"X"+i+"="+(i*num));
    }
    }
    }
    
OUTPUT:
enter the any number:5
5X1=5
5X2=10
5X3=15
5X4=20
5X5=25
5X6=30
5X7=35
5X8=40
5X9=45
5X10=50
