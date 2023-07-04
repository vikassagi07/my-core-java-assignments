package com.pratice.library.Controller;

import com.pratice.library.Model.Book;
import com.pratice.library.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/library")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/newbook")
    public Book addBook(@RequestBody Book book) {
        return this.bookService.addNewBook(book);
    }

    @GetMapping("/All")
    public List<Book> getAllBook() {
        return this.bookService.getAllBook();
    }

    @DeleteMapping("/delete/{Id}")
    public String deleteBook(@PathVariable Integer Id) {
        return this.bookService.deletEvent(Id);
    }

    @GetMapping("/{Id}")
    public Optional<Book> getSingleBook(@PathVariable Integer Id) {

        return this.bookService.getSingleBook(Id);
    }

    @PutMapping("/update/{Id}")
    public Book updateBook(@PathVariable Integer Id, @RequestBody Book lastBook) {
        return this.bookService.updateBook(Id, lastBook);
    }

    @PatchMapping("/latest/{Id}")
    public Book updateId(@PathVariable Integer Id, @RequestBody Book bookDetails) {
        return this.bookService.updateBook(Id, bookDetails);
    }
//if (this.userRepository.existsByUsername(user.getUserid()));
//        throws new Exception("User with given uusernamealready exist");
//    else
//            this.userRepository.save(this.convertSignUpRequestDtoToEntity(signUpRequestDto));

}
