package com.acs.elearn.vo;


import com.acs.elearn.dao.model.Role;
import com.acs.elearn.dao.model.Tag;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class AddUserInfoRequest {

    @NotNull
    private String userRoleId;
    private List<Tag> tagList;
    @NotNull
    private String userUsername;
    private Integer userAge;
    private String userFirstname;
    private String userLastname;
    @NotNull
    private Boolean userEmailVerified;
    @NotNull
    private Boolean userEnabled;
    @NotNull
    private String userEmail;
    private String userAvatar;
    private String userContact;
    private String userIntroduction;

}
