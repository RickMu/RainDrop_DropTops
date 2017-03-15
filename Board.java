
public class Board {
	
	private int dimensions;
	private String[][] board;

	public Board(int dimensions, String[][] newboard) {
		this.dimensions = dimensions;
		board = new String[dimensions][dimensions];
		this.board = newboard; 		//Not sure about this.
	}

	public int BoardSize() {
		return dimensions;
	}
	
	public String getCell(int i, int j) {
		return board[i][j];
	}
	
	
}
