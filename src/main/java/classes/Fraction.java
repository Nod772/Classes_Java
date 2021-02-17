package classes;

public class Fraction {
    private int a;
    private int b;

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public Fraction() {
        a=0;
        b=0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                a +"/"+b+"}";
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
