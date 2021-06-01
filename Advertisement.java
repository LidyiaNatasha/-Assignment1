
public class Advertisement {

    double earlybirdDiscount;
    double firstTimeDiscount;

    public Advertisement(double earlybirdDiscount, double fisrtTimeDiscount) {
        this.earlybirdDiscount = earlybirdDiscount;
        this.firstTimeDiscount = fisrtTimeDiscount;
    }

    public double getEarlybirdDiscount() {
        return earlybirdDiscount;
    }

    public void setEarlybirdDiscount(double earlybirdDiscount) {
        this.earlybirdDiscount = earlybirdDiscount;
    }

    public double getFirstTimeDiscount() {
        return firstTimeDiscount;
    }

    public void setFirstTimeDiscount(double firstTimeDiscount) {
        this.firstTimeDiscount = firstTimeDiscount;
    }

}
