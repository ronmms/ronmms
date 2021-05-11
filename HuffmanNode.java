
public class HuffmanNode implements Comparable<HuffmanNode> {
    public int freq;
    public HuffmanNode left;
    public HuffmanNode right;
    public char value;
    public byte course;

    public HuffmanNode(char value, int freq) {
        this.freq = freq;
        this.value = value;
    }

    @Override
    public String toString() {
        return "node value: \'" + value + "\' freq: " + freq;
    }

    public int compareTo(HuffmanNode other) {
        return Integer.compare(this.freq, other.freq);
    }

}
