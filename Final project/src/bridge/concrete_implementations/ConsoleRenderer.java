package bridge.concrete_implementations;

import bridge.Renderer;

public class ConsoleRenderer implements Renderer {
    public void renderText(String text) {
        System.out.println(text);
    }
    public void renderBar(String label, int value, int max) {
        System.out.println(label + ": " + value + "/" + max);
    }
}