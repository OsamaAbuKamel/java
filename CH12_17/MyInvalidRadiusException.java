package CH12_17;

public class MyInvalidRadiusException extends Exception {

    private String myMsg = "";

    public MyInvalidRadiusException(String userMsg) {
        // user-defined message
        myMsg = userMsg;
    }

    public MyInvalidRadiusException() {
        // default message
        myMsg = "Invalid RADIUS. It must be a positive value";
    }

    @Override
    public String getMessage() {
        return myMsg;
    }
}

class Circle2 {
    private double radius;

    public Circle2() throws MyInvalidRadiusException {
        setRadius(0);
    }

    public Circle2(double radius) throws MyInvalidRadiusException {
        setRadius(radius);
    }

    /**
     * Set a new radius – it must be a positive number
     * 
     * @throws Exception
     */
    public void setRadius(double radius) throws MyInvalidRadiusException {
        if (radius >= 0)
            this.radius = radius;
        else
            throw new MyInvalidRadiusException("Radius must be positive "
                    + radius);
    }
}
