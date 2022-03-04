#Program- Check whether the given year is a Leap Year
--> import java.util.Scanner;
    class Demo3{
    public static void main(String[]args)
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("input year");
    int year=scan.nextInt();
    boolean isLeapYear=false;
    if(year%4==0){
    if(year%100==0){
    if(year%400==0){
    isLeapYear=true;
    }else{
    isLeapYear=false;
    }
    if(isLeapYear){
    System.out.println("given year"+year+"is leap year");
    }else{
    System.out.println("given year"+year+"is not leap year");
    }
    }
     }

OUTPUT:
enter year:2005
Given year 2005 is not a leap year.