public class Prostokat extends Czworokat{
    public Prostokat(int a, int b) {
        super(a, b);
    }

    @Override
    public int pole() {
        return a*b;
    }

    @Override
    public int obwod() {
        return 2*a+2*b;
    }
}
