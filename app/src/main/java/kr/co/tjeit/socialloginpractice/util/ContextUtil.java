package kr.co.tjeit.socialloginpractice.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by user on 2017-08-29.
 */

public class ContextUtil {

//    메모장파일이름 설정
    private static final String prefName = "SocialLoginPref";

//    사용자 아이디 / 비번을 위한 항목명
    private static final String USER_ID = "USER_ID";
    private static final String USER_PW = "USER_PW";

    public static void setUserId(Context context, String id) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        pref.edit().putString(USER_ID, id).commit();
    }

    public static String getUserId(Context context) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        return pref.getString(USER_ID, "");
    }

    public static void setUserPw(Context context, String pw) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        pref.edit().putString(USER_PW, pw).commit();
    }

    public static String getUserPw(Context context) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        return pref.getString(USER_PW, "");
    }

}
