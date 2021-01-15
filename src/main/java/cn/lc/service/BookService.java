package cn.lc.service;

import cn.lc.beans.Book;

public interface BookService {
    void purchase(int userId, String bookId);

    Book queryById(int id);

}
