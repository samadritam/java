import java.util.Scanner;

class Case{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch=sc.next().charAt(0);
        
        if(ch>=65 && ch<=90){
            System.out.println("Upper case");}
        else if(ch>=97 && ch<=122){
            System.out.println("Lower case");}
        else if(ch>=40 && ch<=57){
            System.out.println("Digit");}
        else{
            System.out.println("Special Symbol");}

    }
}