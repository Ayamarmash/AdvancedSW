public final class Color{
    private final int red, green, blue;
    public Color(int red, int green, int blue) throws Exception {
        if( red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255){
            throw new Exception("Invalid values");
        }
        this.red = red;
        this.green = green;
        this.blue = blue;
        if(red+green+blue == 255 && red == 255)System.out.println("Red color");
        else if(red+green+blue == 255 && green == 255)System.out.println("Green color");
        else if(red+green+blue == 255 && blue == 255)System.out.println("Blue color");
        else if(red+green+blue == 765)System.out.println("White color");
        else if(red+green+blue == 0)System.out.println("Black color");
        else System.out.println(this.getKey());
    }
    public static String getKey(int red, int green, int blue){
        String str = red + " " + green + " " + blue;
        return str;
    }
    public String getKey(){
        String str = this.red + " " + this.green + " " + this.blue;
        return str;
    }
}
