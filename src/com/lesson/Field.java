package com.lesson;

public class Field {
    public static final int FIELD_SIZE = 3;

    public static final char DEFAULT_CELL_VALUE = 'p';

    private static char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    public void eraseField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            eraseLine(i);
        }
    }
    private void eraseLine(int lineNumber) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }
    public void showField () {
        for (int i = 0; i < FIELD_SIZE; i++) {
            showLine(i);
            System.out.println();
        }
    }
    private void showLine (int lineNumber) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print("[" + field[i][lineNumber] + "]");
        }
    }
    }