package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {

        double salaryYearly = 70000;
        double firstTrack = 9.70 / 100;
        double secondTrack = 37.35 / 100;
        double thirdTrack = 49.50 / 100;
        double valueTax;

        if (salaryYearly <= 34712){
            valueTax = salaryYearly * firstTrack;

        }else if (salaryYearly>= 34713 && salaryYearly <=68507){
            valueTax = salaryYearly * secondTrack;

        }else {
            valueTax = salaryYearly * thirdTrack;
        }
        System.out.println(valueTax);
    }
}
