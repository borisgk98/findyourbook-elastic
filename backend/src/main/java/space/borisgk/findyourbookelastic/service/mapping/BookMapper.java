package space.borisgk.findyourbookelastic.service.mapping;

import org.mapstruct.Mapper;
import space.borisgk.findyourbookelastic.model.elastic.BookEntity;
import space.borisgk.findyourbookelastic.model.rest.Book;

@Mapper(componentModel = "spring")
public interface BookMapper extends IMapper<Book, BookEntity> {
}
