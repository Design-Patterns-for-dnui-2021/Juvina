package tank_war;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;


	public class Tank {
		public static final int XSPEED = 5;
		public static final int YSPEED = 5;
		
		public static final int WIDTH = 30; 
		public static final int HEIGHT = 30;
		
		TankClient tc = null;

		private int x, y;
		private boolean good;
			private boolean bL = false,
						bU = false, 
						bR = false, 
						bD = false;
			
			enum Direction {L, LU, U, RU, R, RD, D, LD, STOP};

			private Direction dir = Direction.STOP;
		
	//Ptdir represents the direction of the barrel, and the default direction is downward
			private Direction ptDir = Direction.D;
			
			public Tank(int x, int y, boolean good) { 
				this.x = x;
				this.y = y;
				this.good = good;
			}
			
			public Tank(int x, int y, boolean good, TankClient tc) { 
				this(x, y, good);
				this.tc = tc;
			}

			public void draw(Graphics g) { 
				g.drawString("tanks count: " + tanks.size(), 10, 90); 
				Color c = g.getColor(); 
			//Display different tanks in different colors
				if(good) {
					g.setColor(Color.RED);
					} 
				else {
					g.setColor(Color.BLUE);
					}
				g.fillOval(x, y, WIDTH, HEIGHT); 
				g.setColor(c);
				
				move();
		
				//Determine the direction of the barrel and draw the barrel 
				//by simulating the direction
				
				switch(ptDir) {
				case L:
					g.drawLine(x + Tank.WIDTH /2 , y + Tank.HEIGHT / 2, x, y + Tank.HEIGHT / 2);
					break; 
				case LU:
					g.drawLine(x + Tank.WIDTH /2 , y + Tank.HEIGHT /
					2, x, y);
					break;
				case U:
					g.drawLine(x + Tank.WIDTH /2 , y + Tank.HEIGHT / 2, x + Tank.WIDTH /2, y);
					break; 
				case RU:
					g.drawLine(x + Tank.WIDTH /2 , y + Tank.HEIGHT / 2, x + Tank.WIDTH, y);
					break; 
				case R:
					g.drawLine(x + Tank.WIDTH /2 , y + Tank.HEIGHT / 2, x + Tank.WIDTH, y + Tank.HEIGHT / 2);
					break; 
				case RD:
					g.drawLine(x + Tank.WIDTH /2 , y + Tank.HEIGHT / 2, x + Tank.WIDTH, y + Tank.HEIGHT);
					break; 
				case D:
					g.drawLine(x + Tank.WIDTH /2 , y + Tank.HEIGHT / 2, x + Tank.WIDTH /2, y + Tank.HEIGHT);
					break; 
				case LD:
					g.drawLine(x + Tank.WIDTH /2 , y + Tank.HEIGHT / 2, x, y + Tank.HEIGHT);
					break; 
				case STOP:
					break;
					}
					}

					void move() {
					switch(dir) {
					
					case L:
						x -= XSPEED;
						break; 
					case LU:
						x-= XSPEED; 
						y -= YSPEED;
						break; 
					case U:
						y-= YSPEED;
						break; 
					case RU:
						x += XSPEED; 
						y -= YSPEED;
						break; 
					case R:
						x += XSPEED;
						break; 
					case RD:
						x += XSPEED; 
						y += YSPEED;
						break; 
					case D:
						y += YSPEED;
						break; 
					case LD:
						x -= XSPEED; 
						y += YSPEED;
						break; 
					case STOP:
						break;
						}

					//Transmit the direction of the tank to the barrel to make the barrel 
					//consistent with the direction of the tank						
					
					if(this.dir != Direction.STOP) {
						this.ptDir = this.dir;
						}
					
					if(x < 0) x = 0;
					if(y < 25) y = 25;
					if(x + Tank.WIDTH > TankClient.GAME_WIDTH) x = 
							TankClient.GAME_WIDTH - Tank.WIDTH;
					if(y + Tank.HEIGHT > TankClient.GAME_HEIGHT) y = 
							TankClient.GAME_HEIGHT - Tank.HEIGHT;
					}
					
				public void KeyPressed(KeyEvent e) { 
					int key = e.getKeyCode(); 
						switch(key) {
					case KeyEvent.VK_LEFT: 
						bL = true;
						break;
					case KeyEvent.VK_UP: 
						bU = true; 
						break;
					case KeyEvent.VK_RIGHT: 
						bR = true;
						break;
					case KeyEvent.VK_DOWN: 
						bD = true;
						break;
					}
					locateDirection();
					}

			public void keyReleased(KeyEvent e) { 
					int key = e.getKeyCode(); 
					switch(key) {
				case KeyEvent.VK_CONTROL: 
					fire();
					break;
				case KeyEvent.VK_LEFT: 
					bL = false;
					break;
				case KeyEvent.VK_UP: 
					bU = false; 
					break;
				case KeyEvent.VK_RIGHT: 
					bR = false;
					break;
				case KeyEvent.VK_DOWN: 
					bD = false;
					break;
					}
				locateDirection();
			}

			void locateDirection() {
				if(bL && !bU && !bR && !bD) dir = Direction.L;
				else if(bL && bU && !bR && !bD) dir = Direction.LU; 
				else if(!bL && bU && !bR && !bD) dir = Direction.U; 
				else if(!bL && bU && bR && !bD) dir = Direction.RU; 
				else if(!bL && !bU && bR && !bD) dir = Direction.R; 
				else if(!bL && !bU && bR && bD) dir = Direction.RD; 
				else if(!bL && !bU && !bR && bD) dir = Direction.D; 
				else if(bL && !bU && !bR && bD) dir = Direction.LD; 
				else if(!bL && !bU && !bR && !bD) dir =
			Direction.STOP;
				}	
				
		public Missile fire() {
			//Make sure the bullet appears in the middle of the tank
			int x = this.x + Tank.WIDTH / 2 - Missile.WIDTH / 2;
			int y = this.y + Tank.HEIGHT /2 - Missile.WIDTH / 2;
			
			//Pass the current position and direction of the tank to the bullet
			//And now the initialization of bullets is no longer determined by the tank, but by the barrel
			Missile m = new Missile(x, y, ptDir, this.tc); 
			tc.missiles.add(m);
			return m;
}
	
	


	



	
	