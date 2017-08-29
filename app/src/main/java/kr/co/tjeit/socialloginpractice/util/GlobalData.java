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
        allUsers.add(new User("aaaa", "1111"));
        allUsers.add(new User("bbbb", "2222"));
        allUsers.add(new User("cccc", "3333"));
        allUsers.add(new User("dddd", "4444"));
        allUsers.add(new User("eeee", "5555"));
        allUsers.add(new User("ffff", "6666"));
        allUsers.add(new User("gggg", "7777"));
        allUsers.add(new User("hhhh", "8888"));
        allUsers.add(new User("iiii", "9999"));
        allUsers.add(new User("jjjj", "0000"));
    }

}
