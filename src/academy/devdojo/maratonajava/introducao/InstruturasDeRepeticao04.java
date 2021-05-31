package academy.devdojo.maratonajava.introducao;

public class InstruturasDeRepeticao04 {
    public static void main(String[] args) {

        // Dado o valor do carro, descubra em quantas ele pode ser parcelado
        // Condição da parcela >= 1000

        double valuetotal = 30000;
        for (int parcel = 1; parcel < valuetotal; parcel++) {
            double valueParcel = valuetotal / parcel;
            if (valueParcel < 1000){
                break;
            }
            System.out.println("Parcela "+parcel +"R$ "+valueParcel);
        }
    }
}
