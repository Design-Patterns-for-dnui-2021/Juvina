// 
// Decompiled by Procyon v0.5.36
// 

package flight_simulation;

class Harrier implements Aircraft
{
    String aircraftType;
    String takeoff;
    String flight;
    
    Harrier() {
        this.aircraftType = "Harrier";
        this.takeoff = "VerticalTakeOff";
        this.flight = "SuperSonicFly";
    }
    
    @Override
    public void simulatetAircraft() {
        System.out.println("Aircraft Type\t\t : " + this.aircraftType);
        System.out.println("Takeoff Characteristics\t : " + this.takeoff);
        System.out.println("Flight Characteristics \t : " + this.flight);
        System.out.println("");
    }
}
