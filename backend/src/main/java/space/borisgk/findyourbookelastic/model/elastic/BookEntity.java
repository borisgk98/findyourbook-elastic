package space.borisgk.findyourbookelastic.model.elastic;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

/**
 * Contains information about books
 */
@Data
@Document(indexName = "books")
public class BookEntity {
    @Id
    private String id;

    private String imgUrl;

    private String name;

    private String description;

    private String year;

    private List<String> tags;

    private List<String> genres;

    private List<String> placeOfEvents;

    private List<String> timeOfEvents;

    private List<String> protagonists;

    private List<AuthorEntity> authors;
}

