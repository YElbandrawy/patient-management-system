package com.pm.patientservice.dto;

import com.pm.patientservice.dto.validators.CreatPatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {

    @NotBlank(groups = CreatPatientValidationGroup.class ,message = "Name is required")
    @Size(max = 40, message = "Name cannot exceed 40 character")
    private String name;

    @NotBlank(groups = CreatPatientValidationGroup.class ,message = "Email is required")
    @Email(message = "enter a valid email ex.(john@example.com)")
    private String email;

    @NotBlank(groups = CreatPatientValidationGroup.class ,message = "Address is required")
    private String address;

    @NotBlank(groups = CreatPatientValidationGroup.class ,message = "DOB is required")
    private String dateOfBirth;

    //---------------------------------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
