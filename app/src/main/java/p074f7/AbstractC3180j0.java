package p074f7;

import com.roblox.client.components.AbstractRunnableC2800a;
import p033c7.C1134c;

/* renamed from: f7.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC3180j0 extends AbstractRunnableC2800a<Integer> {
    public AbstractC3180j0() {
        super("rbx.game.orientation");
    }

    /* renamed from: j */
    public static boolean m13912j() {
        return true;
    }

    @Override // com.roblox.client.components.AbstractRunnableC2800a
    /* renamed from: f */
    protected long mo12408f() {
        return C1134c.m6537a().mo6653v();
    }

    @Override // com.roblox.client.components.AbstractRunnableC2800a
    /* renamed from: g */
    protected int mo12409g() {
        return 3;
    }

    /* renamed from: h */
    public abstract void mo13913h(int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.components.AbstractRunnableC2800a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo12406a(Integer num) {
        mo13913h(num.intValue());
    }
}
