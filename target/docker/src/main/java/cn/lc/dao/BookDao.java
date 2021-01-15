package cn.lc.dao;

import cn.lc.beans.Book;



public interface BookDao {
    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
    Book queryById(int id);

}
