package io.start;

import java.io.IOException;
import java.io.PrintStream;

import static java.nio.charset.StandardCharsets.*;

/**
 * 콘솔 스트림
 * - System.out(PrintStream)은 자바가 시작될 때 자동으로 만들어진다.
 */
public class PrintStreamMain {

    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;

        byte[] bytes = "Hello!\n".getBytes(UTF_8);
        printStream.write(bytes);
        printStream.println("Print!");
    }
}
