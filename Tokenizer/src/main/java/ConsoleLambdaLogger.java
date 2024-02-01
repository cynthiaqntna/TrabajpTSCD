import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class ConsoleLambdaLogger implements LambdaLogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public void log(byte[] message) {
        System.out.println(new String(message));
    }
}
