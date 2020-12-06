public class StayingHuman extends Human {
    private String haracter;
    StayingHuman(String Name,String Place,String haracter) {
        super(Name, Place);
        this.haracter = haracter;
    }
    void Remembered() {
        System.out.println("Он вспомнил и своего друга по имени " + getName() + ", который, как ему казалось, остался " + getPlace() + ", и стал горевать за своего друга");
    }

    void getHaracter() {
        System.out.println("Он также вспомнил, что " + getName() + " " + haracter);
    }
}
