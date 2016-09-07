class overloading {
    static int add (int a,int b){
        return (a+b);
    }
    
static int add (int a,int b,int c){
    return (a+b+c);
}
static double add (double a,double c){
    return (a+c);
}
}
class demo{
    public static void main (String[]arg){
     System.out.println("Addition" + overloading.add(5,5.5));

    }
}