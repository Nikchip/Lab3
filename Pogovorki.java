public enum Pogovorki implements IPogovorki {
    pogovorka1("Кому пироги да пышки, а нам синяки да шишки"),
    pogovorka2("Слышит ухо, что не сыто брюхо"),
    pogovorka3("Яков лаком, съел кошку с маком");

    private final String pog;

    Pogovorki(String pog) {
        this.pog = pog;
    }

    @Override
    public String getPog() {
        return pog;
    }

    static void pogovorochka() {
        System.out.println("Он принялся вспоминать пословицы и поговорки вроде: " + pogovorka1.getPog() + ", " + pogovorka2.getPog() + " или " + pogovorka3.getPog());
    }
}
