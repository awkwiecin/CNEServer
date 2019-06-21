package akk.studio.cne.CNEServer.service;

import akk.studio.cne.CNEServer.model.LibraryElementDTO;
import akk.studio.cne.CNEServer.persistence.model.LibraryElement;
import akk.studio.cne.CNEServer.persistence.repository.LibraryElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Primary
@Service
public class LibraryElementServiceImpl extends BaseServiceImpl<LibraryElement, Long, LibraryElementRepository> implements LibraryElementService {

    @Autowired
    private LibraryElementRepository libraryElementRepository;

    @Override
    public LibraryElementRepository getRepository() {
        return libraryElementRepository;
    }

    @Override
    public LibraryElementDTO getLibraryElementDtoById(Long id) {
        return Mapper.libraryElementPersistenceToDTO(getOne(id));
    }

    @Override
    public LibraryElementDTO createLibraryElement(LibraryElementDTO libraryElementDTO) {

        LibraryElement libraryElement = save(Mapper.libraryElementDTOToPersistence(libraryElementDTO));
        return Mapper.libraryElementPersistenceToDTO(libraryElement);

    }

    @Override
    public List<LibraryElementDTO> getAllLibraryElements() {
        return getAll().stream()
                .map(Mapper::libraryElementPersistenceToDTO)
                .collect(Collectors.toList());
    }
}
