package com.texteditor;

import java.util.Stack;

public class TextEditor {

    private String content;
    private Stack<EditorAction> undoStack;
    private Stack<EditorAction> redoStack;

    public TextEditor() {
        content = "";
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // insert text
    public void insertText(String text) {
        content += text;
        undoStack.push(new EditorAction("insert", text));
        redoStack.clear();
    }

    // delete text from end
    public void deleteText(int length) {

        if (length > content.length()) {
            length = content.length();
        }

        String deleted = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);

        undoStack.push(new EditorAction("delete", deleted));
        redoStack.clear();
    }

    // undo last action
    public void undo() {

        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        EditorAction action = undoStack.pop();

        if (action.type.equals("insert")) {
            content = content.substring(0, content.length() - action.text.length());
        } else if (action.type.equals("delete")) {
            content += action.text;
        }

        redoStack.push(action);
    }

    // redo last undone action
    public void redo() {

        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        EditorAction action = redoStack.pop();

        if (action.type.equals("insert")) {
            content += action.text;
        } else if (action.type.equals("delete")) {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
    }

    // display current content
    public void showContent() {
        System.out.println("Current Text: " + content);
    }
}
