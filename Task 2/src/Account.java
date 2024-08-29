public class Account {
    private String id ,name;
    private int balance =0;



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String toString(){
        return "Account[id="+id+",name="+name+",balance="+balance+"]";
    }

    public int credit(int amount){
        balance +=amount;
        return balance;
    }

    public int debit(int amount){
        if(amount<=balance)
            balance -=amount;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }

    public int transferTo(Account another , int amount){
        if(amount<=balance)
            another.balance +=amount;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }


}
