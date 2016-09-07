
interface Arithmetic {
    int add(int a , int b);
    int sub(int a , int b);
    int multi(int a , int b);
    int division(int a , int b);
}

class A implements Arithmetic {
    @Override
    public int add(int a , int b){
        int c;
        c = a + b;
        return c;
    }
    @Override
   public int sub(int a , int b){
        int c;
        c = a - b;
        return c;
    }
    @Override
   public int multi(int a , int b){
        int c;
        c = a * b;
        return c;
    }
    @Override
   public int division(int a , int b){
        int c;
        c = a / b;
        return c;
    }
    public static void main(String[] args){
    Arithmetic math = new A();
    System.out.println("Addition : " + math.add(8 , 12));
    System.out.println("Subtraction : " + math.sub(8 , 12));
    System.out.println("Multiplication : " + math.multi(8 , 12));
    System.out.println("Division : " + math.division(8 , 12));
    }
}