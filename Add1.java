import java.util.Scanner;

class Add1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x value");
        int x=sc.nextInt();
        System.out.println("Enter n value");
        int n=sc.nextInt();
        int i,no;
        double sum=1;
        for(i=1;i<=n;i++){
            no=i;
            fact=1;
            while(no>0){
                fact=fact*i;
            }
            sum=sum+((Math.pow(x,i))/factorial);
        }
        System.out.println(sum);

    }
    
}