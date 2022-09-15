package by.epam.taskXML.application.util;

public enum Color {
    Brown,
    Black,
    Blood_Red,
    Blue,
    Cherry,
    Colorless,
    Crimson,
    Golden,
    Golden_Yellow,
    Gray,
    Green,
    Greenish_Blue,
    Lemon_Yellow,
    Maroon_Brown,
    Multi_Color,
    Olive,
    Pale,
    Pale_Blue,
    Pink,
    Purple,
    Purple_Pink,
    Purple_Red,
    Red,
    Tan,
    Transparent,
    Orange,
    White,
    Yellow,
    Yellowish_Green;

    public static Color getColor(int i) {
        return switch (i) {
            case 1 -> Black;
            case 2 -> Blood_Red;
            case 3 -> Blue;
            case 4 -> Cherry;
            case 5 -> Colorless;
            case 6 -> Crimson;
            case 7 -> Golden;
            case 8 -> Golden_Yellow;
            case 9 -> Gray;
            case 10 -> Green;
            case 11 -> Greenish_Blue;
            case 12 -> Lemon_Yellow;
            case 13 -> Maroon_Brown;
            case 14 -> Multi_Color;
            case 15 -> Olive;
            case 16 -> Pale;
            case 17 -> Pale_Blue;
            case 18 -> Pink;
            case 19 -> Purple;
            case 20 -> Purple_Pink;
            case 21 -> Purple_Red;
            case 22 -> Red;
            case 23 -> Orange;
            case 24 -> White;
            case 25 -> Yellow;
            case 26 -> Yellowish_Green;
            case 27 -> Transparent;
            default -> Brown;
        };
    }
}
