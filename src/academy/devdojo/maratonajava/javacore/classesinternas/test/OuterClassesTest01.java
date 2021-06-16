package academy.devdojo.maratonajava.javacore.classesinternas.test;

    public class OuterClassesTest01 {
        private String name = "Monkey D. Luffy";

        class Inner {
            public void printOuterClassAttribute() {
                System.out.println(name);
                System.out.println(this);
                System.out.println(OuterClassesTest01.this);
            }
        }

    public static void main(String[] args) {
        OuterClassesTest01 outerClasses = new OuterClassesTest01();
        Inner inner = outerClasses.new Inner();
        Inner inner1= new   OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner1.printOuterClassAttribute();
    }
}
