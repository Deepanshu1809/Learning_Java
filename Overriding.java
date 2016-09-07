import java.util.Scanner;

class Base{

int a;
void show(int b) {
    this.a = b;
    System.out.println(a);
}   
}
class Derived extends Base {
    int b;
    void display(int a , int b){
        this.b = a;
        super.show(30);
        System.out.println(this.b);
    }
    public static void main(String[] args){
        Derived e = new Derived();
        e.display(20,30);        
    }
}