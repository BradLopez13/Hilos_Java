/**
 * 
 */

/**
 * @author Brad Lopez
 *
 */
public class Caja extends Thread{
	private String nombre;
	private Cliente cliente;
	private long timeStamp;
	

	/**
	 * @param nombre
	 */
	public Caja(String nombre,Cliente cliente,long timeStamp) {
		this.nombre = nombre;
		this.cliente =cliente;
		this.timeStamp=timeStamp;
	}
	@Override
	public void run(){
		
		System.out.println("La cajera "+ this.nombre + " Comienza a procesar la compra del cliente " + 
				this.cliente.getNombre() + " En el tiempo: "+ (System.currentTimeMillis()-this.timeStamp)/1000 +" seg");
		for(int i=0; i<this.cliente.getCarroCompra().length;i++) {
			this.esperarXsegundos(this.cliente.getCarroCompra()[i]);
			System.out.println("Procesado el producto "+(i+1)+" ->Tiempo: "+(System.currentTimeMillis()-this.timeStamp/1000+" seg"));
		}
		
		System.out.println("La cajera "+this.nombre+" ha terminado de procesar "+ this.cliente.getNombre()+" en el tiempo: "+ 
							(System.currentTimeMillis()-this.timeStamp)/1000+ " seg" );	
	}
	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	
}
