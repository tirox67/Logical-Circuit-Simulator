package com.example.haaaa;

public class Powersource extends GATE{

    private double x;
    private double y;
    private Output outputpoint = new Output(this);

    public Powersource(double x, double y) {
        super(x,y,0);

        outputpoint.setState(1);
        outputpoint.setX(x + 31);
        outputpoint.setY(y + 15);
    }
    @Override
    public Output getOutput_point() {
        return this.outputpoint;
    }


}