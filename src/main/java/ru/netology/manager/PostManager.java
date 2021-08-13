package ru.netology.manager;

import ru.netology.domain.Posts;

public class PostManager {
    private Posts[] posts;

    public Posts[] search(int ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
        // some logic
        return null;
    }

    public void delete(int ownerId, int postId) {
        // some logic
    }
}
