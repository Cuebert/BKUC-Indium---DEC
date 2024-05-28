package com.roblox.engine.jni.model;

/* renamed from: com.roblox.engine.jni.model.a */
/* loaded from: classes.dex */
public class C2940a extends PlatformParams {
    public boolean isLuaChatEnabled;
    public boolean isLuaGamesPageEnabled;
    public boolean isLuaHomePageEnabled;
    public boolean isTablet;

    public C2940a() {
        this(null);
    }

    /* renamed from: b */
    private void m13340b(C2940a c2940a) {
        this.isLuaHomePageEnabled = c2940a.isLuaHomePageEnabled;
        this.isLuaGamesPageEnabled = c2940a.isLuaGamesPageEnabled;
        this.isLuaChatEnabled = c2940a.isLuaChatEnabled;
        this.isTablet = c2940a.isTablet;
    }

    @Override // com.roblox.engine.jni.model.PlatformParams
    /* renamed from: a */
    public void mo13339a(PlatformParams platformParams) {
        super.mo13339a(platformParams);
        if (platformParams instanceof C2940a) {
            m13340b((C2940a) platformParams);
        }
    }

    public C2940a(PlatformParams platformParams) {
        mo13339a(platformParams);
    }
}
