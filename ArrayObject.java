class Student
{
    String name;
    int regd;
    int marks;

}
public class ArrayObject {
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.name="Sehan1";
        s1.regd=307081;
        s1.marks=8771;
        Student s2=new Student();
        s2.name="Sehan2";
        s2.regd=307082;
        s2.marks=8772;
        Student s3=new Student();
        s3.name="Sehan3";
        s3.regd=307083;
        s3.marks=8773;
        Student stnds[]=new Student[3];
        stnds[0] = s1;
        stnds[1] = s2;
        stnds[2] = s3;
//        for(int i=0;i<stnds.length;i++)
//        {
//            System.out.println(stnds[i].name+" : name");
//        }
        for(Student k: stnds)
        {
            System.out.println(k.name+" : name");
        }
    }
}
