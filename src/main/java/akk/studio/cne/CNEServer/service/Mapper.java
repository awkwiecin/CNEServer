package akk.studio.cne.CNEServer.service;

import akk.studio.cne.CNEServer.model.LibraryElementDTO;
import akk.studio.cne.CNEServer.persistence.model.LibraryElement;

public class Mapper {

    public static LibraryElementDTO libraryElementPersistenceToDTO(LibraryElement libraryElement){

        LibraryElementDTO libraryElementDTO = new LibraryElementDTO();

        libraryElementDTO.setId(libraryElement.getId());
        libraryElementDTO.setAuthor(libraryElement.getAuthor());
        libraryElementDTO.setTitle(libraryElement.getTitle());
        libraryElementDTO.setPublisher(libraryElement.getPublisher());
        libraryElementDTO.setYearOfPublication(libraryElement.getYearOfPublication());
        libraryElementDTO.setRented(libraryElement.isRented());
        libraryElementDTO.setSold(libraryElement.isSold());
        libraryElementDTO.setActive(libraryElement.isActive());

        return libraryElementDTO;
    }

    public static LibraryElement libraryElementDTOToPersistence(LibraryElementDTO libraryElementDTO){

        LibraryElement libraryElement = new LibraryElement();

        libraryElement.setId(libraryElementDTO.getId());
        libraryElement.setAuthor(libraryElementDTO.getAuthor());
        libraryElement.setTitle(libraryElementDTO.getTitle());
        libraryElement.setPublisher(libraryElementDTO.getPublisher());
        libraryElement.setYearOfPublication(libraryElementDTO.getYearOfPublication());
        libraryElement.setRented(libraryElementDTO.isRented());
        libraryElement.setSold(libraryElementDTO.isSold());
        libraryElement.setActive(libraryElementDTO.isActive());

        return libraryElement;
    }
}
