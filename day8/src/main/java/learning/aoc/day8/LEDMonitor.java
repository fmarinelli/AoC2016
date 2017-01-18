package learning.aoc.day8;

import java.util.Arrays;

public class LEDMonitor {

    private final byte[] monitor;
    private final int rows;
    private final int cols;

    public LEDMonitor() {
        this(50, 6);
    }

    public LEDMonitor(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.monitor = new byte[cols * rows];
    }

    public void rect(int cols, int rows) {
        cols = Math.min(this.cols, Math.max(0, cols));
        rows = Math.min(this.rows, Math.max(0, rows));

        for (; (rows > 0) && (cols > 0); ) {
            rows -= 1;
            Arrays.fill(monitor, rows * this.cols, rows * this.cols + cols, (byte) 1);
        }
    }

    public void rotateByRow(int row, int value) {
        if ((row >= 0 && row < rows) && (value > 0 && value < cols)) {
            int offset = cols * row;
            byte[] buffer = Arrays.copyOfRange(monitor, offset, offset + cols);
            for (int col = 0; col < cols; col++) {
                monitor[offset + ((col + value) % cols)] = buffer[col];
            }
        }
    }

    public void rotateByColumn(int column, int value) {
        if ((column >= 0 && column < cols) && (value > 0 && value < rows)) {
            byte[] buffer = Arrays.copyOf(monitor, monitor.length);
            for (int row = 0; row < rows; row++) {
                monitor[column + (((row + value) % rows) * cols)] = buffer[column + (row * cols)];
            }
        }
    }

    public int getPixelsLit() {
        int total = 0;
        for (int i = 0; i < rows * cols; i++) {
            total += (monitor[i] != 0 ? 1 : 0);
        }
        return total;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<rows*cols; i++) {
            if(i!=0 && (i%cols ==0)) {
                sb.append("\n");
            }
            sb.append(monitor[i]!=0?'#':'.');
        }
        return sb.toString();
    }
}
