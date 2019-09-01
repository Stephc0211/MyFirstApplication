package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.myfirstapplication.Fragment.MainFragment;
import com.example.myfirstapplication.Fragment.MineFragment;
import com.example.myfirstapplication.Fragment.RatingsFragment;
import com.example.myfirstapplication.Fragment.SellFragment;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    private FrameLayout mFlMainContainer;
    private MineFragment mMineFragment;
    private MainFragment mMainFragment;
    private SellFragment mSellFragment;
    private RatingsFragment mRatingsFragment;

    private RadioGroup mRgMain;
    private RadioButton mRbHome;
    private RadioButton mRbMine;
    private RadioButton mRbSell;
    private RadioButton mRbRatings;

    private TextView mTvLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFlMainContainer = findViewById(R.id.fl_main_container);
        mRgMain = findViewById(R.id.rg_main);
        mRbHome = findViewById(R.id.rb_home);
        mRbRatings = findViewById(R.id.rb_ratings);
        mRbSell = findViewById(R.id.rb_b);
        mRbMine = findViewById(R.id.rb_mine);

        mMineFragment = new MineFragment();
        mRatingsFragment = new RatingsFragment();
        mSellFragment = new SellFragment();
        mMainFragment = new MainFragment();

        mRgMain.setOnCheckedChangeListener(this);

        mRbHome.setChecked(true);
        replaceFragment(mMainFragment);


    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_main_container,fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case R.id.rb_home:
                if(null != mMainFragment){
                    mMainFragment = new MainFragment();
                }
                replaceFragment(mMainFragment);
                break;

            case R.id.rb_mine:
                if(null != mMineFragment){
                    mMineFragment = new MineFragment();
                }
                replaceFragment(mMineFragment);
                break;

            case R.id.rb_ratings:
                if(null != mRatingsFragment) {
                    mRatingsFragment = new RatingsFragment();
                }
                replaceFragment(mRatingsFragment);
                break;



            default:
                break;
        }
    }
}
