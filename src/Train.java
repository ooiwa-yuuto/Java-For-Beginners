
public class Train extends Vehicle {
	
	public Train(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
	}

	public void draw(MyFrame frame) {
		frame.fillRect(x,y-10,100,30);
		frame.fillOval(x,y+18,15,15);
		frame.fillOval(x+17,y+18,15,15);
		frame.fillOval(x+68,y+18,15,15);
		frame.fillOval(x+85,y+18,15,15);
	} 
}
