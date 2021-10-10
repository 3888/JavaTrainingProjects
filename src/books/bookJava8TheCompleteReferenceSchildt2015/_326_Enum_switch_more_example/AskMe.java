package books.bookJava8TheCompleteReferenceSchildt2015._326_Enum_switch_more_example;


class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("HeT");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Boзможнo");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
