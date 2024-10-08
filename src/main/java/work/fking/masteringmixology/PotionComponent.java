package work.fking.masteringmixology;

public enum PotionComponent {
    MOX('M', "03a9f4"),
    AGA('A', "00e676"),
    LYE('L', "e91e63");

    private final char character;
    private final String color;

    PotionComponent(char character, String color) {
        this.character = character;
        this.color = color;
    }

    public char character() {
        return character;
    }

    public String color() {
        return color;
    }
}

