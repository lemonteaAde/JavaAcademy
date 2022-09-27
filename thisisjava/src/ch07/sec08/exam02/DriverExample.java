package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus);//Vehicle타입로 변환(Promotion)
		
		Taxi taxi = new Taxi();//Vehicle타입으로 변환(Promotion)
		driver.drive(taxi);

		driver.drive(new Bus());//new Bus()객체가 Vehicle로 변환되어서 전달.
	}
}
