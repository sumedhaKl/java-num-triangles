public class NumTriangles{
//This function should print a triangle in the bottom left with the character being the input parameter of the function.
//$
//$ $
//$ $ $
//$ $ $ $
//$ $ $ $ $
//$ $ $ $ $ $
public static void triangleBLInput(String input){
    for (int row=1; row <= 6; row++) {
        for (int column = 1; column <= row; column++) {
            System.out.print(input + " ");
        }
        System.out.println();
    }
}
//Triangle in the top left with multiplier
//6 12 18 24 30 36
//5 10 15 20 25
//4 8 12 16
//3 6 9
//2 4
//1
public static void triangleTLMultiplier(){
    int size = 6;
    for (int row=size; row >= 1; row--) {
        for (int column = 1; column <= row; column++) {
            System.out.print((row*column) + " ");
        }
        System.out.println();
    }
}
//triangle in the bottom right
// 1
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1
//6 5 4 3 2 1
public static void triangleBR(){
    int size = 6;
    for (int row=1; row <= size; row++) {
        for (int space = 1; space <= size - row; space++) {
            System.out.print(" ");
        }
        for (int num = row; num >= 1; num--) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
//upside down pyramid
//1 2 3 4 5 6 5 4 3 2 1
// 2 3 4 5 6 5 4 3 2
// 3 4 5 6 5 4 3
// 4 5 6 5 4
// 5 6 5
// 6
public static void upsideDownPyramid(){
    int size = 6;
    for (int row=1; row <= size; row++) {
        for (int space = 1; space < row; space++) {
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
