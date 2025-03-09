package io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.*;

/**
 * 파일 쓰기 - 버퍼 기능을 사용해 10MB 파일을 생성 및 시간 측정
 */
public class CreateFileV3 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE); // 내부에서 단순히 버퍼 기능만 제공
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < FILE_SIZE; i++) {
            bos.write(1);
        }
        // close 메서드를 호출하면 내부적으로 flush() 메서드를 호출한다.
        // close 메서드를 호출하면 연쇄적으로 연결된 스트림의 close()를 호출한다.
        bos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("FILE_NAME: " + FILE_NAME);
        System.out.println("FILE_SIZE: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
