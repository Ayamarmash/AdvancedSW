public final class Color{
    private final int red, green, blue;
    private final String key;
    public Color(int red, int green, int blue) throws Exception {
        if( red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255){
            throw new Exception("Invalid values");
        }
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.key = this.red + " " + this.green + " " + this.blue;
    }
    public String getKey(){
        return key;
    }
    public static String checkKey(int red, int green, int blue){
        return red + " " + green + " " + blue;
    }
    public void printColorName(){
        int sum = this.red+this.green+this.blue;
        if(sum == 255 && this.red == 255)System.out.println("Red color");
        else if(sum == 255 && this.green == 255)System.out.println("Green color");
        else if(sum == 255 && this.blue == 255)System.out.println("Blue color");
        else if(sum == 765)System.out.println("White color");
        else if(sum == 0)System.out.println("Black color");
        else System.out.println(this.key);
    }
}
