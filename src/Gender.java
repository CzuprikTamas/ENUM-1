public enum Gender {
    MAN("FERFI" ,"UMOU"),
    WOMAN("NŐ", "DONNA");

    private String magyarNev;
    private String olaszNev;

    Gender(String magyarNev, String olaszNev) {
        this.magyarNev = magyarNev;
        this.olaszNev = olaszNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

    public void setMagyarNev(String magyarNev) {
        this.magyarNev = magyarNev;
    }

    public String getOlaszNev() {
        return olaszNev;
    }

    public void setOlaszNev(String olaszNev) {
        this.olaszNev = olaszNev;
    }
}
