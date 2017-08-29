package kr.co.tjeit.socialloginpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import kr.co.tjeit.socialloginpractice.util.ContextUtil;

public class MainActivity extends BaseActivity {

    private android.widget.TextView idTxt;
    private android.widget.TextView pwTxt;
    private android.widget.Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void setValues() {
        idTxt.setText(ContextUtil.getUserId(mContext));
        pwTxt.setText(ContextUtil.getUserPw(mContext));
    }

    @Override
    public void bindViews() {

        this.logoutBtn = (Button) findViewById(R.id.logoutBtn);
        this.pwTxt = (TextView) findViewById(R.id.pwTxt);
        this.idTxt = (TextView) findViewById(R.id.idTxt);
    }
}
