package by.epam.taskXML.application.util;

public enum Origin {
    Australia,
    Botswana,
    Brazil,
    Burma,
    Congo,
    China,
    Egypt,
    India,
    Russia,
    Sri_Lanka,
    Kenya,
    Tasmania,
    Thailand,
    Tunja,
    Madagascar,
    Muso,
    Myanmar,
    New_Granada,
    USA,
    Vietnam,
    Zambia,
    Zimbabwe;

    public static Origin getOrigin(int i) {
        return switch (i) {
            case 1 -> Australia;
            case 2 -> Botswana;
            case 3 -> Brazil;
            case 4 -> Burma;
            case 5 -> Congo;
            case 6 -> China;
            case 7 -> Egypt;
            case 8 -> India;
            case 9 -> Russia;
            case 10 -> Sri_Lanka;
            case 11 -> Kenya;
            case 12 -> Tasmania;
            case 13 -> Thailand;
            case 14 -> Tunja;
            case 15 -> Madagascar;
            case 16 -> Muso;
            case 17 -> Myanmar;
            case 18 -> New_Granada;
            case 19 -> USA;
            case 20 -> Vietnam;
            case 21 -> Zambia;
            case 22 -> Zimbabwe;
            default -> Zimbabwe;
        };
    }
}
