package Model;

public class Element {
    public int size;
    private int[] a;

    public Element() {
    }

    public Element(int size, int[] a) {
        this.size = size;
        this.a = a;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

}
