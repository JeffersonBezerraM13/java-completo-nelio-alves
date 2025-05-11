package intermediarioOO.seção12Exercicio2;

public class Comment {
    private String text;

    public Comment(){
        this.text = null;
    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
