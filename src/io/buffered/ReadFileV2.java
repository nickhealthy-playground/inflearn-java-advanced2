package io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.BUFFER_SIZE;
import static io.buffered.BufferedConst.FILE_NAME;

/**
 * 파일 읽기 - read() 및 buffer를 이용해서 10MB 파일을 읽기 및 시간 측정
 */
public class ReadFileV2 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        byte[] buffer = new byte[BUFFER_SIZE];
        int fileSize = 0;
        int size;
        while ((size = fis.read(buffer)) != -1) {
            fileSize += size;
        }
        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("FILE_NAME: " + FILE_NAME);
        System.out.println("FILE_SIZE: " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
