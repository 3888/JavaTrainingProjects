package TrainingProjects.tutorials.Multithreading.interrupt;


class Incremenator extends Thread
{
    private volatile boolean mIsIncrement = true;

    public void changeAction()	//Меняет действие на противоположное
    {
        mIsIncrement = !mIsIncrement;
    }

    @Override
    public void run()
    {
        do
        {
            if(!Thread.interrupted())	//Проверка прерывания
            {
                if(mIsIncrement) Program.mValue++;	//Инкремент
                else Program.mValue--;			//Декремент

                //Вывод текущего значения переменной
                System.out.print(Program.mValue + " ");
            }
            else {
                System.out.println("else + return");
                return;        //Завершение потока
            }
            try{
                Thread.sleep(500);		//Приостановка потока на 0.5 сек.
            }catch(InterruptedException e){
                System.out.println("example " + Incremenator.currentThread().getName() + " InterruptedException + return");
                return;	//Завершение потока после прерывания
            }
        }
        while(true);
    }
}