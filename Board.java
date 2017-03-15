
public class Board {
	
	private int dimensions;
	private String[][] board;

	public Board( String[][] newboard) {
		this.dimensions = newboard.length;
		this.board = newboard;
	}

	public int BoardSize() {
		return dimensions;
	}
	
	public String getCell(int i, int j) {
		return board[i][j];
	}

	public void printBoard(){
		for(String[] row: board) {
			for (String cell : row)
				System.out.print((cell));
			System.out.println();
		}
	}
	
	
}
