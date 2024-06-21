import java.util.Scanner;

class Marks1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter paper 1 marks: ");
        int p1=sc.nextInt();
        System.out.println("Enter paper 2 marks: ");
        int p2=sc.nextInt();
        System.out.println("Enter paper 3 marks: ");
        int p3=sc.nextInt();
        int total=p1+p2+p3;
        double per = total/3;
        System.out.println("Enter gender(f/m): ");
        char gender=sc.next().charAt(0);
        if(per>=80 && gender=='f'){
            System.out.println("She can take admission");
        }
        else if(per>=60 && gender=='m'){
            System.out.println("He can take admission");
        }
        else{
            System.out.println("Cannot take admission");
        }
    }
}