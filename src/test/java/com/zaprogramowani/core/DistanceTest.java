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
        Assert.assertEquals(meters, result.getMeters(), 0f);
    }
    
}