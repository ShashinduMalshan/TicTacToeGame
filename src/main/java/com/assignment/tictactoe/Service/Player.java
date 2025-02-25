package com.assignment.tictactoe.Service;


public abstract class Player {
    protected BoardImpl board;;

    public Player(BoardImpl board) {
        this.board = board;

    }

    public abstract boolean move(int row, int col);

}
