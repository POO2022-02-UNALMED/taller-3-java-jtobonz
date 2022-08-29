package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV = 0;
	
	public TV (Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
	}
	public void setMarca(Marca marca) {
		 this.marca = marca;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public Control getControl() {
		return control;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return precio;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getCanal() {
		return canal;
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		estado = !estado ;
	}
	public void turnOff() {
		estado = !estado;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (canal < 120) {
			canal ++;
		}			
	}
	public void canalDown() {
		if (canal > 0) {
			canal --;
		}
	}
	public void volumenUp() {
		if (volumen < 7) {
			volumen ++;
		}
	}
	public void volumenDown() {
		if (volumen > 0) {
			volumen --;
		}
	}

}