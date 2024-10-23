package co.unicauca.conferencia.core.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.unicauca.conferencia.core.fachadaServices.DTO.ConferenceDTO;
import co.unicauca.conferencia.core.services.IConferenceService;

@RestController
@RequestMapping("/api")
public class ConferenceRestController {
    
    @Autowired
    private IConferenceService ConferenceService;

    @GetMapping("/conferences")
    public List<ConferenceDTO> getConferences() {
        return ConferenceService.findAll();
    }

    @GetMapping("/conferences/{id}")
    public ConferenceDTO getConferenceById(Integer id) {
        return ConferenceService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<ConferenceDTO> getConferences() {
        return ConferenceService.findAll();
    }
}
