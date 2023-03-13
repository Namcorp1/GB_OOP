package org.example;

public class Treadmill {
    int minLength;
    int maxLength;

    public Treadmill(){}

    /**
     *
     * @param minLength минимальная длина дорожки, м
     * @param maxLength максимальная длина дорожки, м
     */
    public Treadmill(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    /**
     *
     * @param minLength минимальная длина дорожки, м
     * @param maxLength максимальная длина дорожки, м
     * @return случайная длина дорожки, м
     */
    public int randomLength(int minLength, int maxLength){
        return (int) (Math.random()*((maxLength - minLength) + 1)) + minLength;
    }
}
