package exceptions;

import java.util.Random;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }


}
