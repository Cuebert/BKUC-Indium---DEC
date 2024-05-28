package na;

import android.os.Build;
import com.appsflyer.oaid.BuildConfig;

/* renamed from: na.g */
/* loaded from: classes.dex */
public class C4092g extends AbstractC4089d {

    /* renamed from: na.g$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16616a;

        static {
            int[] iArr = new int[EnumC4091f.values().length];
            f16616a = iArr;
            try {
                iArr[EnumC4091f.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16616a[EnumC4091f.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16616a[EnumC4091f.RECORD_AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16616a[EnumC4091f.MODIFY_AUDIO_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16616a[EnumC4091f.WRITE_EXTERNAL_STORAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16616a[EnumC4091f.POST_NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: na.g$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        private static C4092g f16617a = new C4092g();
    }

    /* renamed from: C */
    public static C4092g m17032C() {
        return b.f16617a;
    }

    @Override // na.AbstractC4089d
    /* renamed from: g */
    public String mo17022g(EnumC4091f enumC4091f) {
        switch (a.f16616a[enumC4091f.ordinal()]) {
            case 1:
                return "android.permission.CAMERA";
            case 2:
                return "android.permission.READ_CONTACTS";
            case 3:
                return "android.permission.RECORD_AUDIO";
            case 4:
                return "android.permission.MODIFY_AUDIO_SETTINGS";
            case 5:
                return "android.permission.WRITE_EXTERNAL_STORAGE";
            case 6:
                return Build.VERSION.SDK_INT >= 33 ? "android.permission.POST_NOTIFICATIONS" : BuildConfig.FLAVOR;
            default:
                return BuildConfig.FLAVOR;
        }
    }
}
