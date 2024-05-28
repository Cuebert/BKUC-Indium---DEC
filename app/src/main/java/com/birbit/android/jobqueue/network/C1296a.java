package com.birbit.android.jobqueue.network;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PowerManager;
import com.birbit.android.jobqueue.network.NetworkEventProvider;

/* renamed from: com.birbit.android.jobqueue.network.a */
/* loaded from: classes.dex */
public class C1296a implements NetworkUtil, NetworkEventProvider {

    /* renamed from: a */
    private NetworkEventProvider.Listener f5844a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.birbit.android.jobqueue.network.a$a */
    /* loaded from: classes.dex */
    public class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        final /* synthetic */ Context f5845a;

        a(Context context) {
            this.f5845a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C1296a.this.m7145a(this.f5845a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.birbit.android.jobqueue.network.a$b */
    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C1296a.this.m7145a(context);
        }
    }

    public C1296a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            m7144d(context);
        }
        m7143c(context);
    }

    @TargetApi(23)
    /* renamed from: b */
    private static boolean m7142b(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager.isDeviceIdleMode() && !powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
    }

    @TargetApi(23)
    /* renamed from: c */
    private void m7143c(Context context) {
        ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(13).build(), new a(context));
    }

    @TargetApi(23)
    /* renamed from: d */
    private void m7144d(Context context) {
        context.getApplicationContext().registerReceiver(new b(), new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
    }

    /* renamed from: a */
    void m7145a(Context context) {
        NetworkEventProvider.Listener listener = this.f5844a;
        if (listener == null) {
            return;
        }
        listener.onNetworkChange(getNetworkStatus(context));
    }

    @Override // com.birbit.android.jobqueue.network.NetworkUtil
    public int getNetworkStatus(Context context) {
        NetworkInfo activeNetworkInfo;
        if (m7142b(context) || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return 1;
        }
        return (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9) ? 3 : 2;
    }

    @Override // com.birbit.android.jobqueue.network.NetworkEventProvider
    public void setListener(NetworkEventProvider.Listener listener) {
        this.f5844a = listener;
    }
}
