package br.edu.unidavi.codereview.herancaPolimorfismo;

import java.util.Scanner;

public abstract class Game<T, R> {

    private boolean won = false;

    abstract public void start();

    abstract public void printMessageAttempt();

    abstract public T input(Scanner scanner);

    abstract public R play(T param);

    abstract public boolean canPlay();

    public void read() {
        Scanner scanner = new Scanner(System.in);

        do {
            printMessageAttempt();
            T attempt = input(scanner);
            pritMessages(play(attempt).toString());
        } while (canPlay());

        scanner.close();
        pritMessages("You ".concat(isWon() ? " win" : " lose"));
    }

    protected void pritMessages(String Msg) {
        System.out.println(Msg);
    }

    public void setWon(boolean gotcha) {
        this.won = gotcha;
    }

    public boolean isWon() {
        return this.won;
    }
}