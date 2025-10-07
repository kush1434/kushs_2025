// Average utility with correct casting and a small demo
public class AvgDemo {
    public static double avgInt(int a, int b) {
        return (a + b) / 2.0; // Cast to double by dividing by 2.0
    }

    public static void main(String[] args) {
        // Demo calls
        System.out.println("avgInt(3, 4) = " + avgInt(3, 4));
        System.out.println("avgInt(5, 6) = " + avgInt(5, 6));
    }
}
