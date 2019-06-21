package akk.studio.cne.CNEServer.service;

import akk.studio.cne.CNEServer.persistence.model.BaseEntity;
import akk.studio.cne.CNEServer.persistence.repository.BaseRepository;

import java.io.Serializable;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseServiceImpl<T extends BaseEntity, K extends Serializable, R extends BaseRepository<T, K>>
        implements BaseService<T, K, R> {
    @Override
    public abstract R getRepository();

    @Override
    public T save(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public T delete(K id) {

        T entity = getOne(id);
        entity.setActive(false);
        return save(entity);
    }

    @Override
    public T getOne(K id) {

        T entity = getRepository().getOne(id);
        if (entity.isActive()) //getter given by lombok for 'active' is isActive not getActive
            return entity;
        else
            return null;
    }

    @Override
    public Collection<T> getAll() {

        return getRepository().findAll()
                .stream()
                .filter(BaseEntity::isActive)
                .collect(Collectors.toList());
    }

}
