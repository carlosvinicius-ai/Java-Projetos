
public class Banco {
	
	public static int nconta = 0;
	
	public static float valorEmprestimo(ContaBancaria c) {
		float valor = 0;
		
		if (c instanceof ContaPoupanca) {
			valor=c.saldo * 10;
		} else if (c instanceof ContaEspecial) {
			valor= ((ContaEspecial) c).limite * 5;
		}
			
		
		return valor;
	}

}
