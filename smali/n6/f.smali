.class public Ln6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Ln6/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/roblox/engine/jni/NativeReportingInterface;->addStopwatchCheckpoint(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static b()V
    .locals 1

    .line 1
    sget-boolean v0, Ln6/f;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Ln6/f;->a:Z

    .line 3
    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->initStopwatch()V

    :cond_0
    return-void
.end method

.method private static c()Z
    .locals 1

    sget-boolean v0, Ln6/f;->a:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Ln6/f;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d()V
    .locals 1

    .line 1
    invoke-static {}, Ln6/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Ln6/f;->b:Z

    .line 3
    new-instance v0, Ln6/f$a;

    invoke-direct {v0}, Ln6/f$a;-><init>()V

    invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
