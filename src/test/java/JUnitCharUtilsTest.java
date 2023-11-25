import org.apache.commons.lang3.CharUtils;
import org.junit.Test;
import static org.junit.Assert.*;


public class JUnitCharUtilsTest {
    @Test
    public void testToChar(){
        assertEquals('1',CharUtils.toChar("1"));
    }
    @Test
    public void testToIntValue(){
        assertEquals(9, CharUtils.toIntValue('9'));
    }
    @Test
    public void testisAscii(){
        assertEquals(1,CharUtils.isAscii('a'));
    }
}
