package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1,"Rorkir", 'm', LocalDate.of(2015,5,6),8));
        userList.add(new ForumUser(2,"Belm ", 'm', LocalDate.of(1997,11,1),0));
        userList.add(new ForumUser(3,"Lara ", 'f', LocalDate.of(2008,4,12),2));
        userList.add(new ForumUser(4,"Czarn ", 'm', LocalDate.of(2002,8,19),4));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(userList);
    }
}
