package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;




/**
 * Created by s.tsymbalenko on 23.11.2016.
 */

public class ImageReaderFactory {


    public static ImageReader getReader(ImageTypes jpg) {
        ImageReader reader;

        if (jpg == ImageTypes.JPG) {
            reader = new JpgReader();
        } else if (jpg == ImageTypes.BMP) {
            reader = new BmpReader();
        } else if (jpg == ImageTypes.PNG) {
            reader = new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        return reader;
    }


}
