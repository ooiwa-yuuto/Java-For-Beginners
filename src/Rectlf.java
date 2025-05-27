
public class Rectlf extends MyFrame {
public void run() {
	int x = 30;
	int y = 50;
	int a = 20;
	int b = 0;
	int brg = 0;
	setColor(brg,brg,brg);
	int i;
	
	/*for (i=0 ;i<9;i++ ) {
		if(i==4) {
			fillRect(x,100,10,100);
		}else{
			fillRect(x,80,10,100);
		}
		x+=20;
	}*/
	
	/*for(i =0 ; i<10; i++) {
		fillRect(x,y,10,100);
		x+=20;
		y+=10;
	}
	
	for(i=0 ; i<10 ;i++) {
		fillRect(b,250,10,a);
		b+=20;
		a+=20;
	}*/
	for(i=0;i<40; i++) {
		fillRect(b,80,10,100);
		if(i<20) {
			setColor(brg,brg,brg);
			brg+= 13;
		}
		else if(20<i) {
			setColor(brg,brg,brg);
			brg -= 13;
		}
		b+= 20;
	}
	
}
}
