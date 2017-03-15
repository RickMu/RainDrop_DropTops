
public class Board {
	
	private int dimensions;
	private String[][] board;

	public Board( String[][] newboard) {
		this.dimensions = newboard.length;
		this.board = newboard;
	}

	public String[][] getBoard(){
		return this.board;
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
	public boolean cellMoveable(int i, int j) {
		return false;
	}



}
