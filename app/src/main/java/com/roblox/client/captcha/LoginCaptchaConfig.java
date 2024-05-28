package com.roblox.client.captcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.C2877p0;

/* loaded from: classes.dex */
public class LoginCaptchaConfig implements CaptchaConfig {
    public static final Parcelable.Creator<LoginCaptchaConfig> CREATOR = new C2750a();

    /* renamed from: n */
    private String f10790n;

    /* renamed from: o */
    private String f10791o;

    /* renamed from: com.roblox.client.captcha.LoginCaptchaConfig$a */
    /* loaded from: classes.dex */
    class C2750a implements Parcelable.Creator<LoginCaptchaConfig> {
        C2750a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginCaptchaConfig createFromParcel(Parcel parcel) {
            return new LoginCaptchaConfig(parcel, (C2750a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginCaptchaConfig[] newArray(int i10) {
            return new LoginCaptchaConfig[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.captcha.LoginCaptchaConfig$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2751b {

        /* renamed from: a */
        static final /* synthetic */ int[] f10792a;

        static {
            int[] iArr = new int[EnumC2752c.values().length];
            f10792a = iArr;
            try {
                iArr[EnumC2752c.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10792a[EnumC2752c.PHONE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10792a[EnumC2752c.USERNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.roblox.client.captcha.LoginCaptchaConfig$c */
    /* loaded from: classes.dex */
    public enum EnumC2752c {
        USERNAME,
        EMAIL,
        PHONE_NUMBER
    }

    /* synthetic */ LoginCaptchaConfig(Parcel parcel, C2750a c2750a) {
        this(parcel);
    }

    /* renamed from: a */
    public static String m12263a(EnumC2752c enumC2752c) {
        int i10 = C2751b.f10792a[enumC2752c.ordinal()];
        return i10 != 1 ? i10 != 2 ? "username" : "phonenumber" : "email";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.roblox.client.captcha.CaptchaConfig
    /* renamed from: s */
    public String mo12262s() {
        return C2877p0.m12944r(this.f10790n, this.f10791o);
    }

    public String toString() {
        return "CredentialType: " + this.f10790n + ". CredentialValue: " + this.f10791o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10790n);
        parcel.writeString(this.f10791o);
    }

    public LoginCaptchaConfig(EnumC2752c enumC2752c, String str) {
        this.f10790n = m12263a(enumC2752c);
        this.f10791o = str;
    }

    private LoginCaptchaConfig(Parcel parcel) {
        this.f10790n = parcel.readString();
        this.f10791o = parcel.readString();
    }
}
