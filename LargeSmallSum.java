import java.util.*;
class LargeSmallSum{
    public static void main(String[] args){
        int[] arr={3,2,1,7,5,4};
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest element: "+largest);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element: "+smallest);
        System.out.println("Output is: "+(largest+smallest));
    }
}