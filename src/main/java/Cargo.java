import java.io.Serializable;

/**
 * Константы типов груза со значениями по умолчанию
 *
 * <code>COAL</code> уголь: значения по умолчанию (макс. масса груза - 71 т, макс. скорость - 300 км/сут.)
 * <code>SAND</code> песок: значения по умолчанию (макс. масса груза - 69 т, макс. скорость - 300 км/сут.)
 * <code>OIL</code> нефть: значения по умолчанию (макс. масса груза - 125 т, макс. скорость - 280 км/сут.)
 */
public enum Cargo implements Debug, Serializable {
    COAL(RailCar.RailcarType.GONDOLA, 71d, 300d, "уголь"),
    SAND(RailCar.RailcarType.GONDOLA, 69d, 300d, "песок"),
    OIL(RailCar.RailcarType.TANK, 125d, 280d, "нефть");

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
