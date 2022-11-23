package ch.noseryoung.blj;

public class Main {
    public static void main(String[] args) {
        double height = 158;
        double diameter = 46;
        char gender = 'f';

        System.out.println(computeGarmentSize(gender, height, diameter));
    }
    public static String computeGarmentSize(char gender, double height, double diameter){
        String size = "";
        double garmentSize;
        if (gender == 'm') {
            garmentSize = diameter/2;
        }
        else if (gender == 'F') {

            if (height < 164){
                garmentSize = diameter/2;
                garmentSize -= 6;
                garmentSize = garmentSize/2;
                size = "kurzgrösse!";
                return size;
            }
            else if (height < 170){
                garmentSize = diameter/2;
                garmentSize -= 6;
                size = "Normalgrösse!";
                return size;
            }
            else if (height > 170){
                garmentSize = diameter/2;
                garmentSize -= 6;
                garmentSize = garmentSize*2;
                size = "Langgrösse!";
                return size;
            }
        }
        return size;
}
}