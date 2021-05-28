package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {

//        + - / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;
        System.out.println(result);

//        %
        int rest = 21 % 7;
        System.out.println(rest);

//        < > <= >= == !=
        boolean isTenBiggerThenTwenty = 10 > 20;
        boolean isTenSmallerThenTwenty = 10 < 20;
        boolean isTenEqualTwenty = 10 == 20;
        boolean isTenEqualTen = 10 == 10;
        boolean isTenDifferentTen = 10 != 10;

        System.out.println("isTenBiggerThenTwenty "+isTenBiggerThenTwenty);
        System.out.println("isTenSmallerWhatTwenty "+isTenSmallerThenTwenty);
        System.out.println("isTenEqualTwenty "+isTenEqualTwenty);
        System.out.println("isTenEqualTen "+isTenEqualTen);
        System.out.println("isTenDifferentTen "+isTenDifferentTen);


//        && (AND)

        int age = 29;
        float salary = 3500F;
        boolean isInTheLawBiggerThenThirty = age >= 30 && salary >= 4612;
        boolean isInTheLawSmallerThenThirty = age < 30 && salary >= 3381;

        System.out.println("isInTheLawBiggerThenThirty "+isInTheLawBiggerThenThirty);
        System.out.println("isInTheLawSmallerThenThirty "+isInTheLawSmallerThenThirty);


//        || (OR)

        double valueTotalCurrentAccount = 200;
        double valueTotalSavingAccount = 10000;
        float valuePlaystation = 5000F;
        boolean isPlaystationFiveBuyable = valueTotalCurrentAccount > valuePlaystation || valueTotalSavingAccount > valuePlaystation;
        System.out.println("isPlaystationFiveBuyable "+isPlaystationFiveBuyable);

//

    }
}
