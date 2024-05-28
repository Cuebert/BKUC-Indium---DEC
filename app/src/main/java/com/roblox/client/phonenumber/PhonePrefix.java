package com.roblox.client.phonenumber;

import com.appsflyer.oaid.BuildConfig;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class PhonePrefix {

    @SerializedName("code")
    public final String countryCode;

    @SerializedName("name")
    public final String countryName;

    @SerializedName("localizedName")
    public final String localizedCountryName;
    public final String prefix;
    private static final PhonePrefix EMPTY_PREFIX = new PhonePrefix(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    private static final PhonePrefix DEFAULT_PHONE_PREFIX = new PhonePrefix("United States", "US", "1", "United States");

    public PhonePrefix(String str, String str2, String str3, String str4) {
        this.countryName = str;
        this.countryCode = str2;
        this.prefix = str3;
        this.localizedCountryName = str4;
    }

    public static PhonePrefix emptyPrefix() {
        return EMPTY_PREFIX;
    }

    public static PhonePrefix getDefaultPhonePrefix() {
        return DEFAULT_PHONE_PREFIX;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhonePrefix phonePrefix = (PhonePrefix) obj;
        return this.countryCode.equals(phonePrefix.countryCode) && this.countryName.equals(phonePrefix.countryName) && this.prefix.equals(phonePrefix.prefix) && this.localizedCountryName.equals(phonePrefix.localizedCountryName);
    }

    public String toString() {
        return "Country: " + this.countryCode + ". Prefix: " + this.prefix;
    }
}
