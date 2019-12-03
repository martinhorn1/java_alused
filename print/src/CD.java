public class CD implements ToBeStored {
    public String artist;
    public String title;
    public int published;

    public CD(String artist, String title, int published) {
        this.artist = artist;
        this.title = title;
        this.published = published;
    }
    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + published + ")";
    }

    public static void main(String[] args) {
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
}
