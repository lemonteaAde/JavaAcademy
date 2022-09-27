package ch08.sec02;

public class MainExample {

	public static void main(String[] args) {
		//RemoCon rc = new RemoCon();
		RemoCon rc;
		
		if(new Tv() instanceof RemoCon) {
			rc = new Tv();
			rc.turnOn();
		}else if(new Audio() instanceof RemoCon) {
			rc = new Audio();		
			rc.turnOn();
		}
	}

}
