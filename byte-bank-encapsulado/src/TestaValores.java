
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println("Ag�ncia da conta criada: " + conta.getAgencia());
		
		conta.setAgencia(123123123);
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(1337, 696969);
		
		System.out.println(Conta.getTotal());

	}

}
