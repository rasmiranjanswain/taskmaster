package com.taskmaster.dto;

public record TaskResponse (
    Long id,
    String name,
    String description,
    boolean isCompleted
){}
