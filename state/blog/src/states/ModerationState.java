package states;

import context.DocumentContext;

public class ModerationState implements State {
    private DocumentContext document;  

    public ModerationState(DocumentContext document) {
        this.document = document;
    }

    @Override
    public String draft() {
        document.changeState(new DraftState(document));
        return ("Rascunho...");
    }

    @Override
    public String moderation() {
        document.changeState(new ModerationState(document));
        return ("Protegido...");
    }

    @Override
    public String published() {
        document.changeState(new PublishedState(document));
        return ("Publicado...");
    }
    
}
