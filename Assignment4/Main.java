public class Main {
    public static void main(String[] args) throws Exception {
        ColorStore.createNewColor(0,0,0); // color already exist (from the basic colors)
        ColorStore.createNewColor(4,4,4); // new color added
        ColorStore.printColors();
    }
}
