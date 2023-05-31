package by.ruslan.radevich.lessons19;

import java.util.concurrent.Callable;

public class MyCallble implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Hello";
    }
}
