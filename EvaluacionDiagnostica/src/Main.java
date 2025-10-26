public class Main {
    public static void main(String[] args) throws Exception {
        leftTriangle(10, "*");

    }

    public static void leftTriangle(int nrows, String simbol) {
        for (int i = 1; i <= nrows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(simbol);
            }
            System.out.println();
        }
    }
}
