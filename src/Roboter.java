public class Roboter {
    private String nahkampfwaffe;
    private String fernkampfwaffe;

    public Roboter(String nahkampfwaffe, String fernkampfwaffe) {
        this.nahkampfwaffe = nahkampfwaffe;
        this.fernkampfwaffe = fernkampfwaffe;
    }
    public String getNahkampfwaffe() {
        return nahkampfwaffe;
    }
    public void setNahkampfwaffe(String nahkampfwaffe) {
        this.nahkampfwaffe = nahkampfwaffe;
    }
    public String getFernkampfwaffe() {
        return fernkampfwaffe;
    }
    public void setFernkampfwaffe(String fernkampfwaffe) {
        this.fernkampfwaffe = fernkampfwaffe;
    }
}
