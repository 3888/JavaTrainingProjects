package android.study.EugenQuizes;

//  ѕрименение оператора break  во  вложенных  циклах
class BreakLoop_вихід_з_двох_циклів {

    private static boolean cycleIsRunning = true;
    private static int i = 0;
    private static int j = 0;

    public static void main(String args[]) {

//        тут треба щоб після і==10 виходило
//        breakDoubleLoopViaBreak();

//        є 2 вічних цикла, через 10 кроків треба вийти з обох
//        але break 1 юзати можна лише у внутнішньому
//        breakDoubleLoopViaReturn();
//        breakDoubleLoopViaLabel();
//        breakDoubleLoopViaBoolean();

    }

    private static void breakDoubleLoopViaBreak() {
//це вже набагато краще))

        while (true) {
            while (true) {
                i++;
                System.out.println(i);
                if (i == 10) {
                    break;
                }
            }
            break;
        }
    }

    private static void breakDoubleLoopViaBoolean() {
//OK
        while (cycleIsRunning) {
            while (true) {
                i++;
                System.out.println("i = " + i);
                if (i == 10) {
                    i = 0;
                    j++;
                    System.out.println("j = " + j);
                    if (j == 2) {
                        cycleIsRunning = false;
                        break;
                    }
                }
            }
        }
    }

    private static void breakDoubleLoopViaLabel() {
        //        красава тільки outerLoop: після циклу
        mainLoop:
        while (true) {
            while (true) {
                i++;
                System.out.println("i = " + i);
                if (i == 10) {
                    i = 0;
                    j++;
                    System.out.println("j = " + j);
                    if (j == 2) {
                        break mainLoop;
                    }
                }
            }
        }
    }

    private static void breakDoubleLoopViaReturn() {
        while (true) {
            while (true) {
                i++;
                System.out.println("i = " + i);
                if (i == 10) {
                    i = 0;
                    j++;
                    System.out.println("j = " + j);
                    if (j == 2) {
                        return;
                    }
                }
            }
        }
    }


}


//        int i = 0;
//        int j = 0;
//
//        while (j < 2) {
//            while (true) {
//                i++;
//                if (i == 10) {
//                    i = 0;
//                    break;
//                }
//            }
//            j++;
//        }


//        while (true) {
//                while (true) {
//                i++;
//                System.out.println("i = " + i);
//                if (i == 10) {
//                i = 0;
//                break;
//                }
//                }
//
//                j++;
//                if (j == 2) {
//                break;
//                }
//                }


//переускладнив дуже  + while(true) міняти не можна
// і нащо тобі 'і' + 'count'?
// 'і' ти ніде на юзаєш
//    int i = 0;
//    int count = 0;
//    boolean endCycle = true;
//
//        while (endCycle) {
//                while (endCycle) {
//                i++;
//                count += 1;
//                if (count == 10) {
//                endCycle = false;
//                }

