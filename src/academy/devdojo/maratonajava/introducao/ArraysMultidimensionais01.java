package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {

        //1, 2, 3, 4, 5 Meses
        // 31, 28, 31, 30 Dias

        int [][] days = new int[3][3];
        days[0][0]= 31;
        days[0][1]= 28;
        days[0][2]= 30;

        days[1][0]= 31;
        days[1][1]= 28;
        days[1][2]= 30;

        for (int i = 0; i < days.length ; i++) {
            for (int j = 0; j < days[0].length ; j++) {
                System.out.println(days[i][j]);

            }
        }
    }
}