import java.awt.Color;
import java.io.Serializable;

/**
 * <b>Цветовые константы модели</b><br/><br/>
 *
 * <code>RZD_RED</code> красный РЖД<br/>
 * <code>RZD_GRAY_20</code> серый 20%<br/>
 * <code>RZD_GRAY_40</code> серый 40%<br/>
 * <code>RZD_GRAY_60</code> серый 60%<br/>
 * <code>RZD_GRAY_80</code> серый 80%<br/>
 * <code>BUTTON_ACTIVE</code> кнопка нажата<br/>
 * <code>BUTTON_INACTIVE</code> кнопка не нажата<br/><br/>
 *
 * @author ООО "Дилибриум"<br/>Техническая поддержка: <a href="mailto:support@dilibrium.ru">support@dilibrium.ru</a>
 * @version 0.0.1
 */
public enum Colors implements Serializable {
    RZD_RED(new Color(226, 26, 26), "красный РЖД"),
    RZD_GRAY_20(new Color(209, 211, 210), "серый 20%"),
    RZD_GRAY_40(new Color(168, 169, 173), "серый 40%"),
    RZD_GRAY_60(new Color(129, 130, 134), "серый 60%"),
    RZD_GRAY_80(new Color(88, 89, 91), "серый 80%"),
    BUTTON_ACTIVE(new Color(230, 230, 250), "кнопка нажата"),
    BUTTON_INACTIVE(new Color(180, 180, 200), "кнопка не нажата"),
    OZD(new Color(255, 165, 0), "цвет октябрьской ж. д."),
    ZSZD(new Color(138, 43, 226), "цвет западно-сибирской ж. д."),
    DVZD(new Color(107, 142, 35), "цвет дальневосточной ж. д.")
    ;

    /**
     * Это число используется при сохранении состояния модели<br>
     * Его рекомендуется изменить в случае изменения класса
     */
    private static final long serialVersionUID = 2L;

    /**
     * Цвет
     */
    public Color color;

    /**
     * Наименование цвета
     */
    public String alias;

    Colors(Color color, String alias) {
        this.color = color;
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias;
    }
}
