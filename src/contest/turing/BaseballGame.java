package contest.turing;

/*
    You are keeping score for a baseball game with strange rules. The game consists of several rounds,
    where the scores of past rounds may affect future rounds' scores.
        Atthe beginning of the game, you start with an empty record. You are given a list of strings ops ,
        where ops[i]  is the ith operation you must apply to the record and is one of the following:
0. An integer x - Record a new score of x .
0.  "+" - Record a new score that is the sum of the previous two scores it is guaranteed there will always be
two previous scores.
0.  "D" - Record a new score that is double the previous score. It is guaranteed there will always be a
previous score
0.  "c" - Invalidate the previous score, removing it from the record. It is guaranteed there will always
    be a previous score. Return the sum of all the scores on the record.
        */

import java.util.ArrayList;

public class BaseballGame {
    public static void main(String[] args) {

        String[] values = {"5", "2", "C", "D", "+"};
        System.out.println(callPoint(values));
    }

    public static int callPoint(String[] ops) {
        int result;

        ArrayList<Integer> values = new ArrayList<>();

        for (String op : ops) {
//            System.out.println(op);

            switch (op) {
                case "C":
                    values.remove(values.size() - 1);
                    break;
                case "+":
                    values.add(values.get(values.size() - 1) + values.get(values.size() - 2));
                    break;
                case "D":
                    values.add(values.get(values.size() - 1) * 2);
                    break;
                default:
                    values.add(Integer.parseInt(op));
                    break;
            }

//            System.out.println("values  size" + values.size());
//            System.out.println("values " + values);
        }

        /*
        https://stackoverflow.com/questions/16242733/sum-all-the-elements-java-arraylist
         */

         result = values.stream()
                .mapToInt(Integer::intValue)
                .sum();

        return result;

    }
}


