class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

class SBAccount {
    public double balance;

    public SBAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws MinimumBalanceException {
        if (balance - amount < 500) {
            throw new MinimumBalanceException("Withdrawal denied: Minimum balance of ₹500 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

 class BankApp {
    public static void main(String[] args) {
        SBAccount account = new SBAccount(1000);

        try {
            account.withdraw(100);
            account.withdraw(200); // This will trigger the exception
        } catch (MinimumBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Final balance: ₹" + account.getBalance());
    }
}
