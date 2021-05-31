package academy.devdojo.maratonajava.introducao;

public class InstruturasDeRepeticao05 {
    public static void main(String[] args) {

        // Dado o valor do carro, descubra em quantas ele pode ser parcelado
        // Condição da parcela >= 1000
         double valueTotal = 30000;
        for (int parcel = (int) valueTotal; parcel >= 1 ; parcel--) {
            double valueParcel = valueTotal / parcel;
            if (valueParcel< 1000){
            continue;
            }
            System.out.println("Parcela "+parcel +"R$ "+valueParcel);
            
        }
    }

    }
