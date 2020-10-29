package com.anisDev.videomeeting.listeners;

import com.anisDev.videomeeting.models.User;

public interface UsersListener {
    void initiateVideoMeeting(User user);

    void initiateAudioMeeting(User user);

    void onMultipleUsersAction(Boolean isMultipleUserSelected);
}
