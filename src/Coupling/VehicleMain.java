package Coupling;

interface Vehicle {
       String getName();
}

class Car implements Vehicle {
	@Override
	public String getName() {
		return "Car";
	}
	
	public String printName() {
		return "Car";
	}
}

class Bike implements Vehicle {
	@Override
	public String getName() {
		return "Bike";
	}
	
	public String printName() {
		return "Bike";
	}
}

class BuildVehicle {
	static Vehicle getVehicle(int wheel) {
		if(wheel==2) {
			return new Bike();
		} else if(wheel==4) {
			return new Car();
		} else {
			return null;
		}
	}
}

public class VehicleMain {
	public static void main(String args[]) {
		Vehicle v=BuildVehicle.getVehicle(4);
		System.out.print(v.getName());
	}
}
