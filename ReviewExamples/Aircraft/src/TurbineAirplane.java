public class TurbineAirplane extends FixedWing {

    private String turbineType; // jet, turboprop, turbofan

    /**
     * Basic constructor defers to same in superclass.
     */
    public TurbineAirplane(int numberOfEngines, String tailNumber, String modelName) {
        super(numberOfEngines, tailNumber, modelName);
        super.setGearIsRetractable(true); // all jets have retractable gear
    } // constructor TurbineAirplane

    /**
     * @return descriptive string for this aircraft.
     */
    @Override
    public String toString() {
        return String.format("%S is a %s airplane with %d engine(s) and retractable gear.\n" +
                        "This %s (%s) was manufactured by %s in %d.",
                getTailNumber(), getTurbineType(), getNumberOfEngines(),
                getModelName(), getModelCode(), getManufacturer(), getYearManufactured());
    } // method toString

    /*
    AUTOMAGICALLY GENERATED CODE: MUTATORS (SETTERS)
    Methods to change the value of variables in existing objects
    */

    public void setTurbineType(String turbineType) {
        this.turbineType = turbineType;
    }

    /*
    AUTOMAGICALLY GENERATED CODE: ACCESSORS (GETTERS)
    Methods to obtain the value of variables in existing objects
    */

    public String getTurbineType() {
        return turbineType;
    }
}
