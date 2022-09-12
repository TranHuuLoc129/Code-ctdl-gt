public class Fraction{
    
    private int numer = 0;
    private int denom = 1;

    public Fraction(){}

    public Fraction(int x, int y){
        this.numer = x;
        this.denom = y;
    }

    public Fraction(Fraction f){
        this.numer = f.numer;
        this.denom = f.denom;
    }

    public String toString(){
        return String.format("%d/%d", this.numer, this.denom);
    }

    public boolean equals(Object f){
        if(f instanceof Fraction){
            Fraction frac = (Fraction) f;

            if(((double)this.numer/(double) this.denom) == ((double)frac.numer/(double) frac.denom)){
                return true;
            }
        }

        return false;
    }


}