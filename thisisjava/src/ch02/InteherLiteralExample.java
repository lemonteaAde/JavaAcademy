package ch02;

public class InteherLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011; //0b로 시작 2진수(binary)표기법: 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0=>8+0+2+1=>11
		int var2 = 0206;//0으로 시작 8진수 표기법: 2*8^2 +0*8^1 + 6*8^0 = 2*64 + 0 + 6 =>134
		int var3 = 365;//10진수 표기법:365
		int var4 = 0xB3;//0x로 시작 16진수 표기법:11*16^1 +3*16^0 => 11*16 +3*1 =>176+3 = 179
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}

}
