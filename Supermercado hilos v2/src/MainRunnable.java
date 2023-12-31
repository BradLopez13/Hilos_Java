/**
 * 
 */

/**
 * @author Brad Lopez
 *
 */

public class MainRunnable implements Runnable {
	
	private Caja caja;
	private Cliente cliente;
	private long initialTime;

	public MainRunnable(Cliente cliente,Caja caja,long initialTime) {
		this.cliente=cliente;
		this.caja=caja;
		this.initialTime=initialTime;
	}
		
	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente("Cliente1",new int[] {2,2,1,5,2,3});
		Cliente cliente2 = new Cliente("Cliente1",new int[] {1,3,5,1,1});
		
		Caja cajera1 = new Caja("Cajera1");
		Caja cajera2 = new Caja("Cajera2");
		
		long initialTime = System.currentTimeMillis();
		
		Runnable proceso1= new MainRunnable(cliente1, cajera1, initialTime);
		Runnable proceso2= new MainRunnable(cliente2, cajera2, initialTime);
		
		new Thread(proceso1).start();
		new Thread(proceso2).start();

	}

	@Override
	public void run() {
		this.caja.procesarCompra(this.cliente,this.initialTime);
	}

	

}
