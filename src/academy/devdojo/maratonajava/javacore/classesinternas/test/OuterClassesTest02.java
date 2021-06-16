package academy.devdojo.maratonajava.javacore.classesinternas.test;

public class OuterClassesTest02 {
    private  String nome = "Midoriya";

    void print(/*String param*/){
      /*final*/ String lastName = "Izuku";
        class LocalClass{
            public void printLocal(){
//                System.out.println(param);
                System.out.println(nome+ " "+lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();


    }

}
