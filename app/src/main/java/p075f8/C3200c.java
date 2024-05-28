package p075f8;

import com.android.billingclient.api.Purchase;
import p114i7.InterfaceC3542c;

/* renamed from: f8.c */
/* loaded from: classes.dex */
public class C3200c implements InterfaceC3542c {
    private boolean isInApp;
    private boolean isRetry;
    private String orderId;
    private String packageName;
    private String productId;
    private String token;

    public C3200c(Purchase purchase, boolean z10, boolean z11) {
        this.packageName = purchase.m6782d();
        this.productId = C3198a.m14059k(purchase);
        this.orderId = purchase.m6780b();
        this.isRetry = z10;
        this.token = purchase.m6785g();
        this.isInApp = z11;
    }
}
