package TrainingProjects.thread.interrupt;

/**
 * Created by 3888 on 22.07.2015.
 */
public class Program {

    //���������, ������� ��������� ������������
    public static int mValue = 0;

    static Incremenator mInc;	//������ ��������� ������
    static Incremenator mInc2;	//������ ��������� ������
    static Incremenator mInc3;	//������ ��������� ������
    static Incremenator mInc4;	//������ ��������� ������

    public static void main(String[] args)
    {
        mInc = new Incremenator();	//�������� ������

        System.out.println("�������� = ");

        mInc.start();	//������ ������

//        mInc2 = new Incremenator();	//�������� ������
//
//        System.out.println("��������2 = ");
//
//        mInc2.start();
//        mInc3 = new Incremenator();	//�������� ������
//
//        System.out.println("��������3 = ");
//        mInc3.start();
//
//        mInc4 = new Incremenator();	//�������� ������
//
//
//        System.out.println("��������4 = ");
//
//
//        mInc4.start();

        //����������� ��������� �������� ������������� � ���������� � i*2 ������
        for(int i = 1; i <= 3; i++)
        {
            try{
                Thread.sleep(i*2*1000);		//�������� � ������� i*2 ���.
            }catch(InterruptedException e){}

            mInc.changeAction();	//������������ ��������
//            mInc2.changeAction();	//������������ ��������
//            mInc3.changeAction();	//������������ ��������m
//            mInc4.changeAction();	//������������ ��������

        }

        mInc.interrupt();	//���������� ��������� ������
//        mInc2.interrupt();	//���������� ��������� ������
//        mInc3.interrupt();	//���������� ��������� ������
//        mInc4.interrupt();	//���������� ��������� ������
    }


}
