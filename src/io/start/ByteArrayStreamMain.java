package io.start;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 메모리 스트림
 * - 주로 스트림을 간단하게 테스트 하거나 스트림의 데이터를 확인하는 용도
 * - 메모리에 어떤 데이터를 저장하고 읽을 땐 주로 컬렉션이나 배열을 사용하므로 잘 사용되지는 앟는다.
 */
public class ByteArrayStreamMain {

    public static void main(String[] args) throws IOException {
        byte[] input = {1, 2, 3};

        // 메모리에 쓰기
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(input);

        // 메모리에서 읽기
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        byte[] bytes = bais.readAllBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
