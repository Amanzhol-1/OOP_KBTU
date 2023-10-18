package Problem3;

import java.util.Vector;

public class Board {
    private Vector<Vector<Piece>> board;
    public Board() {
        board = new Vector<>(8);
        for (int i = 0; i < 8; i++) {
            Vector<Piece> row = new Vector<>(8);
            for (int j = 0; j < 8; j++) {
                row.add(null);
            }
            board.add(row);
        }
    }
    public void placePiece(Piece piece, Pos position) {
        board.get(position.row - 1).set(position.col - 1, piece);
    }
    public boolean movePiece(Pos from, Pos to) {
    	boolean pawneat = false;
    	Piece piece = board.get(from.row - 1).get(from.col - 1);
    	Piece othpiece = getPieceAt(to);	
    	if(othpiece != null && piece instanceof Pawn && othpiece.getColor() != piece.getColor()) {
    		if(piece.getColor()) {
    			pawneat = ((from.col == to.col + 1)||(from.col == to.col - 1)) && (from.row == to.row + 1);
    		}
    		else {
    			pawneat = ((from.col == to.col + 1)||(from.col == to.col - 1)) && (from.row == to.row - 1);
    		}
    	}
	    if (piece != null && (piece.isLegalMove(from, to) || pawneat)) {
	    	if(othpiece != null) {
		    	if(othpiece.getColor() != piece.getColor()) {
		    		eatPiece(othpiece);
		        }
		    	else{
		    		System.out.println("Invalid move.");
		    		return false;
		    	}
	    	}
	        board.get(to.row - 1).set(to.col - 1, piece);
	        board.get(from.row - 1).set(from.col - 1, null);
	        piece.pos = to; 
	        return true;
	    } else {
	    	System.out.println("Invalid move.");
	        return false;
	    }
    }
    public void eatPiece(Piece piece) {
    	piece.setEaten(true);
    }
    public Piece getPieceAt(Pos position) {
        return board.get(position.row - 1).get(position.col - 1);
    }
    public Pos findPos(String s, int i) {
    	int col = 'h' - s.charAt(i) + 1;
    	int row = Character.getNumericValue(s.charAt(i + 1));
    	return new Pos(row, col);
    }
    public Piece findPiece(Pos pos) {
	    Piece piece = getPieceAt(pos);
	    return piece;
	}
    public void printBoard() {
    	System.out.print("--");
	    for (char c = 'h'; c >= 'a'; c--) {
	        System.out.print(" " + c + " ");
	    }
	    System.out.print("---");
	    System.out.println();
	    for (int row = 0; row < 8; row++) {
	        System.out.print((row + 1) + " ");
	        for (int col = 0; col < 8; col++) {
	            Piece piece = board.get(row).get(col);
	            if (piece == null || piece.getEaten()) {
	                System.out.print(" _ ");
	            } else if (piece instanceof Rook) {
	            	System.out.print(piece.getColor() ? " R " : " r ");
		        } else if (piece instanceof King) {
		        	System.out.print(piece.getColor() ? " K " : " k ");
		        } else if (piece instanceof Queen) {
		        	System.out.print(piece.getColor() ? " Q " : " q ");
		        } else if (piece instanceof Bishop) {
		          	System.out.print(piece.getColor() ? " B " : " b ");
		        } else if (piece instanceof Pawn) {
		        	System.out.print(piece.getColor() ? " P " : " p ");
		        } else if (piece instanceof Horse) {
		        	System.out.print(piece.getColor() ? " H " : " h ");
		        }
	        }
	    	System.out.println(" " + (row + 1));
	    }
	    System.out.print("--");
	    for (char c = 'h'; c >= 'a'; c--) {
	        System.out.print(" " + c + " ");
	    }
	    System.out.print("---");
	    System.out.println();
	}

}