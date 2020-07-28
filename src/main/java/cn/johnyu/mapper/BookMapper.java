package cn.johnyu.mapper;

import cn.johnyu.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {

    Book loadBook(int id);
    @Transactional
    void addBook(Book book);

    List<Book> findAllBooks();

}
