package com.roblox.engine.jni;

import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class NativeGLJavaInterface {
    private static OnAppBridgeNotificationListener sAppBridgeNotificationListener;
    private static WeakReference<OnAppShellReloadNeededListener> sAppShellReloadNeededListener;
    private static EngineExitJavaCallback2 sExitImplementation;
    private static IExtendedAnalyticsInterface sExtendedAnalyticsImplementation;
    private static EngineJavaCallback2 sImplementation = new EngineJavaCallback2();

    /* loaded from: classes.dex */
    public interface IExtendedAnalyticsInterface {
        /* renamed from: a */
        void m13266a(byte[] bArr, int i10);
    }

    /* loaded from: classes.dex */
    public interface OnAppShellReloadNeededListener {
        /* renamed from: J */
        void mo12150J();
    }

    public static void exitGameWithError(int i10) {
        sImplementation.mo13258a(i10);
    }

    public static void gameDidLeave() {
        EngineExitJavaCallback2 engineExitJavaCallback2 = sExitImplementation;
        if (engineExitJavaCallback2 != null) {
            engineExitJavaCallback2.mo13257a();
        }
    }

    public static void gameLoadedCallback(long j10) {
        sImplementation.mo12557b(j10);
    }

    public static EngineJavaCallback2 getImplementation() {
        return sImplementation;
    }

    public static void hideKeyboard() {
        sImplementation.mo13260d();
    }

    public static void listenToMotionEvents(String str) {
        sImplementation.mo12558e(str);
    }

    public static void onAppBridgeNotification(String str, String str2) {
        OnAppBridgeNotificationListener onAppBridgeNotificationListener = sAppBridgeNotificationListener;
        if (onAppBridgeNotificationListener != null) {
            onAppBridgeNotificationListener.mo12606a(str, str2);
        }
    }

    public static void onAppShellReloadNeeded() {
        OnAppShellReloadNeededListener onAppShellReloadNeededListener = sAppShellReloadNeededListener.get();
        if (onAppShellReloadNeededListener != null) {
            onAppShellReloadNeededListener.mo12150J();
        }
    }

    public static void onDataModelNotificationCallback(String str, String str2) {
        sImplementation.mo12559f(str, str2);
    }

    static void onExtendedAnalyticsRecvCallback(byte[] bArr, int i10) {
        IExtendedAnalyticsInterface iExtendedAnalyticsInterface = sExtendedAnalyticsImplementation;
        if (iExtendedAnalyticsInterface != null) {
            iExtendedAnalyticsInterface.m13266a(bArr, i10);
        }
    }

    public static void onLuaTextBoxChangedCallback(String str) {
        sImplementation.mo13261g(str);
    }

    public static void onLuaTextBoxPropertyChangedCallback() {
        sImplementation.mo13262h();
    }

    public static void onVrSessionStateUpdate(int i10) {
        sImplementation.mo13259c(i10);
    }

    public static void openNativeOverlay(String str, String str2) {
        sImplementation.mo12560i(str, str2);
    }

    public static void promptNativePurchase(long j10, String str, String str2) {
        sImplementation.mo12562k(j10, str, str2);
    }

    public static void promptNativePurchaseWithPayload(long j10, String str, String str2) {
        sImplementation.mo12563l(j10, str, str2);
    }

    public static void replaceImplementation(Class<? extends EngineJavaCallback2> cls, EngineJavaCallback2 engineJavaCallback2) {
        if (sImplementation.getClass() == cls) {
            setImplementation(engineJavaCallback2);
        }
    }

    public static void saveImageToAlbum(String str) {
        sImplementation.mo13263m(str);
    }

    public static void screenOrientationChanged(int i10) {
        sImplementation.mo13264n(i10);
    }

    public static void setAppBridgeNotificationListener(OnAppBridgeNotificationListener onAppBridgeNotificationListener) {
        sAppBridgeNotificationListener = onAppBridgeNotificationListener;
    }

    public static void setAppShellReloadNeededListener(OnAppShellReloadNeededListener onAppShellReloadNeededListener) {
        sAppShellReloadNeededListener = new WeakReference<>(onAppShellReloadNeededListener);
    }

    public static void setExitImplementation(EngineExitJavaCallback2 engineExitJavaCallback2) {
        sExitImplementation = engineExitJavaCallback2;
    }

    public static void setExtendedAnalyticsImplementation(IExtendedAnalyticsInterface iExtendedAnalyticsInterface) {
        sExtendedAnalyticsImplementation = iExtendedAnalyticsInterface;
    }

    public static void setImplementation(EngineJavaCallback2 engineJavaCallback2) {
        if (engineJavaCallback2 != null) {
            sImplementation = engineJavaCallback2;
        }
    }

    public static void showKeyboard(long j10, boolean z10, byte[] bArr, NativeTextBoxInfo nativeTextBoxInfo) {
        sImplementation.mo13265o(j10, z10, bArr, nativeTextBoxInfo);
    }

    public static void promptNativePurchase(long j10, String str) {
        sImplementation.mo12561j(j10, str);
    }
}
