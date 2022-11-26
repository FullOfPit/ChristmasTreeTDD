public class ChristmasTree {

    public static String treeBuilder(int height) {
        if (height < 1) {
            return "I";
        }
        String treeString = "";
        for (int i = 1; i <= height; i++) {
            treeString += (" ".repeat(height-i));
            treeString += ("X".repeat(i*2-1));
            treeString += (" ".repeat(height-i));
            treeString += ("\n");
        }
        treeString += (" ".repeat(height-1));
        treeString += ("I");
        treeString += (" ".repeat(height-1));
        /*

        if (height == 4) {
            return "   X   \n  XXX  \n XXXXX \nXXXXXXX\n   I   ";
            //      height-1 spaces + 1 X + height-1 spaces +\n
            //      height-2 spaces + 3 X + height-2 spaces +\n
            //      height-3 spaces + 5 X + height-3 spaces +\n
            //      height-4 spaces + 7 X + height-4 spaces +\n
            //                      + I
        }
        if(height == 3) {
            return "  X  \n XXX \nXXXXX\n  I  ";
        }

        if (height == 2) {
            return " X \nXXX\n I ";
        }
        if (height == 1) {
            return "X\nI";
        }
        return "I";

         */
        return treeString;
    }

    public static void main(String[] args) {

        System.out.println(treeBuilder(4));

    }
}
