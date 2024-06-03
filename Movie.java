import java.util.Arrays;

class cinema{
    private String name;
    private int collection;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
public class Movie {
    public static void main(String args[])
    {
        cinema obj=new cinema();
        obj.setName("jersey");
        System.out.println(obj.getName());
        cinema obj1=new cinema();
        obj1.setName("jersey1");
        System.out.println(obj1.getName());
    }
}
