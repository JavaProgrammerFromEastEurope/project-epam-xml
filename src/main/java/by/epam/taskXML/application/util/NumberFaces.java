package by.epam.taskXML.application.util;

public enum NumberFaces {

    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Eleven,
    Twelve,
    Thirteen,
    Fourteen,
    Fifteen;

    public static NumberFaces getNumberFaces(int i) {
        return switch (i) {
            case 4 -> Four;
            case 5 -> Five;
            case 6 -> Six;
            case 7 -> Seven;
            case 8 -> Eight;
            case 9 -> Nine;
            case 10 -> Ten;
            case 11 -> Eleven;
            case 12 -> Twelve;
            case 13 -> Thirteen;
            case 14 -> Fourteen;
            case 15 -> Fifteen;
            default -> Four;
        };
    }
}
