package Advanced.exercise.ExceptionTest_1;

public class UserNameException extends Exception{
    public UserNameException() {
    }

    public UserNameException(String message) {
        super(message);
    }
}
