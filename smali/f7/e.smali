.class public Lf7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final g:J


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/BatteryManager;

.field private c:Landroid/content/BroadcastReceiver;

.field private d:J

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private f:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x1388

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x7530

    :goto_0
    sput-wide v0, Lf7/e;->g:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lf7/e;->d:J

    .line 3
    sget-object v0, Lf7/d;->a:Lf7/d;

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lf7/e;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    iput-object p1, p0, Lf7/e;->a:Landroid/content/Context;

    const-string v0, "batterymanager"

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/BatteryManager;

    iput-object p1, p0, Lf7/e;->b:Landroid/os/BatteryManager;

    return-void
.end method

.method public static synthetic a(Lf7/e;)V
    .locals 0

    invoke-direct {p0}, Lf7/e;->n()V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    invoke-static {p0}, Lf7/e;->l(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lf7/e;)J
    .locals 2

    iget-wide v0, p0, Lf7/e;->d:J

    return-wide v0
.end method

.method static synthetic d(Lf7/e;J)J
    .locals 0

    iput-wide p1, p0, Lf7/e;->d:J

    return-wide p1
.end method

.method static synthetic e()J
    .locals 2

    sget-wide v0, Lf7/e;->g:J

    return-wide v0
.end method

.method static synthetic f(Lf7/e;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, Lf7/e;->o(Landroid/content/Intent;)V

    return-void
.end method

.method private static g(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private h(I)Ljava/lang/Integer;
    .locals 4

    .line 1
    iget-object v0, p0, Lf7/e;->b:Landroid/os/BatteryManager;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/os/BatteryManager;->getLongProperty(I)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    long-to-int p1, v0

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private static i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-eq p0, v0, :cond_0

    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private j(I)Ljava/lang/Long;
    .locals 4

    .line 1
    iget-object v0, p0, Lf7/e;->b:Landroid/os/BatteryManager;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/os/BatteryManager;->getLongProperty(I)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private k(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const-string p1, "BATTERY_STATUS_UNKNOWN"

    return-object p1

    :cond_0
    const-string p1, "BATTERY_STATUS_FULL"

    return-object p1

    :cond_1
    const-string p1, "BATTERY_STATUS_NOT_CHARGING"

    return-object p1

    :cond_2
    const-string p1, "BATTERY_STATUS_DISCHARGING"

    return-object p1

    :cond_3
    const-string p1, "BATTERY_STATUS_CHARGING"

    return-object p1
.end method

.method private static synthetic l(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BatteryStatusObserver-"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    const/4 p0, 0x1

    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0
.end method

.method public static m(Ljava/lang/Integer;)Lcom/roblox/engine/jni/model/BatteryStatus$b;
    .locals 6

    if-nez p0, :cond_0

    .line 1
    sget-object p0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    return-object p0

    .line 2
    :cond_0
    invoke-static {}, Lcom/roblox/engine/jni/model/BatteryStatus$b;->values()[Lcom/roblox/engine/jni/model/BatteryStatus$b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 3
    iget v4, v3, Lcom/roblox/engine/jni/model/BatteryStatus$b;->androidValue:I

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v4, v5, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_2
    sget-object p0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    return-object p0
.end method

.method private n()V
    .locals 6

    .line 1
    iget-object v0, p0, Lf7/e;->a:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v1, Lcom/roblox/engine/jni/model/BatteryStatus;

    invoke-direct {v1}, Lcom/roblox/engine/jni/model/BatteryStatus;-><init>()V

    const/4 v2, 0x1

    .line 3
    invoke-direct {p0, v2}, Lf7/e;->h(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->chargeCounter:Ljava/lang/Integer;

    const/4 v2, 0x2

    .line 4
    invoke-direct {p0, v2}, Lf7/e;->h(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    const v3, 0xa410

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-ge v2, v3, :cond_1

    .line 6
    iget-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    :cond_1
    const/4 v2, 0x3

    .line 7
    invoke-direct {p0, v2}, Lf7/e;->h(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    if-eqz v2, :cond_2

    .line 8
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-ge v2, v3, :cond_2

    .line 9
    iget-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    :cond_2
    const/4 v2, 0x5

    .line 10
    invoke-direct {p0, v2}, Lf7/e;->j(I)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->energyCounter:Ljava/lang/Long;

    const-string v2, "status"

    .line 11
    invoke-static {v0, v2}, Lf7/e;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lcom/roblox/engine/jni/model/BatteryStatus$c;->b(Ljava/lang/Integer;)Lcom/roblox/engine/jni/model/BatteryStatus$c;

    move-result-object v2

    .line 12
    iget v3, v2, Lcom/roblox/engine/jni/model/BatteryStatus$c;->robloxValue:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->status:Ljava/lang/Integer;

    const-string v3, "plugged"

    .line 13
    invoke-static {v0, v3}, Lf7/e;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lf7/e;->m(Ljava/lang/Integer;)Lcom/roblox/engine/jni/model/BatteryStatus$b;

    move-result-object v3

    .line 14
    iget v4, v3, Lcom/roblox/engine/jni/model/BatteryStatus$b;->robloxValue:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->plugged:Ljava/lang/Integer;

    .line 15
    sget-object v4, Lcom/roblox/engine/jni/model/BatteryStatus$b;->NOT_PLUGGED:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    if-ne v3, v4, :cond_3

    .line 16
    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lez v4, :cond_4

    .line 17
    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    neg-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    .line 18
    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    .line 19
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    neg-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    goto :goto_0

    .line 20
    :cond_3
    sget-object v4, Lcom/roblox/engine/jni/model/BatteryStatus$b;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    if-eq v3, v4, :cond_4

    .line 21
    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-gez v4, :cond_4

    .line 22
    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    neg-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    .line 23
    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    .line 24
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    neg-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    :cond_4
    :goto_0
    const-string v4, "level"

    .line 25
    invoke-static {v0, v4}, Lf7/e;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "scale"

    .line 26
    invoke-static {v0, v5}, Lf7/e;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v4, :cond_5

    if-eqz v5, :cond_5

    .line 27
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    mul-int/lit8 v4, v4, 0x64

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    div-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->batteryPercentage:Ljava/lang/Integer;

    .line 28
    :cond_5
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1c

    if-lt v4, v5, :cond_6

    const-string v4, "battery_low"

    .line 29
    invoke-static {v0, v4}, Lf7/e;->g(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->batteryLow:Ljava/lang/Boolean;

    :cond_6
    const-string v4, "voltage"

    .line 30
    invoke-static {v0, v4}, Lf7/e;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->voltage:Ljava/lang/Integer;

    const-string v4, "temperature"

    .line 31
    invoke-static {v0, v4}, Lf7/e;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 32
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x41200000    # 10.0f

    div-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->temperature:Ljava/lang/Float;

    :cond_7
    const-string v4, "technology"

    .line 33
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->technology:Ljava/lang/String;

    const-string v4, "health"

    .line 34
    invoke-static {v0, v4}, Lf7/e;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lcom/roblox/engine/jni/model/BatteryStatus$a;->b(Ljava/lang/Integer;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->health:Ljava/lang/Integer;

    const-string v4, "present"

    .line 35
    invoke-static {v0, v4}, Lf7/e;->g(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->present:Ljava/lang/Boolean;

    .line 36
    iget-object v0, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    if-eqz v0, :cond_8

    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->voltage:Ljava/lang/Integer;

    if-eqz v4, :cond_8

    .line 37
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v0, v4

    iget-object v5, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->voltage:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v4

    mul-float v0, v0, v5

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->power:Ljava/lang/Integer;

    .line 38
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "perfdata battery "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "uAmps "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->power:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "mW"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "rbx.perfdata"

    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    invoke-static {v1}, Lcom/roblox/engine/jni/NativeGLInterface;->reportBatteryStatus(Lcom/roblox/engine/jni/model/BatteryStatus;)V

    return-void
.end method

.method private o(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "level"

    const/4 v1, -0x1

    .line 1
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "scale"

    .line 2
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    int-to-float v0, v0

    int-to-float v2, v2

    div-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float v0, v0, v2

    float-to-int v0, v0

    const-string v2, "status"

    .line 3
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batteryStatus: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lf7/e;->k(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " batteryLevel: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BatteryStatusObserver"

    invoke-static {v2, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-static {v0, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->reportBatteryStateChanged(II)V

    return-void
.end method


# virtual methods
.method public p()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lf7/e;->r()V

    const-string v0, "BatteryStatusObserver"

    const-string v1, "startObserving"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->T()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lf7/e;->q()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lf7/e;->e:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lf7/c;

    invoke-direct {v2, p0}, Lf7/c;-><init>(Lf7/e;)V

    const-wide/16 v3, 0x0

    sget-wide v5, Lf7/e;->g:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lf7/e;->f:Ljava/util/concurrent/ScheduledFuture;

    :goto_0
    return-void
.end method

.method public q()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lf7/e;->r()V

    const-string v0, "BatteryStatusObserver"

    const-string v1, "startObserving"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Lf7/e$a;

    invoke-direct {v0, p0}, Lf7/e$a;-><init>(Lf7/e;)V

    iput-object v0, p0, Lf7/e;->c:Landroid/content/BroadcastReceiver;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lf7/e;->a:Landroid/content/Context;

    iget-object v2, p0, Lf7/e;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-direct {p0, v0}, Lf7/e;->o(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public r()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf7/e;->c:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "BatteryStatusObserver"

    const-string v2, "stopObserving"

    .line 2
    invoke-static {v0, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Lf7/e;->a:Landroid/content/Context;

    iget-object v2, p0, Lf7/e;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 4
    iput-object v1, p0, Lf7/e;->c:Landroid/content/BroadcastReceiver;

    .line 5
    :cond_0
    iget-object v0, p0, Lf7/e;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 7
    iput-object v1, p0, Lf7/e;->f:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    return-void
.end method
