
public class DisplayFaceAndTree extends MyFrame {
public void run() {
Face facel = new Face(50,50,10,5);
	
	Tree tree1 = new Tree(200,100,-10,-5);
	
	for(int i=0;i<30; i++) {
		clear();
		facel.draw(this);
		tree1.draw(this);
		
		facel.move();
		tree1.move();
		sleep(0.1);
	}
}
}
