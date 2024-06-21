import java.util.*;
class Area{
    int length, breadth;
    public Area(int l, int b){
        length=l;
        breadth=b;
    }
    public int getArea(){
        return length*breadth;
    }
}
class Test{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length: ");
        int length= s.nextInt();
        System.out.println("Enter breadth: ");
        int breadth= s.nextInt();
        Area a=new Area(length,breadth);
        System.out.println("Area: "+a.getArea());
    }
}