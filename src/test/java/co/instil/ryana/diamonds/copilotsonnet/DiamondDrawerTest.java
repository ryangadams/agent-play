package co.instil.ryana.diamonds.copilotsonnet;

/* Generated by Copilot - Sonnet 3.7
 * Using the instructions from .github/copilot-instructions.md
 * and resources/diamond-prompt.md
 * I've manually moved it into the copilotsonnet package
 */


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiamondDrawerTest {
    private DiamondDrawer diamondDrawer;
    
    @BeforeEach
    void setUp() {
        diamondDrawer = new DiamondDrawer();
    }
    
    @Test
    void shouldDrawDiamondOfHeightThree() {
        String expected = " #\n###\n #";
        String actual = diamondDrawer.drawDiamond(3);
        assertEquals(expected, actual);
    }
    
    @Test
    void shouldDrawDiamondOfHeightFive() {
        String expected = "  #\n ###\n#####\n ###\n  #";
        String actual = diamondDrawer.drawDiamond(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void shouldDrawDiamondOfHeightOne() {
        String expected = "#";
        String actual = diamondDrawer.drawDiamond(1);
        assertEquals(expected, actual);
    }
}
