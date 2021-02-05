package ex3;

public class menu {

	public static void main(String[] args) {
		ContaSimples c1, c2;
		c1 = new ContaSimples();
		c2 = new ContaSimples(300);
		c2.saque(50);
		c1.deposito(900);
		c2.saque(500);

	}

}
