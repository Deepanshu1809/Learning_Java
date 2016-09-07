class Static{
 static int a, b;
    
   /* void show(Passing p1, Passing p2){
        System.out.println("Sum of a" + (p1.a + p2.a));
        System.out.println("Sum of b" + (p1.b + p2.b));
    }*/
    static {
        a=10;
        b=20;
        System.out.println("Multiplication : " +(a*b));
    }
    
    public static void main(String[] args) {
        //System.out.println(args.length);
       /* for(int i=0 ; i<args.length ; i++) {
        System.out.println(args[i]);
        }*/
        for(String i:args) {
        System.out.println(i);
        }
   /* 
        Passing p1 = new Passing();
        p1.a=10;
        p1.b=20;
        Passing p2 = new Passing();
        p2.a=30;
        p2.b=40;
        p1.show(p2, p1);
     */   
    }
    
}