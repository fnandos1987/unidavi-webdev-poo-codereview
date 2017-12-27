package br.edu.unidavi.codereview.herancaPolimorfismo;

import java.util.Scanner;

public class HangManV3 extends Game<String, String> {

    private String pass;
    private char[] placeholder;
    private int limit;
    private int wrongs = 0;

    public HangManV3(String word) {
        this.pass = word;
    }

    public static void main(String[] args) {
        HangManV3 hangman = new HangManV3("Ghost");
        hangman.start();
    }

    private void createPlaceHolder() {
        this.placeholder = new char[this.pass.length()];
        for (int i = 0; i < this.pass.length(); i++) {
            this.placeholder[i] = '*';
        }

        this.limit = this.pass.length();
    }

    @Override
    public void start() {
        createPlaceHolder();
        super.read();
    }

    @Override
    public String play(String param) {
        String placeholderAsString = "";
        boolean hit = false;
        for (int i = 0; i < this.pass.length(); i++) {
            if (this.pass.charAt(i) == param.charAt(0)) {
                this.placeholder[i] = param.charAt(0);
                hit = true;
            }
            setWon(isWon() & this.pass.charAt(i) == this.placeholder[i]);
            placeholderAsString += this.placeholder[i];
        }
        if (!hit) {
            this.wrongs++;
        }
        return placeholderAsString;
    }

    @Override
    public void printMessageAttempt() {
        System.out.printf("Your attempt: %d/%d", this.wrongs, this.limit);
    }

    @Override
    public String input(Scanner scanner) {
        return scanner.nextLine();
    }

    @Override
    public boolean canPlay() {
        return this.wrongs <= this.limit && !isWon();
    }
}
