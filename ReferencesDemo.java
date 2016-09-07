class Reference{
    int a;

    public static void main(String[] args){
        Reference b = new Reference();
        Reference c;
        b.a=11;
        c=b;
        c.a++;
        System.out.println(" B : " + b.a);
        System.out.println(" C : " + c.a);
    }
}