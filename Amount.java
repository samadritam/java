import java.util.Scanner;

class Amount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amt=sc.nextInt();
        System.out.println("Enter range: ");
        System.out.println("2000,500,200,100,50,20,10,5,2,1");
        int range=sc.nextInt();
        switch(range){
            case 2000:
            System.out.println("2000-> " +(amt/2000));
            amt=amt%2000;
            case 500:
            System.out.println("500-> " +(amt/500));
            amt=amt%500;
            case 200:
            System.out.println("200-> " +(amt/200));
            amt=amt%200;
            case 100:
            System.out.println("100-> " +(amt/100));
            amt=amt%100;
            case 50:
            System.out.println("50-> " +(amt/50));
            amt=amt%2000;
            case 20:
            System.out.println("20-> " +(amt/20));
            amt=amt%20;
            case 10:
            System.out.println("10-> " +(amt/10));
            amt=amt%10;
            case 5:
            System.out.println("5-> " +(amt/5));
            amt=amt%5;
            case 2:
            System.out.println("2-> " +(amt/2));
            amt=amt%2;
            case 1:
            System.out.println("1-> " +(amt/1));
            amt=amt%1;
            break;
            default: System.out.println("Invalid Input");
            break;
        }
    }
}