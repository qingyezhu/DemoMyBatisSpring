package com.wangzhu.service;

import java.util.List;

import com.wangzhu.bean.BookType;
/**
 * �����ӿ�
 * @author wangzhu
 *
 */
public interface BookTypeService {

	public int insert(BookType bookType);

	public int update(BookType bookType);

	public int delete(Integer id);

	public List<BookType> selectAll();

	public int countAll();

	public BookType findById(Integer id);
}
