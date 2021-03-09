package bsu.comp152;

public class Rectangle {
    public static void main(String[] args){
        int width = 10;
        int length = 30;


    }

    private static void Rotate(int width, int length){
        //temporary variable//
        int temp = width;
        width = length;
        length = temp;

        System.out.println(width);
        System.out.println(length);
    }
}
