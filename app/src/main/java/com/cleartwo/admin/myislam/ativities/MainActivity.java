package com.cleartwo.admin.myislam.ativities;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.cleartwo.admin.myislam.R;
import com.cleartwo.admin.myislam.ativities.StartSignUp.ChildNameActivity;
import com.cleartwo.admin.myislam.fragments.GamesFragment;
import com.cleartwo.admin.myislam.fragments.HomeFragment;
import com.cleartwo.admin.myislam.fragments.DetailsFragment;
import com.cleartwo.admin.myislam.utilities.Const;
import com.cleartwo.admin.myislam.utilities.ConstMenu;
import com.cleartwo.admin.myislam.utilities.DataProcessor;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public TabLayout tabLayout;
    public ViewPager viewPager;
    DataProcessor dataProcessor;

    private int[] tabIcons = {
            R.drawable.home_btn,
            R.drawable.bar_game_btn,
            R.drawable.menu_tab_btn
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataProcessor = new DataProcessor(this);
        setTitle("Hi " + dataProcessor.getStr("name"));
        setContentView(R.layout.activity_main);
        initView();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Profile Button", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });
        fab.setImageResource(dataProcessor.getInt("avatar"));
        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
        final NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(false); //disable "hamburger to arrow" drawable
        toggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        toggle.setHomeAsUpIndicator(R.drawable.menu_button); //set your own
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void initView() {
        Const.mainActivity = this;
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);

        ImageView imgView = new ImageView(MainActivity.this);
        int width = 100;
        int height = 100;
        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(width,height);
        imgView.setLayoutParams(parms);
        imgView.setImageResource(R.drawable.bar_game_btn);
        tabLayout.getTabAt(1).setCustomView(imgView);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 2:
                        if (ConstMenu.selectedMenu != -101) {
                            ConstMenu.selectedMenu = 100;
                        }else {
                            ConstMenu.selectedMenu = 0;
                        }
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                ConstMenu.selectedMenu = 100;
                try{
                    Const.detailsFragment.refreshFragment();
                }catch (Exception e){

                }
            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new HomeFragment(), "ONE");
        adapter.addFrag(new GamesFragment(), "TWO");
        adapter.addFrag(new DetailsFragment(), "THREE");
//        adapter.addFrag(new MenuFragment(), "THREE");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }
        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
//            return mFragmentTitleList.get(position);
            return null;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (Const.mainActivity.tabLayout.getSelectedTabPosition() == 0) {
                overridePendingTransition(R.anim.enter_ani, R.anim.exit_ani);
                super.onBackPressed();
            } else {
                Const.mainActivity.tabLayout.getTabAt(0).select();
            }
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            this.tabLayout.getTabAt(0).select();
        } else if (id == R.id.nav_back) {
            dataProcessor.setClearData();
            startActivity(new Intent(MainActivity.this, ChildNameActivity.class));
            overridePendingTransition(R.anim.left_to_right_ani, R.anim.right_to_left_ani);
            finish();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
