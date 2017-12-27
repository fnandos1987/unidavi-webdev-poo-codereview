package br.edu.unidavi.codereview.encapsulamento;

import java.util.Scanner;

public class Hangman {

    private String pass;
    private char[] placeholder;
    private boolean canPlay = true;
    private boolean gotcha = false;
    private int limit;
    private int wrongs = 0;

    public Hangman(String word) {
        this.pass = word;
        createPlaceHolder();
    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman("Ghost");
        hangman.read();
    }

    private void createPlaceHolder() {
        this.placeholder = new char[this.pass.length()];
        for (int i = 0; i < this.pass.length(); i++) {
            this.placeholder[i] = '*';
        }

        this.limit = this.pass.length();
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);

        do {
            printMessageAttempt();
            String attempt = scanner.nextLine();
            pritMessages(play(attempt.charAt(0)));
        } while (this.canPlay);

        scanner.close();
        pritMessages("You ".concat(this.gotcha ? " win" : " lose"));
    }

    public String play(char letter) {
        String placeholderAsString = "";
        boolean hit = false;
        for (int i = 0; i < this.pass.length(); i++) {
            if (this.pass.charAt(i) == letter) {
                this.placeholder[i] = letter;
                hit = true;
            }
            this.gotcha = this.gotcha & (this.pass.charAt(i) == this.placeholder[i]);
            placeholderAsString += this.placeholder[i];
        }
        if (!hit) {
            this.wrongs++;
        }
        this.canPlay = this.wrongs <= this.limit && !this.gotcha;
        return placeholderAsString;
    }

    private void printMessageAttempt() {
        System.out.printf("Your attempt: %d/%d", this.wrongs, this.limit);
    }

    private void pritMessages(String Msg) {
        System.out.println(Msg);
    }

    public int getWrongs() {
        return this.wrongs;
    }
}
