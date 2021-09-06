// 
// Decompiled by Procyon v0.5.36
// 

package flight_simulation;

class Simulation
{
    private Aircraft aircraft;
    
    public Aircraft getAircraft() {
        return this.aircraft;
    }
    
    public void setAircraft(final Aircraft aircraft) {
        this.aircraft = aircraft;
    }
    
    public void simulatetAircraft() {
        this.aircraft.simulatetAircraft();
    }
}
