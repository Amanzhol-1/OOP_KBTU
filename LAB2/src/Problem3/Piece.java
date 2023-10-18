package Problem3;

public abstract class Piece extends Board{
	private boolean touched;
	private boolean color;
	private boolean eaten;
	Pos pos;
	public Piece(int row,int col, boolean color) {
		pos = new Pos(row,col);
		touched = false;
		this.color = color;
		this.eaten = false;
	}
	public boolean isLegalMove(Pos from,Pos to) {
		return false;
	}
	public Pos getPos() {
		return pos;
	}
	public boolean getTouched() {
		return touched;
	}
	public boolean getColor() {
		return color;
	}
	public boolean getEaten() {
		return eaten;
	}
	public void setTouched(boolean touched) {
		this.touched = touched;
	}
	public  void setColor(boolean color) {
		this.color = color;
	}
	public  void setEaten(boolean eaten) {
		this.eaten = eaten;
		this.pos = null;
	}
	public String toString() {
		return " r " +  Integer.toString(pos.row) + " c " + Integer.toString(pos.col);
	}
}