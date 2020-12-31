package hw10.task4;

public class TooManyChars extends Exception
{
    public TooManyChars() {
    }

    public TooManyChars(String message) {
        super(message);
    }
}
