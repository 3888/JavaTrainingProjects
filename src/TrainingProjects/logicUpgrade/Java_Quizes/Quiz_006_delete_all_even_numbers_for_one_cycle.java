package TrainingProjects.logicUpgrade.Java_Quizes;


import java.util.ArrayList;
import java.util.List;

public class Quiz_006_delete_all_even_numbers_for_one_cycle {

    public static void main(String[] args) {
//         ����� ����� ������ �������� �� ���� ����� � ������� �����:

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int i = 0;

   while (i < list.size() &&
           list.get(i) % 2 != 0){
       list.remove(i + 1);
       i++;
   }


//        for (int i = 0; i <= list.size();i++){
//            if(list.get(i) % 2 == 0){
//                list.remove(i);
//            }
//        }

        System.out.println(list);
    }

}