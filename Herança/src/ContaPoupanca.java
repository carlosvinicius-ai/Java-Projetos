
public class ContaPoupanca extends ContaBancaria{
	public int dtAniversario;
	public ContaPoupanca() {
		super();
		this.dtAniversario=1;
	}

	
	public void calcManutencao() {
		
	}
	
	public void infoConta() {
		System.out.println("\n=====================\n");
		System.out.println("Conta Poupança");
		System.out.println("Nome: " + nome);
		System.out.println("Conta: "+ conta);
		System.out.println("Aniversario: "+ dtAniversario);
		System.out.println("Disponível: " + saldo);
		System.out.println("\n=====================\n");
	}
	
}
