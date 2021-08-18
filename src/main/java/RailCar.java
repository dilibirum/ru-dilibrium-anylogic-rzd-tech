import java.io.Serializable;

/**
 * Железнодорожный вагон
 *
 * @version 0.0.1
 * @author ООО "Дилибриум". <br/>Техническая поддержка: <a href="mailto:support@dilibrium.ru">support@dilibrium.ru</a>
 */
public class RailCar implements Debug, Serializable {

    /**
     * Это число используется при сохранении состояния модели<br>
     * Его рекомендуется изменить в случае изменения класса
     */
    private static final long serialVersionUID = 3L;

    /**
     * Констатны типов вагонов
     */
    enum RailcarType {
        GONDOLA("полувагон"),
        TANK("цистерна");

        public String alias;

        RailcarType(String alias) {
            this.alias = alias;
        }

        @Override
        public String toString() {
            return alias;
        }
    }

    /**
     * Константы направлений
     */
    enum Direction {
        EAST("Дальневосточная"),
        WEST("Октябрьская");

        /**
         * Наименование железной дороги
         */
        public String alias;

        Direction(String alias) {
            this.alias = alias;
        }

        /**
         * Метод возвращает направление по наименованию железной дороги
         * @param railway железная дорога
         * @return направление или <code>null</code>, если направление определить не удалось
         */
        public static Direction getDirection(String railway) throws NullPointerException {
            switch (railway) {
                case("Дальневосточная"):
                    return Direction.EAST;
                case ("Октябрьская"):
                    return Direction.WEST;
                default:
                    return null;
            }
        }

        @Override
        public String toString() {
            return alias + " железная дорога";
        }
    }

    /**
     * Уникальный номер вагона
     */
    public int id;

    /**
     * Тип вагона
     */
    public RailcarType railcarType;

    /**
     * Тип груза
     */
    public Cargo cargo;

    /**
     * Текущая масса груза в вагоне
     */
    public double cargoWeight;

    /**
     * Направление работы
     */
    public Direction direction;

    /**
     * Станция отправления
     */
    public String departureStation;

    /**
     * Станция назначения
     */
    public String destinationStation;

    /**
     * Станция приписки (обычно та станция, с которой был начат самы первый маршрут)
     */
    public String homeStationCode;

    /**
     * Признак пустого (порожнего вагона)
     */
    public boolean isEmpty;

    /**
     * Признак "замороженного" вагона, ожидающего или на путях или на станции,
     * по умолчанию <code>false</code>
     */
    public boolean isFreeze = false;

    public RailCar(Cargo cargo, double cargoWeight) {
        this.id = hashCode();
        this.cargo = cargo;
        this.railcarType = cargo.railcarType;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public String toString() {
        return "Вагон #" + id
                + ": тип " + railcarType.alias
                + ", груз: " + cargo.alias
                + ", текущая масса груза: " + cargoWeight
                + " т из макс. возможной " + cargo.maxCargoWeight
                + " т";
    }
}
