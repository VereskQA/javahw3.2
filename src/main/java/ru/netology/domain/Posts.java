package ru.netology.domain;

public class Posts {
    private int postId;
    private int fromId; //поле из документации
    private int createdBy; //поле из документации
    private int dateOfPublication;
    private String postBody;
    private int replyOwnerId; //поле из документации
    private int replyPostId; //поле из документации
    private int friendsOnly; //поле из документации
    private Comments comments;
    private Copyrights copyright; //поле из документации
    private Likes likes;
    private Reposts reposts;
    private Views views;
    private String postType; //поле из документации
    private PostSources postSource; //поле из документации
    private String postAttachments;
    private Geos geo; //поле из документации
    private int signerId; //поле из документации
    private int canPin; //поле из документации
    private int canDelete; //поле из документации
    private int canEdit; //поле из документации
    private int isPinned; //поле из документации
    private int markedAsAds; //поле из документации
    private boolean isFavorite; //поле из документации
    private Donuts donut; //поле из документации
    private int postponedId; //поле из документации

    // + getters/setters
}