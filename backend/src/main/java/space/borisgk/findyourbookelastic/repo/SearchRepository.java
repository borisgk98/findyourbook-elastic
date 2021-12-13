package space.borisgk.findyourbookelastic.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SearchRepository<E, ID> extends ElasticsearchRepository<E, ID> {
    @Query("{\n" +
            "    \"query_string\": {\n" +
            "      \"query\": \"?0\"\n" +
            "    }\n" +
            "  }")
    Page<E> search(String query, Pageable pageable);
}
