package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {

    private static final List<Author> authors = new ArrayList<>();

    static {
        authors.add(new Author("Vladimir", "Plavevski", "Macedonia", ""));
        authors.add(new Author("Erich", "Marie Remarque", "Germany", ""));
        authors.add(new Author("Dan", "Brown", "US", ""));
        authors.add(new Author("Gabriel", "Garcia Marquez", "Colombia", ""));
        authors.add(new Author("Ivo", "Andric", "Yugoslavia", ""));
        authors.add(new Author("Andy", "Weir", "US", ""));
        authors.add(new Author("George", "Orwell", "England", ""));
        authors.add(new Author("Ilina", "Arsova", "Macedonia", ""));
        authors.add(new Author("Chuck", "Palahniuk", "US", ""));
    }


    public List<Author> findAll()
    {
        return authors.stream().toList();
    }

    public Author findByIndex(Long index) {
        return authors.stream().filter(a -> a.getId().equals(index)).findFirst().get();
    }
    public Author findByName(String name)
    {
        return authors.stream().filter(a -> a.getName().equals(name)).findFirst().get();
    }
}
