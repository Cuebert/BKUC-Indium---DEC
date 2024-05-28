package com.roblox.client.captcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.C2877p0;

/* loaded from: classes.dex */
public class SignUpCaptchaConfig implements CaptchaConfig {
    public static final Parcelable.Creator<SignUpCaptchaConfig> CREATOR = new C2753a();

    /* renamed from: com.roblox.client.captcha.SignUpCaptchaConfig$a */
    /* loaded from: classes.dex */
    class C2753a implements Parcelable.Creator<SignUpCaptchaConfig> {
        C2753a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SignUpCaptchaConfig createFromParcel(Parcel parcel) {
            return new SignUpCaptchaConfig();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SignUpCaptchaConfig[] newArray(int i10) {
            return new SignUpCaptchaConfig[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.roblox.client.captcha.CaptchaConfig
    /* renamed from: s */
    public String mo12262s() {
        return C2877p0.m12946s();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
    }
}
