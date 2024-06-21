import java.util.Scanner;

class Add{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=0,i;
        for(i=1;i<=y;i++){
            sum=sum+x;
        }
        System.out.println("Multiplication is: "+sum);
    }
}