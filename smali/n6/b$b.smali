.class public Ln6/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Lm1/a;


# direct methods
.method public constructor <init>(Lm1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln6/b$b;->a:Lm1/a;

    return-void
.end method

.method private static a(Z)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    const-string p0, "Quest-Backtrace-ANRException-Sent"

    goto :goto_0

    :cond_0
    const-string p0, "Quest-Backtrace-ANRException-NotSent"

    :goto_0
    return-object p0

    :cond_1
    if-eqz p0, :cond_2

    const-string p0, "Android-Backtrace-ANRException-Sent"

    goto :goto_1

    :cond_2
    const-string p0, "Android-Backtrace-ANRException-NotSent"

    :goto_1
    return-object p0
.end method

.method private b()Z
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double v0, v0, v2

    double-to-int v0, v0

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->d0()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c(Z)V
    .locals 2

    .line 1
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v0

    invoke-static {p1}, Ln6/b$b;->a(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx7/e;->A(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roblox/client/p0;->c0()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {p1}, Ln6/b$b;->a(Z)Ljava/lang/String;

    move-result-object p1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-Channel-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/roblox/client/p0;->T()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onEvent(Lbacktraceio/library/watchdog/BacktraceWatchdogTimeoutException;)V
    .locals 2

    const-string v0, "rbx.backtrace"

    const-string v1, "OnApplicationNotRespondingEvent()"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Ln6/b$b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, v0}, Ln6/b$b;->c(Z)V

    .line 4
    iget-object v0, p0, Ln6/b$b;->a:Lm1/a;

    invoke-virtual {v0, p1}, Lm1/a;->c(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    invoke-direct {p0, p1}, Ln6/b$b;->c(Z)V

    :goto_0
    return-void
.end method
