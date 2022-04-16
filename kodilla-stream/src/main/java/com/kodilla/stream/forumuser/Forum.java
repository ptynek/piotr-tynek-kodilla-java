package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum(){
        theUsersList.add(new ForumUser(1, "UserOne", 'M', 1993, 11, 20, 30));
        theUsersList.add(new ForumUser(2, "UserTwo", 'F', 2001, 03, 15, 200));
        theUsersList.add(new ForumUser(3, "UserThree", 'M', 1983, 01, 05, 24));
        theUsersList.add(new ForumUser(4, "UserFour", 'F', 1992, 05, 03, 10));
        theUsersList.add(new ForumUser(5, "UserFive", 'F', 1964, 11,11, 300));
        theUsersList.add(new ForumUser(6, "UserSix", 'M', 2010, 10,11,0));
        theUsersList.add(new ForumUser(7, "UserSeven", 'M', 2011, 06, 22, 0));
        theUsersList.add(new ForumUser(8, "UserEight", 'F', 2020, 03, 03, 0));
        theUsersList.add(new ForumUser(9,"UserNine", 'M', 2009, 06,05, 200));
        theUsersList.add(new ForumUser(10,"UserTen", 'F', 2010, 8, 9,0));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theUsersList);
    }
}
