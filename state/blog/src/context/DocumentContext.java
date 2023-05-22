package context;

import states.DraftState;
import states.State;

public class DocumentContext {
    private State state;
    private boolean publishing = false;

    public DocumentContext() {
        this.state = new DraftState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public boolean isPublishing() {
        return publishing;
    }

    public void setPublishing(boolean publishing) {
        this.publishing = publishing;
    } 
}