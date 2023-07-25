package activity3lab2;

public class Literary extends Tawjihi {
    private Names major;

    public Literary(int seatingNumber, int id, String name, String school, char gender, Names major) {
        super(seatingNumber, id, name, school, gender);
        this.major = major;
    }
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return super.toString();
   }
    @Override
    public double calculateAverage() {
        if (major == Names.ARABIC) {
            return 0;
        } else {
            return 0;
        }
    }
}
