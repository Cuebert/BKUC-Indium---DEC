package com.roblox.client.components;

/* renamed from: com.roblox.client.components.o */
/* loaded from: classes.dex */
public enum EnumC2814o {
    ALL("all"),
    NONE("none"),
    MORE_ONLY("more");


    /* renamed from: n */
    private String f11004n;

    EnumC2814o(String str) {
        this.f11004n = str;
    }

    /* renamed from: b */
    public static EnumC2814o m12459b(String str) {
        String lowerCase = str.toLowerCase();
        EnumC2814o enumC2814o = ALL;
        if (lowerCase.contains(enumC2814o.m12460c())) {
            return enumC2814o;
        }
        EnumC2814o enumC2814o2 = MORE_ONLY;
        return lowerCase.contains(enumC2814o2.m12460c()) ? enumC2814o2 : NONE;
    }

    /* renamed from: c */
    public String m12460c() {
        return this.f11004n;
    }
}
