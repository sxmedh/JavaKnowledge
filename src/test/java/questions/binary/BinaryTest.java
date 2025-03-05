package questions.binary;

import org.junit.jupiter.api.Test;

public class BinaryTest {

    @Test
    void reverseBits() {
        ReverseBits reverseBits = new ReverseBits();
        int answer = reverseBits.reverseBits(0b00000010100101000001111010011100);
        assert (answer ==  964176192);
    }
}
