package com.cleartwo.admin.myislam.utilities;

import android.text.Html;
import android.text.Spanned;

import com.cleartwo.admin.myislam.modelClasses.QuestionsModel;

import java.util.ArrayList;
import java.util.List;

public class QuesAnsConst {
    //Activities
    public static String bar_title = "";
    public static List<QuestionsModel> modelList = new ArrayList<>();

    public static void initQueAnsAngels() {
        bar_title = "ANGELS";
        modelList = new ArrayList<>();
        modelList.add(new QuestionsModel("1. What are the angels made from?",
                "a. Light", "b. Clay", "c. Stone ", "d. Sand", "1"));
        modelList.add(new QuestionsModel("2. Which angel revealed the Quran to Muhammad (PBUH)?",
                "a. Jibra’il", "b. Israfil", "c. Mika’il ", "d. Izra’il", "1"));
        modelList.add(new QuestionsModel("3. Mika’il is the angel of...?",
                "a. Mercy", "b. Death", "c. Revelation", "d. Light", "1"));
    }

    public static void initQueAnsFIVEPILLARS() {
        bar_title = "FIVE PILLARS";
        modelList = new ArrayList<>();
        modelList.add(new QuestionsModel("1. What is the first pillar of Islam?",
                "a. Shahadah", "b. Hajj", "c. Sawm ", "d. Zakat", "1"));
        modelList.add(new QuestionsModel("2. What percentage of a Muslim’s savings should be given as Zakat?\n",
                "a. 2.5%", "b. 2%", "c. 3.5% ", "d. 4%", "1"));
        modelList.add(new QuestionsModel("3. In which Islamic month do Muslims fast?\n",
                "a. Ramadhan", "b. Rajab", "c. Muharram  ", "d. Shaban", "1"));
    }

    public static void initQueAnsMESSENGERS() {
        bar_title = "MESSENGERS";
        modelList = new ArrayList<>();
        modelList.add(new QuestionsModel("1. Who was the first prophet?",
                "a. Adam", "b. Nuh", "c. Isa ", "d. Ibrahim", "1"));
        modelList.add(new QuestionsModel("2. What was the name of Prophet Adam’s (AS) wife?",
                "a. Hawwa", "b. Zaynab", "c. Maryam", "d. Aysha", "1"));
        modelList.add(new QuestionsModel("3. How many prophets are mentioned in the Quran?",
                "a. 25", "b. 20", "c. 27", "d. 30", "1"));
    }

    public static void initQueAnsQURAN() {
        bar_title = "QURAN";
        modelList = new ArrayList<>();
        modelList.add(new QuestionsModel("1. How many chapters are there in the Quran?",
                "a. 114", "b. 110", "c. 100 ", "d. 99", "1"));
        modelList.add(new QuestionsModel("2. How old was the Prophet (PBUH) when the Quran was first revealed to him?",
                "a. 40", "b. 39", "c. 39", "d. 42", "1"));
        modelList.add(new QuestionsModel("3. Who revealed Allah’s words to the Prophet (PBUH)?",
                "a. Jibra’il", "b. Mika’il", "c. Israfil", "d. Izra’il", "1"));
    }

    public static void initQueAnsPROPHET() {
        bar_title = "THE LAST PROPHET (PBUH)";
        modelList = new ArrayList<>();
        modelList.add(new QuestionsModel("1. In which year was the Prophet (PBUH) born?",
                "a. 570 AD", "b. 600 AD", "c. 620 AD", "d. 580 AD", "1"));
        modelList.add(new QuestionsModel("2. Where was he born?",
                "a. Makkah", "b. Medina", "c. Jerusalem ", "d. Bethlehem", "1"));
        modelList.add(new QuestionsModel("3. Which cave did Muhammad (PBUH) spend a lot of his time?",
                "a. Hira", "b. Mira", "c. Thawr ", "d. Al-Gara", "1"));
    }
}
