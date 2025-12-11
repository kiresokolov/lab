package mk.ukim.finki.wp.lab.service.impl;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Author;
import mk.ukim.finki.wp.lab.repository.jpa.AuthorRepository;
import mk.ukim.finki.wp.lab.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public static List<Author> authors = new ArrayList<>();

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    public void init() {
        if (authorRepository.findAll().isEmpty()) {
            authors = new ArrayList<>();
            authors.add(new Author("Vladimir", "Plavevski", "Macedonia", ""));
            authors.add(new Author("Erich", "Marie Remarque", "Germany", ""));
            authors.add(new Author("Dan", "Brown", "US", ""));
            authors.add(new Author("Gabriel", "Garcia Marquez", "Colombia", ""));
            authors.add(new Author("Ivo", "Andric", "Yugoslavia", ""));
            authors.add(new Author("Andy", "Weir", "US", ""));
            authors.add(new Author("George", "Orwell", "England", ""));
            authors.add(new Author("Ilina", "Arsova", "Macedonia", ""));
            authors.add(new Author("Chuck", "Palahniuk", "US", ""));
            authorRepository.saveAll(authors);
        }
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
