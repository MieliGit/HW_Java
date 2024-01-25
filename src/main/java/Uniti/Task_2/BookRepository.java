package Uniti.Task_2;
import java.util.List;
public interface BookRepository {
    Book findById(Long id);
    List<Book> findAll();
    void save(Book book);
    void delete(Long id);
}
