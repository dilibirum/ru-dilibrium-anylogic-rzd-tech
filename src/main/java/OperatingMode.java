import java.io.Serializable;

/**
 * <b>Схемы работы модели</b><br/><br/>
 *
 * <code>0</code> - Текущая схемая работы;<br/>
 * <code>1</code> - Целевая схема работы.<br/><br/>
 *
 * @author ООО "Дилибриум"<br/>Техническая поддержка: <a href="mailto:support@dilibrium.ru">support@dilibrium.ru</a>
 * @version 0.0.1
 */
public enum OperatingMode implements Serializable {
    CURRENT("Текущая схемая работы", 0),
    TARGET("Целевая схема работы", 1)
    ;

    /**
     * Это число используется при сохранении состояния модели<br>
     * Его рекомендуется изменить в случае изменения класса
     */
    private static final long serialVersionUID = 4L;

    /**
     * Наименование схемы
     */
    public String alias;

    /**
     * Индекс схемы
     */
    public int index;

    OperatingMode(String alias, int index) {
        this.alias = alias;
        this.index = index;
    }

    /**
     * Метод возвращает схему работы модели по ее названию
     * @param alias название схемы
     * @return схема работы, по умолчанию "Текущая схемая работы"
     */
    public static OperatingMode getMode(String alias) {
        switch (alias) {
            case ("Текущая схемая работы"):
                default:
                    return OperatingMode.CURRENT;
            case ("Целевая схема работы"):
                return OperatingMode.TARGET;
        }
    }

    /**
     * Метод возвращает схему работы модели по ее индексу
     * @param index индекс схемы
     * @return схема работы, по умолчанию "Текущая схемая работы"
     */
    public static OperatingMode getMode(int index) {
        switch (index) {
            case (0):
            default:
                return OperatingMode.CURRENT;
            case (1):
                return OperatingMode.TARGET;
        }
    }

    @Override
    public String toString() {
        return index + " – " + alias;
    }
}
