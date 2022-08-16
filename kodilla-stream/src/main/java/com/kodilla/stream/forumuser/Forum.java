package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();


    public Forum(){
        theForumUserList.add(new ForumUser(001, "Jonn", 'M', 1995,3,15,12));
        theForumUserList.add(new ForumUser(002, "aacb", 'M', 1999,12, 4, 10));
        theForumUserList.add(new ForumUser(004, "kdkd", 'F', 2000,4,23,8));
        theForumUserList.add(new ForumUser(004, "kkkk", 'M', 2010, 1,1, 10));
        theForumUserList.add(new ForumUser(004, "bbbb", 'M', 2001, 1,1, 0));

    }

    public List<ForumUser> getList(){
        return new ArrayList<>(theForumUserList);
    }
}
