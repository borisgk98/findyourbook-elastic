package space.borisgk.findyourbookelastic.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import space.borisgk.findyourbookelastic.model.rest.Author;
import space.borisgk.findyourbookelastic.service.search.AuthorService;

import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-13T11:03:22.391916999+03:00[Europe/Moscow]")
@Controller
@RequestMapping("${openapi.findYourBook.base-path:}")
public class AuthorApiController implements AuthorApi {

    private final NativeWebRequest request;

    @Autowired
    private AuthorService authorService;

    /**
     * GET /author/{author_id}
     * Get information about author by author id
     *
     * @param authorId (required)
     * @return Successful getting (status code 200)
     * or Not found author by this author_id (status code 404)
     */
    @Override
    public ResponseEntity<Author> authorAuthorIdGet(String authorId) {
        return ResponseEntity.ok(authorService.read(authorId));
    }

    /**
     * GET /author
     * Get all authors
     *
     * @param page (optional)
     * @return Successful getting (status code 200)
     * or Not found any authors (status code 404)
     */
    @Override
    public ResponseEntity<List<Author>> authorGet(Integer page) {
        return ResponseEntity.ok(authorService.readAll(page));
    }

    /**
     * GET /author/search
     * Search authors
     *
     * @param query (required)
     * @param page  (optional)
     * @return Successful getting (status code 200)
     * or Not found authors (status code 404)
     */
    @Override
    public ResponseEntity<List<Author>> authorSearchGet(String query, Integer page) {
        return ResponseEntity.ok(authorService.search(page, query));
    }

    @org.springframework.beans.factory.annotation.Autowired
    public AuthorApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
