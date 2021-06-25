package todo.TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._227_Dinami4eskaya_distep4erizaciya_metodov;

//http://www.cyberforum.ru/java-j2se/thread643192.html
//http://javatalks.ru/topics/45734?page=1#234477
//http://ru.stackoverflow.com/questions/232419/%D0%9E%D0%B1%D1%8A%D1%8F%D1%81%D0%BD%D0%B8%D1%82%D0%B5-%D0%BD%D0%B0%D0%B3%D0%BB%D1%8F%D0%B4%D0%BD%D0%BE-%D1%80%D0%B0%D0%B7%D0%BD%D0%B8%D1%86%D1%83-%D1%80%D0%B0%D0%BD%D0%BD%D0%B5%D0%B3%D0%BE-%D0%B8-%D0%BF%D0%BE%D0%B7%D0%B4%D0%BD%D0%B5%D0%B3%D0%BE-%D1%81%D0%B2%D1%8F%D0%B7%D1%8B%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F-%D0%BC%D0%B5%D1%82%D0%BE%D0%B4%D0%BE%D0%B2

public class Dispatch {
    public static void main(String[] args) {

        A a = new A(); // объект класса A
        B b = new B(); // объект класса В
        C c = new C(); // объект класса С

        A r;    // получить ссылку на объект типа A

        r = a;        // переменная r ссылается на объект типа A
        r.callMe();    // вызвать вариант метода callMe (), определенный в классе A

        r = b;        // переменная r ссылается на объект типа В
        r.callMe();    // вызвать вариант метода callMe (), определенный в классе В

        r = c;        // переменная r ссылается на объект типа С
        r.callMe();    // вызвать вариант метода callMe (), определенный в классе С
    }
}
