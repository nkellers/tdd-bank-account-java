package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account = new Account();
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    public void depositAccountToIncreaseBalance(){
        Account account = new Account();

        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(10);
        account.deposit(20);
        assertThat(account.getBalance()).isEqualTo(30);
    }

    @Test
    public void withdrawFromAccountToDecreaseBalance(){
        Account account = new Account();

        account.withdraw(10);
        assertThat(account.getBalance()).isEqualTo(-10);
        account.deposit(50);
        account.withdraw(5);

        assertThat(account.getBalance()).isEqualTo(35);

    }
}
