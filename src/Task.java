import java.util.Objects;

public class Task {
    private int numer;
    private  String title;
    private String description;

    @Override
    public String toString() {
        return String.format("%02d.%s[%s]",  numer, title, description);
    }

    public Task(int numer, String title, String description) {
        this.numer = numer;
        this.title = title;
        this.description = description;
    }

    public int getNumer() {
        return numer;
    }

}
