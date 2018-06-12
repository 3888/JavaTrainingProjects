package hashCodeAndEquals;

public class Instance {
    private int a;
    private int b;

    public Instance() {
    }

    @Override
    public int hashCode() {
        return a + b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

