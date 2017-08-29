package kr.co.tjeit.socialloginpractice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kr.co.tjeit.socialloginpractice.util.ContextUtil;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent;
                if (ContextUtil.getUserId(mContext).equals("")) {
//                    로그인이 안되어있는 상태
                    intent = new Intent(SplashActivity.this, LoginActivity.class);
                }
                else {
//                    로그인이 되어있는 상태.
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
            }
        }, 2000);

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
