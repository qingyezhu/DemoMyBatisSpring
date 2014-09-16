package com.wangzhu.service.impl;

import java.util.List;

import com.wangzhu.bean.BookType;
import com.wangzhu.dao.BookTypeDao;
import com.wangzhu.service.BookTypeService;
/**
 * 服务层实现
 * @author wangzhu
 *
 */
public class BookTypeServiceImpl implements BookTypeService {

	private BookTypeDao bookTypeDao;

	public BookTypeDao getBookTypeDao() {
		return bookTypeDao;
	}

	public void setBookTypeDao(BookTypeDao bookTypeDao) {
		this.bookTypeDao = bookTypeDao;
	}

	@Override
	public int insert(BookType bookType) {
		return bookTypeDao.insert(bookType);
	}

	@Override
	public int update(BookType bookType) {
		return bookTypeDao.update(bookType);
	}

	@Override
	public int delete(Integer id) {
		return bookTypeDao.delete(id);
	}

	@Override
	public List<BookType> selectAll() {
		return bookTypeDao.selectAll();
	}

	@Override
	public int countAll() {
		return bookTypeDao.countAll();
	}

	@Override
	public BookType findById(Integer id) {
		return bookTypeDao.findById(id);
	}

}
