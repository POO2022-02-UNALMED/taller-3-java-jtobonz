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
		TV.numTV ++;
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
		if (canal >= 0 && canal <= 120 && estado == true) {
			this.canal = canal;
		}
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
		estado = true ;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (canal < 120 && estado == true) {
			canal ++;
		}			
	}
	public void canalDown() {
		if (canal > 0 && estado == true) {
			canal --;
		}
	}
	public void volumenUp() {
		if (volumen < 7 && estado == true) {
			volumen ++;
		}
	}
	public void volumenDown() {
		if (volumen > 0 && estado == true) {
			volumen --;
		}
	}

}