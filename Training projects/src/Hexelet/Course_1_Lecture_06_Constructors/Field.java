package Hexelet.Course_1_Lecture_06_Constructors;
public class Field {

	private static final char DEFAULT_CELL_VALUE = ' ';
	private static final int MAX_FIELD_SIZE = 3;
	private static final int MIN_FIELD_SIZE = 0;
	private final int fieldSize;
	private final char[][] field;

	public Field() {
		this(MAX_FIELD_SIZE);
		System.out.println("In constructor1");

	}

	public Field(int size) {

		fieldSize = size;
		field = new char[fieldSize][fieldSize];
		System.out.println("In constructor2");
	}

	public void eraseField() {
		for (int i = 0; i < fieldSize; i++) {
			eraseLine(i);

		}
	}

	public int getFieldSize() {
		return fieldSize;
	}

	public void showField() {
		System.out.println();
		for (int i = 0; i < fieldSize; i++) {
			for (int i2 = 0; i2 < fieldSize; i2++) {
				showCell(i, i2);
			}
			System.out.println();

		}
		System.out.println();

	}

	private void eraseLine(int lineNumber) {
		for (int i = 0; i < fieldSize; i++) {
			field[i][lineNumber] = DEFAULT_CELL_VALUE;
		}
	}

	private void showCell(int x, int y) {

		System.out.print("[" + field[x][y] + "]");
	}
}

// public void setFieldSize(int newFieldSize) {
// if (newFieldSize > MIN_FIELD_SIZE && newFieldSize <MAX_FIELD_SIZE) {
// FieldSize = newFieldSize;
// }
// }