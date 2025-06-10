
public class Truck extends Vehicle {
	public Truck(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
	}

	public void draw(MyFrame frame) {
		
		frame.fillRect(x+120,y+50,35,30);
		frame.fillRect(x+35,y+75,120,20);
		frame.fillOval(x+38,y+85,20,20);
		frame.fillOval(x+60,y+85,20,20);
		frame.fillOval(x+125,y+85,20,20);
		
	} 
}
