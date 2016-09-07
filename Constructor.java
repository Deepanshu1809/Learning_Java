class ConstrutorDemo {
    int a, b;
    Construtor(int a, int b) {
        this.a = a;
        this.b = b;
        
    }
    void show() {
        System.out.println("Value of a: " +a);
        System.out.println("Value of b: " +b);
    }

    public static void main(String[] arg) {

        Construtor s = new Construtor(67, 89);
        s.show();
    }

}