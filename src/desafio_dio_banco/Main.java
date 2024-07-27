package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente Marcelo = new Cliente();
		Marcelo.setNome("Marcelo");
		
         Conta cc = new ContaCorrente(Marcelo);
         cc.depositar(100);
         cc.transferir(100, cc);
         
         Conta poupanca = new ContaPoupança(Marcelo);
         cc.transferir(100, poupanca);
         
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
	}
      
}
