package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Book;
import mk.ukim.finki.wp.lab.model.BookReservation;
import mk.ukim.finki.wp.lab.repository.AuthorRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Book> books = new ArrayList<>();
    public static List<BookReservation> reservations = new ArrayList<>();
    private final AuthorRepository authorRepository;

    public DataHolder(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    public void init()
    {


        books.add(new Book("Jadica","Roman",10.0, authorRepository.findByName("Vladimir")));
        books.add(new Book("Bokserot od Novo maalo","Roman",10.0, authorRepository.findByName("Vladimir")));
        books.add(new Book("Na zapad nisto novo","Roman",10.0, authorRepository.findByName("Erich")));
        books.add(new Book("Mostot na drina","Roman",10.0, authorRepository.findByName("Ivo")));
        books.add(new Book("Sto godini samotija","Roman",7.0, authorRepository.findByName("Gabriel")));
        books.add(new Book("Angeli i demoni","Triler",10.0, authorRepository.findByName("Dan")));
        books.add(new Book("Fight club","Roman",10.0, authorRepository.findByName("Dan")));
        books.add(new Book("Marsvecot","Roman, Naucna fantastika",10.0, authorRepository.findByName("Andy")));
        books.add(new Book("1984","Roman",10.0, authorRepository.findByName("George")));
        books.add(new Book("Sedumte","Roman",8.0, authorRepository.findByName("Ilina")));

    }
}
