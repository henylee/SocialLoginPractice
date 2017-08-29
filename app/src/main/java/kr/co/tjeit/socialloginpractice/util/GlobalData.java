package kr.co.tjeit.socialloginpractice.util;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.socialloginpractice.data.User;

/**
 * Created by user on 2017-08-29.
 */

public class GlobalData {

    public static List<User> allUsers = new ArrayList<>();

    public static void initGlobalData() {
        allUsers.clear();
        allUsers.add(new User("aaaa", "1111", "갑", "tempURL"));
        allUsers.add(new User("bbbb", "2222", "을", "tempURL"));
        allUsers.add(new User("cccc", "3333", "병", "tempURL"));
        allUsers.add(new User("dddd", "4444", "정", "tempURL"));
        allUsers.add(new User("eeee", "5555", "무", "tempURL"));
        allUsers.add(new User("ffff", "6666", "기", "tempURL"));
        allUsers.add(new User("gggg", "7777", "경", "tempURL"));
        allUsers.add(new User("hhhh", "8888", "신", "tempURL"));
        allUsers.add(new User("iiii", "9999", "임", "tempURL"));
        allUsers.add(new User("jjjj", "0000", "계", "tempURL"));
    }

}
