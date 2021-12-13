package space.borisgk.findyourbookelastic.service.mapping;

import org.mapstruct.Mapper;
import space.borisgk.findyourbookelastic.model.elastic.AuthorEntity;
import space.borisgk.findyourbookelastic.model.rest.Author;

@Mapper(componentModel = "spring")
public interface AuthorMapper extends IMapper<Author, AuthorEntity> {
}
