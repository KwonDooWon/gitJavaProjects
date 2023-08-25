package testProject;
import java.util.*;

//main메서드를 실행해주기위한 class
public class Study0808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		POSSystem pos = POSSystem.getPosInstance();
		pos.saveCustomer(new Customer("정경호", "myId", "myPassword12", "rudghxn@naver.com"));
		
		boolean isLoop = true;
		while(true) {	
			switch(pos.printMenu()) {
				case 1:{ // 회원등록
					pos.joinCustomer();
				}break;
				case 2:{ // 회원삭제
					pos.deleteLastCustomer();
				}break;
				case 3:{ //회원목록출력
					pos.viewCustomerList();
				}break;
				case 4:{ //로그인
					pos.login();
				}break;
				default:
					isLoop = false;
			}
		}
		
		//길이가 10인 Customer 객체배열을 생성하고
		//0번째 인덱스값에 id : myId, password : myPassword12로 객체생성(이름 이메일 자유)
		Customer[] customerArr = new Customer[1];
//		customerArr[0] = new Customer("정경호", "myId", "myPassword12", "rudghxn@naver.com");
		
		//-------회원삭제----------
		// 마지막으로 등록된 회원을 삭제한다.
//		for(int i = 0; i < customerArr.length;i++) {
//			if (customerArr[i] == null && i != 0) {
//				customerArr[i - 1] = null;
//				break;
//			} else if (i == customerArr.length - 1)
//				customerArr[i] = null;
//		}
		//------------모든 회원 출력---------------
		System.out.println("이름\t아이디\t비밀번호\t이메일");
		for (int i =0; i < customerArr.length; i++) {
			if (customerArr[i] == null)
				break;
			System.out.println(customerArr[i].toString());
		}
		//아이디, 비밀번호, 이름, 이메일을 입력받아 Customer객체를 추가해보자
		/*
		 * 아이디를 입력하세요 :
		 * 비밀번호를 입력하세요 : 
		 * 이름을 입력하세요 : 
		 * 이메일을 입력하세요 :
		 * 
		 * 이름 : ㅇㅇㅇ
		 * 이메일 : ㅇㅇㅇ
		 * ID : ㅇㅇㅇ
		 * Password : ㅇㅇㅇ
		 * 회원정보가 정상적으로 등록되었습니다.
		 */
		
		//내가 한거
//	    for (int i = 0; i < customerArr.length; i++) {
//	    	if(customerArr[i] != null) {
//	    		if(i > 0 && customerArr[i-1] != null) {
//	    			System.out.print("더이상 등록할 수 없습니다.");
//	    			break;
//	    		}
//	    		continue;
//	    	} else {
//	    		String id, password, name, email;
//		    	System.out.print("아이디를 입력하세요 : ");
//	    		id = sc.next();
//	    		System.out.print("비밀번호를 입력하세요 : ");
//	    		password = sc.next();
//	    	    System.out.print("이름을 입력하세요 : ");
//	    	    name = sc.next();
//	    	    System.out.print("이메일을 입력하세요 : ");
//	    	    email = sc.next();
//	    		customerArr[i] = new Customer(name, id, password, email);
//	    		break;
//	    	}
//	    }
		
		
	    //답안
//      for (int i = 0; i < customerArr.length; i++) {
	//      if (customerArr[i] == null) {
	//         String name, psw, id, email;
	//         System.out.print("아이디 : ");
	//         id = sc.next();
	//         
	//         System.out.print("비밀번호를 입력하세요 : ");
	//         psw = sc.next();
	//         
	//         System.out.print("이름을 입력하세요 : ");
	//         name = sc.next();
	//         
	//         System.out.print("이메일을 입력하세요 : ");
	//         email = sc.next();
	//         customerArr[i] = new Customer(name, id, psw, email);
	//         
	//         System.out.println(customerArr[i].toString());
	//         System.out.println("회원정보가 정상적으로 등록되었습니다.");
	//         break;
	//      } else if (i == customerArr.length - 1) {
	//         System.out.print("더이상 회원을 등록할 수 없습니다.");
//      }

	    
		//++-----------로그인-------------++
//		Customer loginCustomer;
//		String id,psw;
//	
//		System.out.print("아이디 : ");
//		id = sc.next();
//
//		System.out.print("비밀번호 : ");
//		password = sc.next();
//		
//		for (int i = 0; i < customerArr.length; i++) {
//			if(customerArr[i] == null)
//				break;
//			else if(customerArr[i].equals(id, password)) {
//				loginCustomer = customerArr[i];
//				System.out.print("로그인 성공");
//				break;
//			} else if (!customerArr[i].equals(id)) {
//				System.out.print("비밀번호를 찾을 수 없습니다.");
//				break;
//			} else if (i == customerArr.length -1) {
//				System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//			}
//		}
		
		
	}
}
