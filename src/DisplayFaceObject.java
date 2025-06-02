
public class DisplayFaceObject extends MyFrame {
public void run() {
	Face facel = new Face(50,50,10,5);
	
	Face face2 = new Face(200,100,-10,-5);
	
	for(int i=0;i<30; i++) {
		clear();
		facel.draw(this);
		face2.draw(this);
		
		facel.move();
		face2.move();
		sleep(0.1);
	}
}
}
