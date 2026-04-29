public class counter {
    private int count;
    public void setCount(int count) {
        this.count = count;
    }

    public int getIncrease() {
        count++;
        return count;
    }
    public int getDecrease() {
        count--;
        return count;
    }
    public String toString() {
        return " count=" + count + " increase=" + getIncrease()+ " decrease=" + getDecrease();
    }

}
