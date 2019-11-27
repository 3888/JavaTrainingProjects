package TrainingProjects.thread.interrupt;

class Incremenator extends Thread
{
    private volatile boolean mIsIncrement = true;

    public void changeAction()	//������ �������� �� ���������������
    {
        mIsIncrement = !mIsIncrement;
    }

    @Override
    public void run()
    {
        do
        {
            if(!Thread.interrupted())	//�������� ����������
            {
                if(mIsIncrement) Program.mValue++;	//���������
                else Program.mValue--;			//���������

                //����� �������� �������� ����������
                System.out.print(Program.mValue + " ");
            }
            else {
                System.out.println("else + return");
                return;        //���������� ������
            }
            try{
                Thread.sleep(500);		//������������ ������ �� 0.5 ���.
            }catch(InterruptedException e){
                System.out.println("example " + Incremenator.currentThread().getName() + " InterruptedException + return");
                return;	//���������� ������ ����� ����������
            }
        }
        while(true);
    }
}