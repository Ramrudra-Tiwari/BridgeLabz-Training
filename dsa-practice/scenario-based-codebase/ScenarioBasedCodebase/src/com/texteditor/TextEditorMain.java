package com.texteditor;

import java.util.Scanner;

public class TextEditorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        int choice;

        do {
            System.out.println("\n=== Simple Text Editor ===");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Show Text");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter text to insert: ");
                    editor.insertText(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    editor.deleteText(sc.nextInt());
                    sc.nextLine();
                    break;

                case 3:
                    editor.undo();
                    break;

                case 4:
                    editor.redo();
                    break;

                case 5:
                    editor.showContent();
                    break;

                case 6:
                    System.out.println("Editor closed.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 6);

        sc.close();
    }
}
