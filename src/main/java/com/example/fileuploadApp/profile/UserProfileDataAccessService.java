package com.example.fileuploadApp.profile;

import com.example.fileuploadApp.dataStore.UserProfileData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final UserProfileData userProfileData;

    @Autowired
    public UserProfileDataAccessService(UserProfileData userProfileData) {
        this.userProfileData = userProfileData;
    }

    List<UserProfile> getUserProfiles(){

        return userProfileData.getUserProfiles();
    }
}
