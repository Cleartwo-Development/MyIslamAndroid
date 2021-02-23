package com.cleartwo.admin.myislam.utilities;

import com.cleartwo.admin.myislam.R;

public class ConstMenu {
    public static int selectedMenu = 0;
    public static String[] web = {
            "Basic Beliefs",
            "Shahadah",
            "Salah",
            "Sawm",
            "Zakat",

            "Hajj",
            "The Last Prophet (PBUH)",
            "Companions of the Prophet",
            "Stories of the Prophets",
            "Wudu"
    };

    public static int[] imageId = {
            R.drawable.basic_beliefs,
            R.drawable.shahadah,
            R.drawable.salah,
            R.drawable.sawm,
            R.drawable.zakat,

            R.drawable.hajj,
            R.drawable.the_last_prophet,
            R.drawable.companions_of_the_prophet,
            R.drawable.stories_of_the_prophets,
            R.drawable.wudu
    };

    public static String pillrsArr[] = {"1. What is the first pillar of Islam?",
            "2. What percentage of a Muslim’s savings should be given as Zakat?",
            "3. In which Islamic month do Muslims fast?"};
    public static String pillrsOpt[][] = {
            {"Shahadah",
                    "Hajj",
                    "Sawm",
                    "Zakat"},
            {"2%",
                    "3.5%",
                    "2.5%",
                    "4%"},
            {"Muharram",
                    "Rajab",
                    "Ramadhan",
                    "Shaban"},};
    public static int pillrsAns[] = {1,
            3,
            3};
    public static int pillrsUserAns[] = {0,
            0,
            0};

    public static String messArr[] = {"1. Who was the first prophet?",
            "2. What was the name of Prophet Adam’s (AS) wife?",
            "3. How many prophets are mentioned in the Quran?"};
    public static String messOpt[][] = {
            {"Nuh",
                    "Isa",
                    "Ibrahim",
                    "Adam"},
            {"Hawwa",
                    "Zaynab",
                    "Maryam",
                    "Aysha"},
            {"20",
                    "25",
                    "27",
                    "30"},};
    public static int messAns[] = {4,
            1,
            2};
    public static int messUserAns[] = {0,
            0,
            0};

    public static String quranArr[] = {"1. How many chapters are there in the Quran?",
            "2. How old was the Prophet (PBUH) when the Quran was first revealed to him?",
            "3. Who revealed Allah’s words to the Prophet (PBUH)?"};
    public static String quranOpt[][] = {
            {"110",
                    "100",
                    "99",
                    "114"},
            {"39",
                    "41",
                    "40",
                    "42"},
            {"Jibra’il",
                    "Mika’il",
                    "Israfil",
                    "Izra’il"},};
    public static int quranAns[] = {4,
            3,
            1};
    public static int quranUserAns[] = {0,
            0,
            0};

    public static String pbuhArr[] = {"1. In which year was the Prophet (PBUH) born?",
            "2. Where was he born?",
            "3. Which cave did Muhammad (PBUH) spend a lot of his time?"};
    public static String pbuhOpt[][] = {
            {"600 AD",
                    "570 AD",
                    "620 AD",
                    "580 AD"},
            {"Makkah",
                    "Medina",
                    "Jerusalem",
                    "Bethlehem"},
            {"Mira",
                    "Thawr",
                    "Hira",
                    "Al-Gara"},};
    public static int pbuhAns[] = {2,
            1,
            3};
    public static int pbuhUserAns[] = {0,
            0,
            0};
}
