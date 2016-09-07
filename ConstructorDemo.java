class ConstrutorDemo {
    int a, b;
    ConstrutorDemo(int a, int b) {
        this.a = a;
        this.b = b;
        
    }
    ConstrutorDemo getRef() {
        return this;
    }

    void show() {
        System.out.println("Value of a: " +a);
        System.out.println("Value of b: " +b);
    }

    public static void main(String[] arg) {

        ConstrutorDemo s = new ConstrutorDemo(67, 89);
        ConstrutorDemo s1 = s.getRef();
        s1.show();
    }

}