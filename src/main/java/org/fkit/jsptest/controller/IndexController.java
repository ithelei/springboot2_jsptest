package org.fkit.jsptest.controller;

import java.util.ArrayList;
import java.util.List;
import org.fkit.jsptest.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(Model model){
		// 保存一个username到model
		model.addAttribute("username", "疯狂软件");
		// 模拟数据库数据保存到List集合
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "疯狂Java讲义", "java.jpg", "李刚 编著", 109.00));
		books.add(new Book(2, "轻量级Java EE企业应用实战", "ee.jpg", "李刚 编著", 108.00));
		books.add(new Book(3, "Spring+MyBatis应用实战", "SpringMyBatis.jpg", "疯狂软件 编著", 58.00));
		books.add(new Book(4, "疯狂Android讲义", "android.jpg", "李刚 编著", 108.00));
		books.add(new Book(5, "疯狂Ajax开发", "ajax.jpg", "李刚 编著", 79.00));
		// 保存数据到model
		model.addAttribute("books", books);
		return "index";
	}
}
