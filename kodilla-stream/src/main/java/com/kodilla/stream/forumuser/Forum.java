package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();


    public Forum(){
        theForumUserList.add(new ForumUser(001, "Jon", 'M', 1995,12, 23, 3));
        theForumUserList.add(new ForumUser(002, "aab", 'M',1999, 10, 14, 10));
        theForumUserList.add(new ForumUser(004, "kdkd", 'F', 1988,8, 22, 19));
        theForumUserList.add(new ForumUser(004, "kkkk", 'M', 2010, 3, 1, 30));

    }

    public List<ForumUser> getList(){
        return new ArrayList<>(theForumUserList);
    }
}
