package Problem3;
public class Queen extends Piece {
	public Queen(int row,int col,boolean color) {
		super(row,col,color);
	}
	@Override
	public boolean isLegalMove(Pos from, Pos to) {
		int distcol = Math.abs(from.col - to.col);
		int distrow = Math.abs(from.row - to.row);
		return (from.col == to.col || from.row == to.row)|| distcol == distrow;
	}
}