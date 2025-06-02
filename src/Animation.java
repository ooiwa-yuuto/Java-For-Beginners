
public class Animation extends MyFrame {
	public void run() {
		setColor(0,128,0);
		int  x= 30;
		int y = 200;
		int z = 0;
		int g = 80;
		int a = 10;
		int b = 40;
		int i;
		
		/*while(x<=170) {
			clear();
			fillRect(x,80,10,100);
			x+= 20;
			sleep(0.04);
		}
		
		while(x>=30) {
			clear();
			fillRect(x,80,10,100);
			x-= 20;
			sleep(0.04);
		}
		
		while(g<=200) {
			clear();
			fillRect(x,g,10,100);
			g+= 20;
			sleep(0.04);
		}
		
		for(i =0 ; i<10; i++) {
			clear();
			fillRect(x,y,10,100);
			x+=20;
			y+=10;
			sleep(0.04);
		}
		
		for(i =0 ; i<10; i++) {
			clear();
			fillOval(z,80,20,20);
			z+=20;
			sleep(0.1);
		}
		
		while(true) {
			clear();
			fillOval(z,80,20,20);
			z+=10;
			if (z>400) {
				break;
			}
			sleep(0.1);
		}
		
		while(true) {
			clear();
			fillOval(z,100,20,20);
			z-=10;
			if(z<=0) {
				break;
			}
			sleep(0.1);
		}
		
		while(true) {
			while(x<=170) {
				clear();
				fillRect(x,80,10,100);
				x+= 20;
				sleep(0.04);
			}
			
			while(x>=30) {
				clear();
				fillRect(x,80,10,100);
				x-= 20;
				sleep(0.04);
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*while(y>=10) {
			clear();
			fillRect(x,y,10,100);
			y-= 10;
			sleep(0.04);
		}
		
		while(x<=200) {
			clear();
			fillRect(x,y,10,100);
			x+= 20;
			sleep(0.04);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*while(b<=200) {
			clear();
			fillRect(a,b,10,100);
			a+=20;
			b+=10;
			sleep(0.04);
		}
		
		while(a>=10) {
			clear();
			fillRect(a,b,10,100);
			a-=20;
			sleep(0.04);
		}
		
		while(b>= 40) {
			clear();
			fillRect(a,b,10,100);
			a+=20;
			b-= 10;
			sleep(0.04);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(i=0; i<4;i++) {
			while(x<=170) {
				clear();
				fillRect(x,80,10,100);
				x+= 20;
				sleep(0.04);
			}
			
			while(x>=30) {
				clear();
				fillRect(x,80,10,100);
				x-= 20;
				sleep(0.04);
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
		/*while(true) {
			while(y>=60) {
				clear();
				fillRect(x,y,10,100);
				y-= 10;
				sleep(0.04);
			}
			while(x<=200) {
				clear();
				fillRect(x,y,10,100);
				x+= 20;
				sleep(0.04);
			}
			while(y<=200) {
				clear();
				fillRect(x,y,10,100);
				y+= 10;
				sleep(0.04);
			}
			while(x>=30) {
				clear();
				fillRect(x,y,10,100);
				x-= 20;
				sleep(0.04);
			}
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*while(true) {
			while(b >= 40) {
				clear();
				fillRect(x,b,10,100);
				
			while(x<=200) {
				clear();
				fillRect(x,b,10,100);
				x+= 20;
				sleep(0.04);
			}
			while(b<=200) {
				clear();
				fillRect(x,b,10,100);
				b+= 10;
				sleep(0.04);
			}
			while(x>=30) {
				clear();
				fillRect(x,b,10,100);
				x-= 20;
				sleep(0.04);
			}
			while(b<=400) {
				clear();
				fillRect(x,b,10,100);
				b+= 10;
				sleep(0.04);
			}
			
			b -= 350;
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		while(true) {
			while(true) {
				if(x <= 200) {
					clear();
					fillRect(x,b,10,100);
					x+=20;
					sleep(0.04);
				}
				if(x >= 200) {
				if(b<=200) {
					clear();
					fillRect(x,b,10,100);
					b+= 10;
					sleep(0.04);
					if(b<=200) {
						break;
					}
				}
				
			}
				
			}
			while(true) {
				if(x>= 30) {
					clear();
					fillRect(x,b,10,100);
					x-=20;
					sleep(0.04);
				}
				if(x <= 30) {
				if(b<=400) {
					clear();
					fillRect(x,b,10,100);
					b+= 10;
					sleep(0.04);
					if(b<=400) {
						break;
					}
				}
				}
			}
		if(b >= 400) {
			b-= 350;
			clear();
			fillRect(x,b,10,100);
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
