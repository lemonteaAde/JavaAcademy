package ch07.sec02;

public class SmartPhone extends Phone {
	//필드
	/*public String model;//null
	public String color;//null*/
	
	public boolean wifi;//false
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public SmartPhone(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
		}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
		}
	
	//매소드
	/*public void bell() {System.out.println("벨이 울립니다.");}
	public void sendVoice(String message) {System.out.println("자기: "+message);}
	public void receiveVoice(String message) {System.out.println("상대방: "+message);}
	public void hangUp() {System.out.println("전화를 끊습니다.");}*/
	
}
