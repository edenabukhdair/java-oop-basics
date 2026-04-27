public class Counter {
    public int count;

    public int increase() {
      count++;
      return count;
    }
    public int decrease() {
        count--;
        return count;
    }
    public String toString() {
        return " count=" + count + " increase=" + increase () + " decrease=" + decrease();
    }


}
