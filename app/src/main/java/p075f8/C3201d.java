package p075f8;

import android.content.Context;
import com.roblox.client.C2748c0;
import p062e8.AbstractC3097h;
import p062e8.InterfaceC3092c;

/* renamed from: f8.d */
/* loaded from: classes.dex */
public class C3201d extends AbstractC3097h implements InterfaceC3092c {

    /* renamed from: n */
    public final b f13347n;

    /* renamed from: o */
    public final String f13348o;

    /* renamed from: f8.d$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13349a;

        static {
            int[] iArr = new int[b.values().length];
            f13349a = iArr;
            try {
                iArr[b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13349a[b.ALREADY_ACKNOWLEDGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13349a[b.IS_EMULATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13349a[b.VALIDATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13349a[b.VALIDATION_RETRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13349a[b.VALIDATION_LIMIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13349a[b.VALIDATION_LIMIT_UNDER_13.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13349a[b.REQUEST_BALANCE_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13349a[b.USER_CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13349a[b.FAILED_PRODUCT_NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13349a[b.ACKNOWLEDGE_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13349a[b.IAB_LAUNCH_PURCHASE_FLOW_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13349a[b.IAB_HANDLE_ACTIVITY_RESULT_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13349a[b.IAB_QUERY_INVENTORY_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13349a[b.IAB_CONSUME_ERROR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13349a[b.RECEIPT_VERIFICATION_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13349a[b.RECEIPT_EMPTY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13349a[b.EMPTY_USERNAME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f13349a[b.FAILED_PURCHASE_RESPONSE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13349a[b.FAILED_PURCHASE_UPDATE_RESPONSE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f13349a[b.UNKNOWN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f13349a[b.FAILED_NOT_ALLOWED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    /* renamed from: f8.d$b */
    /* loaded from: classes.dex */
    public enum b {
        SUCCESS,
        IS_EMULATOR,
        VALIDATION_ERROR,
        VALIDATION_RETRY,
        VALIDATION_LIMIT,
        VALIDATION_LIMIT_UNDER_13,
        REQUEST_BALANCE_ERROR,
        ACKNOWLEDGE_ERROR,
        CONSUME_ERROR,
        USER_CANCELLED,
        ALREADY_ACKNOWLEDGED,
        IAB_LAUNCH_PURCHASE_FLOW_ERROR,
        IAB_HANDLE_ACTIVITY_RESULT_ERROR,
        IAB_QUERY_INVENTORY_ERROR,
        IAB_CONSUME_ERROR,
        RECEIPT_VERIFICATION_ERROR,
        RECEIPT_EMPTY,
        EMPTY_USERNAME,
        FAILED_PURCHASE_RESPONSE,
        FAILED_PURCHASE_UPDATE_RESPONSE,
        FAILED_NOT_ALLOWED,
        FAILED_PRODUCT_NOT_FOUND,
        UNKNOWN
    }

    public C3201d(b bVar, String str) {
        this.f13347n = bVar;
        this.f13348o = str;
    }

    @Override // p062e8.AbstractC3097h
    /* renamed from: b */
    public CharSequence mo13618b(Context context) {
        context.getString(C2748c0.f10722r3);
        switch (a.f13349a[this.f13347n.ordinal()]) {
            case 1:
            case 2:
                return context.getText(C2748c0.f10723r4);
            case 3:
                return context.getString(C2748c0.f10705o4);
            case 4:
                return context.getString(C2748c0.f10711p4);
            case 5:
                return context.getText(C2748c0.f10693m4);
            case 6:
                return context.getString(C2748c0.f10747v4);
            case 7:
                return context.getText(C2748c0.f10753w4);
            case 8:
                return context.getString(C2748c0.f10711p4);
            case 9:
                return context.getString(C2748c0.f10699n4);
            default:
                return context.getString(C2748c0.f10711p4);
        }
    }

    @Override // p062e8.AbstractC3097h
    /* renamed from: c */
    public boolean mo13619c() {
        b bVar = this.f13347n;
        return bVar == b.SUCCESS || bVar == b.ALREADY_ACKNOWLEDGED;
    }

    @Override // p062e8.AbstractC3097h
    /* renamed from: e */
    public boolean mo13620e() {
        int i10 = a.f13349a[this.f13347n.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 5 || i10 == 7) ? false : true;
    }

    @Override // p062e8.InterfaceC3092c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String mo13609a() {
        return this.f13348o;
    }
}
