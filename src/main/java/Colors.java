import java.awt.Color;
import java.io.Serializable;

/**
 * Цветовые константы модели
 */
public enum Colors implements Serializable {
    RZD_RED(new Color(226, 26, 26), "красный РЖД"),
    RZD_GRAY_20(new Color(209, 211, 210), "серый 20%"),
    RZD_GRAY_40(new Color(168, 169, 173), "серый 40%"),
    RZD_GRAY_60(new Color(129, 130, 134), "серый 60%"),
    RZD_GRAY_80(new Color(88, 89, 91), "серый 80%"),
    BUTTON_ACTIVE(new Color(230, 230, 250), "кнопка нажата"),
    BUTTON_INACTIVE(new Color(180, 180, 200), "кнопка не нажата")
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