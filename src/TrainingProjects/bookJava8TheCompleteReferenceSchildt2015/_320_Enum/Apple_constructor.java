package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._320_Enum;

// Перечисление  сортов  яблок
public enum Apple_constructor {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price; // цена яблока каждого сорта

    // Конструктор
    Apple_constructor(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
