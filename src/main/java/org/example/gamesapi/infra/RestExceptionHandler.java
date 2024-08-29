package org.example.gamesapi.infra;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice
public class RestExceptionHandler {
    Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<String> handleNoResourceFoundException(NoResourceFoundException exception) {
        LOGGER.error("ERROR! Resource not found: {}", exception.getMessage(), " Try again.");
        return ResponseEntity.status(404).body("ERROR! Resource not found: " + exception.getMessage() + " Try again.");
    }
}

