class hero{
    private String name;
    private int capacity;
    public String getname()
    {
        return name;
    }
    public void setname(String n)
    {
        name=n;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
public class robot {
    public static void main(String args[])
    {
        hero obj1=new hero();
        obj1.setname("superman");
        System.out.println(obj1.getname());

    }
}
