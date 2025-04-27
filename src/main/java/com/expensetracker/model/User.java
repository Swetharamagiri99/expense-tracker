package com.expensetracker.model;

import jakarta.persistence.*;
import lombok.*;

@Entity                      // 🟢 Marks this class as a database table
@Data                        // 🟢 Lombok annotation to generate getters/setters
@NoArgsConstructor           // 🟢 Create default (empty) constructor
@AllArgsConstructor          // 🟢 Create constructor with all fields
@Builder                     // 🟢 Allows you to use builder pattern when creating objects
public class User {

    @Id                     // 🟢 Marks this field as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;        // 🟢 Will auto-increment

    private String username;
    private String email;
    private String password;
}
