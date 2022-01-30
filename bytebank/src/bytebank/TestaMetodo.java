package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaDay = new Conta();
		contaDaDay.saldo = 100;
		contaDaDay.deposita(50);
		System.out.println(contaDaDay.saldo);
		
		boolean conseguiuRetirar = contaDaDay.saca (20);
		System.out.println(contaDaDay.saldo);
		System.out.println(conseguiuRetirar);
		
		
		

	}

}
