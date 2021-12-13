package space.borisgk.findyourbookelastic.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import space.borisgk.findyourbookelastic.model.rest.Book;
import space.borisgk.findyourbookelastic.service.search.BookService;

import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-13T11:03:22.391916999+03:00[Europe/Moscow]")
@Controller
@RequestMapping("${openapi.findYourBook.base-path:}")
public class BookApiController implements BookApi {

    private final NativeWebRequest request;

    @Autowired
    private BookService bookService;

    /**
     * GET /book/{book_id}
     * Get information about book by book id
     *
     * @param bookId (required)
     * @return Successful getting (status code 200)
     * or Not found book by this book_id (status code 404)
     */
    @Override
    public ResponseEntity<Book> bookBookIdGet(String bookId) {
        return ResponseEntity.ok(bookService.read(bookId));
    }

    /**
     * GET /book
     * Get all books
     *
     * @param page (optional)
     * @return Successful getting (status code 200)
     * or Not found any books (status code 404)
     */
    @Override
    public ResponseEntity<List<Book>> bookGet(Integer page) {
        return ResponseEntity.ok(bookService.readAll(page));
    }

    /**
     * GET /book/search
     * Search books
     *
     * @param query (required)
     * @param page  (optional)
     * @return Successful getting (status code 200)
     * or Not found books (status code 404)
     */
    @Override
    public ResponseEntity<List<Book>> bookSearchGet(String query, Integer page) {
        return ResponseEntity.ok(bookService.search(page, query));
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BookApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
