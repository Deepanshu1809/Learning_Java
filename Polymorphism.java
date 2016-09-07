import java.util.Scanner;

class Bank{
    double  a=2000;
    double getInterest(){
      return 52;
    }
}
class SBI extends Bank{
    double getInterest(){
        
        return a*1.5;
    }
}
class HDFC extends Bank{
    double getInterest(){
        double  b;
        b= a*1.75;
        return b;
    }
}
class ICICI extends Bank{
    double getInterest(){
        double b;
        b= a*2;
        return b;
    }
}
class Canara extends Bank{
    double getInterest(){
        double b;
        b= a*2.5;
        return b;
    }
}
class Customer {
    public static void main (String[] args){
        String choice;
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();
        Bank b4 = new Canara();
        do{
        System.out.println("You had Entered The Amount of Rs.2000 INR");
        System.out.println("Enter Your choice \n Press 1 For SBI \n Press 2 For HDFC \n Press 3 For ICICI \n Press 4 For Canara");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n)
        {
            case 1 : 
            System.out.println("Interest of SBI : " + b1.getInterest());
            break;
            case 2 : 
            System.out.println("Interest of HDFC : " + b2.getInterest());
            break;
            case 3 : 
            System.out.println("Interest of ICICI : " + b3.getInterest());
            break;
            case 4 : 
            System.out.println("Interest of Canara : " + b4.getInterest());
            break;
            default : 
            System.out.println("INVALID SELECTION");
            break;
        }
        System.out.println("Press 1 Continue Else Press any key to exit");
        choice = sc.next();
        }while(choice   .equals("1"));
        
    }
}