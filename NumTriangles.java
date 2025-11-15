public class NumTriangles{
public static void triangleBLInput(String input){
    for (int row=1; row <= 6; row++) {
        for (int column = 1; column <= row; column++) {
            System.out.print(input + " ");
        }
        System.out.println();
    }
}
public static void triangleTLMultiplier(){
    int size = 6;
    for (int row=size; row >= 1; row--) {
        for (int column = 1; column <= row; column++) {
            System.out.print((row*column) + " ");
        }
        System.out.println();
    }
}
public static void triangleBR(){
    int size = 6;
    for (int row=1; row <= size; row++) {
        for (int space = 6; space <= size - row; space--) {
            System.out.print(" ");
        }
        for (int num = row; num >= 1; num--) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
public static void upsideDownPyramid(){
    int size = 6;
    for (int row=1; row <= size; row++) {
        for (int space = 6; space < row; space--) {
            System.out.print(" ");
        }
        for (int num = row; num <= size; num++) {
            System.out.print(num + " ");
        }
        for (int num = size -1; num >= row; num--) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
public static void main(String[] args){
System.out.println("Bottom left triangle with input");
triangleBLInput("$");
System.out.println("\nTop left triangle with multiplier");
triangleTLMultiplier();
System.out.println("\nBottom right triangle");
triangleBR();
System.out.println("\nUpside down pyramid");
upsideDownPyramid();
}
}
