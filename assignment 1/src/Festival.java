    abstract class Festival{
        abstract String getMessage();
    }
    class PONGAL extends Festival {
        String sweets = "Enjoy the sweet Pongal!";

        String getMessage() {
            return sweets;
        }
    }
    class DIWALI extends Festival {
        String crackers = "Light up the night with crackers!";
        String getMessage() {
            return crackers;
        }

    }

