package akk.studio.cne.CNEServer.persistence.repository;

import akk.studio.cne.CNEServer.persistence.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface BaseRepository<T extends BaseEntity, K extends Serializable>
        extends JpaRepository<T,K>, JpaSpecificationExecutor<T> {

}
