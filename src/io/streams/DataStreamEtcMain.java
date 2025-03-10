package io.streams;

import java.io.*;

/**
 * `DataOutputStream`을 사용하면 자바의 String, int, double, boolean 같은 데이터형을 편리하게 다룰 수 있음.
 * - 데이터 형식을 그대로 저장한다.(문자로 치환 X)
 * - 파일을 읽을 땐 반드시 데이터형이 저장된 순서대로 읽어야 한다.
 *   - 각 타입을 그대로 사용하기 때문에 바이트의 수가 상이하다. 따라서 저장된 순서대로 읽어야 바이트를 알맞는 타입으로 정확히 읽을 수 있다.
 */
public class DataStreamEtcMain {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/data.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("회원A"); // UTF-8 형식으로 쓰기
        dos.writeInt(20);
        dos.writeDouble(10.5);
        dos.writeBoolean(true);
        dos.close();

        // 데이터 읽기
        FileInputStream fis = new FileInputStream("temp/data.dat");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        dis.close();
    }
}
