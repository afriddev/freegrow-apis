package com.freegrownextgen.freegrow.models.utils;

import java.util.List;

import com.freegrownextgen.freegrow.enums.utils.ExperienceLocationTypeEnums;
import com.freegrownextgen.freegrow.enums.utils.ExperienceTypeEnums;
import com.freegrownextgen.freegrow.enums.utils.MonthsEnums;

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
    private ExperienceTypeEnums type;
    private String companyName;
    private boolean isCurrentlyWorkingHere;
    private MonthsEnums startMonth;
    private Integer startYear;
    private MonthsEnums endMonth;
    private Integer endYear;
    private String location;
    private ExperienceLocationTypeEnums locationType;
    private String description;
    private List<SkillModel> skills;
    private List<String> images;

}
