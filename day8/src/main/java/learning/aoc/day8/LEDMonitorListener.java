package learning.aoc.day8;

import learning.aoc.antlr4.AoCBaseListener;
import learning.aoc.antlr4.AoCParser;

public class LEDMonitorListener extends AoCBaseListener {
    private final LEDMonitor ledMonitor;

    public LEDMonitorListener(LEDMonitor ledMonitor) {
        this.ledMonitor = ledMonitor;
    }

    @Override
    public void exitRect(AoCParser.RectContext ctx) {
        int cols = Integer.valueOf(ctx.x.getText());
        int rows = Integer.valueOf(ctx.y.getText());
        ledMonitor.rect(cols, rows);
    }

    @Override
    public void exitRotateCol(AoCParser.RotateColContext ctx) {
        int column = Integer.valueOf(ctx.column.getText());
        int value = Integer.valueOf(ctx.value.getText());
        ledMonitor.rotateByColumn(column, value);
    }

    @Override
    public void exitRotateRow(AoCParser.RotateRowContext ctx) {
        int row = Integer.valueOf(ctx.row.getText());
        int value = Integer.valueOf(ctx.value.getText());
        ledMonitor.rotateByRow(row, value);
    }
}
