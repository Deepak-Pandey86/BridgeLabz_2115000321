import java.io.*;


public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream);


            Thread writerThread = new Thread(new WriterTask(outputStream));
            Thread readerThread = new Thread(new ReaderTask(inputStream));


            writerThread.start();
            readerThread.start();


        } catch (IOException e) {
            System.out.println("Error creating piped streams: " + e.getMessage());
        }
    }
}


class WriterTask implements Runnable {
    private final PipedOutputStream outputStream;


    public WriterTask(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }


    @Override
    public void run() {
        try (outputStream) {
            String message = "Hello from Writer Thread!";
            outputStream.write(message.getBytes());
        } catch (IOException e) {
            System.out.println("Error writing to stream: " + e.getMessage());
        }
    }
}


class ReaderTask implements Runnable {
    private final PipedInputStream inputStream;


    public ReaderTask(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }


    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Reader received: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from stream: " + e.getMessage());
        }
    }
}
