package Problem3;

public class Rook extends Piece {
	public Rook(int row,int col,boolean color) {
		super(row,col,color);
	}

	@Override
	public boolean isLegalMove(Pos from, Pos to) {
		return from.col == to.col || from.row == to.row;
	}
}