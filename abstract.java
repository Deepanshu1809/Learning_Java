abstract class sam
{
abstract void show();
}
class hoola extends sam
{
void show()
{
System.out.println("hi little fucker");
}
}
class zaroori
{
public static void main(String[]arg){
hoola obj=new hoola();
obj.show();
}
}