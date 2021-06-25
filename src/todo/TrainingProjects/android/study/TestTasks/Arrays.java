package todo.TrainingProjects.android.study.TestTasks;

class Arrays {
	public static void main(String[] arg) {

//		int[] numbers = { -99, 6, 0, -59 };
//		int min = numbers[0];
//		for (int i = 0; i < numbers.length; i++) {
//			if (min > numbers[i]) {
//				min = numbers[i];
//			}
//		}
//
//		System.out.println("ћинимальное число " + min);

		// создание и инициализация массива
		int[] numberArray = new int[10];
		for (int i = 0; i < 10; i++) {
			numberArray[i] = i + 1;
		}
		// вывод значений на консоль

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "-й элемент массива = "
					+ numberArray[i]);

//
//		String str = "1";
//		str += "2";
//
//		System.out.println(str); // 12
//
//
//		int i = 13579;
//	    String s = ""+i;
//	    System.out.println(s.length()+" цифр"+" последняя "+s.charAt(s.length()-1));

		}
	}
}