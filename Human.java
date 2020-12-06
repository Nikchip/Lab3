public abstract class Human implements IHuman{
    private String Name;
    private String Place;

    Human(String Name, String Place) {
        this.Name = Name;
        this.Place = Place;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getPlace() {
        return Place;
    }

    public String who() {
        return "Человек по имени " + Name + " создан\n";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.Name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return who();
    }
}
