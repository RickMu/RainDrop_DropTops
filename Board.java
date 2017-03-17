public class Board {

	private int dimensions;
	private String[][] board;

	public Board(String[][] newboard) {
		this.dimensions = newboard.length;
		int i,j;
		board = new String[dimensions][dimensions];
		for (i=0;i<dimensions;i++) {
			for (j=0;j<dimensions;j++) {
				board[i][j] = newboard[i][j];
			}
		}
		//this.board = newboard;
	}
	/** Returns the size of the board. */

	public int getDimensions() {
		return dimensions;
	}
	/** Gets the value of the cell in (i,j). */
	public String getCell(int i, int j) {
		String thiscell = board[i][j];
		return thiscell;
	}
	/** Changes the value of the cell (i,j) for this board. */
	public void changeCell(int i, int j, String value) {
		this.board[i][j] = value;
	}
	/** Returns the 2d array of this board. */
	public String[][] getBoard() {
		return this.board;
	}
	/** Prints the board. */
	public void printBoard(){
		for(String[] row: board) {
			for (String cell : row)
				System.out.print((cell));
			System.out.println();
		}
	}

	/** Rotates board clockwise. */
	public static Board rotateBoard(Board board) {
		Board rotatedBoard = new Board(board.getBoard());
		int ri, rj;
		for(ri=0; ri < rotatedBoard.dimensions;ri++) {
			for (rj=0; rj < rotatedBoard.dimensions;rj++) {
				//System.out.println("rotated=(" + rj + "," + (dimensions-1-ri) + ") old=(" + ri + "," + rj + ")");
				rotatedBoard.changeCell(rj, rotatedBoard.dimensions-1-ri, board.getCell(ri, rj));
			}
		}
		return rotatedBoard;
	}

	public boolean pieceMoveable(int i, int j) {
		// Check right.
		if (j+1 <= dimensions && board[i][j+1] == "+") {return true;}
		// Check up.
		if (i-1 < 0 && board[i][j+1] == "+" ) {return true;}
		// Check down.
		if (i+1 <=dimensions && board[i+1][j] == "+" ) {return true;}
		return false;
	}


}

