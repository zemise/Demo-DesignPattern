package io.github.zemise.patterns.structural.flywight;

public class Game {
    public static void main(String[] args) {
        Chesspiece p1 = ChesspieceFactory.getChesspiece("黑");
        p1.put(1, 1);

        Chesspiece p2 = ChesspieceFactory.getChesspiece("白");
        p2.put(2, 2);

        Chesspiece p3 = ChesspieceFactory.getChesspiece("黑");
        p1.put(3, 3);

        Chesspiece p4 = ChesspieceFactory.getChesspiece("白");
        p2.put(4, 4);
    }
}
