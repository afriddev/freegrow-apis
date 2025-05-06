package com.freegrownextgen.freegrow.models.utils;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * EducationModel is a model class that represents the education details of a user.
 * It contains various fields related to the user's educational background.
 */
public class EducationModel {
    private String school;
    private String startMonth;
    private String startYear;
    private String endMonth;
    private String endYear;
    private float grade;
    private String description;
    private List<SkillsModel> skills;
    private boolean isShowInProfile = true;
    
}
