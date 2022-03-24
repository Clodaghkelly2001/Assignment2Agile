public class WagesExceptionHandler  extends Exception
{
    String message;

    public WagesExceptionHandler(String errMessage)
    {
        message = errMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }
}