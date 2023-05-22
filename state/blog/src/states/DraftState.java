package states;

import context.DocumentContext;

public class DraftState implements State {
    private DocumentContext document;    

    public DraftState(DocumentContext document) {
        this.document = document;
        document.setPublishing(false);
    }

    @Override
    public String draft() {
        if(document.isPublishing()) {
            document.changeState(new DraftState(document));
            return ("Rascunho...");
        }
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
