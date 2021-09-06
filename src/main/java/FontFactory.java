import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/**
 * <b>Класс создает фирменные шрифты модели</b><br/><br/>
 *
 * @author ООО "Дилибриум"<br/>Техническая поддержка: <a href="mailto:support@dilibrium.ru">support@dilibrium.ru</a>
 * @version 0.0.3
 */
public class FontFactory implements Debug, Serializable {

    /**
     * Это число используется при сохранении состояния модели<br>
     * Его рекомендуется изменить в случае изменения класса
     */
    private static final long serialVersionUID = 1L;

    /**
     * Меод создает шрифт из файла шрифта
     * @param path путь до файла со шрифтом
     * @return объект Font или <code>null</code>, если создать шрифт не удалось
     * @see java.awt.Font
     */
    public static Font createFont(String path, float size) {
        Font font = null;

        try {
            File fontFile = new File(path);
            font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            if (DEBUG) {
                System.out.println(font.getFontName());
                font.getAttributes().entrySet().forEach(System.out::println);
            }
        } catch (IOException | FontFormatException e) {
            System.out.println("WARNING: не удалость прочитать файл со шрифтом " + path);
            e.printStackTrace();
        }

        Font newSizeFont = null;
        try {
            newSizeFont = font != null ? font.deriveFont(size) : font;
            if (DEBUG) {
                System.out.println(newSizeFont.getFontName());
                newSizeFont.getAttributes().entrySet().forEach(System.out::println);
            }
        } catch (NullPointerException e) {
            System.out.println("WARNING: не удалость увеличить размер шрифта " + size);
            e.printStackTrace();
        }

        return newSizeFont;
    }

}
