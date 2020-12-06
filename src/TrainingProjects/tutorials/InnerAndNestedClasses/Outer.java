package TrainingProjects.tutorials.InnerAndNestedClasses;

public class Outer {
        // Простой вложенный класс
        class Inner {
            public void show() {
                System.out.println("Метод внутреннего класса");
            }
        }
        public static void main(String[] args) {
            Outer.Inner inner = new Outer().new Inner();
            inner.show();
        }
    }

