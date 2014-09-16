package com.wangzhu.dao;

import java.util.List;

import com.wangzhu.bean.BookType;

/**
 * 数据访问接口
 * @author wangzhu
 *
 */
public interface BookTypeDao {

	public int insert(BookType bookType);

	public int update(BookType bookType);

	public int delete(Integer id);

	public List<BookType> selectAll();

	public int countAll();

	public BookType findById(Integer id);

}
