import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener {
	
	public Car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
	}

	public void draw(MyFrame frame) {
		
		frame.fillRect(x+50,y+50,50,25);
		frame.fillRect(x+35,y+75,80,10);
		frame.fillOval(x+45,y+80,20,20);
		frame.fillOval(x+85,y+80,20,20);
	}

	//キーボドから文字を入力したときの処理
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	//キーが押されたとき
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("キーが押されました");
		if(e.getKeyCode()== KeyEvent.VK_LEFT) {
			vx = -5;
		}
		if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
			vx = 5;
		}
		if(e.getKeyCode()== KeyEvent.VK_UP) {
			vy = -5;
		}
		if(e.getKeyCode()== KeyEvent.VK_DOWN) {
			vy = 5;
		}
	}

	//キーを離したとき
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode()== KeyEvent.VK_LEFT) {
			vx = 0;
		}
		if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
			vx = 0;
		}
		if(e.getKeyCode()== KeyEvent.VK_UP) {
			vy = 0;
		}
		if(e.getKeyCode()== KeyEvent.VK_DOWN) {
			vy = 0;
		}
	} 
}
