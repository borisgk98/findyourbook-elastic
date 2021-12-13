package space.borisgk.findyourbookelastic.service.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.server.ResponseStatusException;
import space.borisgk.findyourbookelastic.repo.SearchRepository;
import space.borisgk.findyourbookelastic.service.mapping.IMapper;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.NOT_FOUND;

public abstract class AbstractSearchService<ID, DTO, E> implements SearchService<ID, DTO> {

    @Autowired
    protected SearchRepository<E, ID> repository;

    @Autowired
    protected IMapper<DTO, E> mapper;

    // TODO move to var
    protected static final Integer PAGE_SIZE = 25;

    @Override
    public DTO read(ID id) {
        return repository.findById(id)
                .map(mapper::e2dto)
                .orElseThrow(this::notFound);
    }

    @Override
    public List<DTO> readAll(Integer page) {
        if (page == null) {
            page = 0;
        }
        return repository.findAll(PageRequest.of(page, PAGE_SIZE))
                .get()
                .map(mapper::e2dto)
                .collect(Collectors.toList());
    }

    @Override
    public List<DTO> search(Integer page, String query) {
        if (page == null) {
            page = 0;
        }
        return repository.search(query, PageRequest.of(page, PAGE_SIZE))
                .get()
                .map(mapper::e2dto)
                .collect(Collectors.toList());
    }

    protected RuntimeException notFound() {
        return new ResponseStatusException(NOT_FOUND, "Unable to find resource");
    }
}
