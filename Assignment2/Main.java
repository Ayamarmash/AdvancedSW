package AdvancedSW.Assignment2;

public class Main {
    public static void main(String[] args) {
        Entity x = new Monster();

        ((Monster) x).getAttributes().add(new FastMonster());

        x.Render();
    }
}