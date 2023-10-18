package Problem3;

import java.util.Scanner;

public class Main {
	public static boolean ochered = true;
    public static void main(String[] args) {
        Board board = new Board();
        Rook whiteRook = new Rook(1, 8, true);
        Rook whiteRook1 = new Rook(1,1, true);
        Horse whiteHorse = new Horse(1, 7, true);
        Horse whiteHorse1 = new Horse(1, 2, true);
        King whiteKing = new King(1, 5, true);
        Queen whiteQueen = new Queen(1, 4, true);
        Bishop whiteBishop = new Bishop(1, 3, true);
        Bishop whiteBishop1 = new Bishop(1, 6, true);
        Pawn whitePawn1 = new Pawn(2, 1, true);
        Pawn whitePawn2 = new Pawn(2, 2, true);
        Pawn whitePawn3 = new Pawn(2, 3, true);
        Pawn whitePawn4 = new Pawn(2, 4, true);
        Pawn whitePawn5 = new Pawn(2, 5, true);
        Pawn whitePawn6 = new Pawn(2, 6, true);
        Pawn whitePawn7 = new Pawn(2, 7, true);
        Pawn whitePawn8 = new Pawn(2, 8, true);
        
        Rook blackRook = new Rook(8, 8, false);
        Rook blackRook1 = new Rook(8, 1, false);
        Horse blackHorse = new Horse(8, 7, false);
        Horse blackHorse1 = new Horse(8, 2, false);
        King blackKing = new King(8, 5, false);
        Queen blackQueen = new Queen(8, 4, false);
        Bishop blackBishop = new Bishop(8, 3, false);
        Bishop blackBishop1 = new Bishop(8, 6, false);
        Pawn blackPawn1 = new Pawn(7, 1, false);
        Pawn blackPawn2 = new Pawn(7, 2, false);
        Pawn blackPawn3 = new Pawn(7, 3, false);
        Pawn blackPawn4 = new Pawn(7, 4, false);
        Pawn blackPawn5 = new Pawn(7, 5, false);
        Pawn blackPawn6 = new Pawn(7, 6, false);
        Pawn blackPawn7 = new Pawn(7, 7, false);
        Pawn blackPawn8 = new Pawn(7, 8, false);
        
        board.placePiece(whiteRook, whiteRook.pos);
        board.placePiece(whiteRook1, whiteRook1.pos);
        board.placePiece(whiteHorse, whiteHorse.pos);
        board.placePiece(whiteHorse1, whiteHorse1.pos);
        board.placePiece(whiteQueen, whiteQueen.pos);
        board.placePiece(whiteKing, whiteKing.pos);
        board.placePiece(whiteBishop, whiteBishop.pos);
        board.placePiece(whiteBishop1, whiteBishop1.pos);
        board.placePiece(whitePawn1, whitePawn1.pos);
        board.placePiece(whitePawn2, whitePawn2.pos);
        board.placePiece(whitePawn3, whitePawn3.pos);
        board.placePiece(whitePawn4, whitePawn4.pos);
        board.placePiece(whitePawn5, whitePawn5.pos);
        board.placePiece(whitePawn6, whitePawn6.pos);
        board.placePiece(whitePawn7, whitePawn7.pos);
        board.placePiece(whitePawn8, whitePawn8.pos);
        
        board.placePiece(blackRook, blackRook.pos);
        board.placePiece(blackRook1, blackRook1.pos);
        board.placePiece(blackHorse, blackHorse.pos);
        board.placePiece(blackHorse1, blackHorse1.pos);
        board.placePiece(blackQueen, blackQueen.pos);
        board.placePiece(blackKing, blackKing.pos);
        board.placePiece(blackBishop, blackBishop.pos);
        board.placePiece(blackBishop1, blackBishop1.pos);
        board.placePiece(blackPawn1, blackPawn1.pos);
        board.placePiece(blackPawn2, blackPawn2.pos);
        board.placePiece(blackPawn3, blackPawn3.pos);
        board.placePiece(blackPawn4, blackPawn4.pos);
        board.placePiece(blackPawn5, blackPawn5.pos);
        board.placePiece(blackPawn6, blackPawn6.pos);
        board.placePiece(blackPawn7, blackPawn7.pos);
        board.placePiece(blackPawn8, blackPawn8.pos);

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                board.printBoard();
                System.out.println(ochered  ? "White's turn" : "Black's turn");
                System.out.print("Enter move (ex 'e2e4'): ");
                String move = scanner.next();
                
                Pos from = board.findPos(move, 0);
                Pos to = board.findPos(move, 2);
                if(board.movePiece(from, to)) {
                	ochered = !ochered ;
                }
            }
        } 
    }
}
