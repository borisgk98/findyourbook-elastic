package space.borisgk.findyourbookelastic.service.search;

import org.springframework.stereotype.Service;
import space.borisgk.findyourbookelastic.model.elastic.AuthorEntity;
import space.borisgk.findyourbookelastic.model.rest.Author;

@Service
public class AuthorService extends AbstractSearchService<String, Author, AuthorEntity> {
}
