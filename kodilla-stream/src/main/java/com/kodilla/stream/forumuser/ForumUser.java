package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int IdUser;
    private final String nameUser;
    private final char sexUser;
    private final LocalDate bornUser;
    private final int onPosts;
    public LocalDate today = LocalDate.now();

    public ForumUser(int idUser, String nameUser, char sexUser, LocalDate bornUser, int onPosts) {
        IdUser = idUser;
        this.nameUser = nameUser;
        this.sexUser = sexUser;
        this.bornUser = bornUser;
        this.onPosts = onPosts;
    }

    public int getIdUser() {
        return IdUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSexUser() {
        return sexUser;
    }

    public LocalDate getBornUser() {
        return bornUser;
    }

    public int getOnPosts() {
        return onPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "nameUser='" + nameUser + '\'' +
                ", sexUser=" + sexUser +
                ", bornUser=" + bornUser +
                ", onPosts=" + onPosts +
                '}';
    }
}
