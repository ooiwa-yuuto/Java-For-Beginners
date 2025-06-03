
public class Car {
	int x ,y,vx ,vy;
	public Car(int x, int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx = vx;
		this.vy = vy;
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+100,y+100,100,50);
		frame.fillRect(x+70,y+150,160,20);
		frame.fillOval(x+90,y+160,40,40);
		frame.fillOval(x+170,y+160,40,40);
	} 
	public void move() {
		x+= vx;
		y+= vy;
	}
}
