package tank_war;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

	public class TankClient extends Frame {
		public static final int GAME_WIDTH = 800;
		public static final int GAME_HEIGHT = 600;
	
		Tank myTank = new Tank(50, 50, true, this);
		//New came out an enemy tank
		Tank enemyTank = new Tank(100, 100, false, this); 
		
		
		List<Missile> missiles = new ArrayList<Missile>();	
		
		List<tank>tanks = ArrayList<tank>();
		m.hitTanks(tanks);
		(I = 0; I < 10; I + +) {
			tanks.add (tank (50 + 40 * (I + 1), 50,for int new false
		}
		this)); 
	    
		// Missile m = null; sebelumnya 
		
		//int x = 50, y = 50; // perlu dicoret
		Image offScreenImage = null;

		
		public void paint(Graphics g) { 
			
			g.drawString("missiles count: " + missiles.size(), 10, 50);	
			g.drawString("explodes count: " + explodes.size(), 10, 70);
			
			//Draw the shells in the container one by one
			for int (i = 0; i < missiles.size(); i++) { 
				Missile m = missiles.get(i); 
				m.hitTank(enemyTank); 
				m.draw(g); 
			
			//if(!m.isLive()) missiles.remove(m); 
			//else m.draw(g); 
			} 
			//Draw the explosions in the container one by one
			
			for(int i = 0; i < explodes.size(); i++) { 
				Explode e = explodes.get(i); 
				e.draw(g); 
			}
			myTank.draw(g); 
			enemyTank.draw(g); 
			} 
			
		
			//if(m != null) m.draw(g);
			//Color c = g.getColor(); 
			//g.setColor(Color.RED); 
			//g.fillOval(x, y, 30, 30); 
			//g.setColor(c);

			//y += 5;
			//}
			
		public void update(Graphics g) {
			if(offScreenImage == null) {
			offScreenImage = this.createImage(GAME_WIDTH,
			GAME_HEIGHT);
			}	
			
		Graphics gOffScreen = offScreenImage.getGraphics();
		
		Color c = gOffScreen.getColor(); 
		gOffScreen.setColor(Color.GREEN); 
		gOffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT); 
		gOffScreen.setColor(c);
		print(gOffScreen); 
		g.drawImage(offScreenImage, 0, 0, null);
		}
		
		public void launchFrame() { 
			this.setLocation(300, 50); 
			this.setSize(GAME_WIDTH, GAME_HEIGHT); 
			this.setTitle("TankWar"); 
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) { 
					System.exit(0);
			}
			});
					
			this.setResizable(false); 
			this.setBackground(Color.GREEN);

			this.addKeyListener(new KeyMonitor()); 
			setVisible(true);
			new Thread(new PaintThread()).start();
			}

			public static void main(String[] args) { 
			TankClient tc = new TankClient(); 
			tc.launchFrame();
			}
			
			private class PaintThread implements Runnable {
				public void run() {
					while(true) { repaint(); 
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) { 
						e.printStackTrace();
					}
				}
			
			private class KeyMonitor extends KeyAdapter {

				public void keyPressed(KeyEvent e) { 
					myTank.KeyPressed(e);
				}

				public void keyReleased(KeyEvent e) { 
					myTank.keyReleased(e);
				}
			}
}

					

	