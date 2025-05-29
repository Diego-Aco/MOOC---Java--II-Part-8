public class Container {
    
    private int amount;

    public Container() {
       this.amount=0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount<0) {
            return;
        }
        this.amount+=amount;
        if (this.amount>100) {  //amount can't go over 100
            this.amount=100;
        }
    }

    public void remove(int amount) {
        if (amount<0) {
            return;
        }
        this.amount-=amount;
        if (this.amount<0) {   //amount can't be less than 100
            this.amount=0;
        }
    }

    public String toString() {
        return String.valueOf(this.contains()) + "/100";
    }
}
