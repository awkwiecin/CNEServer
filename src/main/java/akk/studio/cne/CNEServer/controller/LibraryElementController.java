package akk.studio.cne.CNEServer.controller;

import akk.studio.cne.CNEServer.exception.WrongIdException;
import akk.studio.cne.CNEServer.model.LibraryElementDTO;
import akk.studio.cne.CNEServer.service.LibraryElementService;
import org.apache.el.lang.ELArithmetic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryElementController {

    private List<LibraryElementDTO> libraryElements = new ArrayList<>();

    @Autowired
    LibraryElementService libraryElementService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<LibraryElementDTO> createLibraryElement(@RequestBody LibraryElementDTO libraryElementDTO) {

        if (libraryElementDTO.getId() != null)
            throw new WrongIdException("!Created library element should not have an id, it's generated automatically!");

        System.out.println("/library/create/" + libraryElementDTO.getTitle());
        LibraryElementDTO libraryElementDTO1 = libraryElementService.createLibraryElement(libraryElementDTO);

        return null;
    }

}
