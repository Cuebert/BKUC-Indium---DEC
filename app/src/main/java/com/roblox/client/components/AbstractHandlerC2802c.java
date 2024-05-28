package com.roblox.client.components;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Vector;
import p035c9.C1151k;

/* renamed from: com.roblox.client.components.c */
/* loaded from: classes.dex */
public abstract class AbstractHandlerC2802c extends Handler {

    /* renamed from: a */
    private String f10960a;

    /* renamed from: b */
    private int f10961b = 0;

    /* renamed from: c */
    private Vector<a> f10962c = new Vector<>();

    /* renamed from: com.roblox.client.components.c$a */
    /* loaded from: classes.dex */
    public interface a {
        void start();
    }

    public AbstractHandlerC2802c(String str) {
        this.f10960a = str;
    }

    /* renamed from: a */
    public void m12415a(a aVar) {
        this.f10962c.add(aVar);
        this.f10961b++;
    }

    /* renamed from: b */
    public abstract void mo12416b();

    /* renamed from: c */
    protected void m12417c() {
        Iterator<a> it = this.f10962c.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
    }

    /* renamed from: d */
    public void m12418d(String str) {
        sendMessage(obtainMessage(200, str));
    }

    /* renamed from: e */
    public void m12419e() {
        sendMessage(obtainMessage(100));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 100 && this.f10961b > 0) {
            C1151k.m6714h("rbx.execute", "MTCH.handleMessage() group:" + this.f10960a + " START size:" + this.f10961b);
            m12417c();
        } else if (i10 == 200) {
            this.f10961b--;
            C1151k.m6714h("rbx.execute", "MTCH.handleMessage() task:" + message.obj + " COMPLETE size:" + this.f10961b);
        }
        if (this.f10961b <= 0) {
            C1151k.m6714h("rbx.execute", "MTCH.handleMessage() group:" + this.f10960a + " complete");
            mo12416b();
        }
    }
}
