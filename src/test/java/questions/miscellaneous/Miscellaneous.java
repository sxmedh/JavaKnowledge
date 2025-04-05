package questions.miscellaneous;

import org.junit.jupiter.api.Test;

public class Miscellaneous {

    @Test
    void power() {
        var xPowerN = new XPowerN();
        assert xPowerN.myPow(2.00000,10) == 1024.00000;
    }
}
