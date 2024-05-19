class Mobile1{
    static String Name;
    int price;
    String brand;
    public void show(){
        System.out.println(Name+" "+price+" "+brand+" ");
    }
}
public class Mobile {
    public static void main(String args[])
    {
        Mobile1 obj1=new Mobile1();
        Mobile1.Name="smart";
        obj1.price=500;
        obj1.brand="samsung";

        Mobile1 obj2=new Mobile1();
        obj2.price=600;
        obj2.brand="apple";

        Mobile1 obj3=new Mobile1();
        obj3.price=700;
        obj3.brand="vivo";
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
