package com.zaprogramowani.core;

import org.junit.Assert;
import org.junit.Test;

public class DistanceTest {
 
    @Test
    public void shouldCreateDistanceFromMeters() {
        // given
        float meters = 0.5f;

        // when
        Distance result = new Distance(meters);

        // then
        Assert.assertNotNull(result);
        Assert.assertEquals(meters, result.asMeters(), 0f);
    }

    @Test
    public void shouldReturnDistanceAsInches() {
        // given
        float meters = 0.5f;
        Distance distance = new Distance(meters);

        // when
        float result = distance.asInches();

        // then
        float expected = 19.68505f;
        Assert.assertEquals(expected, result, 0f);
    }
    
}