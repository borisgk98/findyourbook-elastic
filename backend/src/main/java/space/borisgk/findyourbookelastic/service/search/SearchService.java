package space.borisgk.findyourbookelastic.service.search;

import java.util.List;

public interface SearchService<ID, DTO> {
    DTO read(ID id);
    List<DTO> readAll(Integer page);
    List<DTO> search(Integer page, String query);
}
