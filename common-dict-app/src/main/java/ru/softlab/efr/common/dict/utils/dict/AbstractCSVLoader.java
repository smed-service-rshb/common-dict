package ru.softlab.efr.common.dict.utils.dict;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Загрузчик файлов в формате CSV
 *
 * @author olshansky
 * @since 14.09.2018.
 */
abstract class AbstractCSVLoader<T> {

    private String charsetName;

    AbstractCSVLoader(String charsetName) {
        this.charsetName = charsetName;
    }

    abstract T parseLineString(String line);

    public void parseAndSave(String path, int batchSaveCount, Function<List<T>, Void> saveFunction) throws IOException {
        List<T> result = new ArrayList<>();
        int i = 0;

        try (FileInputStream inputStream = new FileInputStream(path);
             Scanner sc = new Scanner(inputStream, charsetName)) {

            while (sc.hasNextLine()) {
                i++;
                T parseResult = parseLineString(sc.nextLine());

                if (parseResult != null) {
                    result.add(parseResult);
                    if (i >= batchSaveCount) {
                        i = 0;
                        saveFunction.apply(result);
                        result.clear();
                    }
                }
            }
            saveFunction.apply(result);
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        }
    }

}
