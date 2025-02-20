class ContaBancaria {
    String titular;
    double saldo;

    void apresentarSaldo(){  // Mostrar o saldo antes da movimentação da conta junto com o nome do titular
        System.out.println("\n"+titular+", saldo:"+saldo);
    }

    void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Valor depositado: +" + valor);
    }

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso, valor: -" + valor);
        } else {
            System.out.println("Não permitido, saldo insuficiente."); //Opereção inválida, devido ao saldo insuficiente.
        }
    }
   //Saldo atualizado após todas as operações concluidas.
    void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
