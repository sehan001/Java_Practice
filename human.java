class body{
    private int p1;
    private String p2;
    public int getP1()
    {
        return p1;
    }
    public void setP1(int a)
    {
        p1=a;
    }
}
public class human {
    public static void main(String args[])
    {
        body a=new body();
        a.setP1(0);
        System.out.println(a.getP1());
    }
}
