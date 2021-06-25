package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum;

// Перечисление  сортов  яблок
public enum Apple_constructor2 {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
    private int price; // цена яблока каждого сорта

    // Конструктор
    Apple_constructor2(int p) {
        price = p;
    }

    Apple_constructor2() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}
