class BankAccount{
    private String accountNumber;
    private double balance;


    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public double deposit(double amount){
        if(amount<0){
            System.out.println("Invalid input from the user!");
        }
        balance+=amount;
        return balance;
    
    }

    public double withdraw(double amount){
        if(amount>balance){
            System.out.println("Withdrawl amount exceeds the balance amount!");
        }

        balance-=amount;
        return balance;
        
    }

    //Getters for accountNumber
    public String getNum(){
        return accountNumber;
    }

    //Setters for accountNUmber
    public void setNum(String accountNumber){
        this.accountNumber=accountNumber;
    }

    //Getters for balance
    public double getBalance(){
        return balance;
    }

    //Setters for balance
    public void setBalance(double balance){
        this.balance=balance;
    }
}

    class SavingAccount extends BankAccount {
        private double interestRate;


        SavingAccount(String accountNumber,double balance,double interestRate){
            super(accountNumber,balance);
            this.interestRate=interestRate;
        }
        //Getter for interestRate

        public double getInterestRate(){
            return interestRate;
        }

        //Setters for interestRate

        public void setInterestRate(double interestRate){
            this.interestRate=interestRate;
        }


        @Override
        public double withdraw(double amount){
            if(getBalance()<1000){
                System.out.println("Unable to withdraw! Balance is less then 1000");
                return getBalance();
            }
            else {
                return super.withdraw(amount);
            }
        
        }
    }
    

class BankSystem{
    public static void main(String[] args){
        SavingAccount acc=new SavingAccount("2129-329-39203", 4000000, 0.05);
        System.out.println(" Old Balance: "+acc.getBalance());
        acc.deposit(400);
        acc.withdraw(10000);
        System.out.println("New Balance: "+acc.getBalance());


    }
}