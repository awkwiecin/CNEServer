package akk.studio.cne.CNEServer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongIdException extends RuntimeException {

    public WrongIdException(String msg){
        super(msg);
    }

}
