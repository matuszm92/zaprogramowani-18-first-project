package com.zaprogramowani.core;

public class Distance {

    private static final float METERS_TO_INCHES_RATIO = 39.3701f;
    private static final float CENTIMETERS_TO_METERS_RATIO = 100f;

    private float meters;

    private Distance(float meters) {
        if(meters <= 0f) {
            throw new IllegalArgumentException();
        }
        this.meters = meters;
    }

    public float asCentimeters() {
        return meters / CENTIMETERS_TO_METERS_RATIO;
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
    
    public static Distance ofCentimeters(float centimeters) {
        return new Distance(centimeters * CENTIMETERS_TO_METERS_RATIO);
    }

}