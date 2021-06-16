package academy.devdojo.maratonajava.javacore.classesinternas.test;

public class OuterClassesTest03 {
    private String name = "William";

    static class Nested {
        private String lastName = "Suane";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }

    }

    public static void main(String[] args) {
      OuterClassesTest03.Nested nested = new OuterClassesTest03.Nested();
        //  Nested nested = new Nested();
        nested.print();

    }

}
