package ch06.verify.exam20;

//Scanner 임포트
import java.util.Scanner;

public class BankApplication {
	//필드
	static final String BANKNO="111-";
	static int seq;
	static int index;
	static Account[] accounts = new Account[100];//[null][null][null][null][null][null] ... [null][null]
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택> ");
			
			String menu = scanner.nextLine();
			switch(menu) {
			case "1": System.out.println("--------");
					  System.out.println(" 계좌생성");
					  System.out.println("--------");
					  //System.out.println("계좌번호: ");
					 // String ano = scanner.nextLine();
					  System.out.println("계좌주: ");
					  String owner = scanner.nextLine();
					  System.out.println("초기입금액: ");
					  int amount = Integer.parseInt(scanner.nextLine());
					  //계좌생성
					  String ano = BANKNO+(++seq)+seq+seq;
					  Account account =new Account(ano, owner, amount);
					  //Account배열에 생성된 계좌객체 대입
					  /*if(accounts[index] == null){    //
						  accounts[index++]=account; //accounts[index++] = account; //[][][][]
					  }*/
					  for(int i = 0; i<accounts.length; i++) { //[null][null][null][null]
						  if(accounts[i] == null)
						  {
							  accounts[i]=account;
							  break;
						  }
					  }
					  System.out.println("결과: 계좌가 생성되었습니다.");
					  break;
					  
			case "2": System.out.println("--------");
			  		  System.out.println(" 계좌목록");
			  		  System.out.println("--------");
			  		  
			  		 for(Account acc:accounts) { //참조타입 변수배열 - null여부 확인
			  			 if(acc!=null) {
			  				System.out.println(acc);
			  			 }
			  			 
			  		 }
					  break;
		
			case "3": System.out.println("--------");
	  		  		  System.out.println(" 예 금 ");
	  		  		  System.out.println("--------");
	  		  		  System.out.println("계좌번호: ");
	  		  		  ano = scanner.nextLine();
	  		  		  System.out.print("예금액: ");
	  		  		  amount = Integer.parseInt(scanner.nextLine());
	  		  		/*Account acc=null;
	  		  		   for(int i =0; i<accounts.length; i++) {
	  		  			   acc=accounts[i];
	  		  			   if(acc!=null) {
	  		  				   if(acc.getAno().equals(ano)) { //acc.getAno().equals("");
	  		  					   acc.deposit(amount);
	  		  					   break;
	  		  					   }
	  		  				   }
	  		  			   //[account][account][null][null][account][null][null][null][null]
	  		  			   }
	  		  		   if(acc==null) {
	  		  			   System.out.println("해당 번호의 계좌가 없습니다.");
	  		  		   }*/
	  		  		  
	  		  		  Account account1 = findAccount(ano);
	  		  		  if(findAccount(ano)!=null) {
	  		  			  account1.deposit(amount);
	  		  		  }else {
	  		  			System.out.println("해당 번호의 계좌가 없습니다.");
	  		  		  }
	  		  		   break;
	  		  		  
			
			case "4": System.out.println("--------");
	  		  		  System.out.println(" 출 금 ");
	  		  		  System.out.println("--------");
	  		  		  System.out.println("계좌번호: ");
	  		  		  ano = scanner.nextLine();
	  		  		  System.out.print("출금액: ");
	  		  		  amount = Integer.parseInt(scanner.nextLine());
	  		  		  /*acc=null;
	  		  		   for(int i =0; i<accounts.length; i++) {
	  		  			   acc=accounts[i];
	  		  			   if(acc!=null) {
	  		  				   if(acc.getAno().equals(ano)) { //acc.getAno().equals("");
	  		  					   acc.withdraw(amount);
	  		  					   break;
	  		  					   }
	  		  				   }
	  		  			   //[account][account][null][null][account][null][null][null][null]
	  		  			   }
	  		  		   if(acc==null) {
	  		  			   System.out.println("해당 번호의 계좌가 없습니다.");
	  		  		   }*/
	  		  		  
	  		  		 Account account2 = findAccount(ano);
	  		  		  if(findAccount(ano)!=null) {
	  		  			  account2.withdraw(amount);
	  		  		  }else {
	  		  			System.out.println("해당 번호의 계좌가 없습니다.");
	  		  		  }
	  		  		   break;
			
			case "5": run=!run;
					  break;
			}
		}//while 끝.
		System.out.println("프로그램 종료");
	}

	static Account findAccount(String ano) {
		Account acc=null;
		for(int i =0; i<accounts.length; i++) {
 			   acc=accounts[i];
 			   if(acc!=null) {
 				   if(acc.getAno().equals(ano)) { //acc.getAno().equals("");
 					   break;
 					   }
 				   }
 			   }
		return acc;
		
	}//findAccount 끝
}
