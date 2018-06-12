package texnopark.Polymorphism;

public class Example {


    public static void main(String[] args) {
        Child child = new Child();
        Parent parentChild = child;

        child.test();
        parentChild.test();


//            System.out.println("===Parent -> Child===");
//            Parent item = new Child();
//            item.inheritance();
//            item.parentBase();

//            System.out.println("===Child -> Child===");
//            Child other = new Child();
//            other.inheritance();
//            other.childBase();
//            other.parentBase();

//        System.out.println("===Exception_569===");
//        List<Parent> list = new ArrayList<>();
//        list.add(new Child());
//        list.add(new Parent());
//
////            Using for loop (old)
//        for (Parent p : list) {
//            p.inheritance();
//        }


    }
}
