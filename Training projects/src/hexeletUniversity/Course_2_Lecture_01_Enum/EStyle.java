package hexeletUniversity.Course_2_Lecture_01_Enum;
public enum EStyle {
	DOLLAR_STYLE("$"){

	}, A_STYLE("@"), B_STYLE("#"), C_STYLE ("%"), EMPTY_STYLE ("");

	private final String styleString;

	EStyle(String styleString) {
		this.styleString = styleString;
	}

	public String getStyleString() {
		return styleString;
	}

}