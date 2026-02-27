public class BannerApp {
    public static void main(String[] args) {
        // Example: Representing the letter 'A' patterns for 3 lines (simulated)
        String[] row1 = {"  * ", "  * "};
        String[] row2 = {" * * ", " * * "};
        String[] row3 = {"*****", "*****"};

        // UC5 Optimization: Combined Declaration and Initialization
        String[] bannerLines = {
            String.join(" ", row1),
            String.join(" ", row2),
            String.join(" ", row3)
        };

        // Enhanced For Loop for printing
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
