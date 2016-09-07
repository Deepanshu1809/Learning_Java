class Fruit {
    String name = "abc";    //instance Variable
    int energy;
    String color;
    static String n = "efh";  //static variable
    
    void show() {
        System.out.println("Name: " +name);
        System.out.println("Energy: " +energy);
        System.out.println("Color: " +color);     
    }

    
}
class Simple {
    public static void main(String[]args) {
        System.out.println("n value: " +n   );
        Fruit apple = new Fruit();
        apple.name = "Apple";
        apple.energy = 500;
        apple.color = "Red";
        apple.show();


    }
}

