public class Die {
    public int roll() {
        java.util.Random r = new java.util.Random();
        return (r.nextInt(6) + 1);
    }
}