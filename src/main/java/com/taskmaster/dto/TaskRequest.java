package com.taskmaster.dto;


public record TaskRequest (
    String name,
    String description,
    boolean isCompleted
){}
