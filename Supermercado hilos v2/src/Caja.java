/**
 * 
 */

/**
 * @author Brad Lopez
 *
 */
	public class Caja{
		private String nombre;
		
		public Caja(String nombre) {
			this.nombre = nombre;
			}
		public void procesarCompra(Cliente cliente,long timeStamp) {
			System.out.println("La cajera " + this.nombre+
								" Comienza a procesar la compra del cliente "+cliente.getNombre()+
								" En el tiempo: "+(System.currentTimeMillis()-timeStamp));
			
			for (int i = 0;i< cliente.getCarroCompra().length; i++) {
				this.esperaXsegundos(cliente.getCarroCompra()[i]);
				System.out.println("Procesado el producto "+(i+1)+
									" -> Tiempo: " + (System.currentTimeMillis() - timeStamp)/
									1000+
									" seg");
			}
			
			System.out.println("La cajera "+this.nombre+" Ha terminado de procesar "+
								(System.currentTimeMillis()-timeStamp)/1000+" seg");
			
			}
		private void esperaXsegundos(int segundo) {
			try {
				Thread.sleep(segundo * 1000);
			}catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
		

}
