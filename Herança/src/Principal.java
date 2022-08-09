
public class Principal {

	public static void main(String[]args) {
		
		ContaPoupanca p1 = new ContaPoupanca();
		
		ContaEspecial e1 = new ContaEspecial();
		
		
		p1.depositar(1000);
		p1.infoConta();
		
		e1.sacar(200);
		e1.infoConta();
		
		System.out.println("Emprestimo p1 = " + Banco.valorEmprestimo(p1));
		System.out.println("Emprestimo e1 = " + Banco.valorEmprestimo(e1));
		
		p1.sacar(150);
		p1.infoConta();
	}
	
}
