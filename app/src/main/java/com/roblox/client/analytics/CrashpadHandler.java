package com.roblox.client.analytics;

import com.roblox.client.C2836i;
import com.roblox.engine.jni.NativeSettingsInterface;
import p035c9.C1151k;

/* loaded from: classes.dex */
public class CrashpadHandler {
    private static final String TAG = "CrashpadHandler";

    public static void main(String[] strArr) {
        String str = System.getenv("LIBRARYPATH");
        for (String str2 : C2836i.f11265g) {
            if (!str2.equals("libtrampoline.so")) {
                System.load(str + "/" + str2);
            }
        }
        StringBuilder sb2 = new StringBuilder("Crash handling ");
        int nativeRunCrashpadHandler = NativeSettingsInterface.nativeRunCrashpadHandler(strArr);
        if (nativeRunCrashpadHandler == 0) {
            sb2.append("succeed");
            C1151k.m6712f(TAG, sb2.toString());
        } else {
            sb2.append("failed with result ");
            sb2.append(nativeRunCrashpadHandler);
            C1151k.m6709c(TAG, sb2.toString());
        }
    }
}
