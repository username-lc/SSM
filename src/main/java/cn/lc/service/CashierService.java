package cn.lc.service;

import java.util.List;

public interface CashierService {
    void checkout(int userId, List<String> bookId);
}
