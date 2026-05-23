package com.taskmaster.dto;

import jakarta.validation.constraints.NotBlank;

public record TaskRequest (
    @NotBlank(message = "Task name is required")
    String name,
    String description,
    boolean isCompleted
){}
