//single inheritence

class A{
    public void showA(){
        System.out.println("I am in class A");
    }
}
class B extends A{
    public void showB(){
        System.out.println("I am in class B");
    }
}
class MyJava{
    public static void main(String[] args){
        B obj=new B();
        obj.showA();
        obj.showB();
    }
}