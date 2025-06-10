
public class Car extends Vehicle {
	
	public Car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
	}

	public void draw(MyFrame frame) {
		
		frame.fillRect(x+50,y+50,50,25);
		frame.fillRect(x+35,y+75,80,10);
		frame.fillOval(x+45,y+80,20,20);
		frame.fillOval(x+85,y+80,20,20);
	} 
}
