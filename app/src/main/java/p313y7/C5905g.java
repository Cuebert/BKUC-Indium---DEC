package p313y7;

import com.roblox.client.C2906t0;

/* renamed from: y7.g */
/* loaded from: classes.dex */
public class C5905g extends C5906h {

    /* renamed from: h */
    private int f21768h;

    public C5905g(C2906t0 c2906t0, String str) {
        super(c2906t0);
        this.f21768h = m21032g(str);
    }

    /* renamed from: g */
    private int m21032g(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case -1237460524:
                if (lowerCase.equals("groups")) {
                    c10 = 0;
                    break;
                }
                break;
            case -985752863:
                if (lowerCase.equals("player")) {
                    c10 = 1;
                    break;
                }
                break;
            case -493567566:
                if (lowerCase.equals("players")) {
                    c10 = 2;
                    break;
                }
                break;
            case 98629247:
                if (lowerCase.equals("group")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                return 5;
            case 1:
            case 2:
                return 1;
            default:
                return super.mo21030b();
        }
    }

    @Override // p313y7.C5906h, p313y7.C5904f.e
    /* renamed from: b */
    public int mo21030b() {
        return this.f21768h;
    }
}
