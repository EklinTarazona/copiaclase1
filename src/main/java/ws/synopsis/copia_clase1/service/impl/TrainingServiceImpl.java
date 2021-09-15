package ws.synopsis.copia_clase1.service.impl;

import org.springframework.stereotype.Service;
import ws.synopsis.copia_clase1.response.IndexResponse;
import ws.synopsis.copia_clase1.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService {
    @Override
    public IndexResponse index() {
        System.out.println("Invocando a index.");
        StringBuilder sts = new StringBuilder().append("Invocando").append(" a ").append("Index.");
        return IndexResponse.builder()
                .message(sts.toString())
                .build();
    }
}
