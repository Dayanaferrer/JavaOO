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
		
		Conta contaDoDavi = new Conta();
		contaDoDavi.deposita(1000);
		
		 boolean sucessoTransferencia = contaDoDavi.transfere(300, contaDaDay);
	        if(sucessoTransferencia) {
	            System.out.println("transferencia com sucesso");
	        } else {
	            System.out.println("faltou dinheiro");

	        }
	        System.out.println(contaDoDavi.saldo);
	        System.out.println(contaDaDay.saldo); 
	    }
	}
