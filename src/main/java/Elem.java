public class Elem implements Comparable<Elem> {
    private int key;
    private Object data;

    public Elem(int key, Object data) {
        this.key = key;
        this.data = data;
    }

    public int getKey() {
        return key;
    }

    public Object getData() {
        return data;
    }

    public String toString() {
        return "("+ key + "," + data + ")";
    }

    @Override
    public int compareTo(Elem o) {
        return this.key - o.getKey();
    }
}
