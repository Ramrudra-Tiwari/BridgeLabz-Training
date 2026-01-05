package com.linkedlist.doublylinkedlist.undoeditor;

// Main class to test undo-redo functionality
public class TextEditorMain {

    public static void main(String[] args) {

        UndoRedoManager editor = new UndoRedoManager();

        editor.addState("Hello");
        editor.displayCurrentState();

        editor.addState("Hello World");
        editor.displayCurrentState();

        editor.addState("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello Java");
        editor.displayCurrentState();

        editor.redo(); // should not work
    }
}
