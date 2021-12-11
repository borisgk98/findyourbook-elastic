package space.borisgk.findyourbookelastic.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-11T17:16:40.444092736+03:00[Europe/Moscow]")
@Controller
@RequestMapping("${openapi.findYourBook.base-path:}")
public class AuthorApiController implements AuthorApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AuthorApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
