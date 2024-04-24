public class Kwadrat extends Czworokat {
    double d;
    public Kwadrat(int a) {
        super(a);
    }

    public Kwadrat(int a, int b){
        super(b);
    }

    @Override
    public int pole() {
        return (int) Math.pow(a, 2);
    }

    @Override
    public int obwod() {
        return 4*a;
    }

    public double getprzekatna() {
        d = Math.sqrt(a);
        return d;
    }

    public void informacje(){
        System.out.println("Długość: " + this.getA());
        System.out.println("Obwód: " + obwod());
        System.out.println("Pole: " + pole());
        System.out.println();
    }
}
