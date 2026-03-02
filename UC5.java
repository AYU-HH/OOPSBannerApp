public class UC5 {
    public static void main(String[] args) {
        String[] row1 = {"  * ", "  * "};
        String[] row2 = {" * * ", " * * "};
        String[] row3 = {"*****", "*****"};
        String[] bannerLines = {
            String.join(" ", row1),
            String.join(" ", row2),
            String.join(" ", row3)
        };
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
