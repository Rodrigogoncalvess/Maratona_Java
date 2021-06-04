package academy.devdojo.maratonajava.javacore.Kenum;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("João",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
//        Cliente cliente3 = new Cliente("Pedro",TipoCliente.PESSOA_FISICA);
//        Cliente cliente4 = new Cliente("João",TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 =TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física" );
        System.out.println(tipoCliente2);
//        System.out.println(cliente3);
//        System.out.println(cliente4);



    }
}
