package logicUpgrade.Java_Quizes;

public class Quiz_009_задача_с_меткой {

//    хєрньою маєшся раз, continue не рекомендується юзати,
//    а з мітками взагалі треба руки ламати

//    мітки - хороші для того щоб виходити з декількох циклів вкладених

    public static void main(String[] args) {
        {
            a:
            for (int i = 1; i <= 3; i++) {
                b:
                for (int j = 1; j <= 3; j++) {
                    if (i <= 2 && j <= 2) {
                        continue a;
                    }

                    System.out.print(i + "" + j);
                }
            }
        }
    }
}

