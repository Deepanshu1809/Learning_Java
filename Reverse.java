class Reverse{
    public static void main(String[] args){
        int a=56,rev=0,n;
        while(a>0) {
            n=a%10;
            rev=rev*10+n;
           a= a/10;
        }
        System.out.println(rev);
    }
}