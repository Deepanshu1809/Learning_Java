class A{
    int a;
    A(int a){
        this.a = a;
        System.out.println(a);
    }
}
class B extends A{
    int b;
    B(int a , int b){
    super(a);
    this.b = b;
    System.out.println(this.b);
    }
}
class C extends B{
    int c;
    C(int a , int b , int c){
       super(a,b);
       this.c = c;
       System.out.println(c); 
    }
    public static void main(String[] args){
        C e = new C(20,30,40);
    }
}