import java.util.Scanner;

class ArrRev{
    public static void main(String[] args){
        int arr[]= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        for(int i=0;i<5;++i){
            arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;--i){
            System.out.print(arr[i]);
        }
    }
}