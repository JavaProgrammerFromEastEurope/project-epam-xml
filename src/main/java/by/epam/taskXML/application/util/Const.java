package by.epam.taskXML.application.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Const's elements used by App
 */
public final class Const {
    public static final String ID_TO_UPDATE = "Input Gem id to update:";
    public static final String ID_TO_REMOVE = "Input Gem id to remove:";
    public static final String SUCCESS_ADDING = "Adding Stone was successful!";
    public static final String SUCCESS_UPDATE = "Updating Stone was successful!";
    public static final String SUCCESS_REMOVE = "Removing Stone was successful!";
    public static final String INPUT_PRICE = "Input price of stone:";
    public static final String INPUT_NUMBER = "Input quantity of stone:";
    public static final String INPUT_VALUE = "Input weight of stone:";
    public static final String INPUT_TRANS = "Input gem transparency: (0-100)";
    public static final String ERROR_ADDING = "Error while adding gem! %s%n";
    public static final String ERROR_UPDATE = "Error while updating gem! %s%n";
    public static final String ERROR_REMOVE = "Error while removing gem! %s%n";
    public static final String MESSAGE_FORMAT = "%s%n%n:";
    public static final String GEM_PRICE_NOT_FOUND = " %s %d, not found!%n%n";
    public static final String EMPTY_GEM_LIST = " List of gems is empty!";
    public static final String PRICE_GEM = "The gem with price = ";
    public static final String HIGHEST_PRICE
            = " The gem with highest price:%n %s %n%n";
    public static final String SUCCESS_EXPORT
            = "Exporting gems to xml file was successful!";
    public static final String GEMS_CHOOSER
            = """
            Choose the type of gems: ->
             1 - Precious
             2 - SemiPrecious
            """;
    public static final String PRECIOUS_CHOOSER
            = """
            Choose the precious gem: ->
             1 - Alexandrite
             2 - Diamond
             3 - Emerald
             4 - Ruby
             5 - Sapphire
            """;
    public static final String SEMI_PRECIOUS_CHOOSER
            = """
            Choose the semiprecious gem: ->
             1 - Agate
             2 - Amethyst
             3 - Aquamarine
             4 - Aventurine
             5 - Chrysolite
             6 - Citrine
             7 - Pomegranate
             8 - Quartz
             9 - Rhinestone
             10 - Topaz
            """;
    public static final String NUMBER_FACES_CHOOSER
            = """
            Choose the Number Of Faces: ->
             4 - Four
             5 - Five
             6 - Six
             7 - Seven
             8 - Eight
             9 - Nine
             10 - Ten
             11 - Eleven
             12 - Twelve
             13 - Thirteen
             14 - Fourteen
             15 - Fifteen
            """;
    public static final String ORIGIN_CHOOSER
            = """
            Choose the Origin: ->
             1 - Australia
             2 - Botswana
             3 - Brazil
             4 - Burma
             5 - Congo
             6 - China
             7 - Egypt
             8 - India
             9 - Russia
             10 - Sri_Lanka
             11 - Kenya
             12 - Tasmania
             13 - Thailand
             14 - Tunja
             15 - Madagascar
             16 - Muso
             17 - Myanmar
             18 - New_Granada
             19 - USA
             20 - Vietnam
             21 - Zambia
             22 - Zimbabwe
            """;
    public static final String COLOR_CHOOSER
            = """
            Choose the Color: ->
             1 - Black
             2 - Blood_Red
             3 - Blue
             4 - Cherry
             5 - Colorless
             6 - Crimson
             7 - Golden
             8 - Golden_Yellow
             9 - Gray
             10 - Green
             11 - Greenish_Blue
             12 - Lemon_Yellow
             13 - Maroon_Brown
             14 - Multi_Color
             15 - Olive
             16 - Pale
             17 - Pale_Blue
             18 - Pink
             19 - Purple
             20 - Purple_Pink
             21 - Purple_Red
             22 - Red
             23 - Orange
             24 - White
             25 - Yellow
             26 - Yellowish_Green
             27 - Transparent
             28 - Brown
            """;
    public static Logger logger = LogManager.getLogger("REPORT");

}
