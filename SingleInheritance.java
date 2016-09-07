class A{
    protected int a;

    protected void show(){
    a=20;
    a+=10;
    System.out.println(a);
    }
}

class B extends A {
    int b;
    void display(){
        b=10;
        b+=10;
    System.out.println(b);
    }
    public static void main(String[] args) {
        int a;
        B b = new B();
        b.display();
        b.show();
    }
} 