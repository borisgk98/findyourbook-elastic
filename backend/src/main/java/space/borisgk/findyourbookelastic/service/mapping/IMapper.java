package space.borisgk.findyourbookelastic.service.mapping;

public interface IMapper<DTO, E> {
    DTO e2dto(E entity);
    E dto2e(DTO dto);
}
