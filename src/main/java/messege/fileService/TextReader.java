package messege.fileService;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class TextReader {

    /**
     * Метод читающий тхт файл
     * **/
    public void TextReaderFile() throws IOException {

        File txt = new File("src\\main\\resources\\Rulki.txt");

        Scanner textSkanner = new Scanner(txt);
        while (textSkanner.hasNextLine()) {
            System.out.println(textSkanner.nextLine());
        }

    }

}
