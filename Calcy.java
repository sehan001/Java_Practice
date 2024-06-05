class VryAdvCalc {
    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}

class AdvCalc extends VryAdvCalc {
    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class Calct extends AdvCalc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class Calcy {
    public static void main(String[] args) {
        Calct obj = new Calct();
        int a = obj.add(1, 2);
        int b = obj.sub(2, 1);
        int c = obj.mult(3, 4);
        int d = obj.div(4, 2);
        double e = obj.power(2.0, 3.0);  // Corrected to use double arguments
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
