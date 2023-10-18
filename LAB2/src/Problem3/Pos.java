package Problem3;
public class Pos {
	int row;
	int col;
	public Pos(int row,int col) {
		this.row = row;
		this.col = col;
	}
	public String toString() {
		return " r "+ Integer.toString(row) + " c " + Integer.toString(col);
	}
}
