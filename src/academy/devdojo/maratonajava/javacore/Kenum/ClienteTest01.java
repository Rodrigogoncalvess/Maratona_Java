package academy.devdojo.maratonajava.javacore.Kenum;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("João",TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);
//        Cliente cliente3 = new Cliente("Pedro",TipoCliente.PESSOA_FISICA);
//        Cliente cliente4 = new Cliente("João",TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
//        System.out.println(cliente3);
//        System.out.println(cliente4);



    }
}
