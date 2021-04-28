package com.gmail.ryitlearning;


import org.junit.*;

public class BankAccountTest {

    public static int count;
    private BankAccount account;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @Before
    public void setup() {
        account = new BankAccount("Rod", "Y", 1000.0, BankAccount.CHECKING);
        System.out.println("Running a test ...");
    }

    @Test
    public void deposit() {
        double balance = account.deposit(200, true);
        Assert.assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        Assert.assertEquals(400.00, balance, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
        account.withdraw(600.00, false);
        Assert.fail("should have thrown an IllegalArgumentException");
    }

    @Test
    public void getBalance_deposit() {
        account.deposit(200, true);
        Assert.assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        account.withdraw(200, true);
        Assert.assertEquals(800.00, account.getBalance(), 0);
    }

    @Test
    public void isChecking() {
        Assert.assertTrue("The account is NOT checking account", account.isChecking());
    }

    @After
    public void teardown() {
        System.out.println("Count = " + count++);
    }
}