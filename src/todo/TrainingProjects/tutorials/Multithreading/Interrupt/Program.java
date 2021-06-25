package todo.TrainingProjects.tutorials.Multithreading.Interrupt;

/**
 * Created by 3888 on 22.07.2015.
 */
public class Program {

    //Переменая, которой оперирует инкременатор
    public static int mValue = 0;

    static Incremenator mInc;    //Объект побочного потока
    static Incremenator mInc2;    //Объект побочного потока
    static Incremenator mInc3;    //Объект побочного потока
    static Incremenator mInc4;    //Объект побочного потока

    public static void main(String[] args) {
        mInc = new Incremenator();    //Создание потока

        System.out.println("Значение = ");

        mInc.start();    //Запуск потока

//        mInc2 = new Incremenator();	//Создание потока
//
//        System.out.println("Значение2 = ");
//
//        mInc2.start();
//        mInc3 = new Incremenator();	//Создание потока
//
//        System.out.println("Значение3 = ");
//        mInc3.start();
//
//        mInc4 = new Incremenator();	//Создание потока
//
//
//        System.out.println("Значение4 = ");
//
//
//        mInc4.start();

        //Троекратное изменение действия инкременатора с интервалом в i*2 секунд
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(i * 2 * 1000);        //Ожидание в течении i*2 сек.
            } catch (InterruptedException e) {
            }

            mInc.changeAction();    //Переключение действия
//            mInc2.changeAction();	//Переключение действия
//            mInc3.changeAction();	//Переключение действия
//            mInc4.changeAction();	//Переключение действия

        }

        mInc.interrupt();    //Прерывание побочного потока
//        mInc2.interrupt();	//Прерывание побочного потока
//        mInc3.interrupt();	//Прерывание побочного потока
//        mInc4.interrupt();	//Прерывание побочного потока
    }


}
