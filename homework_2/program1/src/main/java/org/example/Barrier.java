package org.example;
import java.util.random.RandomGenerator;

public class Barrier {
    double minHeight;
    double maxHeight;

    public Barrier(){}

    /**
     *
     * @param minHeight минимальная высота барьера, м
     * @param maxHeight максимальная высота барьера, м
     */
    public Barrier(double minHeight, double maxHeight) {
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    /**
     *
     * @param minHeight минимальная высота барьера, м
     * @param maxHeight максимальная высота барьера, м
     * @return случайная высота барьера, м
     */
    public double randomHeight(double minHeight, double maxHeight){
        return Math.random()*(maxHeight - minHeight) + minHeight;
    }

}
