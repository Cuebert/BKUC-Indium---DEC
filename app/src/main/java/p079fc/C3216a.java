package p079fc;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.Arrays;
import java.util.List;

/* renamed from: fc.a */
/* loaded from: classes.dex */
public final class C3216a {
    /* renamed from: a */
    public static void m14295a(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    /* renamed from: b */
    static String m14296b(int i10) {
        switch (i10) {
            case 0:
                return "TYPE_UNKNOWN";
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            case 23:
                return "TYPE_HEARING_AID";
            case 24:
                return "TYPE_BUILTIN_SPEAKER_SAFE";
            case 25:
                return "TYPE_REMOTE_SUBMIX";
            case 26:
                return "TYPE_BLE_HEADSET";
            case 27:
                return "TYPE_BLE_SPEAKER";
            case 28:
            default:
                return "TYPE_INVALID";
            case 29:
                return "TYPE_HDMI_EARC";
        }
    }

    /* renamed from: c */
    public static String m14297c(int i10) {
        if (i10 == -1) {
            return "SCO_AUDIO_STATE_ERROR:";
        }
        if (i10 == 0) {
            return "SCO_AUDIO_STATE_DISCONNECTED";
        }
        if (i10 == 1) {
            return "SCO_AUDIO_STATE_CONNECTED";
        }
        if (i10 == 2) {
            return "SCO_AUDIO_STATE_CONNECTING";
        }
        return "UNKNOWN (" + i10 + ")";
    }

    /* renamed from: d */
    public static String m14298d(int i10) {
        switch (i10) {
            case 10:
                return "STATE_AUDIO_DISCONNECTED";
            case 11:
                return "STATE_AUDIO_CONNECTING";
            case 12:
                return "STATE_AUDIO_CONNECTED";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: e */
    public static String m14299e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
    }

    /* renamed from: f */
    public static void m14300f() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    /* renamed from: g */
    public static String m14301g(int i10) {
        return i10 != -3 ? i10 != -2 ? i10 != -1 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "AUDIOFOCUS_INVALID" : "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE" : "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK" : "AUDIOFOCUS_GAIN_TRANSIENT" : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
    }

    /* renamed from: h */
    public static String m14302h(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "UNKNOWN" : "AUDIOFOCUS_REQUEST_DELAYED" : "AUDIOFOCUS_REQUEST_GRANTED" : "AUDIOFOCUS_REQUEST_FAILED";
    }

    /* renamed from: i */
    public static BluetoothDevice m14303i(String str, Context context, BluetoothHeadset bluetoothHeadset) {
        if (Build.VERSION.SDK_INT >= 31 && !m14308n(context, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d(str, "getAudioConnectedBluetoothDevice: BLUETOOTH_CONNECT not granted!");
            return null;
        }
        BluetoothDevice m14304j = m14304j(str, context, bluetoothHeadset);
        if (m14304j == null || !bluetoothHeadset.isAudioConnected(m14304j)) {
            return null;
        }
        return m14304j;
    }

    /* renamed from: j */
    public static BluetoothDevice m14304j(String str, Context context, BluetoothHeadset bluetoothHeadset) {
        if (Build.VERSION.SDK_INT >= 31 && !m14308n(context, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d(str, "getConnectedBluetoothDevice: BLUETOOTH_CONNECT not granted!");
            return null;
        }
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        if (connectedDevices.isEmpty()) {
            return null;
        }
        return connectedDevices.get(0);
    }

    /* renamed from: k */
    public static String m14305k() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    /* renamed from: l */
    public static boolean m14306l(AudioManager audioManager, boolean z10) {
        return m14307m(audioManager.getDevices(2), z10);
    }

    /* renamed from: m */
    public static boolean m14307m(AudioDeviceInfo[] audioDeviceInfoArr, boolean z10) {
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            boolean z11 = audioDeviceInfo.getType() == 7;
            boolean z12 = audioDeviceInfo.getType() == 8;
            if (z10 && z11) {
                return true;
            }
            if (!z10 && (z12 || z11)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m14308n(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    /* renamed from: o */
    public static boolean m14309o(String str, Context context, BluetoothHeadset bluetoothHeadset, BluetoothDevice bluetoothDevice) {
        if (bluetoothHeadset == null || bluetoothDevice == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31 && !m14308n(context, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d(str, "isBluetoothAudioConnected: BLUETOOTH_CONNECT not granted!");
            return false;
        }
        return bluetoothHeadset.isAudioConnected(bluetoothDevice);
    }

    /* renamed from: p */
    public static void m14310p(String str, String str2, AudioDeviceInfo audioDeviceInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("productName=");
        sb2.append(audioDeviceInfo.getProductName());
        sb2.append(m14296b(audioDeviceInfo.getType()));
        sb2.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
        if (audioDeviceInfo.getChannelCounts().length > 0) {
            sb2.append("channels=");
            sb2.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
            sb2.append(", ");
        }
        if (audioDeviceInfo.getEncodings().length > 0) {
            sb2.append("encodings=");
            sb2.append(Arrays.toString(audioDeviceInfo.getEncodings()));
            sb2.append(", ");
        }
        if (audioDeviceInfo.getSampleRates().length > 0) {
            sb2.append("sample rates=");
            sb2.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
            sb2.append(", ");
        }
        sb2.append("id=");
        sb2.append(audioDeviceInfo.getId());
        Log.d(str, sb2.toString());
    }

    /* renamed from: q */
    public static void m14311q(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        Log.d(str, "Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            m14310p(str, "  ", audioDeviceInfo);
        }
    }

    /* renamed from: r */
    public static void m14312r(String str, AudioManager audioManager) {
        Log.d(str, "audioManager: mode=" + m14316v(audioManager.getMode()) + ",isBluetoothScoAvailableOffCall=" + audioManager.isBluetoothScoAvailableOffCall() + ",isBluetoothScoOn=" + audioManager.isBluetoothScoOn());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
            if (communicationDevice == null) {
                Log.d(str, "No audio device available");
            } else {
                m14310p(str, "communicationDevice: ", communicationDevice);
            }
        }
        if (i10 < 23) {
            Log.d(str, "isWiredHeadsetOn=" + audioManager.isWiredHeadsetOn());
            return;
        }
        m14311q(str, audioManager);
    }

    /* renamed from: s */
    public static void m14313s(String str, Context context, BluetoothHeadset bluetoothHeadset) {
        if (Build.VERSION.SDK_INT >= 31 && !m14308n(context, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d(str, "logBluetoothAdapterInfo: BLUETOOTH_CONNECT not granted!");
            return;
        }
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        if (connectedDevices.isEmpty()) {
            Log.d(str, "No connected bluetooth headset");
            return;
        }
        BluetoothDevice bluetoothDevice = connectedDevices.get(0);
        Log.d(str, "Connected bluetooth headset: name=" + bluetoothDevice.getName() + ", state=" + m14299e(bluetoothHeadset.getConnectionState(bluetoothDevice)) + ", SCO audio=" + bluetoothHeadset.isAudioConnected(bluetoothDevice));
    }

    /* renamed from: t */
    public static void m14314t(String str, Context context, BluetoothHeadset bluetoothHeadset, BluetoothDevice bluetoothDevice) {
        if (Build.VERSION.SDK_INT >= 31 && !m14308n(context, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d(str, "logBluetoothAdapterInfo: BLUETOOTH_CONNECT not granted!");
            return;
        }
        Log.d(str, "Connected bluetooth headset: name=" + bluetoothDevice.getName() + ", state=" + m14299e(bluetoothHeadset.getConnectionState(bluetoothDevice)) + ", SCO audio=" + bluetoothHeadset.isAudioConnected(bluetoothDevice));
    }

    /* renamed from: u */
    public static void m14315u(String str) {
        Log.d(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    /* renamed from: v */
    static String m14316v(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }
}
