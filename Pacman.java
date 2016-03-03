
public class Pacman extends Movable{
	private int livesLeft;
	
	public Pacman(int x, int y) {
		super(x, y);
		livesLeft = 3;
	}
	
	public boolean stillAlive(){
		return livesLeft > 0;
	}
	
	private void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
    		if (key == KeyEvent.VK_LEFT) {
        		super.moveLeft();}
		if (key == KeyEvent.VK_RIGHT) {
			 Direction = 1;}
		if (key == KeyEvent.VK_UP) {
        		Direction = 2;}
		if (key == KeyEvent.VK_DOWN) {
        		Direction = 3;}
	}
}
