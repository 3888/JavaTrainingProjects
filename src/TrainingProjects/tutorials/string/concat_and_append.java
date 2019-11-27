package TrainingProjects.tutorials.string;

public class concat_and_append {
    public static void main(String[] args) {
//        http://www.javadomain.in/ifference-between-concat-and-append-in-java/

/*
concat():
        String has concat method, remember string is immutable.
        It adds a string to another string.
        It will create the new object after concatenation done, since it is a immutable.

append():
        StringBuilder and StringBuffer has append method, remember these two are mutable.
        It appends a char or char sequence to a string.
        It will not create a new object, since it is a mutable one.
        */


//Concatenating string with another string
        String helloVariable = "hello ";
        String worldVariable = "world";
        System.out.println(helloVariable.concat(worldVariable)); //hello world

//Appending string to string
        StringBuilder helloStrBuilderVariable = new StringBuilder("hello");
        StringBuilder worldStrBuilderVariable = new StringBuilder(" world");
        System.out.println(helloStrBuilderVariable.append(worldStrBuilderVariable)); //prints hello world

//Appending char to string
        StringBuilder charVariable = new StringBuilder("Java");
        System.out.println(charVariable.append('D')); // prints JavaD
    }
}
