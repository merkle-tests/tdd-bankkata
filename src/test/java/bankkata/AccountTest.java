package bankkata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private final String final_result =
            "Date        Amount  Balance\n" +
                    "24.12.2015   +500      500\n" +
                    "23.8.2016    -100      400";

    @Test
    public void printStatement_d500_w100_r400() {
        SystemTimer systemTimerMock = new SystemTimerSpy();
        Account account = new Account(systemTimerMock);

        account.deposit(500);
        account.withdraw(100);

        assertEquals(final_result, account.printStatement());
    }

}