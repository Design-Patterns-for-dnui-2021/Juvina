package tank_war;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Missile {
	public static final int XSPEED = 10;
	public static final int YSPEED = 10;
	
	public static final int WIDTH = 10;
	public static final int HEIGHT = 10;
	
	private int x, y; 
	Tank.Direction dir;
	
	private boolean live = true;
	
	public boolean isLive() {
		return live;
		}

	private TankClient tc;

	public Missile(int x, int y, Tank.Direction dir) {
		this.x = x; 
		this.y = y; 
		this.dir = dir;
		}
	
	public Missile(int x, int y, Tank.Direction dir, 
			TankClient tc) {
			this(x, y, dir);
			this.tc = tc;
			}
	

	public void draw(Graphics g) { 
		if(!live) {
			tc.missiles.remove(this); return;
			}
		Color c = g.getColor(); 
		g.setColor(Color.BLACK); 
		g.fillOval(x, y, WIDTH, HEIGHT);
		g.setColor(c);

		move();
		}

		
	private void move() { 
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
		}

			if(x < 0 || y < 0 || x > TankClient.GAME_WIDTH || y > 
			TankClient.GAME_HEIGHT) {
				live = false; 
				tc.missiles.remove(this);
			}
	}
			//Getrect () can just get the box wrapped outside the tank
			public Rectangle getRect() {
				return new Rectangle(x, y, WIDTH, HEIGHT);
			}
			
			//Intersects to judge whether the two squares intersect. 
			//if they collide, set both bullets and tanks to false
			
	
			public boolean hitTank(Tank t) {
				if(this.live && this.getRect().intersects(t.getRect()) && t.isLive() && this.good != t.isGood()) {
					t.setLive(false);
					this.live = false;
					Explode e = new Explode(t.getX(), t.getY(), tc);
					tc.explodes.add(e);
					return true;
				}
				return false;
			}
			
			public boolean hitTanks(List<Tank> tanks) {
				for(int i = 0; i < tanks.size(); i++) {
					if(hitTank(tanks.get(i))) {
						return true;
					}
				}
				return false;
			}
			
			public boolean hitWall(Wall w) {
				if(this.live && this.getRect().intersects(w.getRect())) {
					this.live = false;
					return true;
				}
				return false;
			}
			
			public boolean collidesWithTank(Tank t) {
				if(this.live && this.getRect().intersects(t.getRect()) && t.isLive() && this.god != t.isGood()) {
					if(t.isGood()) {
						t.setLife(t.getLife() - 20);
						if(t.getLife() <= 0) {
							t.setLive(false);
						}
					}else {
						t.setLive(false);
					}
					this.live = false;
					Explode e = new Explode(x, y, tc);
					tc.explode.add(e);
					return true;
				}
				return false;
			}
		}

			

			


