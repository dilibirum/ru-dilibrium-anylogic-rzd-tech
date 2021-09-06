import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * <b>Класс хранит утилиты модели</b><br/><br/>
 *
 * @author ООО "Дилибриум"<br/>Техническая поддержка: <a href="mailto:support@dilibrium.ru">support@dilibrium.ru</a>
 * @version 0.0.1
 */
public class ModelUtils {

    /**
     * Метод открывает ссылку на сайт в браузере по умолчанию
     * @param url ссылка на сайт
     */
    public static void urlHandler(String url) {

        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                System.out.println(
                        "WARNING: ModelUtils.urlHandler() --> не удалось открыть ссылку " + url
                );
            }
        } else {
            System.out.println(
                    "WARNING: ModelUtils.urlHandler() --> рабочий стол в данной операционной системе не поддерживается!"
            );
        }
    }
}
