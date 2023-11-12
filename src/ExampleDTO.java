public class ExampleDTO {
    private int idx;
    private String name;
    private String data;
    private String type;
    private char isUse;

    public ExampleDTO(int idx, String name, String data, String type, char isUse) {
        this.idx = idx;
        this.name = name;
        this.data = data;
        this.type = type;
        this.isUse = isUse;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getIsUse() {
        return isUse;
    }

    public void setIsUse(char isUse) {
        this.isUse = isUse;
    }
}
