package behavioral.memento.chess;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static behavioral.memento.chess.Board.PAWN;
import static behavioral.memento.chess.Board.ROOK;

public class BoardTest {
    private Board board;
    private String standardLayout;

    @BeforeEach
    void setUp() {
        standardLayout = """
            WR,WN,WB,WK,WQ,WB,WN,WR,\
            WP,WP,WP,WP,WP,WP,WP,WP,\
            --,--,--,--,--,--,--,--,\
            --,--,--,--,--,--,--,--,\
            BP,BP,BP,BP,BP,BP,BP,BP,\
            BR,BN,BB,BK,BQ,BB,BN,BR
            """;
        board = new Board();
    }

    @Test
    void canAddPiece() {
        board.setPiece(0, 0, ROOK);
        assertPieceAt(ROOK, 0, 0);
    }

    private void assertPieceAt(int expectedPiece, int file, int rank) {
        Assertions.assertEquals(expectedPiece, board.getPiece(file, rank));
    }

    @Test
    void simpleMomentoTest() {
        Board b2 = new Board();
        board.setPiece(5, 5, -PAWN);
        b2.setMomento(board.getBoardMomento());
        Assertions.assertEquals(-PAWN, b2.getPiece(5, 5));
    }
}
