package filialbiliotek.packages.Repository;

import filialbiliotek.packages.Model.Books;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public class BookRepository implements ICrudRepository<Books> {


    @Override
    public void create(Books books) {

    }

    @Override
    public List<Books> readAll() {
        return null;
    }

    @Override
    public Books read(long id) {
        return null;
    }

    @Override
    public boolean update(Books books) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
