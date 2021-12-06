package ex.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Temp1 {
    public static void main(String[] args) throws IOException {
        question1();
    }
    public static void question1() {
        String first = "./src/ex/file";
        String fileName = "temp.txt";
        //Path.ofメソッドでパスを取得して
        //notExistsメソッド（ファイルがなければ）で指定した階層にファイルがあるかを確認
        if (Files.notExists(Path.of(first, fileName))) {
            try {
                //createFileで場所とファイル形式を指定して空のファイルを作成
                Files.createFile(Path.of(first, fileName));
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}
