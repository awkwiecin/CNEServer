package akk.studio.cne.CNEServer.controller;

import akk.studio.cne.CNEServer.model.LibraryElementDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryElementController {

    private List<LibraryElementDTO> libraryElements = new ArrayList<>();

}
