package kr.co.tjeit.socialloginpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kr.co.tjeit.socialloginpractice.util.GlobalData;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();

        GlobalData.initGlobalData();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

    }
}
