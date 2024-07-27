package desafio_dio_banco;

import java.util.List;

public class Banco {
     public String nome;
     private List<Conta> contas;
     private List<Cliente> clientes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
     
     
}
