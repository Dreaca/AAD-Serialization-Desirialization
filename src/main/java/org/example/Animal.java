package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
     String name;
     String species;

}
