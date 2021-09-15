package ws.synopsis.copia_clase1.response;

import lombok.Data;

@Data
public class TrainingResponse <T> {
    TrainingStatus status;
    private T data;
}
