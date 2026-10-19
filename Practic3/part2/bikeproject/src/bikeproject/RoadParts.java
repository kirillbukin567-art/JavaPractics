package bikeproject;

public interface RoadParts {

    String terrain = "track_racing";

    // Поля tyreWidth и postHeight в классе RoadBike имеют тип int,
    // поэтому и аргумент newValue здесь типа int
    int getTyreWidth();
    void setTyreWidth(int newValue);

    int getPostHeight();
    void setPostHeight(int newValue);

}//end interface RoadParts