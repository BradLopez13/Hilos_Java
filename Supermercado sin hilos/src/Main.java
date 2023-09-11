/**
 * 
 */

/**
 * @author Brad Lopez
 *
 */

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Cliente1",new int[] {2,2,1,5,2,3});
		Cliente cliente2 = new Cliente("Cliente1",new int[] {1,3,5,1,1});
		
		Caja cajera1 = new Caja("Cajera1");
		Caja cajera2 = new Caja("Cajera2");
		
		long initialTime = System.currentTimeMillis();
		cajera1.procesarCompra(cliente1, initialTime);
		cajera2.procesarCompra(cliente2, initialTime);
	}

}
