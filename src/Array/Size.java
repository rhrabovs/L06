package Array;

public enum Size {
    S(""),
    M(""),
    L(""),
    XL("");

    private final String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}
