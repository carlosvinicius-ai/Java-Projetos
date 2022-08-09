
public class ContaEspecial extends ContaBancaria{
	public float limite;
	public ContaEspecial() {
		super();
		this.limite=5000;
	}
	
	public void depositar(float valor) {
		this.saldo+=valor;
	}
	public void sacar(float valor) {
		if (saldo+limite-valor>=0)
			this.saldo-=valor;
		else 
			System.out.println("sem fundo suficiente");
	}
	
	public void calcManutencao() {
		saldo-=50;
	}
	
	public void infoConta() {
		System.out.println("=====================\n");
		System.out.println("Conta Especial");
		System.out.println("Nome: " + nome);
		System.out.println("Conta: "+ conta);
		System.out.println("Disponível: " +(saldo+limite));
		System.out.println("\n=====================");
	}
	
}