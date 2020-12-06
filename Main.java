public class Main {
    public static void main (String[] args) {
        ThinkingHuman Neznaika = new ThinkingHuman("Незнайка","под мостом","скучно");
        StayingHuman Ponchik = new StayingHuman("Пончик","в ракете","очень любил покушать");
        Neznaika.getMood();
        Neznaika.SingAllSongs();
        Neznaika.MakeAllThePuzzles();
        Pogovorki.pogovorochka();
        Neznaika.RememberAllTheFriends();
        Ponchik.Remembered();
        Ponchik.getHaracter();
        Neznaika.hashCode();
        Neznaika.equals(Ponchik);
        Ponchik.toString();
    }
}
