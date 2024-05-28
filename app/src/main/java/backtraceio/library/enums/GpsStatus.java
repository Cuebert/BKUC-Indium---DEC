package backtraceio.library.enums;

/* loaded from: classes.dex */
public enum GpsStatus {
    DISABLED("Disabled"),
    ENABLED("Enabled");

    private final String text;

    GpsStatus(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
