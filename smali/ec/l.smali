.class public Lec/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lec/l$c;,
        Lec/l$d;,
        Lec/l$e;,
        Lec/l$f;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lec/l$f;

.field private final c:Landroid/media/AudioManager;

.field private final d:Landroid/os/Handler;

.field e:I

.field private f:Lec/l$e;

.field private final g:Landroid/bluetooth/BluetoothProfile$ServiceListener;

.field private h:Landroid/bluetooth/BluetoothAdapter;

.field private i:Landroid/bluetooth/BluetoothHeadset;

.field private j:Landroid/bluetooth/BluetoothDevice;

.field private final k:Landroid/content/BroadcastReceiver;

.field private l:Landroid/media/AudioDeviceCallback;

.field private final m:Ljava/lang/Runnable;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lec/l$f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lec/k;

    invoke-direct {v0, p0}, Lec/k;-><init>(Lec/l;)V

    iput-object v0, p0, Lec/l;->m:Ljava/lang/Runnable;

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "ctor"

    .line 3
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lfc/a;->f()V

    .line 5
    iput-object p1, p0, Lec/l;->a:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Lec/l;->b:Lec/l$f;

    .line 7
    invoke-virtual {p0, p1}, Lec/l;->o(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object p1

    iput-object p1, p0, Lec/l;->c:Landroid/media/AudioManager;

    .line 8
    sget-object p1, Lec/l$e;->n:Lec/l$e;

    iput-object p1, p0, Lec/l;->f:Lec/l$e;

    .line 9
    new-instance p1, Lec/l$d;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lec/l$d;-><init>(Lec/l;Lec/l$a;)V

    iput-object p1, p0, Lec/l;->g:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    .line 10
    new-instance p1, Lec/l$c;

    invoke-direct {p1, p0, p2}, Lec/l$c;-><init>(Lec/l;Lec/l$a;)V

    iput-object p1, p0, Lec/l;->k:Landroid/content/BroadcastReceiver;

    .line 11
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lec/l;->d:Landroid/os/Handler;

    return-void
.end method

.method private A(Landroid/bluetooth/BluetoothHeadset;)V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetProfileConnected"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iput-object p1, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    .line 3
    invoke-direct {p0}, Lec/l;->N()V

    return-void
.end method

.method private B()V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetProfileDisconnected"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lec/l;->K()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    .line 4
    iput-object v0, p0, Lec/l;->j:Landroid/bluetooth/BluetoothDevice;

    .line 5
    invoke-direct {p0}, Lec/l;->N()V

    return-void
.end method

.method private C()V
    .locals 3

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "registerAudioDeviceCallback"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lec/l;->l:Landroid/media/AudioDeviceCallback;

    if-nez v0, :cond_1

    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Lec/l$a;

    invoke-direct {v0, p0}, Lec/l$a;-><init>(Lec/l;)V

    iput-object v0, p0, Lec/l;->l:Landroid/media/AudioDeviceCallback;

    .line 4
    iget-object v1, p0, Lec/l;->c:Landroid/media/AudioManager;

    iget-object v2, p0, Lec/l;->d:Landroid/os/Handler;

    invoke-virtual {v1, v0, v2}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private F()V
    .locals 2

    .line 1
    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->startBluetoothSco()V

    .line 3
    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    return-void
.end method

.method private G()Z
    .locals 5

    .line 1
    invoke-static {}, Lfc/a;->f()V

    .line 2
    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    const/4 v1, 0x0

    const-string v2, "AppRtcBluetoothMgr"

    if-nez v0, :cond_0

    const-string v0, "startScoAudio: audioManager == null"

    .line 3
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSco: BT state="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", attempts: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lec/l;->e:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", SCO is on: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-direct {p0}, Lec/l;->u()Z

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    iget v0, p0, Lec/l;->e:I

    const/4 v4, 0x2

    if-lt v0, v4, :cond_1

    const-string v0, "BT SCO connection fails - no more attempts"

    .line 8
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_1
    const-string v0, "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED..."

    .line 9
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    invoke-direct {p0}, Lec/l;->F()V

    .line 11
    iget v0, p0, Lec/l;->e:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lec/l;->e:I

    .line 12
    invoke-direct {p0}, Lec/l;->H()V

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "startScoAudio done: BT state="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    invoke-direct {p0}, Lec/l;->u()Z

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method

.method private H()V
    .locals 4

    .line 1
    invoke-static {}, Lfc/a;->f()V

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "startTimer"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Lec/l;->d:Landroid/os/Handler;

    iget-object v1, p0, Lec/l;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lec/l;->d:Landroid/os/Handler;

    iget-object v1, p0, Lec/l;->m:Ljava/lang/Runnable;

    const-wide/16 v2, 0xfa0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private J()V
    .locals 2

    .line 1
    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->stopBluetoothSco()V

    .line 3
    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    return-void
.end method

.method private K()V
    .locals 4

    .line 1
    invoke-static {}, Lfc/a;->f()V

    .line 2
    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    const-string v1, "AppRtcBluetoothMgr"

    if-nez v0, :cond_0

    const-string v0, "stopScoAudio: audioManager == null"

    .line 3
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stopScoAudio: BT state="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", SCO is on: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-direct {p0}, Lec/l;->u()Z

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    iget-object v0, p0, Lec/l;->f:Lec/l$e;

    sget-object v3, Lec/l$e;->r:Lec/l$e;

    if-eq v0, v3, :cond_1

    sget-object v3, Lec/l$e;->s:Lec/l$e;

    if-eq v0, v3, :cond_1

    return-void

    .line 8
    :cond_1
    invoke-direct {p0}, Lec/l;->l()V

    .line 9
    invoke-direct {p0}, Lec/l;->J()V

    .line 10
    sget-object v0, Lec/l$e;->q:Lec/l$e;

    invoke-direct {p0, v0}, Lec/l;->m(Lec/l$e;)V

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stopScoAudio done: BT state="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    invoke-direct {p0}, Lec/l;->u()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private L()V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "unregisterAudioDeviceCallback"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lec/l;->l:Landroid/media/AudioDeviceCallback;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lec/l;->c:Landroid/media/AudioManager;

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private declared-synchronized N()V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "AppRtcBluetoothMgr"

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update: bluetoothState="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lec/l;->f:Lec/l$e;

    .line 3
    sget-object v1, Lec/l$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Lec/l;->r()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 5
    sget-object v0, Lec/l$e;->s:Lec/l$e;

    goto :goto_0

    .line 6
    :cond_1
    invoke-direct {p0}, Lec/l;->P()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lec/l$e;->p:Lec/l$e;

    goto :goto_0

    :cond_2
    sget-object v0, Lec/l$e;->o:Lec/l$e;

    .line 7
    :cond_3
    :goto_0
    sget-object v1, Lec/l$e;->p:Lec/l$e;

    if-ne v0, v1, :cond_4

    iget v1, p0, Lec/l;->e:I

    const/4 v2, 0x2

    if-ge v1, v2, :cond_4

    const-string v1, "AppRtcBluetoothMgr"

    const-string v2, "Starting SCO Audio..."

    .line 8
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    invoke-direct {p0}, Lec/l;->G()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 10
    sget-object v0, Lec/l$e;->r:Lec/l$e;

    .line 11
    :cond_4
    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    if-eq v0, v1, :cond_5

    .line 12
    invoke-direct {p0, v0}, Lec/l;->m(Lec/l$e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :cond_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private O()V
    .locals 2

    .line 1
    invoke-static {}, Lfc/a;->f()V

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "updateAudioDeviceState"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-direct {p0}, Lec/l;->v()V

    .line 4
    iget-object v0, p0, Lec/l;->b:Lec/l$f;

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {v0}, Lec/l$f;->a()V

    :cond_0
    return-void
.end method

.method private P()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lec/l;->f:Lec/l$e;

    sget-object v1, Lec/l$e;->n:Lec/l$e;

    const/4 v2, 0x0

    const-string v3, "AppRtcBluetoothMgr"

    if-ne v0, v1, :cond_0

    const-string v0, "updateDevice: not initialized!"

    .line 2
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    .line 3
    :cond_0
    iget-object v0, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateDevice: bluetoothHeadset is null. bluetoothState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    .line 5
    :cond_1
    invoke-virtual {p0}, Lec/l;->k()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    .line 6
    iget-object v0, p0, Lec/l;->a:Landroid/content/Context;

    iget-object v4, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v3, v0, v4}, Lfc/a;->j(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iput-object v0, p0, Lec/l;->j:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_2

    const-string v0, "updateDevice: No connected bluetooth headset"

    .line 7
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 8
    :cond_2
    iget-object v2, p0, Lec/l;->a:Landroid/content/Context;

    iget-object v4, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v3, v2, v4, v0}, Lfc/a;->t(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)V

    const/4 v2, 0x1

    goto :goto_0

    .line 9
    :cond_3
    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    if-eqz v0, :cond_5

    .line 10
    invoke-static {v3, v0}, Lfc/a;->r(Ljava/lang/String;Landroid/media/AudioManager;)V

    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v0, v4, :cond_4

    .line 12
    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    invoke-static {v0, v2}, Lfc/a;->l(Landroid/media/AudioManager;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    .line 13
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateDevice: permission not granted, bluetoothState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    :cond_5
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateDevice done: hasBluetoothHeadset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v2
.end method

.method public static synthetic a(Lec/l;)V
    .locals 0

    invoke-direct {p0}, Lec/l;->j()V

    return-void
.end method

.method static synthetic b(Lec/l;)Lec/l$e;
    .locals 0

    iget-object p0, p0, Lec/l;->f:Lec/l$e;

    return-object p0
.end method

.method static synthetic c(Lec/l;Lec/l$e;)Lec/l$e;
    .locals 0

    iput-object p1, p0, Lec/l;->f:Lec/l$e;

    return-object p1
.end method

.method static synthetic d(Lec/l;Landroid/bluetooth/BluetoothHeadset;)V
    .locals 0

    invoke-direct {p0, p1}, Lec/l;->A(Landroid/bluetooth/BluetoothHeadset;)V

    return-void
.end method

.method static synthetic e(Lec/l;)V
    .locals 0

    invoke-direct {p0}, Lec/l;->B()V

    return-void
.end method

.method static synthetic f(Lec/l;)V
    .locals 0

    invoke-direct {p0}, Lec/l;->w()V

    return-void
.end method

.method static synthetic g(Lec/l;)V
    .locals 0

    invoke-direct {p0}, Lec/l;->x()V

    return-void
.end method

.method static synthetic h(Lec/l;)V
    .locals 0

    invoke-direct {p0}, Lec/l;->y()V

    return-void
.end method

.method static synthetic i(Lec/l;)V
    .locals 0

    invoke-direct {p0}, Lec/l;->z()V

    return-void
.end method

.method private j()V
    .locals 4

    .line 1
    invoke-static {}, Lfc/a;->f()V

    .line 2
    iget-object v0, p0, Lec/l;->f:Lec/l$e;

    sget-object v1, Lec/l$e;->n:Lec/l$e;

    const-string v2, "AppRtcBluetoothMgr"

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    if-nez v0, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bluetoothTimeout: BT state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", attempts: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lec/l;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", SCO is on: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-direct {p0}, Lec/l;->u()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object v0, p0, Lec/l;->f:Lec/l$e;

    sget-object v1, Lec/l$e;->r:Lec/l$e;

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0}, Lec/l;->k()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    iget-object v1, p0, Lec/l;->a:Landroid/content/Context;

    iget-object v3, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v2, v1, v3}, Lfc/a;->i(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    iput-object v1, p0, Lec/l;->j:Landroid/bluetooth/BluetoothDevice;

    if-eqz v1, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    .line 9
    :cond_2
    invoke-direct {p0}, Lec/l;->r()Z

    move-result v0

    :cond_3
    :goto_0
    if-eqz v0, :cond_4

    .line 10
    invoke-direct {p0}, Lec/l;->w()V

    goto :goto_1

    :cond_4
    const-string v0, "BT failed to connect after timeout"

    .line 11
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    invoke-direct {p0}, Lec/l;->K()V

    .line 13
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bluetoothTimeout done: BT state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 14
    :cond_5
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bluetoothTimeout: not initialized! BT state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private l()V
    .locals 2

    .line 1
    invoke-static {}, Lfc/a;->f()V

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "cancelTimer"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Lec/l;->d:Landroid/os/Handler;

    iget-object v1, p0, Lec/l;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private m(Lec/l$e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lec/l;->f:Lec/l$e;

    if-eq p1, v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Changing state from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iput-object p1, p0, Lec/l;->f:Lec/l$e;

    .line 4
    sget-object v0, Lec/l$e;->n:Lec/l$e;

    if-eq p1, v0, :cond_0

    .line 5
    invoke-direct {p0}, Lec/l;->O()V

    :cond_0
    return-void
.end method

.method static n(Landroid/content/Context;Lec/l$f;)Lec/l;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "create"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lfc/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lec/l;

    invoke-direct {v0, p0, p1}, Lec/l;-><init>(Landroid/content/Context;Lec/l$f;)V

    return-object v0
.end method

.method private q()Lec/l$e;
    .locals 1

    .line 1
    invoke-static {}, Lfc/a;->f()V

    .line 2
    iget-object v0, p0, Lec/l;->f:Lec/l$e;

    return-object v0
.end method

.method private r()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lec/l;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lec/l;->a:Landroid/content/Context;

    iget-object v1, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    iget-object v2, p0, Lec/l;->j:Landroid/bluetooth/BluetoothDevice;

    const-string v3, "AppRtcBluetoothMgr"

    invoke-static {v3, v0, v1, v2}, Lfc/a;->o(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    return v0

    .line 3
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lfc/a;->l(Landroid/media/AudioManager;Z)Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private u()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    move-result v0

    return v0
.end method

.method private v()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bluetoothState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lec/l;->c:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {v1, v0}, Lfc/a;->r(Ljava/lang/String;Landroid/media/AudioManager;)V

    .line 4
    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v2, p0, Lec/l;->h:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v2, :cond_2

    if-eq v0, v2, :cond_2

    const-string v0, "Cached adapter different that default BluetoothAdapter!"

    .line 6
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string v0, "Default BluetoothAdapter unavailable!"

    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    :cond_2
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_3

    iget-object v0, p0, Lec/l;->a:Landroid/content/Context;

    const-string v2, "android.permission.BLUETOOTH_CONNECT"

    invoke-static {v0, v2}, Lfc/a;->n(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "logBluetoothStatus: BLUETOOTH_CONNECT not granted!"

    .line 9
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 10
    :cond_3
    iget-object v0, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    if-eqz v0, :cond_4

    .line 11
    iget-object v2, p0, Lec/l;->a:Landroid/content/Context;

    invoke-static {v1, v2, v0}, Lfc/a;->s(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;)V

    goto :goto_1

    :cond_4
    const-string v0, "No headset connected."

    .line 12
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method

.method private w()V
    .locals 3

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetAudioConnected"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    sget-object v2, Lec/l$e;->s:Lec/l$e;

    if-ne v1, v2, :cond_0

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onHeadsetAudioConnected: Audio already connected. state="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 4
    :cond_0
    invoke-direct {p0}, Lec/l;->l()V

    .line 5
    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    sget-object v2, Lec/l$e;->r:Lec/l$e;

    if-ne v1, v2, :cond_1

    const-string v1, "+++ Bluetooth audio SCO is now connected"

    .line 6
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lec/l;->e:I

    .line 8
    invoke-direct {p0}, Lec/l;->N()V

    goto :goto_0

    :cond_1
    const-string v1, "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED"

    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private x()V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetAudioDisconnected"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget-object v0, Lec/l$e;->p:Lec/l$e;

    invoke-direct {p0, v0}, Lec/l;->m(Lec/l$e;)V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lec/l;->e:I

    .line 4
    invoke-direct {p0}, Lec/l;->N()V

    return-void
.end method

.method private y()V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetConnected"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lec/l;->e:I

    .line 3
    invoke-direct {p0}, Lec/l;->N()V

    return-void
.end method

.method private z()V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetDisconnected"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lec/l;->K()V

    .line 3
    invoke-direct {p0}, Lec/l;->N()V

    return-void
.end method


# virtual methods
.method protected D(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lec/l;->a:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public E()V
    .locals 4

    .line 1
    invoke-static {}, Lfc/a;->f()V

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "start"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "Starting AppRtcBluetoothManager..."

    .line 3
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object v1, p0, Lec/l;->c:Landroid/media/AudioManager;

    if-nez v1, :cond_0

    const-string v1, "audioManager == null"

    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 6
    :cond_0
    iget-object v2, p0, Lec/l;->f:Lec/l$e;

    sget-object v3, Lec/l$e;->n:Lec/l$e;

    if-eq v2, v3, :cond_1

    const-string v1, "Invalid BT state"

    .line 7
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v2, 0x0

    .line 8
    iput-object v2, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    .line 9
    iput-object v2, p0, Lec/l;->j:Landroid/bluetooth/BluetoothDevice;

    const/4 v2, 0x0

    .line 10
    iput v2, p0, Lec/l;->e:I

    .line 11
    invoke-virtual {v1}, Landroid/media/AudioManager;->isBluetoothScoAvailableOffCall()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "Bluetooth SCO audio is not available off call"

    .line 12
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 13
    :cond_2
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    iput-object v1, p0, Lec/l;->h:Landroid/bluetooth/BluetoothAdapter;

    if-nez v1, :cond_3

    const-string v1, "Device does not support Bluetooth"

    .line 14
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 15
    :cond_3
    iget-object v1, p0, Lec/l;->a:Landroid/content/Context;

    iget-object v2, p0, Lec/l;->g:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    invoke-virtual {p0, v1, v2}, Lec/l;->p(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "BluetoothAdapter.getBluetoothHeadsetProfileProxy failed"

    .line 16
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 17
    :cond_4
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    .line 18
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"

    .line 19
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"

    .line 20
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 21
    iget-object v2, p0, Lec/l;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v2, v1}, Lec/l;->D(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start: bluetoothHeadsetReceiver registered. receiverIntent.action="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " receiverIntent.extras="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    const-string v1, "Bluetooth proxy for headset profile has started."

    .line 23
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    invoke-virtual {p0}, Lec/l;->k()Z

    move-result v1

    if-nez v1, :cond_6

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_6

    .line 25
    invoke-direct {p0}, Lec/l;->C()V

    .line 26
    :cond_6
    sget-object v1, Lec/l$e;->o:Lec/l$e;

    invoke-direct {p0, v1}, Lec/l;->m(Lec/l$e;)V

    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start done: BT state="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public I()V
    .locals 6

    .line 1
    invoke-static {}, Lfc/a;->f()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stop: BT state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Lec/l;->h:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lec/l;->f:Lec/l$e;

    sget-object v2, Lec/l$e;->n:Lec/l$e;

    if-ne v0, v2, :cond_1

    return-void

    .line 5
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v0, v3, :cond_2

    .line 6
    invoke-direct {p0}, Lec/l;->L()V

    .line 7
    :cond_2
    invoke-direct {p0}, Lec/l;->K()V

    .line 8
    iget-object v0, p0, Lec/l;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lec/l;->M(Landroid/content/BroadcastReceiver;)V

    .line 9
    invoke-direct {p0}, Lec/l;->l()V

    .line 10
    iget-object v0, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    .line 11
    iget-object v4, p0, Lec/l;->h:Landroid/bluetooth/BluetoothAdapter;

    const/4 v5, 0x1

    invoke-virtual {v4, v5, v0}, Landroid/bluetooth/BluetoothAdapter;->closeProfileProxy(ILandroid/bluetooth/BluetoothProfile;)V

    .line 12
    iput-object v3, p0, Lec/l;->i:Landroid/bluetooth/BluetoothHeadset;

    .line 13
    :cond_3
    iput-object v3, p0, Lec/l;->h:Landroid/bluetooth/BluetoothAdapter;

    .line 14
    iput-object v3, p0, Lec/l;->j:Landroid/bluetooth/BluetoothDevice;

    .line 15
    invoke-direct {p0, v2}, Lec/l;->m(Lec/l$e;)V

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stop done: BT state="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lec/l;->f:Lec/l$e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method protected M(Landroid/content/BroadcastReceiver;)V
    .locals 1

    iget-object v0, p0, Lec/l;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method k()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected o(Landroid/content/Context;)Landroid/media/AudioManager;
    .locals 1

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    return-object p1
.end method

.method protected p(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lec/l;->h:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, p1, p2, v1}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    move-result p1

    return p1
.end method

.method s()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lec/l;->q()Lec/l$e;

    move-result-object v0

    sget-object v1, Lec/l$e;->s:Lec/l$e;

    if-eq v0, v1, :cond_1

    .line 2
    invoke-direct {p0}, Lec/l;->q()Lec/l$e;

    move-result-object v0

    sget-object v1, Lec/l$e;->r:Lec/l$e;

    if-eq v0, v1, :cond_1

    .line 3
    invoke-direct {p0}, Lec/l;->q()Lec/l$e;

    move-result-object v0

    sget-object v1, Lec/l$e;->p:Lec/l$e;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method t()Z
    .locals 2

    invoke-direct {p0}, Lec/l;->q()Lec/l$e;

    move-result-object v0

    sget-object v1, Lec/l$e;->s:Lec/l$e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
