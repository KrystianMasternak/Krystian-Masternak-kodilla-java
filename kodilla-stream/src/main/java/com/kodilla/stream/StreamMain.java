package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class StreamMain {

    public static void main(String[] args) {


        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSexUser() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear() >= 20)
                .filter(forumUser -> forumUser.getPostsCount() >0)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
