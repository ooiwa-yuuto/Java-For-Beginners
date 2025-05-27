
public class DisplayRectSlow extends MyFrame {
public void run() {
	setColor(0,128,0);
	int  x= 30;
	int y = 200;
	int i;
	while(x<=170) {
		fillRect(x,80,10,100);
		x+= 20;
		sleep(0.099);
	}
	for(i =0 ; i<10; i++) {
		fillRect(x,y,10,100);
		x+=20;
		y+=10;
		sleep(0.099);
	}
}
}
