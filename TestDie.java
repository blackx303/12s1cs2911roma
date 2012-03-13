public class TestDie {
    public static void main(String[] args) {
        Die d = new Die();
        int result = d.roll();
        assert(result <= 6 && result >= 1);
        System.out.println("You are awesome!");
    }
}