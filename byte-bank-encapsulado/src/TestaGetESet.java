
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println("Numero da Conta: " + conta.getNumero());
		
		Cliente paulo = new Cliente ();
		
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println("Titular da conta: " + conta.getTitular().getNome());
		
		conta.getTitular ().setProfissao("Programador");
		System.out.println("Profissão: " + conta.getTitular().getProfissao());
		
		
	}

}
