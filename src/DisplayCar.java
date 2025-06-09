import java.util.Vector;

public class DisplayCar extends MyFrame {
public void run() {
Vector<Car> cars = new Vector<Car>();
	

	cars.add(new Car(0,20,2,0));
	cars.add(new Car(20,60,4 ,0));
	cars.add(new Car(40,100,6,0));
	cars.add(new Car(60,140,8,0));
	cars.add(new Car(80,180,10,0));
	
	while(true) {
		clear();
		for(int j=0; j<cars.size(); j++) {
			cars.get(j).draw(this);
			cars.get(j).move();
		}
		
		sleep(0.1);
	}
}
}
