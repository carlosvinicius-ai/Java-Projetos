
public abstract class ContaBancaria {
		public String nome;
		public int conta;
		public float saldo;
		public ContaBancaria() {
			Banco.nconta++;
			this.nome="Cliente "+Banco.nconta;
			this.conta=Banco.nconta;
			this.saldo=0;
		}
		public void sacar(float valor) {
			if (saldo-valor>=0) 
				this.saldo-=valor;
			else 
				System.out.println("sem fundo suficiente");
		}
		public void depositar(float valor) {
			this.saldo+=valor;
		}
		
		public abstract void calcManutencao();
		public abstract void infoConta();
	}

