package space.borisgk.findyourbookelastic.model.elastic;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

/**
 * Contains information about authors
 */
@Data
@Document(indexName = "authors")
public class AuthorEntity   {

    @Id
    private String id;

    private String name;

    private Integer yearBirth;

    private Integer yearDeath;

    private String biography;

    private String imgUrl;

    private List<Integer> booksIds;
}

