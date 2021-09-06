// 
// Decompiled by Procyon v0.5.36
// 

package flight_simulation;

class AirPlane implements Aircraft
{
    String aircraftType;
    String takeoff;
    String flight;
    
    AirPlane() {
        this.aircraftType = "AirPlane";
        this.takeoff = "LongDistanceTakeOff";
        this.flight = "SubSonicFly";
    }
    
    @Override
    public void simulatetAircraft() {
        System.out.println("Aircraft Type\t\t : " + this.aircraftType);
        System.out.println("Takeoff Characteristics\t : " + this.takeoff);
        System.out.println("Flight Characteristics \t : " + this.flight);
        System.out.println("");
    }
}
