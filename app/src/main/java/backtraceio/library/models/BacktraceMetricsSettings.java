package backtraceio.library.models;

import backtraceio.library.services.BacktraceMetrics;
import p159m1.C3930b;

/* loaded from: classes.dex */
public class BacktraceMetricsSettings {
    private final String baseUrl;
    private final int timeBetweenRetriesMillis;
    private final long timeIntervalMillis;
    private final String token;
    private final String universe;

    public BacktraceMetricsSettings(C3930b c3930b) {
        this(c3930b, BacktraceMetrics.defaultBaseUrl, BacktraceMetrics.defaultTimeIntervalMs, 10000);
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getSubmissionUrl(String str) {
        return getBaseUrl() + "/" + str + "/submit?token=" + getToken() + "&universe=" + getUniverseName();
    }

    public int getTimeBetweenRetriesMillis() {
        return this.timeBetweenRetriesMillis;
    }

    public long getTimeIntervalMillis() {
        return this.timeIntervalMillis;
    }

    public String getToken() {
        return this.token;
    }

    public String getUniverseName() {
        return this.universe;
    }

    public BacktraceMetricsSettings(C3930b c3930b, String str) {
        this(c3930b, str, BacktraceMetrics.defaultTimeIntervalMs, 10000);
    }

    public BacktraceMetricsSettings(C3930b c3930b, long j10) {
        this(c3930b, BacktraceMetrics.defaultBaseUrl, j10, 10000);
    }

    public BacktraceMetricsSettings(C3930b c3930b, String str, long j10) {
        this(c3930b, str, j10, 10000);
    }

    public BacktraceMetricsSettings(C3930b c3930b, String str, long j10, int i10) {
        this.universe = c3930b.m16676g();
        this.token = c3930b.m16674e();
        this.baseUrl = str;
        this.timeIntervalMillis = j10;
        this.timeBetweenRetriesMillis = i10;
    }
}
