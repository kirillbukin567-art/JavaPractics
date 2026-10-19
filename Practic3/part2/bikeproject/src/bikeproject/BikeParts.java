package bikeproject;

public interface BikeParts {

    // Константа интерфейса: неявно public static final, поэтому значение изменить нельзя
    String MAKE = "Oracle Cycles";

    // Методы, которые обязан реализовать любой класс, использующий этот интерфейс
    String getHandleBars();
    void setHandleBars(String newValue);

    String getFrame();
    void setFrame(String newValue);

    String getTyres();
    void setTyres(String newValue);

    String getSeatType();
    void setSeatType(String newValue);

    int getNumGears();
    void setNumGears(int newValue);

}//end interface BikeParts