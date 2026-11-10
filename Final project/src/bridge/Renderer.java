package bridge;

public interface Renderer {
    void renderText(String text);
    void renderBar(String label, int value, int max);
}
