.class public Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sImplementation:Lj9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj9/b;

    invoke-direct {v0}, Lj9/b;-><init>()V

    sput-object v0, Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;->sImplementation:Lj9/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAppVersion()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;->sImplementation:Lj9/a;

    invoke-interface {v0}, Lj9/a;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getFilesDir()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;->sImplementation:Lj9/a;

    invoke-interface {v0}, Lj9/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getLastLoggedInUser()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;->sImplementation:Lj9/a;

    invoke-interface {v0}, Lj9/a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getLastLoggedInUserId()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;->sImplementation:Lj9/a;

    invoke-interface {v0}, Lj9/a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sendSessionReport(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;->sImplementation:Lj9/a;

    invoke-interface {v0, p0, p1}, Lj9/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static setEventTrackingGoogleAnalytics(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6

    sget-object v0, Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;->sImplementation:Lj9/a;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-interface/range {v0 .. v5}, Lj9/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static setImplementation(Lj9/a;)V
    .locals 0

    if-eqz p0, :cond_0

    sput-object p0, Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;->sImplementation:Lj9/a;

    :cond_0
    return-void
.end method
