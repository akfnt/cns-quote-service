package com.akfnt.cnsquoteservice.domain;

public record Quote(
        String content,
        String author,
        Genre genre
) {
}
