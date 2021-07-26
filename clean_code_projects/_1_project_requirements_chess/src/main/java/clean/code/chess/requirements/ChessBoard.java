package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");

        // the test is wrong? it should check the color too?- Cristi 2021
        if(IsLegalBoardPosition(xCoordinate, yCoordinate)&&validColor(xCoordinate,pieceColor)&&checkFreeSpace(xCoordinate,yCoordinate)){
           pawn.setXCoordinate(xCoordinate);
           pawn.setYCoordinate(yCoordinate);
           pieces[xCoordinate][yCoordinate]=pawn;

       }
       else
       {
           pawn.setXCoordinate(-1);
           pawn.setYCoordinate(-1);
       }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        //throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    return xCoordinate>=0&&xCoordinate<MAX_BOARD_WIDTH&&yCoordinate>=0&&yCoordinate<MAX_BOARD_HEIGHT;
    }

    public boolean validColor(int xCoordinate, PieceColor pieceColor )
    {

        if (pieceColor.equals(PieceColor.WHITE)) {
            return xCoordinate == 0 || xCoordinate == 1;
        }
        return xCoordinate == MAX_BOARD_WIDTH - 1 || xCoordinate == MAX_BOARD_WIDTH;
    }
    public boolean checkFreeSpace(int xCoordinate,int yCoordinate)
    {
        return pieces[xCoordinate][yCoordinate]==null;
    }
}