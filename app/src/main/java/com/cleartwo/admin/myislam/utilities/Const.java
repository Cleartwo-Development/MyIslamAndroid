package com.cleartwo.admin.myislam.utilities;


import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.ativities.MainActivity;
import com.cleartwo.admin.myislam.ativities.StartSignUp.ChildNameActivity;
import com.cleartwo.admin.myislam.ativities.StartSignUp.SignUpEmailActivity;
import com.cleartwo.admin.myislam.ativities.StartSignUp.StartSignUpActivity;
import com.cleartwo.admin.myislam.fragments.MenuFragment;
import com.cleartwo.admin.myislam.modelClasses.SectionDetailsModel;
import com.cleartwo.admin.myislam.modelClasses.TopicModel;

import java.util.ArrayList;
import java.util.List;

public class Const {
    //Activities
    public static ChildNameActivity childNameActivity;
    public static SignUpEmailActivity signUpEmailActivity;
    public static StartSignUpActivity startSignUpActivity;
    public static MainActivity mainActivity;

    // Fragments
    public static MenuFragment menuFragment;

    public static int profileIcon = R.drawable.girl_logo;
    public static String profileName = "Islam App";

    public static int gridSelectedNumber = 0;
    public static List<TopicModel> modelList;
    public static SectionDetailsModel sectionDetailsModel;

    public static void methodCall() {
        modelList = new ArrayList<>();
        sectionDetailsModel = new SectionDetailsModel("Section Title", "Description Not Found", modelList);
        if (gridSelectedNumber == 0) {
            methodData();
        } else if (gridSelectedNumber == 1) {
            methodData_1();
        } else if (gridSelectedNumber == 2) {
            methodData_2();
        } else if (gridSelectedNumber == 3) {
            methodData_3();
        } else if (gridSelectedNumber == 4) {
            methodData_4();
        } else if (gridSelectedNumber == 5) {
            methodData_5();
        } else if (gridSelectedNumber == 6) {
            methodData_6();
        } else if (gridSelectedNumber == 7) {
            methodData_7();
        } else if (gridSelectedNumber == 8) {
            methodData_8();
        } else if (gridSelectedNumber == 9) {
            methodData_9();
        }
    }

    public static void methodData() {
        modelList.add(new TopicModel("Allah"));
        modelList.add(new TopicModel("ANGELS"));
        modelList.add(new TopicModel("MESSENGERS"));
        modelList.add(new TopicModel("THE QURAN"));
        modelList.add(new TopicModel("DAY OF JUDGEMENT & LIFE AFTER DEATH"));
        sectionDetailsModel = new SectionDetailsModel("Basic Beliefs",
                "There are five basic religious acts in Islam, collectively known as 'The Pillars of Islam'.",
                modelList);
    }

    public static void methodData_1() {
        modelList.add(new TopicModel("First Kalima (Tayyibah)"));
        modelList.add(new TopicModel("Second Kalima (Shahadat)"));
        modelList.add(new TopicModel("Third Kalima (Tamjeed)"));
        modelList.add(new TopicModel("Fourth Kalima (Tawheed)"));
        modelList.add(new TopicModel("Fifth Kalima (Istighfar)"));
        modelList.add(new TopicModel("Sixth Kalima (Radd-e-Kuffar)"));
        sectionDetailsModel = new SectionDetailsModel(
                "SHAHADAH",
                "The first pillar of Islam is Shahadah. Shahadah is to believe that there is no God except Allah and that" +
                        "Muhammad (PBUH) is his messenger. A person becomes a Muslim by reciting and believing in this " +
                        "statement:\n\n" +
                        "لا إله إلا الله محمد رسول الله\n\n" +
                        "There is no god but God, and Muhammad is the messenger of Allah" +
                        ".\n\n" +
                        "This is also known as Kalima Tayyibah (Word of Purity). It is the first of the six well - known kalimas.\n\n" +
                        "THE SIX KALIMAS\n\n" +
                        "The six kalimas state the basic beliefs Muslim have about Allah, his messengers, angels and life after death",
                modelList);
    }

    public static void methodData_2() {
        modelList.add(new TopicModel("The Five Prayers"));
        modelList.add(new TopicModel("WUDU"));
//        modelList.add(new TopicModel("The Process"));
        modelList.add(new TopicModel("The Azaan"));
        modelList.add(new TopicModel(" How to Pray Namaz"));
        sectionDetailsModel = new SectionDetailsModel(
                "SALAT",
                "Salat is the practice of prayer. It is the second pillar of Islam and " +
                        "therefore a duty that all Muslims must try to carry out. While it is " +
                        "obligatory only for those who have hit the age of puberty, young children " +
                        "are also encouraged to pray.",
                modelList);
    }

    public static void methodData_3() {
        sectionDetailsModel = new SectionDetailsModel(
                "SAWM",
                "The fourth pillar of Islam is sawm, also known as fasting. This is when Muslims fast" +
                        "during the month of Ramadhan every year.\n\n" +
                        "Fasting means not eating or drinking from dawn to sunset. Not only do Muslims " +
                        "avoid food, they are also expected to stay away from using bad language, lying an " +
                        "other bad things.\n\n" +
                        "Following Isha (the night prayer), Muslims pray Tarawih. This is an additional prayer " +
                        "that is performed during Ramadhan and is a prayer that the Prophet Muhammad " +
                        "(PBUH) made during the holy month.\n\n" +
                        "Muslims eat a meal before dawn called Sahoor and then a meal after sunset to " +
                        "break the fast. This is called Iftar and often, Muslims enjoy this meal with family or " +
                        "friends. Arrangements can also be made in the mosque so locals can gather and " +
                        "break their fasts together.\n\n" +
                        "But why do Muslims fast during Ramadhan?\n\n" +
                        "Fasting is an act of worship and a way to get closer to God. It is a way to remind " +
                        "Muslims of the poor who go " +
                        "days without food or drink and make them feel empathy " +
                        "for those who are unable to eat and drink as they please. It is also intended to stop " +
                        "Muslims from doing or saying bad things as Ramadhan is a special month full of " +
                        "great blessings.\n\n" +
                        "To mark the end of " +
                        "Ramadhan, Muslims celebrate Eid al- Fitr. This is a day that starts " +
                        "with a special Eid prayer in the morning which should be performed in congregation " +
                        "with other Muslims. Eid is a happy occasion and Muslims often wear nice clothes " +
                        "and spend time with loved ones",
                modelList);
    }

    public static void methodData_4() {
        sectionDetailsModel = new SectionDetailsModel(
                "ZAKAT",
                "An important act of worship and pillar of Islam is Zakat. It is the required for all Muslims who have " +
                        "more money than they need to give a payment to the poor and needy.\n\n" +
                        "The minimum amount of money that Muslims should give in Zakat is 2.5 percent of " +
                        "their total savings and wealth. This payment must be made once a year.\n\n" +
                        "Why should Muslims give Zakat?\n\n" +
                        "It is a basic duty of being a Muslim and an act of worship carried out to please Allah. It makes it a " +
                        "requirement for Muslims to share their extra wealth" +
                        "with those that need it most. Zakat reminds " +
                        "Muslims of their duty towards the poor, purifies the heart of greed and increases gratitude towards " +
                        "Allah.",
                modelList);
    }

    public static void methodData_5() {
        sectionDetailsModel = new SectionDetailsModel(
                "HAJJ",
                "Hajj is the pilgrimage to Makkah. This is when Muslims visit the Ka’bah," +
                        "also known as the house of Allah.\n\n" +
                        "It is a cube-shaped building covered in a black cloth.\n\n" +
                        "The Ka’bah was the first house built on Earth for the purpose of " +
                        "worshipping Allah and is the direction that Muslims face when praying " +
                        "salat.\n\n" +
                        "It was first built by the Prophet Adam (A.S) and then later rebuilt by " +
                        "Prophet Ibrahim (A.S) and Prophet Isma’il (A.S).\n\n" +
                        "Muslims are expected to perform Hajj at least once in their lifetime, if " +
                        "they can afford the trip.\n\n" +
                        "Millions of Muslims from all over the world visit Makkah and it can be a " +
                        "fascinating experience meeting people from different walks of life.\n\n" +
                        "During the trip to Makkah, and Madina, Muslims spend time worshipping " +
                        "Allah without distractions and reflecting on their lives.\n\n" +
                        "Hajj involves several practices, including walking around the Ka’bah seven times.\n\n" +
                        "After the pilgrimage has been performed, Muslims celebrate all over the world.\n\n" +
                        "This festivity is called Eid al-Adha and involves a morning prayer " +
                        "followed by spending time with family and friends.\n\n" +
                        "It is the day that Muslims remember when the Prophet Ibrahim (A.S) was " +
                        "prepared to sacrifice his son for Allah.\n\n" +
                        "In memory of this, Muslims sacrifice an animal–either a goat, sheep or " +
                        "cow and distribute the meat to the poor.",
                modelList);
    }

    public static void methodData_6() {
        sectionDetailsModel = new SectionDetailsModel("THE LAST PROPHET (PBUH)",
                "In the year 570 AD, Prophet Muhammad (PBUH) was born in Makkah, Saudi Arabia.\n\n" +
                        "He had a tough childhood as his father, Abdullah, passed away before Muhammad " +
                        "(PBUH) was born and his mother, Amina passed when he was just six years old. As " +
                        "an orphan at very early stages of his life, Muhammad (PBUH) was taken care of by " +
                        "his grandfather.\n\n" +
                        "Abdul-Muttalib, the grandfather of the Prophet Muhammad (PBUH), took care of " +
                        "Muhammad (PBUH) for two years.\n\n" +
                        "When Muhammad was eight years old, his grandfather " +
                        "sadly died. This was the " +
                        "second death the Prophet faced before hitting the age of 10. He then moved under " +
                        "the care of his uncle, Abu Talib. Abu Talib looked after Muhammad (PBUH) during " +
                        "his childhood and supported him throughout his life.\n\n" +
                        "Muhammad (PBUH) started work as a shepherd at a young age. Although the  " +
                        "Prophet was illiterate -he could not read nor write, he was able to follow his uncle’s " +
                        "footsteps and gain experience working as a merchant.\n\n" +
                        "He made business trips overseas and soon earned a reputation of being honest and " +
                        "sincere. Muhammed (PBUH) would often be called by the nickname ‘al-Amin’ which means trustworthy.\n\n" +
                        "When Muhammad (PBUH) was 25 years old, " +
                        "a successful merchant named " +
                        "Khadijah sent him a marriage proposal. He accepted and they were happily married " +
                        "for several years. Together, they had two sons: Al-Qasim and Abdullah, along with " +
                        "four daughters: Zaynab, Ruqayya, Umm Kulthum and Fatima.\n\n" +
                        "The Prophet was a very spiritual man and he " +
                        "would often visit Mount Nur where he " +
                        "would sit in a cave called Hira. There he would reflect on his life and the people " +
                        "around him who were at the time very troubled and quarrelled. They had many bad " +
                        "habits and also worshipped idols.\n\n" +
                        "One day in 610 AD, when Muhammad (PBUH) was alone in cave Hira, angel Jibra’il " +
                        "appeared. The angel told the Prophet to “read” to which Muhammad (PBUH) replied " +
                        "“I am unable to read”" +
                        ". Jibra’il told him to read again and the Prophet told him again " +
                        "that he cannot. This was until he was told a third time and the angel recited:\n\n" +
                        "اقْرَأْ بِاسْمِ رَبِّكَ الَّذِي خَلَقَ\n\n" +
                        "“Read in the name of your Lord who created!”\n\n" +
                        "Prophet Muhammad (PBUH) repeated these words and this event marked the " +
                        "beginning of the revelation. The prophet was 40 years old at the time he was told " +
                        "that he was a prophet. Angel Jibra’il continued to bring parts of the Quran to the " +
                        "Prophet for 23 years, until it was all revealed. During this time, the Prophet was told " +
                        "to spread the word of Allah to the people.\n\n" +
                        "Muhammad (PBUH) told the people of Makkah to stop worshipping idols and follow " +
                        "the way of Islam. He faced many hardships during this time as many people refused " +
                        "to accept his message. The Prophet (PBUH) was mocked and harassed but he " +
                        "continues to spread Allah’s word with determination and patience.\n\n" +
                        "Eventually Islam spread across Makkah and people started to believe the Prophet’s " +
                        "words. He gained a following and people admired his strong yet kind character. He " +
                        "spent his days as a Prophet spreading Islam and helping people around him by " +
                        "showing kindness and understanding.\n\n" +
                        "However, along with the support, Muhammad (PBUH) faced anger and hostility from " +
                        "some people of Makkah. These people were threatened by the Prophet’s popularity " +
                        "and were prepared to fight and kill him. Muhammad was protected from these evil " +
                        "plans by Allah as he sent down Jibra’il to tell the Prophet to move to Medina.\n\n" +
                        "The journey the Prophet and his followers made from Makkah to Medina is called the " +
                        "Hijrah. It took place in the year 622 AD – the year that the Islamic calendar starts.\n\n" +
                        "As his following grew and spread, less than 10 years later, Muhammad (PBUH) was " +
                        "able to return to " +
                        "his birthplace. He came back to Makkah and forgave his enemies, " +
                        "which led many of them to later become Muslims.\n\n" +
                        "The message of Allah and the Prophet’s great character meant that Islam was" +
                        "accepted by many. Muhammad continued to lead the Muslim’s until 632 AD. At 63 " +
                        "years old, the Prophet (PBUH) died in Medina but he left the words of the Quran and " +
                        "his examples of living a good, faithful life.",
                modelList);
    }

    public static void methodData_7() {
        modelList.add(new TopicModel("KHADIJA"));
        sectionDetailsModel = new SectionDetailsModel("COMPANIONS of the Prophet",
                "During the Prophet’s (PBUH)life, he made some very close friends who stood by him " +
                        "as he spread Allah’s word.\n\n" +
                        "These companions, or sahabah " +
                        "in Arabic, spent a lot of time with " +
                        "Muhammad (PBUH) and learned about Islam directly from him.\n\n" +
                        "Muslims believe that the sahabah were righteous people and lived as " +
                        "Muslims until they died.\n\n" +
                        "Following the death of Muhammad (PBUH), four of his closest " +
                        "companions led the religion.\n\n" +
                        "Abu Bakr\n\n" +
                        "Umar\n\n" +
                        "Uthman\n\n" +
                        "Ali\n\n" +
                        "Together, they are sometimes called the ‘Rightly Guided Caliphs’. All " +
                        "four of the leaders lived closely with the Prophet (PBUH) during his " +
                        "prophethood and strongly supported him.\n\n" +
                        "They helped to further spread Islam and the sunnah for thirty years.",
                modelList);
    }

    public static void methodData_8() {
        modelList.add(new TopicModel("ADAM"));
        modelList.add(new TopicModel("IBRAHIM"));
        modelList.add(new TopicModel("NUH"));
        modelList.add(new TopicModel("MUSA"));
        modelList.add(new TopicModel("ISA"));
        sectionDetailsModel = new SectionDetailsModel(
                "PROPHET STORIES",
                "Stories of the Prophets.",
                modelList);
    }

    public static void methodData_9() {
        modelList.add(new TopicModel("ANGELS"));
        modelList.add(new TopicModel("FIVE PILLARS"));
        modelList.add(new TopicModel("MESSENGERS"));
        modelList.add(new TopicModel("QURAN"));
        modelList.add(new TopicModel("THE LAST PROPHET (PBUH)"));
        modelList.add(new TopicModel("Prophet Word Search"));
        modelList.add(new TopicModel("'Salat Snap' Game"));
        sectionDetailsModel = new SectionDetailsModel(
                "Learn & Play",
                "Multiple Choice Q&A",
                modelList);
    }
}
