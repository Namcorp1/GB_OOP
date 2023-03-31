package org.example.num;

public class ComplexNumber implements NumbersInterface {
    private double re;
    private double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }


    @Override
    public String toString() {
        if (im >= 0) {
            return String.format("%.3f + %.3f * j",re,im);
        }else{
            return String.format("%.3f - %.3f * j",re,Math.abs(im));
        }

    }

    @Override
    public double getRe() {
        return re;
    }

    @Override
    public double getIm() {
        return im;
    }
}
