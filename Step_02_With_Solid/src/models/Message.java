package models;

public abstract class Message {

    String content;
    String source;
    String target;

    public abstract boolean isValid();

    public String getContent() {
        return content;
    }

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
