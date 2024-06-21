import java.util.Scanner;

class Leap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=sc.nextInt();
        
        if(year%100!=0){
            if(year%4==0){
                System.out.println("Non century leap year");
            }
            else{
                System.out.println("Non leap year");
            }
        }
        else{
            if(year%400==0){
                System.out.println("century leap year");
            }
            else{
                System.out.println("Non leap year");
            }
        }
    }
}