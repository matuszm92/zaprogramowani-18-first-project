package com.zaprogramowani.core;

public class Distance {

    private static final float METERS_TO_INCHES_RATIO = 39.3701f;

    private float meters;

    private Distance(float meters) {
        this.meters = meters;
    }

    public float asMeters() {
        return meters;
    }
    
    public float asInches() {
        return meters * METERS_TO_INCHES_RATIO;
    }

    public static Distance ofInches(float inches) {
        return new Distance(inches / METERS_TO_INCHES_RATIO);
    }

    public static Distance ofMeters(float meters) {
        return new Distance(meters);
    }

}