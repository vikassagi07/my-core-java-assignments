package com.pratice.library.Service;

import com.pratice.library.Model.Book;
import com.pratice.library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book addNewBook(Book book) {
        this.bookRepository.save(book);
        return book;
    }

    public List<Book> getAllBook() {
        return this.bookRepository.findAll();

    }

    public String deletEvent(Integer selectedBookId) {
        this.bookRepository.deleteById(selectedBookId);
        return "delete" + selectedBookId;
    }

    public Optional<Book> getSingleBook(Integer bookId) {
        return this.bookRepository.findById(bookId);
    }

    public Book updateBook(Integer Id, Book updateBook) {
        Book oldBook = this.bookRepository.findById(Id).get();
        oldBook.setBookName(updateBook.getBookName());
        oldBook.setBookAuthor(updateBook.getBookAuthor());
        oldBook.setPrice(updateBook.getPrice());
        this.bookRepository.save(oldBook);
        return updateBook;
    }

    public Book updateBookInfo(Integer Id, int bookDetails) {
        Book oldBook = this.bookRepository.findById(Id).get();
        oldBook.setBookId(bookDetails);
        this.bookRepository.save(oldBook);
        return oldBook;
    }

}
