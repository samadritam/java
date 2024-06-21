import java.util.Scanner;

class Marks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter paper 1 marks: ");
        int p1=sc.nextInt();
        System.out.println("Enter paper 2 marks: ");
        int p2=sc.nextInt();
        System.out.println("Enter paper 3 marks: ");
        int p3=sc.nextInt();
        if(p1<45 && p2<45 && p3<45 ){
            System.out.println("Fail");
        }
        else
            System.out.println("Pass");
        
    }
}