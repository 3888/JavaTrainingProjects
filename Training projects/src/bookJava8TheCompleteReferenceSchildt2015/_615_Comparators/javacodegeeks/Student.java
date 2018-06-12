package bookJava8TheCompleteReferenceSchildt2015._615_Comparators.javacodegeeks;

public class Student {
    private String name;
    private int age;
    private String lesson;
    private int grade;

    private Student() {
    }

    public Student(String name, int age, String lesson, int grade) {
        super(); // зачем он тут?
        this.name = name;
        this.age = age;
        this.lesson = lesson;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "[name=" + this.name + ", age=" + this.age + ", lesson="
                + this.lesson + ", grade=" + this.grade + "]";
    }

    public static Builder newBuilder() {
        return new Student().new Builder();
    }

    public class Builder {

        private Builder() {
            // private constructor
        }

        public Builder setName(String name) {
            Student.this.name = name;

            return this;
        }

        public Builder setAge(int age) {
            Student.this.age = age;

            return this;
        }

        public Builder setLesson(String lesson) {
            Student.this.lesson = lesson;

            return this;
        }

        public Builder setGrade(int grade) {
            Student.this.grade = grade;

            return this;
        }

        public Student build() {
            return Student.this;
        }
    }
}