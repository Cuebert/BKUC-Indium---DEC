.class public Lf9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Lf9/c$a;
.implements Lf9/d$a;
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf9/b$g;,
        Lf9/b$f;,
        Lf9/b$h;,
        Lf9/b$e;
    }
.end annotation


# instance fields
.field private A:F

.field private B:F

.field private final C:[F

.field private final D:[F

.field private final E:[F

.field private final F:[F

.field private final G:[F

.field private final H:Landroid/util/SparseArray;

.field private final I:Landroid/os/Handler;

.field private J:Landroid/hardware/input/InputManager;

.field private final K:Landroid/app/Activity;

.field private L:Lf9/b$e;

.field private M:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private N:Z

.field private final O:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private n:Landroid/view/SurfaceView;

.field private o:Z

.field private p:Landroid/view/GestureDetector;

.field private q:Lf9/b$f;

.field private r:Lf9/c;

.field private s:Lf9/d;

.field private t:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lf9/b$h;",
            ">;"
        }
    .end annotation
.end field

.field private u:Landroid/hardware/SensorManager;

.field private v:Landroid/hardware/Sensor;

.field private w:Landroid/hardware/Sensor;

.field private x:Landroid/view/OrientationEventListener;

.field private y:Lf9/f;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/SurfaceView;Lf9/b$e;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lf9/b;->n:Landroid/view/SurfaceView;

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Lf9/b;->o:Z

    .line 4
    iput-object v0, p0, Lf9/b;->p:Landroid/view/GestureDetector;

    .line 5
    iput-object v0, p0, Lf9/b;->q:Lf9/b$f;

    .line 6
    iput-object v0, p0, Lf9/b;->r:Lf9/c;

    .line 7
    iput-object v0, p0, Lf9/b;->s:Lf9/d;

    .line 8
    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, p0, Lf9/b;->t:Landroid/util/SparseArray;

    .line 9
    iput-object v0, p0, Lf9/b;->u:Landroid/hardware/SensorManager;

    .line 10
    iput-object v0, p0, Lf9/b;->v:Landroid/hardware/Sensor;

    .line 11
    iput-object v0, p0, Lf9/b;->w:Landroid/hardware/Sensor;

    .line 12
    iput-object v0, p0, Lf9/b;->x:Landroid/view/OrientationEventListener;

    .line 13
    iput-object v0, p0, Lf9/b;->y:Lf9/f;

    const/4 v2, 0x0

    .line 14
    iput-boolean v2, p0, Lf9/b;->z:Z

    const/4 v3, 0x0

    .line 15
    iput v3, p0, Lf9/b;->A:F

    .line 16
    iput v3, p0, Lf9/b;->B:F

    const/4 v3, 0x4

    new-array v3, v3, [F

    .line 17
    iput-object v3, p0, Lf9/b;->C:[F

    const/16 v3, 0x9

    new-array v3, v3, [F

    .line 18
    iput-object v3, p0, Lf9/b;->D:[F

    const/4 v3, 0x3

    new-array v4, v3, [F

    .line 19
    iput-object v4, p0, Lf9/b;->E:[F

    new-array v4, v3, [F

    .line 20
    iput-object v4, p0, Lf9/b;->F:[F

    new-array v4, v3, [F

    .line 21
    iput-object v4, p0, Lf9/b;->G:[F

    .line 22
    new-instance v4, Landroid/util/SparseArray;

    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    iput-object v4, p0, Lf9/b;->H:Landroid/util/SparseArray;

    .line 23
    new-instance v4, Lf9/b$g;

    invoke-direct {v4, p0}, Lf9/b$g;-><init>(Lf9/b;)V

    iput-object v4, p0, Lf9/b;->I:Landroid/os/Handler;

    .line 24
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v4, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v4, p0, Lf9/b;->M:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lf9/b;->O:Ljava/util/List;

    .line 26
    iput-object p2, p0, Lf9/b;->n:Landroid/view/SurfaceView;

    .line 27
    iput-object p1, p0, Lf9/b;->K:Landroid/app/Activity;

    .line 28
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const-string v4, "android.hardware.touchscreen"

    invoke-virtual {v2, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lf9/b;->o:Z

    .line 29
    iput-object p3, p0, Lf9/b;->L:Lf9/b$e;

    if-eqz v2, :cond_0

    .line 30
    new-instance p3, Lf9/b$f;

    invoke-direct {p3, p0, v0}, Lf9/b$f;-><init>(Lf9/b;Lf9/b$a;)V

    iput-object p3, p0, Lf9/b;->q:Lf9/b$f;

    .line 31
    new-instance p3, Landroid/view/GestureDetector;

    iget-object v0, p0, Lf9/b;->q:Lf9/b$f;

    invoke-direct {p3, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p3, p0, Lf9/b;->p:Landroid/view/GestureDetector;

    .line 32
    new-instance p3, Lf9/c;

    invoke-direct {p3, p0}, Lf9/c;-><init>(Lf9/c$a;)V

    iput-object p3, p0, Lf9/b;->r:Lf9/c;

    .line 33
    new-instance p3, Lf9/d;

    invoke-direct {p3, p0}, Lf9/d;-><init>(Lf9/d$a;)V

    iput-object p3, p0, Lf9/b;->s:Lf9/d;

    .line 34
    :cond_0
    invoke-direct {p0, p2}, Lf9/b;->s(Landroid/view/SurfaceView;)V

    .line 35
    invoke-virtual {p1}, Landroid/app/Activity;->getBaseContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "sensor"

    invoke-virtual {p2, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/SensorManager;

    iput-object p2, p0, Lf9/b;->u:Landroid/hardware/SensorManager;

    .line 36
    invoke-virtual {p1}, Landroid/app/Activity;->getBaseContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "input"

    invoke-virtual {p2, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/input/InputManager;

    iput-object p2, p0, Lf9/b;->J:Landroid/hardware/input/InputManager;

    .line 37
    iget-object p2, p0, Lf9/b;->u:Landroid/hardware/SensorManager;

    invoke-virtual {p2, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p2

    iput-object p2, p0, Lf9/b;->v:Landroid/hardware/Sensor;

    .line 38
    iget-object p2, p0, Lf9/b;->u:Landroid/hardware/SensorManager;

    const/16 p3, 0xb

    invoke-virtual {p2, p3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p2

    iput-object p2, p0, Lf9/b;->w:Landroid/hardware/Sensor;

    if-eqz p2, :cond_1

    .line 39
    invoke-static {v1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeSetGyroscopeEnabled(Z)V

    .line 40
    :cond_1
    iget-object p2, p0, Lf9/b;->v:Landroid/hardware/Sensor;

    if-eqz p2, :cond_2

    .line 41
    invoke-static {v1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeSetAccelerometerEnabled(Z)V

    .line 42
    :cond_2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p2

    invoke-interface {p2}, Lc7/e;->i()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 43
    new-instance p2, Lf9/b$a;

    invoke-direct {p2, p0, p1}, Lf9/b$a;-><init>(Lf9/b;Landroid/app/Activity;)V

    iput-object p2, p0, Lf9/b;->y:Lf9/f;

    goto :goto_0

    .line 44
    :cond_3
    new-instance p2, Lf9/b$b;

    invoke-direct {p2, p0, p1, v3}, Lf9/b$b;-><init>(Lf9/b;Landroid/content/Context;I)V

    iput-object p2, p0, Lf9/b;->x:Landroid/view/OrientationEventListener;

    .line 45
    invoke-virtual {p2}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 46
    iget-object p1, p0, Lf9/b;->x:Landroid/view/OrientationEventListener;

    invoke-virtual {p1}, Landroid/view/OrientationEventListener;->enable()V

    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic c(Lf9/b;)V
    .locals 0

    invoke-direct {p0}, Lf9/b;->v()V

    return-void
.end method

.method static synthetic d(Lf9/b;I)V
    .locals 0

    invoke-direct {p0, p1}, Lf9/b;->h(I)V

    return-void
.end method

.method static synthetic e(Lf9/b;)F
    .locals 0

    invoke-direct {p0}, Lf9/b;->i()F

    move-result p0

    return p0
.end method

.method static synthetic f(Lf9/b;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Lf9/b;->H:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static g(I[F)[F
    .locals 8

    const/4 v0, 0x3

    new-array v1, v0, [F

    const/4 v2, 0x4

    new-array v3, v2, [[I

    new-array v4, v2, [I

    .line 1
    fill-array-data v4, :array_0

    const/4 v5, 0x0

    aput-object v4, v3, v5

    new-array v4, v2, [I

    fill-array-data v4, :array_1

    const/4 v6, 0x1

    aput-object v4, v3, v6

    new-array v4, v2, [I

    fill-array-data v4, :array_2

    const/4 v7, 0x2

    aput-object v4, v3, v7

    new-array v2, v2, [I

    fill-array-data v2, :array_3

    aput-object v2, v3, v0

    .line 2
    aget-object p0, v3, p0

    .line 3
    aget v2, p0, v5

    int-to-float v2, v2

    aget v3, p0, v7

    aget v3, p1, v3

    mul-float v2, v2, v3

    aput v2, v1, v5

    .line 4
    aget v2, p0, v6

    int-to-float v2, v2

    aget p0, p0, v0

    aget p0, p1, p0

    mul-float v2, v2, p0

    aput v2, v1, v6

    .line 5
    aget p0, p1, v7

    aput p0, v1, v7

    return-object v1

    :array_0
    .array-data 4
        0x1
        -0x1
        0x0
        0x1
    .end array-data

    :array_1
    .array-data 4
        -0x1
        -0x1
        0x1
        0x0
    .end array-data

    :array_2
    .array-data 4
        -0x1
        0x1
        0x0
        0x1
    .end array-data

    :array_3
    .array-data 4
        0x1
        0x1
        0x1
        0x0
    .end array-data
.end method

.method private h(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf9/b;->H:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    if-nez v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [J

    .line 2
    iget-object v1, p0, Lf9/b;->H:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 3
    invoke-direct {p0, p1}, Lf9/b;->r(I)V

    .line 4
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadConnectEvent(I)V

    .line 5
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    const/4 p1, 0x0

    .line 6
    aput-wide v1, v0, p1

    return-void
.end method

.method private i()F
    .locals 1

    .line 1
    iget-object v0, p0, Lf9/b;->L:Lf9/b$e;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lf9/b$e;->d()F

    move-result v0

    return v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method private j(I)[Z
    .locals 3

    const/16 v0, 0xe

    new-array v1, v0, [Z

    new-array v0, v0, [I

    .line 1
    fill-array-data v0, :array_0

    .line 2
    iget-object v2, p0, Lf9/b;->J:Landroid/hardware/input/InputManager;

    invoke-virtual {v2, p1}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/InputDevice;->hasKeys([I)[Z

    move-result-object v1

    :cond_0
    return-object v1

    :array_0
    .array-data 4
        0x60
        0x61
        0x63
        0x64
        0x13
        0x14
        0x15
        0x16
        0x67
        0x66
        0x6a
        0x6b
        0x6d
        0x6c
    .end array-data
.end method

.method private k()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lf9/b;->M:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "EnableCancelInputEvent"

    .line 2
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lf9/b;->N:Z

    .line 3
    :cond_0
    iget-boolean v0, p0, Lf9/b;->N:Z

    return v0
.end method

.method private r(I)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lf9/b;->j(I)[Z

    move-result-object v0

    .line 2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    .line 3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_0
    const/16 v4, 0x16

    const/16 v5, 0xe

    if-ge v2, v5, :cond_1

    packed-switch v2, :pswitch_data_0

    move-object v4, v3

    goto :goto_1

    :pswitch_0
    const/16 v4, 0x6c

    .line 4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_1
    const/16 v4, 0x6d

    .line 5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_2
    const/16 v4, 0x6b

    .line 6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_3
    const/16 v4, 0x6a

    .line 7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_4
    const/16 v4, 0x66

    .line 8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_5
    const/16 v4, 0x67

    .line 9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    .line 10
    :pswitch_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_7
    const/16 v4, 0x15

    .line 11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_8
    const/16 v4, 0x14

    .line 12
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_9
    const/16 v4, 0x13

    .line 13
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_a
    const/16 v4, 0x64

    .line 14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_b
    const/16 v4, 0x63

    .line 15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_c
    const/16 v4, 0x61

    .line 16
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :pswitch_d
    const/16 v4, 0x60

    .line 17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 18
    :goto_1
    array-length v5, v0

    if-ge v2, v5, :cond_0

    .line 19
    aget-boolean v5, v0, v2

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 20
    :cond_0
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 21
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0xb

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x17

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x11

    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x12

    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0xf

    .line 29
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x10

    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    invoke-static {p1}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 32
    invoke-virtual {v0}, Landroid/view/InputDevice;->getMotionRanges()Ljava/util/List;

    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/InputDevice$MotionRange;

    .line 34
    invoke-virtual {v2}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 35
    :cond_2
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 36
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    .line 40
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {p1, v2, v1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeSetGamepadSupportedKey(IIZ)V

    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_4

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private s(Landroid/view/SurfaceView;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lf9/b;->I:Landroid/os/Handler;

    const/16 v1, 0x65

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 2
    new-instance v0, Lf9/b$c;

    invoke-direct {v0, p0}, Lf9/b$c;-><init>(Lf9/b;)V

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 3
    new-instance v0, Lf9/b$d;

    invoke-direct {v0, p0}, Lf9/b$d;-><init>(Lf9/b;)V

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setOnGenericMotionListener(Landroid/view/View$OnGenericMotionListener;)V

    return-void
.end method

.method private v()V
    .locals 6

    .line 1
    iget-object v0, p0, Lf9/b;->K:Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    .line 4
    new-instance v2, Landroid/graphics/Point;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3}, Landroid/graphics/Point;-><init>(II)V

    .line 5
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 6
    iget v0, v2, Landroid/graphics/Point;->x:I

    iget v2, v2, Landroid/graphics/Point;->y:I

    const/4 v4, 0x1

    const/4 v5, 0x3

    if-ge v0, v2, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    if-eqz v1, :cond_3

    if-ne v1, v0, :cond_2

    goto :goto_0

    :cond_2
    if-ne v1, v5, :cond_4

    goto :goto_1

    :cond_3
    :goto_0
    if-ne v1, v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x1

    .line 7
    :goto_1
    invoke-static {v3}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeUpdateScreenOrientation(I)V

    return-void
.end method


# virtual methods
.method public a(Lf9/c;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lf9/c;->b()F

    move-result v1

    .line 2
    invoke-virtual {p1}, Lf9/c;->e()I

    move-result v0

    .line 3
    invoke-virtual {p1}, Lf9/c;->c()Landroid/graphics/Point;

    move-result-object v2

    .line 4
    invoke-virtual {p1}, Lf9/c;->d()Landroid/graphics/Point;

    move-result-object p1

    .line 5
    iget v3, v2, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v4, v2

    iget v2, p1, Landroid/graphics/Point;->x:I

    int-to-float v5, v2

    iget p1, p1, Landroid/graphics/Point;->y:I

    int-to-float v6, p1

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassRotateGesture(IFFFFFF)V

    return-void
.end method

.method public b(Lf9/d;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lf9/d;->a()Landroid/graphics/Point;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lf9/d;->b()Landroid/graphics/Point;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Lf9/d;->c()F

    move-result v3

    .line 4
    invoke-virtual {p1}, Lf9/d;->d()I

    move-result v2

    .line 5
    invoke-direct {p0}, Lf9/b;->i()F

    move-result p1

    .line 6
    iget v4, v0, Landroid/graphics/Point;->x:I

    int-to-float v4, v4

    div-float/2addr v4, p1

    float-to-int v4, v4

    int-to-float v5, v4

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    div-float/2addr v0, p1

    float-to-int v0, v0

    int-to-float v6, v0

    iget v0, v1, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    div-float/2addr v0, p1

    float-to-int v0, v0

    int-to-float v7, v0

    iget v0, v1, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    div-float/2addr v0, p1

    float-to-int p1, v0

    int-to-float v8, p1

    const/4 v4, 0x0

    invoke-static/range {v2 .. v8}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPinchGesture(IFFFFFF)V

    return-void
.end method

.method public l(Landroid/view/MotionEvent;)Z
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x7

    if-eq v0, v2, :cond_5

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v2, 0xb

    if-ne v0, v2, :cond_1

    .line 4
    iget v0, p0, Lf9/b;->A:F

    iget v2, p0, Lf9/b;->B:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionButton()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-static {v0, v2, v1, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    return v1

    .line 5
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v2, 0xc

    const/4 v3, 0x0

    if-ne v0, v2, :cond_2

    .line 6
    iget v0, p0, Lf9/b;->A:F

    iget v2, p0, Lf9/b;->B:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionButton()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-static {v0, v2, v3, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseButton(FFZI)V

    return v1

    .line 7
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_3

    .line 8
    iget v0, p0, Lf9/b;->A:F

    iget v2, p0, Lf9/b;->B:F

    const/16 v3, 0x9

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result p1

    invoke-static {v0, v2, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseWheel(FFF)V

    return v1

    .line 9
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v3

    .line 10
    :cond_5
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-direct {p0}, Lf9/b;->i()F

    move-result v2

    div-float/2addr v0, v2

    .line 11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0}, Lf9/b;->i()F

    move-result v2

    div-float/2addr p1, v2

    .line 12
    iget v2, p0, Lf9/b;->A:F

    sub-float v2, v0, v2

    .line 13
    iget v3, p0, Lf9/b;->B:F

    sub-float v3, p1, v3

    .line 14
    iput v0, p0, Lf9/b;->A:F

    .line 15
    iput p1, p0, Lf9/b;->B:F

    .line 16
    invoke-static {v0, p1, v2, v3}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseMove(FFFF)V

    return v1
.end method

.method public m(II)V
    .locals 1

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v0, 0x1

    invoke-static {v0, p1, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassSwipeGesture(IFF)V

    return-void
.end method

.method public n(II)V
    .locals 1

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v0, 0x2

    invoke-static {v0, p1, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassSwipeGesture(IFF)V

    return-void
.end method

.method public o(II)V
    .locals 1

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v0, 0x0

    invoke-static {v0, p1, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassSwipeGesture(IFF)V

    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lf9/b;->K:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    .line 3
    iget-object v1, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v1}, Landroid/hardware/Sensor;->getType()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/16 v5, 0xb

    if-ne v1, v5, :cond_0

    .line 4
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    invoke-static {v0, p1}, Lf9/b;->g(I[F)[F

    move-result-object p1

    .line 5
    iget-object v0, p0, Lf9/b;->C:[F

    invoke-static {v0, p1}, Landroid/hardware/SensorManager;->getQuaternionFromVector([F[F)V

    .line 6
    iget-object p1, p0, Lf9/b;->D:[F

    iget-object v0, p0, Lf9/b;->C:[F

    invoke-static {p1, v0}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    .line 7
    iget-object p1, p0, Lf9/b;->D:[F

    iget-object v0, p0, Lf9/b;->E:[F

    invoke-static {p1, v0}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    .line 8
    iget-object p1, p0, Lf9/b;->E:[F

    aget v5, p1, v3

    aget v6, p1, v4

    aget v7, p1, v2

    iget-object p1, p0, Lf9/b;->C:[F

    aget v8, p1, v3

    aget v9, p1, v2

    const/4 v0, 0x3

    aget v10, p1, v0

    aget v11, p1, v4

    invoke-static/range {v5 .. v11}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassGyroscopeChange(FFFFFFF)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v1, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v1}, Landroid/hardware/Sensor;->getType()I

    move-result v1

    if-ne v1, v4, :cond_1

    .line 10
    iget-object v1, p0, Lf9/b;->F:[F

    aget v5, v1, v3

    const v6, 0x3f4ccccd    # 0.8f

    mul-float v5, v5, v6

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v7, p1, v3

    const v8, 0x3e4ccccc    # 0.19999999f

    mul-float v7, v7, v8

    add-float/2addr v5, v7

    aput v5, v1, v3

    .line 11
    aget v5, v1, v4

    mul-float v5, v5, v6

    aget v7, p1, v4

    mul-float v7, v7, v8

    add-float/2addr v5, v7

    aput v5, v1, v4

    .line 12
    aget v5, v1, v2

    mul-float v5, v5, v6

    aget v6, p1, v2

    mul-float v6, v6, v8

    add-float/2addr v5, v6

    aput v5, v1, v2

    .line 13
    iget-object v5, p0, Lf9/b;->G:[F

    aget v6, p1, v3

    aget v7, v1, v3

    sub-float/2addr v6, v7

    aput v6, v5, v3

    .line 14
    aget v6, p1, v4

    aget v7, v1, v4

    sub-float/2addr v6, v7

    aput v6, v5, v4

    .line 15
    aget p1, p1, v2

    aget v1, v1, v2

    sub-float/2addr p1, v1

    aput p1, v5, v2

    .line 16
    invoke-static {v0, v5}, Lf9/b;->g(I[F)[F

    move-result-object p1

    .line 17
    iget-object v1, p0, Lf9/b;->F:[F

    invoke-static {v0, v1}, Lf9/b;->g(I[F)[F

    move-result-object v0

    .line 18
    aget v1, p1, v4

    neg-float v1, v1

    aget v5, p1, v2

    aget p1, p1, v3

    invoke-static {v1, v5, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassAccelerometerChange(FFF)V

    .line 19
    aget p1, v0, v4

    neg-float p1, p1

    aget v1, v0, v2

    neg-float v1, v1

    aget v0, v0, v3

    invoke-static {p1, v1, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassGravityChange(FFF)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const/16 v0, 0x2002

    and-int/2addr p1, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    .line 2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getButtonState()I

    move-result p1

    if-nez p1, :cond_2

    .line 3
    invoke-direct {p0}, Lf9/b;->k()Z

    move-result p1

    if-nez p1, :cond_3

    .line 4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result p1

    if-lez p1, :cond_1

    .line 5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-direct {p0}, Lf9/b;->i()F

    move-result v3

    div-float/2addr v0, v3

    sub-int/2addr p1, v2

    invoke-virtual {p2, v1, p1}, Landroid/view/MotionEvent;->getHistoricalY(II)F

    move-result p1

    invoke-direct {p0}, Lf9/b;->i()F

    move-result p2

    div-float/2addr p1, p2

    sub-float/2addr v0, p1

    const/4 p1, 0x0

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_1

    .line 6
    iget p1, p0, Lf9/b;->A:F

    iget p2, p0, Lf9/b;->B:F

    invoke-static {p1, p2, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMouseWheel(FFF)V

    :cond_1
    return v2

    .line 7
    :cond_2
    invoke-virtual {p0, p2}, Lf9/b;->l(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 8
    :cond_3
    iget-boolean p1, p0, Lf9/b;->o:Z

    if-nez p1, :cond_4

    return v1

    .line 9
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result p1

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    .line 11
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_c

    const/4 v5, 0x3

    if-eq v3, v2, :cond_7

    if-eq v3, v4, :cond_5

    if-eq v3, v5, :cond_7

    const/4 v6, 0x5

    if-eq v3, v6, :cond_c

    const/4 v6, 0x6

    if-eq v3, v6, :cond_7

    goto/16 :goto_3

    :cond_5
    const/4 p1, 0x0

    .line 12
    :goto_1
    iget-object v0, p0, Lf9/b;->t:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge p1, v0, :cond_d

    .line 13
    :try_start_0
    iget-object v0, p0, Lf9/b;->t:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v0

    .line 14
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    .line 15
    iget-object v5, p0, Lf9/b;->t:Landroid/util/SparseArray;

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf9/b$h;

    .line 16
    invoke-direct {p0}, Lf9/b;->i()F

    move-result v6

    .line 17
    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    div-float/2addr v7, v6

    invoke-virtual {v5, v7}, Lf9/b$h;->e(F)V

    .line 18
    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    div-float/2addr v3, v6

    invoke-virtual {v5, v3}, Lf9/b$h;->f(F)V

    .line 19
    invoke-virtual {v5, v2}, Lf9/b$h;->d(I)V

    .line 20
    iget-object v3, p0, Lf9/b;->q:Lf9/b$f;

    iget v3, v3, Lf9/b$f;->a:I

    if-ne v0, v3, :cond_6

    .line 21
    invoke-virtual {v5}, Lf9/b$h;->b()F

    move-result v0

    invoke-virtual {v5}, Lf9/b$h;->c()F

    move-result v3

    invoke-static {v2, v0, v3}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassLongPressGesture(IFF)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 22
    :cond_7
    iget-object v6, p0, Lf9/b;->t:Landroid/util/SparseArray;

    invoke-virtual {v6, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf9/b$h;

    const/4 v7, -0x1

    if-nez v6, :cond_9

    .line 23
    invoke-direct {p0}, Lf9/b;->i()F

    move-result v3

    .line 24
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    div-float/2addr v5, v3

    .line 25
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    div-float/2addr p1, v3

    .line 26
    iget-object v3, p0, Lf9/b;->q:Lf9/b$f;

    iget v6, v3, Lf9/b$f;->a:I

    if-ne v0, v6, :cond_8

    .line 27
    iput v7, v3, Lf9/b$f;->a:I

    .line 28
    invoke-static {v4, v5, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassLongPressGesture(IFF)V

    goto :goto_3

    .line 29
    :cond_8
    iget p1, v3, Lf9/b$f;->b:I

    if-ne v0, p1, :cond_d

    .line 30
    invoke-virtual {v3}, Lf9/b$f;->a()V

    goto :goto_3

    :cond_9
    if-ne v3, v5, :cond_a

    .line 31
    invoke-direct {p0}, Lf9/b;->k()Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_2

    :cond_a
    const/4 v5, 0x2

    .line 32
    :goto_2
    invoke-virtual {v6, v5}, Lf9/b$h;->d(I)V

    .line 33
    iget-object p1, p0, Lf9/b;->q:Lf9/b$f;

    iget v3, p1, Lf9/b$f;->a:I

    if-ne v0, v3, :cond_b

    .line 34
    iput v7, p1, Lf9/b$f;->a:I

    .line 35
    invoke-virtual {v6}, Lf9/b$h;->b()F

    move-result p1

    invoke-virtual {v6}, Lf9/b$h;->c()F

    move-result v0

    invoke-static {v4, p1, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassLongPressGesture(IFF)V

    goto :goto_3

    .line 36
    :cond_b
    iget v3, p1, Lf9/b$f;->b:I

    if-ne v0, v3, :cond_d

    .line 37
    invoke-virtual {p1}, Lf9/b$f;->a()V

    goto :goto_3

    .line 38
    :cond_c
    new-instance v3, Lf9/b$h;

    invoke-direct {v3, p0}, Lf9/b$h;-><init>(Lf9/b;)V

    .line 39
    invoke-direct {p0}, Lf9/b;->i()F

    move-result v5

    .line 40
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    div-float/2addr v6, v5

    invoke-virtual {v3, v6}, Lf9/b$h;->e(F)V

    .line 41
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    div-float/2addr p1, v5

    invoke-virtual {v3, p1}, Lf9/b$h;->f(F)V

    .line 42
    invoke-virtual {v3, v1}, Lf9/b$h;->d(I)V

    .line 43
    iget-object p1, p0, Lf9/b;->t:Landroid/util/SparseArray;

    invoke-virtual {p1, v0, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 44
    :cond_d
    :goto_3
    iget-object p1, p0, Lf9/b;->O:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 45
    iget-object p1, p0, Lf9/b;->t:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 v0, 0x0

    :goto_4
    if-ge v0, p1, :cond_13

    .line 46
    iget-object v3, p0, Lf9/b;->t:Landroid/util/SparseArray;

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    .line 47
    iget-object v3, p0, Lf9/b;->t:Landroid/util/SparseArray;

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf9/b$h;

    .line 48
    invoke-virtual {v3}, Lf9/b$h;->a()I

    move-result v6

    if-ne v6, v4, :cond_e

    .line 49
    iget-object v6, p0, Lf9/b;->O:Ljava/util/List;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 50
    :cond_e
    invoke-virtual {v3}, Lf9/b$h;->a()I

    move-result v6

    iget v7, v3, Lf9/b$h;->f:I

    if-ne v6, v7, :cond_f

    .line 51
    invoke-virtual {v3}, Lf9/b$h;->b()F

    move-result v6

    iget v7, v3, Lf9/b$h;->d:F

    cmpl-float v6, v6, v7

    if-nez v6, :cond_10

    invoke-virtual {v3}, Lf9/b$h;->c()F

    move-result v6

    iget v7, v3, Lf9/b$h;->e:F

    cmpl-float v6, v6, v7

    if-nez v6, :cond_10

    :goto_5
    const/4 v6, 0x0

    goto :goto_7

    .line 52
    :cond_f
    invoke-virtual {v3}, Lf9/b$h;->a()I

    move-result v6

    if-ne v6, v2, :cond_10

    iget v6, v3, Lf9/b$h;->f:I

    if-nez v6, :cond_10

    .line 53
    invoke-virtual {v3}, Lf9/b$h;->b()F

    move-result v6

    iget v7, v3, Lf9/b$h;->d:F

    cmpl-float v6, v6, v7

    if-nez v6, :cond_10

    invoke-virtual {v3}, Lf9/b$h;->c()F

    move-result v6

    iget v7, v3, Lf9/b$h;->e:F

    cmpl-float v6, v6, v7

    if-nez v6, :cond_10

    goto :goto_5

    :cond_10
    :goto_6
    const/4 v6, 0x1

    .line 54
    :goto_7
    iget-object v7, p0, Lf9/b;->L:Lf9/b$e;

    invoke-interface {v7}, Lf9/b$e;->a()Z

    move-result v7

    if-eqz v6, :cond_11

    if-eqz v7, :cond_11

    .line 55
    invoke-direct {p0}, Lf9/b;->i()F

    move-result v6

    .line 56
    iget-object v7, p0, Lf9/b;->n:Landroid/view/SurfaceView;

    invoke-virtual {v7}, Landroid/view/SurfaceView;->getWidth()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v6

    float-to-int v9, v7

    .line 57
    iget-object v7, p0, Lf9/b;->n:Landroid/view/SurfaceView;

    invoke-virtual {v7}, Landroid/view/SurfaceView;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v6

    float-to-int v10, v7

    .line 58
    invoke-virtual {v3}, Lf9/b$h;->b()F

    move-result v6

    iput v6, v3, Lf9/b$h;->d:F

    .line 59
    invoke-virtual {v3}, Lf9/b$h;->c()F

    move-result v6

    iput v6, v3, Lf9/b$h;->e:F

    .line 60
    invoke-virtual {v3}, Lf9/b$h;->b()F

    move-result v6

    invoke-virtual {v3}, Lf9/b$h;->c()F

    move-result v7

    .line 61
    invoke-virtual {v3}, Lf9/b$h;->a()I

    move-result v8

    .line 62
    invoke-static/range {v5 .. v10}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassInput(IFFIII)V

    goto :goto_8

    :cond_11
    if-nez v7, :cond_12

    const-string v3, "rbx.input"

    const-string v5, "nativePassInput not ready or already passed event"

    .line 63
    invoke-static {v3, v5}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :cond_12
    :goto_8
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_4

    .line 64
    :cond_13
    iget-object p1, p0, Lf9/b;->O:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 65
    iget-object v1, p0, Lf9/b;->t:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    goto :goto_9

    .line 66
    :cond_14
    iget-object p1, p0, Lf9/b;->s:Lf9/d;

    invoke-virtual {p1, p2}, Lf9/d;->e(Landroid/view/MotionEvent;)Z

    .line 67
    iget-object p1, p0, Lf9/b;->p:Landroid/view/GestureDetector;

    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 68
    iget-object p1, p0, Lf9/b;->r:Lf9/c;

    invoke-virtual {p1, p2}, Lf9/c;->f(Landroid/view/MotionEvent;)Z

    return v2
.end method

.method public p(II)V
    .locals 1

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v0, 0x3

    invoke-static {v0, p1, p2}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassSwipeGesture(IFF)V

    return-void
.end method

.method public q()V
    .locals 0

    invoke-direct {p0}, Lf9/b;->v()V

    return-void
.end method

.method public t(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lf9/b;->z:Z

    if-nez v0, :cond_0

    .line 2
    iput-boolean p1, p0, Lf9/b;->z:Z

    .line 3
    :cond_0
    iget-boolean p1, p0, Lf9/b;->z:Z

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lf9/b;->u:Landroid/hardware/SensorManager;

    iget-object v0, p0, Lf9/b;->w:Landroid/hardware/Sensor;

    const/4 v1, 0x1

    invoke-virtual {p1, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 5
    iget-object p1, p0, Lf9/b;->u:Landroid/hardware/SensorManager;

    iget-object v0, p0, Lf9/b;->v:Landroid/hardware/Sensor;

    invoke-virtual {p1, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 6
    :cond_1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->i()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lf9/b;->y:Lf9/f;

    invoke-virtual {p1}, Lf9/f;->c()V

    :cond_2
    return-void
.end method

.method public u()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf9/b;->u:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lf9/b;->y:Lf9/f;

    invoke-virtual {v0}, Lf9/f;->d()V

    :cond_0
    return-void
.end method
