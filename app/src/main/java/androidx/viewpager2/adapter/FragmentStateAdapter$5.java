package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0843j;
import androidx.lifecycle.InterfaceC0845l;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements InterfaceC0843j {

    /* renamed from: n */
    final /* synthetic */ Handler f5114n;

    /* renamed from: o */
    final /* synthetic */ Runnable f5115o;

    @Override // androidx.lifecycle.InterfaceC0843j
    /* renamed from: e */
    public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
        if (bVar == AbstractC0839f.b.ON_DESTROY) {
            this.f5114n.removeCallbacks(this.f5115o);
            interfaceC0845l.mo583f().mo4891c(this);
        }
    }
}
