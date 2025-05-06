package com.freegrownextgen.freegrow.models.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * Experience is a model class that represents the work experience of a user.
 * It contains various fields related to the user's work experience.
 */
public class ExperienceModel {
    private String title;
    private String employementType;
    private String company;
    private boolean isCurrentlyWorkingHere;
    
}
