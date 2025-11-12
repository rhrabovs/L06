package Array;

public enum Size {
    S("S"),
    M("M"),
    L("L"),
    XL("XL");

    private final String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}
