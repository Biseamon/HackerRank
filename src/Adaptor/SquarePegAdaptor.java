package Adaptor;

public class SquarePegAdaptor extends RoundPeg{

    private SquarePeg peg;

    public SquarePegAdaptor(SquarePeg peg){
        this.peg = peg;
    }

    public double getPeg() {
        double result;

        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2)  * 2));
        return result;
    }
}
