package p190o8;

/* renamed from: o8.c */
/* loaded from: classes.dex */
public enum EnumC4151c {
    HOME("HOME_TAG"),
    GAMES("GAMES_TAG"),
    AVATAR("AVATAR_EDITOR_TAG"),
    MORE("MORE_TAG"),
    GAME_DETAILS("GAME_DETAILS_TAG", new String[]{"gameId"}),
    PROFILE("PROFILE_TAG", new String[]{"userId"}),
    CATALOG("CATALOG_TAG"),
    FRIENDS("FRIENDS_TAG"),
    UNKNOWN("unknown");


    /* renamed from: n */
    private final String f16915n;

    /* renamed from: o */
    private final String[] f16916o;

    EnumC4151c(String str, String[] strArr) {
        this.f16915n = str;
        this.f16916o = strArr;
    }

    /* renamed from: b */
    public String m17225b() {
        return this.f16915n;
    }

    /* renamed from: c */
    public int m17226c() {
        return this.f16916o.length;
    }

    /* renamed from: d */
    public String[] m17227d() {
        return this.f16916o;
    }

    EnumC4151c(String str) {
        this(str, new String[0]);
    }
}
