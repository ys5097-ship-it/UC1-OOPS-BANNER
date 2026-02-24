

public class uc5array {

    public static void main(String[] args) {

        
        String[] lines = {

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    " ***** ",
                    " ***** "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "      *"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "      *"),

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    " ***** ",
                    " ***** ")
        };

        // Enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}