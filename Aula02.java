public class Aula02 {
    public static void main(String[] args) {
        // Criação do primeiro objeto p1
        ContaBancaria p1 = new ContaBancaria();
        p1.titular = "Maria";
        p1.saldo = 500;
        p1.apresentarSaldo();
        p1.depositar(2894);
        p1.sacar(820); 
        p1.exibirSaldo(); 

        // Criação do segundo objeto p2
        ContaBancaria p2 = new ContaBancaria();
        p2.titular = "Jose";
        p2.saldo = 1000;
        p2.apresentarSaldo();
        p2.depositar(512); 
        p2.sacar(420);    
        p2.exibirSaldo();  
    }
}
