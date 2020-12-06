public class ThinkingHuman extends Human {
    private String mood;
    ThinkingHuman(String Name,String Place,String mood) {
        super(Name, Place);
        this.mood = mood;
    }

    void getMood() {
        System.out.println(getName() + " чувствовал себя " + mood + " пока лежал " + getPlace() + " поэтому он всячески пытался развлечь себя");
    }

    void SingAllSongs() {
        System.out.println(getName() + " спел все песни, которые знал");
    }

    void MakeAllThePuzzles() {
        System.out.println(getName() + " загадал себе все загадки, которые знал, и разгадал их");
    }
    void RememberAllTheFriends() {
        System.out.println(getName() + " вспомнил всех своих друзей");
    }
}
