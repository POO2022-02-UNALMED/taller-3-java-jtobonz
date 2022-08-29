package taller3.televisores;


public class Control {
	TV television;

	public TV getTelevision() {
		return television;
	}

	public void setTelevision(TV television) {
		this.television = television;
	}
	
	public void turnOn() {
		television.turnOn();
	}
	
	public void turnOff() {
		television.turnOff();
	}
	
	public void canalUp() {
		television.canalUp();
	}
	
	public void canalDown() {
		television.canalDown();
	}
	
	public void volumenUp() {
		television.volumenUp();
	}
	
	public void volumenDown() {
		television.volumenDown();
	}
	
	public void setCanal(int canal) {
		television.canal = canal;
	}
	
	public void enlazar(TV television) {
		setTelevision(television);
		television.setControl(this);
	}
}
