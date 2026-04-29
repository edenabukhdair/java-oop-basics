public class light {
    private boolean ison;

    public boolean setTurnon() {
        { ison =true;
            return ison;}}

    public boolean setTurnoff() {
        { ison =false;
            return ison;}}
    public String toString() {
        return "light{ison = " + ison + "}";
    }

}
