package Problem3;
public class Bishop extends Piece {
	public Bishop(int row,int col,boolean color) {
		super(row,col,color);
	}
	@Override
	public boolean isLegalMove(Pos from, Pos to) {
		int distcol = Math.abs(from.col - to.col);
		int distrow = Math.abs(from.row - to.row);
		return distcol == distrow;
	}
}