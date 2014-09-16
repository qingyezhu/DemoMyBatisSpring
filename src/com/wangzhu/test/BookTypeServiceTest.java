package com.wangzhu.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangzhu.bean.BookType;
import com.wangzhu.service.BookTypeService;
import com.wangzhu.service.impl.BookTypeServiceImpl;
/**
 * ≤‚ ‘¿‡
 * @author wangzhu
 *
 */
public class BookTypeServiceTest {
	ApplicationContext context = new ClassPathXmlApplicationContext(
			"classpath:applicationContext.xml");
	BookTypeService bookTypeService = (BookTypeServiceImpl) context
			.getBean("bookTypeService");

	public void testAdd() {
		BookType bookType = new BookType();
		bookType.setTitle("mybatis title");
		bookType.setDetail("mybatis detail");
		bookTypeService.insert(bookType);
	}

	public void testUpdate() {
		BookType bookType = new BookType();
		bookType.setId(48);
		bookType.setTitle("mybatis new title");
		bookType.setDetail("mybatis new detail");
		bookTypeService.update(bookType);
	}

	public void testDelete() {
		bookTypeService.delete(48);

	}

	public void testCountAll(){
		System.out.println("countAll: " + bookTypeService.countAll());
	}
	
	public void testselectAll() {
		List<BookType> bookTypeList = bookTypeService.selectAll();
		for (BookType bookType : bookTypeList) {
			System.out.println("testselectAll: " + bookType);
		}
	}

	public static void main(String[] args) {
		BookTypeServiceTest test = new BookTypeServiceTest();
		test.testCountAll();
		test.testselectAll();
		
//		test.testAdd();
		
//		test.testUpdate();
		
		test.testDelete();
	}
}
