import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasTreeTest {

    @Test
    void treeBuilder_height0_onlyStump() {
        int height = 0;
        String actual = ChristmasTree.treeBuilder(height);
        Assertions.assertEquals("I", actual);
    }
    @Test
    void treeBuilder_height1_StumpAndFirstLevel() {
        int height = 1;
        String actual = ChristmasTree.treeBuilder(height);
        Assertions.assertEquals("X\nI", actual);
    }
    @Test
    void treeBuilder_height2_StumpAndTwoLevels() {
        int height = 2;
        String actual = ChristmasTree.treeBuilder(height);
        Assertions.assertEquals(" X \nXXX\n I ", actual);
    }
     @Test
    void treeBuilder_height3_StumpAndThreeLevels() {
        int height = 3;
        String actual = ChristmasTree.treeBuilder(height);
        Assertions.assertEquals("  X  \n XXX \nXXXXX\n  I  ", actual);
     }

     @Test
    void treeBuilder_height4_StumpAndThreeLevels() {
        int height = 4;
        String actual = ChristmasTree.treeBuilder(height);
        Assertions.assertEquals("   X   \n  XXX  \n XXXXX \nXXXXXXX\n   I   ", actual);
     }
}