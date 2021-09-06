package flight_simulation;

public class MainProgram {
	public static void main(String[] args) {
		Simulation simulation = new Simulation();
		
		simulation.setAircraft(new Helicopter());
		simulation.simulatetAircraft();
		
		simulation.setAircraft(new AirPlane());
		simulation.simulatetAircraft();
		
		simulation.setAircraft(new Fighter());
		simulation.simulatetAircraft();
		
		simulation.setAircraft(new Harrier());
		simulation.simulatetAircraft();
	}
}

class Simulation {
	private Aircraft aircraft;
		
	public Aircraft getAircraft() {
		return aircraft;
	}
	
	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}
	
	public void simulatetAircraft() {
		 this.aircraft.simulatetAircraft();
	}
	
}

interface Aircraft{
	 public  String takeoff ="";
	 public  String flight ="";
	 public  String aircraftType = "";
	 void simulatetAircraft();
}


class Helicopter implements Aircraft {
	String aircraftType = "Helicopter";
	String takeoff = "VerticalTakeOff";
	String flight = "SubSonicFly";
	
	public void simulatetAircraft() {
	System.out.println("Aircraft Type		 : "+aircraftType);
	System.out.println("Takeoff Characteristics	 : "+takeoff);
	System.out.println("Flight Characteristics 	 : "+flight);
	System.out.println("");
	}
}

class AirPlane implements Aircraft {
	String aircraftType = "AirPlane";
	String takeoff = "LongDistanceTakeOff";
	String flight = "SubSonicFly";
	
	public void simulatetAircraft() {
		System.out.println("Aircraft Type		 : "+aircraftType);
		System.out.println("Takeoff Characteristics	 : "+takeoff);
		System.out.println("Flight Characteristics 	 : "+flight);
		System.out.println("");
	}
}

class Fighter implements Aircraft {
	String aircraftType = "Fighter";
	String takeoff = "LongDistanceTakeOff";
	String flight = "SuperSonicFly";
	
	public void simulatetAircraft() {
		System.out.println("Aircraft Type		 : "+aircraftType);
		System.out.println("Takeoff Characteristics	 : "+takeoff);
		System.out.println("Flight Characteristics 	 : "+flight);
		System.out.println("");
	}
}

class Harrier implements Aircraft {
	String aircraftType = "Harrier";
	String takeoff = "VerticalTakeOff";
	String flight = "SuperSonicFly";
	
	public void simulatetAircraft() {
		System.out.println("Aircraft Type		 : "+aircraftType);
		System.out.println("Takeoff Characteristics	 : "+takeoff);
		System.out.println("Flight Characteristics 	 : "+flight);
		System.out.println("");
	}
}
