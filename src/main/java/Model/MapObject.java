package Model;

/**
 * Created by n_buga on 15.12.16.
 * This class provides the methods to work with all objects that is placed on the map or can be placed.
 * And useful class Position - for determining the exact place on the map.
 */
public abstract class MapObject{
    private Position position;
    private final int priority = 0;

    public void setPosition(Position position) {
        this.position = position;
    }
    public void setPosition(int i, int j) {
        this.position = new Position(i, j);
    }
    public Position getPosition() {
        return position;
    }

    public static class Position {
        private int i = 0;
        private int j = 0;

        public Position() {}
        public Position(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int geti() {
            return i;
        }

        public int getj() {
            return j;
        }

        public boolean equals(Position other) {
            return (i == other.geti() && j == other.getj());
        }

    }

    public char getSymbol() {
        return '*';
    }

    public int getPriority() {
        return priority;
    }
}
