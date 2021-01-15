package cn.lc.service.impl;

import cn.lc.beans.Book;
import cn.lc.dao.BookDao;
import cn.lc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void purchase(int userId, String bookId) {

    }

    @Override
    public Book queryById(int id) {
        return bookDao.queryById(id);
    }
}
