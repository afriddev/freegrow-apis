package com.freegrownextgen.freegrow.models.employee;

import java.time.Instant;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.freegrownextgen.freegrow.models.utils.EducationModel;
import com.freegrownextgen.freegrow.models.utils.Experience;
import com.freegrownextgen.freegrow.models.utils.SkillModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employee_profiles")
public class EmployeeProfileModel {
    private String title;
    private String description;
    private String portfolioUrl;
    private List<Experience> experience;
    private List<SkillModel> skills;
    private List<EducationModel> education;
    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;
}
