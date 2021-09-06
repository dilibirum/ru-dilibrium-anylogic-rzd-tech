import java.io.Serializable;

/**
 * <b>Константы типов груза со значениями по умолчанию</b><br/><br/>
 *
 * <code>COAL</code> уголь: значения по умолчанию (макс. масса груза - 71 т, макс. скорость - 300 км/сут.)<br/>
 * <code>SAND</code> песок: значения по умолчанию (макс. масса груза - 69 т, макс. скорость - 300 км/сут.)<br/>
 * <code>OIL</code> нефть: значения по умолчанию (макс. масса груза - 125 т, макс. скорость - 280 км/сут.)<br/><br/>
 *
 * @author ООО "Дилибриум"<br/>Техническая поддержка: <a href="mailto:support@dilibrium.ru">support@dilibrium.ru</a>
 * @version 0.0.1
 */
public enum Cargo implements Debug, Serializable {
    COAL(RailCar.RailcarType.GONDOLA, 71d, 300d, "Уголь"),
    SAND(RailCar.RailcarType.GONDOLA, 69d, 300d, "Песок"),
    OIL(RailCar.RailcarType.TANK, 125d, 280d, "Нефть");

    /**
     * Это число используется при сохранении состояния модели<br>
     * Его рекомендуется изменить в случае изменения класса
     */
    private static final long serialVersionUID = 5L;

    /**
     * Доступный тип вагона
     */
    public RailCar.RailcarType railcarType;

    /**
     * Максимальная масса груза в вагоне, в тоннах
     */
    public double maxCargoWeight;

    /**
     * Максимально допустимая скорость вагона для данного типа груза, в км/сут
     */
    public double speed;

    /**
     * Наименование груза
     */
    public String alias;

    Cargo(RailCar.RailcarType railcarType, double maxCargoWeight, double speed, String alias) {
        this.railcarType = railcarType;
        this.maxCargoWeight = maxCargoWeight;
        this.speed = speed;
        this.alias = alias;
    }

    /**
     * Метод обновляет значения типа груза
     * @param railcarType тип вагона
     * @param maxCargoWeight максимальная масса груза
     * @param speed максимальная скорость
     */
    public void update(RailCar.RailcarType railcarType, double maxCargoWeight, double speed) {
        this.railcarType = railcarType;
        this.maxCargoWeight = maxCargoWeight;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Груз: " + alias
                + " (" + railcarType.alias
                + ", " + String.format("%,.0f", maxCargoWeight)
                + " т, " + String.format("%,.0f", speed) + " км/сут)";
    }
}
