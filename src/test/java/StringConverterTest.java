import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConverterTest {

    StringConverter stringConverter;

    @BeforeEach
    void setUp(){
        stringConverter = new StringConverter();
    }

    @Test
    void shouldReturnLong_Account_Name() {

        //given
        String input = "getLongAccountName";
        String expected = "Long_Account_Name";
        //when
        String actual = stringConverter.convertStr(input);
        //then
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnTrade_ID() {

        //given
        String input = "getTradeID";
        String expected = "Trade_ID";
        //when
        String actual = stringConverter.convertStr(input);
        //then
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnSWIFT_Code() {

        //given
        String input = "getSWIFTCode";
        String expected = "SWIFT_Code";
        //when
        String actual = stringConverter.convertStr(input);
        //then
        assertEquals(expected,actual);
    }
}
