package todo.TrainingProjects.android.study.TestTasks;
import java.util.ArrayList;
import java.util.Scanner;
//подгружем используемые утилиты 

public class ArrayListAddressBook {

	private static ArrayList<ArrayListUsersData> addressBook; // cоздаем ArrayList addressBook с параметрами ArrayListUsersData
	public static final int NO_USER = -1; 

	
	public static void main(String[] arg) { // запуск

		addressBook = new ArrayList<ArrayListUsersData>(); // инициализируем addressBookz

		Scanner scan = new Scanner(System.in); // инициализируем сканнер

		System.out.println("Please make your selection:"); // месседж
		System.out.println(""); // разрыв между строками
		System.out.println("add to add new User"); // месседж
		System.out.println("show to find User"); // месседж
		System.out.println("delete to delete User"); // месседж
		System.out.println("showall to show all Users"); // месседж

		boolean exit = false; // выход из массива 

		do  // используем массив do-while
		{ 

			System.out.println("Please make your selection:"); // месседж
		
			String selection = scan.nextLine(); // строка ввода данных через scanner(System.in)
			
			

			if (selection.equals("add")) { // если ввод равен ADD
				ArrayListUsersData data = new ArrayListUsersData(); // инициализируем ArrayListUsersData
				System.out.println("Please insert Area User Name:"); // месседж
				selection = scan.nextLine(); // ввод данных через scanner(System.in)
												
				data.setName(selection); // исп сеттер класса ArrayListUsersData
				addressBook.add(data); // добавляем данные в массив addressBook
				System.out.println("User " + selection + "  added"); // месседж

			}
			
			else if (selection.equals("show")) { //  если ввод равен SHOW
				System.out.println("Find User:");// месседж
				int userPosition = NO_USER; 
			
		        String tempString = scan.nextLine();// ввод данных через scanner(System.in)

				for (int i = 0; i < addressBook.size(); i++) // цикл приращения от 0 до addressBook.size

				{
					if (tempString.equals(addressBook.get(i).getName())) { // если соответсвие данных в  ArrayList<ArrayListUsersData> по i ячейке
						userPosition = i;
						break;
					}
				}

				if (userPosition != NO_USER) {
					System.out.println("User: "
							+ addressBook.get(userPosition).getName()
							+ " finded");
				}

				else {
					System.out.println("Користувача з таким ім’ям не існує!");
				}
			}



			else if (selection.equals("delete"))

			{
				System.out.println("Delete User:");
				selection = scan.nextLine(); 
				String tempString = scan.nextLine(); // ввод данных через scanner(System.in)
				for (int i = 0; i < addressBook.size(); i++) {
					if (tempString.equals(addressBook.get(i).getName())) {
						addressBook.remove(i);
					}
				}
				System.out.println("User: " + tempString + " deleted");
			}

			else if (selection.equals("showall")) {
				if (addressBook.size() > 0)

				{
					System.out.println("-*-*-*-*-*-*-*-*-*-*-*");
					for (int i = 0; i < addressBook.size(); i++) {

						int number = i + 1;
						System.out.println("User number: " + number + " "
								+ "User name: " + addressBook.get(i).getName());
					}

					System.out.println("-*-*-*-*-*-*-*-*-*-*-*");
				}

			} else if (selection.equals("exit")) {
				exit = true;
			}

			else {
				System.out.println("Невідома команда");
			}

		} while (!exit);

	}
}
