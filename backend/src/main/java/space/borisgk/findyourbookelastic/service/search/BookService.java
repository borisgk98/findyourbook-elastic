package space.borisgk.findyourbookelastic.service.search;

import org.springframework.stereotype.Service;
import space.borisgk.findyourbookelastic.model.elastic.BookEntity;
import space.borisgk.findyourbookelastic.model.rest.Book;

@Service
public class BookService extends AbstractSearchService<String, Book, BookEntity> {
}
