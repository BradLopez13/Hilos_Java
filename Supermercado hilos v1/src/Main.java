/**
 * 
 */

/**
 * @author Brad Lopez
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1=new Cliente("Cliente 1", new int[] {2,1,6,1,8,2});
		Cliente cliente2=new Cliente("Cliente 2", new int[] {3,2,4,3,7,1});
		long initialTime= System.currentTimeMillis();

		Caja cajera1=new Caja("Cajera 1" ,cliente1, initialTime);
		Caja cajera2=new Caja("Cajera 2",cliente2, initialTime);

		
		cajera1.start();
		cajera2.start();
	}

}
