class Klu{
    int id;
    static String name;
    public void show(){
        System.out.println("id:"+id+" "+"name:"+name);
    }
    public static void show1(Klu b)
    {
        System.out.println("id:"+b.id+" "+"name:"+name);
    }
}
public class StaticMethod {
    public static void main(String args[])
    {
        Klu a=new Klu();
        a.id=30708;
        a.name="name1";
        Klu b=new Klu();
        b.id=30707;
        Klu.show1(b);
        a.show();
    }

}
