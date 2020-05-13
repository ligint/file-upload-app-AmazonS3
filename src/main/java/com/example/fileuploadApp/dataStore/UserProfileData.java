package com.example.fileuploadApp.dataStore;

import com.example.fileuploadApp.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserProfileData {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("4d51d4eb-d006-4c19-b4ed-a323f17ad304"),"abc",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("65a2748e-39df-4055-8aa5-e74192883dff"),"def",null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
