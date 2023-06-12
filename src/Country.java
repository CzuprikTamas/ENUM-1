public enum Country {
    SWEDISH("SVÉD"),
    HUNGARY("MAGYAR"),
    UKRAINE("UKRAJNA");

    private String magyarNev;

    Country(String magyarNev) {
        this.magyarNev = magyarNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

    public String toString() {
        return magyarNev;
    }
}
