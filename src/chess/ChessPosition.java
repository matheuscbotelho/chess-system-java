package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
<<<<<<< HEAD

	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}

=======
	
	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
>>>>>>> 5995aa2a8d09db4dd1ec908260fb89cf8f9bd8ae
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 5995aa2a8d09db4dd1ec908260fb89cf8f9bd8ae
