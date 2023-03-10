package com.db4o.f1.chapter5;

import java.util.*;


public class PressureSensorReadout extends SensorReadout {
    private double pressure;
    
    public PressureSensorReadout(
            Date time,Car car,
            String description,double pressure) {
        super(time,car,description);
        this.pressure=pressure;
    }
    
    public double getPressure() {
        return pressure;
    }
    
    public String toString() {
        return super.toString()+" pressure : "+pressure;
    }
}
