package dailyWork1;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("검색할 키워드 입력: ");
		Scanner s = new Scanner(System.in);
		String keyword = s.nextLine();
		s.close();
		
	
		String config = "classpath:applicationCtx_dailyWork1.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(config);
		
		BookService service = ctx.getBean("bookService", BookService.class);
		ArrayList<BookEntity> list = service.getListByKeyword(keyword);

		for(BookEntity entity : list){
			System.out.println(entity.getBtitle() + " - " + entity.getBauthor());
			
			ArrayList<CommentEntity> list2 = service.getCommentsList(entity.getBisbn());
			if(list2.size() > 0){
				for(CommentEntity c : list2){
					System.out.println("==> " + c.getComments());
				}
			}
			
		}
		
		ctx.close();
	}

}
