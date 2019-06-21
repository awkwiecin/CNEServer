package akk.studio.cne.CNEServer.service;

import akk.studio.cne.CNEServer.model.LibraryElementDTO;
import akk.studio.cne.CNEServer.persistence.model.LibraryElement;
import akk.studio.cne.CNEServer.persistence.repository.LibraryElementRepository;

import java.util.List;

public interface LibraryElementService extends BaseService<LibraryElement, Long, LibraryElementRepository> {

    LibraryElementDTO getLibraryElementDtoById(Long id);
    LibraryElementDTO createLibraryElement(LibraryElementDTO libraryElementDTO);

    List<LibraryElementDTO> getAllLibraryElements();
}
