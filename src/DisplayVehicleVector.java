import java.util.Vector;

public class DisplayVehicleVector extends MyFrame {
public void run() {
Vector<Vehicle> Vehicle = new Vector<Vehicle>();
	

	Vehicle.add(new Car(0,0,7,0));
	Vehicle.add(new Car(30,60,-5,0));
	Vehicle.add(new Train(10,180,7,0));
	Vehicle.add(new Train(10,230,-5,0));
	Vehicle.add(new Truck(10,220,7,0));
	Vehicle.add(new Truck(80,290,7,0));

	while(true) {
		clear();
		for(int j=0; j<Vehicle.size(); j++) {
			Vehicle.get(j).draw(this);
			Vehicle.get(j).move(this);
		}
		
		sleep(0.1);
	}
}
}
