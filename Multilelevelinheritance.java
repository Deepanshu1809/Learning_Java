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
    protected void display(){
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
class C extends B{
    private int c;
    private void watch(){
       c=70;
       c+=30;
       System.out.println(c);
    }
    public static void main(String[] args){
        C c = new C();
        c.display();
        c.show();
        c.watch();
    }
}