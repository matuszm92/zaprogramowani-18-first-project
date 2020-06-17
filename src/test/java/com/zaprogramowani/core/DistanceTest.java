package com.zaprogramowani.core;

import org.junit.Assert;
import org.junit.Test;

public class DistanceTest {
 
    private static final float RESULT_DELTA = 0f;

    @Test
    public void shouldCreateDistanceFromMeters() {
        // given
        float meters = 0.5f;

        // when
        Distance result = Distance.ofMeters(meters);

        // then
        Assert.assertNotNull(result);
        Assert.assertEquals(meters, result.asMeters(), RESULT_DELTA);
    }

    @Test
    public void shouldReturnDistanceFromInchesAsMeters() {
        // given
        float inches = 10f;

        // when
        Distance result = Distance.ofInches(inches);

        // then
        float expected = 0.2539999f;
        Assert.assertNotNull(result);
        Assert.assertEquals(expected, result.asMeters(), 0f);
    }

    @Test
    public void shouldReturnDistanceFromMetersAsInches() {
        // given
        float meters = 0.5f;
        Distance distance = Distance.ofMeters(meters);

        // when
        float result = distance.asInches();

        // then
        float expected = 19.68505f;
        Assert.assertEquals(expected, result, 0f);
    }
    
}