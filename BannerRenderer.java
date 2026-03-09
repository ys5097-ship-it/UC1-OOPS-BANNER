import java.util.HashMap;
import java.util.Map;

public class BannerRenderer {

    // Map to store character patterns
    private Map<Character, String[]> patternMap = new HashMap<>();

    // Constructor to load patterns
    public BannerRenderer() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Function to render banner word
    public void renderBanner(String word) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(Character.toUpperCase(ch));

                if (pattern != null) {
                    System.out.print(pattern[i] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        BannerRenderer banner = new BannerRenderer();

        banner.renderBanner("OOPS");
    }
}