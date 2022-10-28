import java.util.HashMap;

public class ColorStore {
    private final static HashMap<String, Color> colors = new HashMap<>();
    static {
        System.out.println("Initializing basic colors");
        try {
            Color red = new Color(255,0,0);
            Color green = new Color(0,255,0);
            Color blue = new Color(0,0,255);
            Color white = new Color(255,255,255);
            Color black = new Color(0,0,0);
            colors.put(red.getKey(), red);
            colors.put(green.getKey(), green);
            colors.put(blue.getKey(), blue);
            colors.put(white.getKey(), white);
            colors.put(black.getKey(), black);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Color createNewColor(int red, int green, int blue) throws Exception {

        if(!colors.containsKey(Color.getKey(red, green, blue))){
            try{
                Color color = new Color(red, green, blue);
                colors.put(Color.getKey(red, green, blue), color);
                System.out.println("New color was added");
                System.out.println("Number of colors so far = " + colors.size());
                return color;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
        else{
            System.out.println("This color already exist");
            System.out.println("Number of colors so far = " + colors.size());
            return colors.get(Color.getKey(red, green, blue));
        }
    }
}
