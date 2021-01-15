package cn.lc.beans;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;

@Data
@ToString
@Slf4j
public class Book implements InitializingBean {
    //实现InitializingBean进行初始化
    public int id;
    public String title;
    public double price;


    public Book() {
        System.out.println("Book对象创建了");
    }

    public Book(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        title ="西游记";
        price = 12;
        System.out.println("初始化成功");
    }

}
