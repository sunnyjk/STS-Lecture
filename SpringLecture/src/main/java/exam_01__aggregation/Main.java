package exam_01__aggregation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("검색할 키워드: ");
		String keyword = s.nextLine();
		
		System.out.println("입력된 값은: " + keyword);
		
		// 로직처리를 위한 service 객체를 생성
		// 나중에 DB처리를 위해서 DAO 객체를 생성
		BookDAO dao = new BookDAO();
		BookService service = new BookService(dao);	// dao를 service에 injection하는 것. (DI)
		
		// 서비스를 이용해서 business logic을 수행
		ArrayList<BookEntity> list = service.getListByKeyword(keyword);

		// 출력처리
		for(BookEntity entity : list){
			System.out.println(entity.getBtitle() + " : " + entity.getBauthor());
		}
		
		// 사용한 resource 해제
		s.close();
	}

}
