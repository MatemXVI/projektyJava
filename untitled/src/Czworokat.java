public abstract class Czworokat implements Czworobok {
   protected int a;
    protected int b;
    protected int c;
    protected int d;

    public Czworokat(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Czworokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Czworokat(int a) {
        this.a = a;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void informacje(){
        System.out.println("Długość: " + this.getA());
        System.out.println("Szerokosc: " + this.getB());
        System.out.println("Obwód: " + obwod());
        System.out.println("Pole: " + pole());
        System.out.println();
    }
}
