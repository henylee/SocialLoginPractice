package kr.co.tjeit.socialloginpractice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kr.co.tjeit.socialloginpractice.data.User;
import kr.co.tjeit.socialloginpractice.util.GlobalData;

public class MainActivity extends BaseActivity {

    private android.widget.EditText idEdt;
    private android.widget.EditText pwEdt;
    private android.widget.Button loginBtn;

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

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                입력된 ID와 비밀번호를 확인해서,
//                로그인이 가능하면 로그인 성공 Toast
//                실패하면 실패했다고 Toast.

//                존재하지 않는 아이디입니다. (아이디 X)
//                비밀번호가 올바르지 않습니다. (아이디 O 비번 X)
                
                boolean loginOk = false;
                

//                모든 사용자에 대해 검사하기 위한 반복문
                for (User user : GlobalData.allUsers) {
//                    입력된 아이디가 검사하는 사용자의 아이디와 같은지 검사하는 조건문
                    if (user.getUserId().equals(idEdt.getText().toString()) ) {
//                        아이디가 존재하는 상황에서, 비밀번호가 일치하는지 검사하는 조건문
                        if (user.getPassword().equals(pwEdt.getText().toString())) {
//                            아이디도 일치하고, 비밀번호도 일치하므로 로그인 성공 Toast
                            loginOk = true;
                        }
                    }
                }
                
                if (loginOk) {
                    Toast.makeText(mContext, "로그인에 성공했습니다.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(mContext, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.loginBtn = (Button) findViewById(R.id.loginBtn);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.idEdt = (EditText) findViewById(R.id.idEdt);

    }
}