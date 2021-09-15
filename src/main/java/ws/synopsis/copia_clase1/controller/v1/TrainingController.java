package ws.synopsis.copia_clase1.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ws.synopsis.copia_clase1.response.IndexResponse;
import ws.synopsis.copia_clase1.response.TrainingResponse;
import ws.synopsis.copia_clase1.response.TrainingStatus;
import ws.synopsis.copia_clase1.service.TrainingService;

@RestController
@RequestMapping("/training/v1")
public class TrainingController {

    @Autowired
    private TrainingService service;
    @GetMapping({"", "/"})
    public TrainingResponse<IndexResponse> index() {
        TrainingResponse<IndexResponse> response = new TrainingResponse<>();
        response.setData(service.index());
        response.setStatus(TrainingStatus.builder().code("0000").message("Ejecutado de manera exitosa!").build());
        return response;
    }
}