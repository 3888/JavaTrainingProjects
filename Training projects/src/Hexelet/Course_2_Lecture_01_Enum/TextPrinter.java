package Hexelet.Course_2_Lecture_01_Enum;
public class TextPrinter {
	public static void showText(String text, EStyle style) {
		System.out.println(style.getStyleString() + text
				+ style.getStyleString());
	}

	public static void main(String[] args) {
		showText("Text1", EStyle.valueOf("DOLLAR_STYLE"));
		showText("Text2", EStyle.A_STYLE);

		for (EStyle style : EStyle.values()) {
			showText("ALL STYLES", style);
		}

		System.out.println("Supported styles :");
		{
			for (EStyle style : EStyle.values()) {
				System.out.println("- " + style.toString());
			}
		}
	}
}

// showText("Text3", EStyle.valueOf("sss"));

// switch (style) {
// case DOLLAR_STYLE:
// System.out.println("$" + text + "$");
// break;
// case A_STYLE:
// default:
// System.out.println("@" + text + "@");
//
// }
