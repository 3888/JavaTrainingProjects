package hexeletUniversity.Course_1_Lecture_05_Arrays_for_i_plus_plus;
public class Field {

	private static final int FIELD_SIZE = 3;
	private static final int FIELD_SIZE2 = 3;
	private static final char DEFAULT_CELL_VALUE = ' ';
	private char[][] field = new char[FIELD_SIZE][FIELD_SIZE2];

	public void eraseField() {
		for (int i = 0; i < FIELD_SIZE; i++) {
			eraseLine(i);

		}
	}

	public void showField() {
		System.out.println();
		for (int i = 0; i < FIELD_SIZE; i++) {
			for (int i2 = 0; i2 < FIELD_SIZE2; i2++) {
				showCell(i, i2);
			}
			System.out.println();

		}
		

	}

	private void eraseLine(int lineNumber) {
		for (int i = 0; i < FIELD_SIZE; i++) {
			field[i][lineNumber] = DEFAULT_CELL_VALUE;
		}
	}

	private void showCell(int x, int y) {

		System.out.print("[" + field[x][y] + "]");
	}
}
