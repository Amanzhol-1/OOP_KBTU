package Problem3;

public class Pawn extends Piece {
	public Pawn(int row,int col,boolean color) {
		super(row,col,color);
	}
	
    @Override
    public boolean isLegalMove(Pos from, Pos to) {
    	if (!this.getTouched()) {
            if (!this.getColor()) {
                return (from.col == to.col && from.row == to.row + 2) || (from.col == to.col && from.row == to.row + 1);
            } else {
                return (from.col == to.col && from.row == to.row - 2) || (from.col == to.col && from.row == to.row - 1);
            }
        } else {
            if (!this.getColor()) {
                return from.col == to.col && from.row == to.row + 1;
            } else {
                return from.col == to.col && from.row == to.row - 1;
            }
        }
    }
}