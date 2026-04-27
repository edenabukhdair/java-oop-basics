public class Light {
    public boolean ison;
    public boolean turnon() {
         { ison =true;
           return ison;
        }
    }
    public boolean turnoff() {
        { ison =false;
            return ison;
        }


} public void printDetails() {
        System.out.println("light="+ison);
    }
}
