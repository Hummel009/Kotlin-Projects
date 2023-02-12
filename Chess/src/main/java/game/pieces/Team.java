package game.pieces;


public enum Team implements java.io.Serializable {
    WHITE {
        @Override
        public String toString() {
            return "White";
        }

    },
    BLACK {
        @Override
        public String toString() {
            return "Black";
        }
    }, NOCOLOR {
        @Override
        public String toString() {
            return "No Color";
        }
    };

}
