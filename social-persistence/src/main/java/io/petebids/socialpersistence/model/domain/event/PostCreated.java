package io.petebids.socialpersistence.model.domain.event;

public class PostCreated {

    String id;

    String content;

    public PostCreated(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public PostCreated() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
