package com.example.danceschoolnotifications.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEvent {
    private UUID userId;
    private String email;
}