package com.cleartwo.admin.myislam.ativities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cleartwo.admin.myislam.R;

public class PrayNamazActivity extends AppCompatActivity {

    TextView part_number, pray_part_title, pray_part_details;
    ImageView pray_image;
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pray_namaz);

        part_number = (TextView) findViewById(R.id.part_number);
        pray_image = findViewById(R.id.pray_image);
        pray_part_title = findViewById(R.id.pray_part_title);
        pray_part_details = findViewById(R.id.pray_part_details);
        methodCall();

        ((ImageView) findViewById(R.id.left_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                methodCall();
            }
        });
        ((ImageView) findViewById(R.id.right_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                methodCall();
            }
        });

        ((ImageView) findViewById(R.id.back_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
            }
        });
    }

    public void methodCall() {
        if (count < 1) {
            count = 11;
        } else if (count > 11) {
            count = 1;
        }
        part_number.setText("" + count);
        if (count == 1) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.niyyah));
            pray_part_title.setText("Niyyah");
            pray_part_details.setText("Make the intention to perform salat.");
        } else if (count == 2) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.takbeer));
            pray_part_title.setText("Takbeer");
            pray_part_details.setText("Recite Allahu Akbar and raise the hands to signify\n" +
                    "the start of the prayer. During each movement in\n" +
                    "salat, takbeer should be recited.");
        } else if (count == 3) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.pray_qiyaam));
            pray_part_title.setText("Qiyaam");
            pray_part_details.setText("In the standing position with the right hand placed\n" +
                    "over the left hand on the navel. A short dua is made,\n" +
                    "followed by Surah Fatiha and then another surah\n" +
                    "of choice from the Quran." +
                    "\n\nاَعُوْذُ باِللهِ مِنَ الشَّيْطَنِ الرَّ جِيْمِ" +
                    "\nالرَّحْمـنِ الرَّحِيمِ" +
                    "\nمَالِكِ يَوْمِ الدِّينِ" +
                    "\nإِيَّاكَ نَعْبُدُ وإِيَّاكَ نَسْتَعِينُ" +
                    "\nاهدِنَــــا الصِّرَاطَ المُستَقِيمَ" +
                    "\nصِرَاطَ الَّذِينَ أَنعَمتَ عَلَيهِمْ" +
                    "\nغَيرِ المَغضُوبِ عَلَيهِمْ وَلاَ الضَّالِّينَ" +
                    "\n\nIn The Name of Allah, The Beneficent, The Merciful.\n" +
                    "(All) praise is (only) Allah's, the Lord\n" +
                    "of the Worlds.\n" +
                    "The Beneficent, The Merciful.\n" +
                    "Master of the Day of Judgement.\n" +
                    "Thee (alone) do we worship and of Thee (only) do we seek help.\n" +
                    "\"Guide us (O' Lord) on the Straight Path.\n" +
                    "\"The path of those upon whom Thou hast bestowed Thy bounties, not (th\n" +
                    "e path) of those\n" +
                    "inflicted with Thy wrath, nor (of those) gone astray." +
                    "\n" +
                    "");
        } else if (count == 4) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.pray_ruku));
            pray_part_title.setText("Ruku");
            pray_part_details.setText("Bow down and recite:\n" +
                    "\nسُبْحَانَ رَبِّىَ الْعَظِيْمِ" +
                    "(three times)" +
                    "\n\nGlory be to my Lord, the Almighty.");
        } else if (count == 5) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.niyyah));
            pray_part_title.setText("Qiyaam");
            pray_part_details.setText("Return to an upright position and recite:\n" +
                    "\nسَمِعَ اللَّهُ لِمَنْ حَمِدَه رَبَّنَـا لَكَ الْحَمْدُ" +
                    "\n\nGlory be to my Lord, the Almighty.");
        } else if (count == 6) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.pray_sujud));
            pray_part_title.setText("Sujud");
            pray_part_details.setText("While prostrating, recite:" +
                    "\n\nسُبْحَانَ رَبِّىَ الأَ عْلَى(three times)" +
                    "\n\nGlory be to my Lord, the Most High.\n" +
                    "Repeat the act of sujud.");
        } else if (count == 7) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.tashahud));
            pray_part_title.setText("Tashahud");
            pray_part_details.setText("Sit up and recite Allahu Akbar. Ensure that\n" +
                    "the hands are placed on the thighs and you\n" +
                    "are sitting on your left foot. Repeat the\n" +
                    "sujood for a second time.");
        } else if (count == 8) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.pray_qiyaam));
            pray_part_title.setText("Qiyaam");
            pray_part_details.setText("Following the second sujood, return to the standing\n" +
                    "position. This marks the end of the first rak’aah.\n" +
                    "Perform the second rak’aah in the same way as the first.\n" +
                    "Start by reciting Surah Fatiha, followed by a surah and\n" +
                    "perform ruku, qiyaam and sujood again.\n");
        } else if (count == 9) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.quood));
            pray_part_title.setText("Quood");
            pray_part_details.setText("Once you have performed sujood, remain seated and recite:\n" +
                    "\nاَلتَّحِيَّاتُ لِلَّهِ وَالصَّلَوَاتُ وَالطَّيِبَاتُ اَلسَّلاَمُ عَلَيْكَ اَيُّهَاالنَّبِيُّ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ" +
                    "اَلسَّلاَمُ عَلَيْنَا وَ عَلَى عِبَادِ اللهِ الصَّالِحِيْنَ\n" +
                    "اَشْهَدُ اَنْ لاَّ اِلَهَ اِلاَّ اللَّهُ وَاَشْهَدُ اَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُوْلُهُ\n" +
                    "\n\nAll compliments, prayers and beautiful expressions are for God. Peace be on you, Oh\n" +
                    "Messenger, and God's mercy and blessings. Peace be on us and on all righteous servants\n" +
                    "of God. I bear witness that no one is worthy of worship except God. And I bear witness\n" +
                    "that Muhammad is His servant and Envoy." +
                    "\n\nFollowed by Darood Shareef:" +
                    "\n\n\n" +
                    "اَللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَّعَلَى آلِ مُحَمَّدٍ كَمَـا صَلَّيْتَ عَلَى اِبْرَاهِيْمَ وَعَلَى آلِ اِبْرَاهِيْمَ اِنَّكَ حَمِيْدٌ مَّجِيْدٌ\n" +
                    "اَللَّهُمَّ بَـارِكْ عَلَى مُحَمَّدٍ وَّعَلَى آلِ مُحَمَّدٍ كَمَـا بَـاَرَكْتَ عَلَى اِبْرَاهِيْمَ وَعَلَى آلِ اِبْرَاهِيْمَ اِنَّكَ حَمِيْدٌ مَّجِيْدٌ\n" +
                    "\n\n" +
                    "My God, honour Muhammad and Muhammad’s family as you honoured Abraham and\n" +
                    "Abraham’s family Surely, you are praiseworthy, the Great My God, bless Muhammad and\n" +
                    "Muhammad’s family as you blessed Abraham and Abraham’s family Surely, you are\n" +
                    "praiseworthy, the Great.");
        } else if (count == 10) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.salam_right));
            pray_part_title.setText("Salaam");
            pray_part_details.setText("Turn to your right and recite:" +
                    "\n\nاَلسَّلاَمُ عَلَيكُمْ وَرَحْمَةُ اللهِ" +
                    "\n\nGod's peace and blessings be upon you.");
        } else if (count == 11) {
            pray_image.setImageDrawable(getResources().getDrawable(R.drawable.salam_left));
            pray_part_title.setText("Salaam");
            pray_part_details.setText("Turn to your left and recite:" +
                    "\n\nاَلسَّلاَمُ عَلَيكُمْ وَرَحْمَةُ اللهِ" +
                    "\n\nGod's peace and blessings be upon you." +
                    "\nNow you have completed two rak’aahs of salat.\n");
        }
    }
}
