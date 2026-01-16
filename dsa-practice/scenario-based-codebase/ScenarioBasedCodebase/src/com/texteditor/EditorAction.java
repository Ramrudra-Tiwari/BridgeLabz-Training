package com.texteditor;

public class EditorAction {

    String type;   // insert or delete
    String text;   // text involved

    public EditorAction(String type, String text) {
        this.type = type;
        this.text = text;
    }
}
