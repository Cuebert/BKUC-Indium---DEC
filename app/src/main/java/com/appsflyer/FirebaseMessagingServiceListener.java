package com.appsflyer;

import com.appsflyer.internal.C1242bb;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        new C1242bb(getApplicationContext()).valueOf(str);
    }
}
