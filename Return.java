class Simple{
    int a,b;
    Simple(int a,int b){
        this.a = a;
        this.b = b;
    }
    Simple(){
        // DEFAULT CONSTRUCTOR
    }
    Simple add(Simple j){
        Simple r = new Simple();
        r.a = this.a + j.a;
        r.b = this.b + j.b;
        return r;
    } 
    public static void main(String[] args) {

        Simple s1 = new Simple(2, 8);
        Simple s2 = new Simple(5, 8);
        Simple s3 = new Simple();
        s3 =s1.add(s2);
        System.out.println("Addition.a : " + s3.a);
        System.out.println("Addition.b : " + s3.b);
    } 
}