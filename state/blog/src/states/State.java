package states;

public interface State {
    String draft();
    String moderation();
    String published();
}
