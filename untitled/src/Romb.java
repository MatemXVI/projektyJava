public class Romb extends Kwadrat{
    private int katA;
    private int katB;

    public Romb(int a, int katA, int katB) {
        super(a);
        this.katA = katA;
        this.katB = katB;
    }
    

    @Override
    public int pole() {
       double wynik = Math.pow(a,2)*Math.sin(katA);
       return (int) wynik;
    }
}
