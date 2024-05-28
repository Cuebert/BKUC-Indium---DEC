package p276v8;

import java.util.regex.Pattern;

/* renamed from: v8.c */
/* loaded from: classes.dex */
public class C4993c extends C4991a {

    /* renamed from: b */
    private Pattern f19088b;

    public C4993c(String str) {
        super(str);
    }

    /* renamed from: d */
    public boolean m19444d(String str) {
        if (this.f19088b == null) {
            this.f19088b = Pattern.compile("(?:(?:http|https):\\/\\/)?(?:[^.]+\\.)?(?:facebook\\.com|twitter\\.com|twitch\\.tv|youtube\\.com|discord\\.gg)(?:\\/.*)?");
        }
        return this.f19088b.matcher(str).matches();
    }
}
