package bridge.concrete_implementations;

import bridge.Renderer;

public class AsciiRenderer implements Renderer {
    public void renderText(String text) {
        System.out.println("== " + text + " ==");
    }
    
    public void renderBar(String label, int value, int max) {
        int length = 20;
        int filled = 0;
        if (max > 0) {
            filled = value * length / max;
        }
        String bar = "#".repeat(filled) + "-".repeat(length - filled);
        System.out.println(label + " [" + bar + "] " + value + "/" + max);
    }
}