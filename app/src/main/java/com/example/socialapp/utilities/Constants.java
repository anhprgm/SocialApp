package com.example.socialapp.utilities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS = "users";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PREFERENCE_NAME = "chatAppPreference";
    public static final String KEY_IS_SIGNED_IN = "isSignedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_USER = "user";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderID";
    public static final String KEY_RECEIVER_ID = "receiverId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_COLLECTION_CONVERSIONS = "conversions";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_RECEIVER_NAME = "receiverName";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_RECEIVER_IMAGE = "receiverImage";
    public static final String KEY_LAST_MESSAGE = "lastMessage";
    public static final String KEY_AVAILABILITY = "availability";
    public static final String REMOTE_MSG_AUTHORIZATION = "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";

    public static final String REMOTE_MSG_TYPE = "type";
    public static final String REMOTE_MSG_INVITATION = "invitation";
    public static final String REMOTE_MSG_MEETING_TYPE = "meetingType";
    public static final String REMOTE_MSG_INVITER_TOKEN = "inviterToken";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";


    public static HashMap<String, String> getRemoteMsgHeaders() {
        HashMap<String, String> remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    Constants.REMOTE_MSG_AUTHORIZATION,
                    "key=AAAAwhF9dhI:APA91bGz6SAym8iCtTuu1aOBAqckJJu1wqcSy4CqSRGC1q67l7I_vcoqMakFA-fB_J_muWeFwRMtItugKNRYYH4mQjZRVgDXzOXC2IfieP4ufeCuFhHJTfg2S5EuK8ZDzmSqNTl1KZ3p"
            );
            remoteMsgHeaders.put(
                    Constants.REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );
        return remoteMsgHeaders;
    }

}
