package Calculator;

class A{

    public void show()
    {
        System.out.println("outed A");
    }
}
class B extends A{
    public void show()
    {
        System.out.println("outed B");
    }
}
class C
{
    public void show()
    {
        System.out.println("outed C");
    }
}
public class demo {
    public static void main(String args[])
    {
        A obj=new A();
        obj.show();
        obj=new B();
        obj.show();
        obj=new C();
        obj.show();
    }
}
