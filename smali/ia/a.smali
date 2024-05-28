.class public Lia/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static j:Lia/a;


# instance fields
.field private a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/roblox/universalapp/messagebus/Connection;",
            ">;"
        }
    .end annotation
.end field

.field private final c:I

.field private d:Z

.field private e:Ljava/util/Timer;

.field private f:Landroid/os/Vibrator;

.field private g:F

.field private h:Z

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lia/a;

    invoke-direct {v0}, Lia/a;-><init>()V

    sput-object v0, Lia/a;->j:Lia/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    iput-object v0, p0, Lia/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lia/a;->b:Ljava/util/ArrayList;

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iput v0, p0, Lia/a;->c:I

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lia/a;->d:Z

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lia/a;->e:Ljava/util/Timer;

    .line 7
    iput-object v1, p0, Lia/a;->f:Landroid/os/Vibrator;

    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lia/a;->g:F

    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lia/a;->h:Z

    .line 10
    iput v0, p0, Lia/a;->i:I

    return-void
.end method

.method static synthetic a(Lia/a;)Lcom/roblox/universalapp/messagebus/MessageBus;
    .locals 0

    iget-object p0, p0, Lia/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-object p0
.end method

.method static synthetic b(Lia/a;F)F
    .locals 0

    iput p1, p0, Lia/a;->g:F

    return p1
.end method

.method static synthetic c(Lia/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lia/a;->h:Z

    return p1
.end method

.method public static f()Lia/a;
    .locals 1

    sget-object v0, Lia/a;->j:Lia/a;

    return-object v0
.end method

.method private i(Landroid/content/Context;)Landroid/os/Vibrator;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1f
    .end annotation

    const-string v0, "vibrator_manager"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/VibratorManager;

    .line 2
    invoke-virtual {p1}, Landroid/os/VibratorManager;->getDefaultVibrator()Landroid/os/Vibrator;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public d()V
    .locals 4

    .line 1
    iget v0, p0, Lia/a;->i:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lia/a;->i:I

    if-eq v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lia/a;->e:Ljava/util/Timer;

    .line 3
    new-instance v1, Lia/a$c;

    invoke-direct {v1, p0}, Lia/a$c;-><init>(Lia/a;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget v0, p0, Lia/a;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lia/a;->i:I

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lia/a;->e:Ljava/util/Timer;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lia/a;->e:Ljava/util/Timer;

    :cond_1
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lia/a;->h:Z

    .line 6
    invoke-virtual {p0}, Lia/a;->j()V

    return-void
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lia/a;->d:Z

    return v0
.end method

.method public h(Landroid/content/Context;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lia/a;->d:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Lia/a;->c:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 3
    invoke-direct {p0, p1}, Lia/a;->i(Landroid/content/Context;)Landroid/os/Vibrator;

    move-result-object p1

    iput-object p1, p0, Lia/a;->f:Landroid/os/Vibrator;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    const-string v0, "vibrator"

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Vibrator;

    iput-object p1, p0, Lia/a;->f:Landroid/os/Vibrator;

    .line 5
    :cond_2
    :goto_0
    iget-object p1, p0, Lia/a;->f:Landroid/os/Vibrator;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lia/a;->d:Z

    .line 7
    iget-object p1, p0, Lia/a;->b:Ljava/util/ArrayList;

    iget-object v0, p0, Lia/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v1, Lia/a$a;

    invoke-direct {v1, p0}, Lia/a$a;-><init>(Lia/a;)V

    const-string v2, "HapticProtocol"

    const-string v3, "SupportsHaptics"

    invoke-virtual {v0, v2, v3, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object p1, p0, Lia/a;->b:Ljava/util/ArrayList;

    iget-object v0, p0, Lia/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v1, Lia/a$b;

    invoke-direct {v1, p0}, Lia/a$b;-><init>(Lia/a;)V

    const-string v3, "UpdateSingletonVibration"

    invoke-virtual {v0, v2, v3, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    return-void
.end method

.method public j()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lia/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lia/a;->f:Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    .line 3
    iget-boolean v0, p0, Lia/a;->h:Z

    if-nez v0, :cond_1

    return-void

    .line 4
    :cond_1
    iget v0, p0, Lia/a;->g:F

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float v0, v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    const/4 v1, 0x1

    new-array v2, v1, [J

    const-wide/16 v3, 0x3e8

    const/4 v5, 0x0

    aput-wide v3, v2, v5

    new-array v1, v1, [I

    aput v0, v1, v5

    .line 5
    invoke-static {v2, v1, v5}, Landroid/os/VibrationEffect;->createWaveform([J[II)Landroid/os/VibrationEffect;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lia/a;->f:Landroid/os/Vibrator;

    invoke-virtual {v1, v0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    return-void
.end method
