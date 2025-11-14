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
            System.out.print("$");
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
    for (int row=5; row > 0; row--) {
        for (int column = row; column > 0; column--) {
            System.out.print(row + 6);
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
    for (int row=5; row > 0; row--) {
        for (int column = row; column > 0; column--) {
            System.out.print(row);
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
    for (int row=5; row > 0; row--) {
        for (int column = row; column > 0; column--) {
            System.out.print(row + " ");
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
