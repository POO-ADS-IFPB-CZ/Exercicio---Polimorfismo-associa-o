package view;

import model.Cliente;
import model.ContaCorrente;
import model.Endereco;
import model.PessoaFisica;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new PessoaFisica(1000,
                new Endereco("Rua A", 30, "Cajazeiras"),
                "111.111.111-01", "João",
                LocalDate.of(1990,1,1));

        ContaCorrente contaCorrente = new ContaCorrente(1,1,
                0, LocalDate.now(), cliente,20);

        contaCorrente.depositar(500);
        contaCorrente.sacar(600);
        contaCorrente.aplicarTaxa();
        contaCorrente.sacar(800);

        System.out.println(contaCorrente.getSaldo());


    }
}