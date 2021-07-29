package helpers;

import models.DataModel;

public class Apihelpers {

    public static DataModel dataModel ;

    //shared helper class with dataModel as argument in the constructor to allow child class be able to use method defined in there
    public Apihelpers(DataModel dataModel) {
        this.dataModel = dataModel;
    }
}
