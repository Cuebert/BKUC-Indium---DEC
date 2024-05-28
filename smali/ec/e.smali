.class public Lec/e;
.super Lorg/webrtc/voiceengine/AppAudioManagerBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lec/e$d;,
        Lec/e$c;,
        Lec/e$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/media/AudioManager;

.field private c:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

.field private d:Lec/e$c;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:I

.field private final j:Lec/e$b;

.field private k:Lec/e$b;

.field private final l:Lec/l;

.field private m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lec/e$b;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Landroid/content/BroadcastReceiver;

.field private o:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private p:Landroid/media/AudioFocusRequest;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/webrtc/voiceengine/AppAudioManagerBase;-><init>()V

    const/4 v0, -0x2

    .line 2
    iput v0, p0, Lec/e;->e:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lec/e;->i:I

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lec/e;->m:Ljava/util/Set;

    const-string v0, "AppRtcAudioManager"

    const-string v1, "ctor"

    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-static {}, Lfc/a;->f()V

    .line 7
    iput-object p1, p0, Lec/e;->a:Landroid/content/Context;

    const-string v1, "audio"

    .line 8
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/AudioManager;

    iput-object v1, p0, Lec/e;->b:Landroid/media/AudioManager;

    .line 9
    new-instance v1, Lec/b;

    invoke-direct {v1, p0}, Lec/b;-><init>(Lec/e;)V

    invoke-static {p1, v1}, Lec/l;->n(Landroid/content/Context;Lec/l$f;)Lec/l;

    move-result-object p1

    iput-object p1, p0, Lec/e;->l:Lec/l;

    .line 10
    new-instance p1, Lec/e$d;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1}, Lec/e$d;-><init>(Lec/e;Lec/e$a;)V

    iput-object p1, p0, Lec/e;->n:Landroid/content/BroadcastReceiver;

    .line 11
    sget-object p1, Lec/e$c;->n:Lec/e$c;

    iput-object p1, p0, Lec/e;->d:Lec/e$c;

    .line 12
    sget-object p1, Lec/e$b;->n:Lec/e$b;

    iput-object p1, p0, Lec/e;->j:Lec/e$b;

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "defaultAudioDevice: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    invoke-static {v0}, Lfc/a;->u(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0, p0}, Lorg/webrtc/voiceengine/AppAudioManagerBase;->setInstance(Lorg/webrtc/voiceengine/AppAudioManagerBase;)V

    return-void
.end method

.method public static synthetic a(Lec/e;Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V
    .locals 0

    invoke-direct {p0, p1}, Lec/e;->o(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V

    return-void
.end method

.method public static synthetic b(Lec/e;)V
    .locals 0

    invoke-direct {p0}, Lec/e;->z()V

    return-void
.end method

.method public static synthetic c(I)V
    .locals 0

    invoke-static {p0}, Lec/e;->n(I)V

    return-void
.end method

.method private d()V
    .locals 2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->c0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lec/e;->f()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lec/e;->e()V

    :goto_0
    return-void
.end method

.method private e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lec/e;->o:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    return-void
.end method

.method private f()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lec/e;->p:Landroid/media/AudioFocusRequest;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    return-void
.end method

.method static synthetic g(Lec/e;Z)Z
    .locals 0

    iput-boolean p1, p0, Lec/e;->h:Z

    return p1
.end method

.method static synthetic h(Lec/e;)V
    .locals 0

    invoke-direct {p0}, Lec/e;->z()V

    return-void
.end method

.method public static i(Landroid/content/Context;)Lec/e;
    .locals 1

    new-instance v0, Lec/e;

    invoke-direct {v0, p0}, Lec/e;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private j()Z
    .locals 2

    iget-object v0, p0, Lec/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.telephony"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private k()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    .line 3
    invoke-direct {p0}, Lec/e;->l()Z

    move-result v0

    return v0

    .line 4
    :cond_1
    invoke-direct {p0}, Lec/e;->m()Z

    move-result v0

    return v0
.end method

.method private l()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->isWiredHeadsetOn()Z

    move-result v0

    return v0
.end method

.method private m()Z
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x3

    .line 2
    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object v0

    .line 3
    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v0, v4

    .line 4
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v5

    const-string v6, "AppRtcAudioManager"

    const/4 v7, 0x1

    if-ne v5, v2, :cond_1

    const-string v0, "hasWiredHeadset: found wired headset"

    .line 5
    invoke-static {v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v7

    :cond_1
    const/16 v8, 0xb

    if-ne v5, v8, :cond_2

    const-string v0, "hasWiredHeadset: found USB audio device"

    .line 6
    invoke-static {v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v7

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method private static synthetic n(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAudioFocusChange: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lfc/a;->g(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "AppRtcAudioManager"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private synthetic o(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V
    .locals 0

    invoke-virtual {p0, p1}, Lec/e;->w(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V

    return-void
.end method

.method private p(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 1

    iget-object v0, p0, Lec/e;->a:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private q()V
    .locals 2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->c0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lec/e;->s()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lec/e;->r()V

    :goto_0
    return-void
.end method

.method private r()V
    .locals 4

    .line 1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lec/e;->o:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "AppRtcAudioManager"

    if-ne v0, v1, :cond_1

    const-string v0, "Audio focus request granted for VOICE_CALL streams"

    .line 3
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string v0, "Audio focus request failed"

    .line 4
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private s()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x2

    .line 3
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v2, 0x1

    .line 4
    invoke-virtual {v0, v2}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    .line 6
    new-instance v3, Landroid/media/AudioFocusRequest$Builder;

    invoke-direct {v3, v1}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    .line 7
    invoke-virtual {v3, v0}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    .line 8
    invoke-virtual {v0, v2}, Landroid/media/AudioFocusRequest$Builder;->setAcceptsDelayedFocusGain(Z)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    .line 9
    invoke-virtual {v0, v2}, Landroid/media/AudioFocusRequest$Builder;->setWillPauseWhenDucked(Z)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    iget-object v1, p0, Lec/e;->o:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 10
    invoke-virtual {v0, v1}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object v0

    iput-object v0, p0, Lec/e;->p:Landroid/media/AudioFocusRequest;

    .line 12
    iget-object v1, p0, Lec/e;->b:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    move-result v0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestAudioFocusNew: result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lfc/a;->h(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private t(Lec/e$b;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setAudioDeviceInternal(device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lec/e;->m:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lfc/a;->a(Z)V

    .line 3
    sget-object v0, Lec/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    const-string v0, "Invalid audio device selection"

    .line 4
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Lec/e;->v(Z)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-direct {p0, v2}, Lec/e;->v(Z)V

    .line 7
    :goto_0
    iput-object p1, p0, Lec/e;->k:Lec/e$b;

    return-void
.end method

.method private u(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v0

    if-ne v0, p1, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    return-void
.end method

.method private v(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v0

    if-ne v0, p1, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    return-void
.end method

.method private y(Landroid/content/BroadcastReceiver;)V
    .locals 1

    iget-object v0, p0, Lec/e;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method private z()V
    .locals 5

    .line 1
    invoke-static {}, Lfc/a;->f()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "---> updateAudioDeviceState: wired headset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lec/e;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", BT isHeadsetAvailable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lec/e;->l:Lec/l;

    .line 3
    invoke-virtual {v1}, Lec/l;->s()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcAudioManager"

    .line 4
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device status: available="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lec/e;->m:Ljava/util/Set;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", selected="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lec/e;->k:Lec/e$b;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    const-string v0, "Mode != MODE_IN_COMMUNICATION"

    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, p0, Lec/e;->b:Landroid/media/AudioManager;

    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->setMode(I)V

    .line 10
    :cond_0
    iget-object v0, p0, Lec/e;->d:Lec/e$c;

    sget-object v3, Lec/e$c;->n:Lec/e$c;

    if-ne v0, v3, :cond_1

    const-string v0, "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED"

    .line 11
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 12
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 13
    iget-object v3, p0, Lec/e;->l:Lec/l;

    invoke-virtual {v3}, Lec/l;->t()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 14
    sget-object v3, Lec/e$b;->q:Lec/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15
    :cond_2
    iget-boolean v3, p0, Lec/e;->h:Z

    if-eqz v3, :cond_3

    .line 16
    sget-object v3, Lec/e$b;->o:Lec/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 17
    :cond_3
    sget-object v3, Lec/e$b;->n:Lec/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-direct {p0}, Lec/e;->j()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 19
    sget-object v3, Lec/e$b;->p:Lec/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    :cond_4
    :goto_0
    iget-object v3, p0, Lec/e;->m:Ljava/util/Set;

    invoke-interface {v3, v0}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    .line 21
    iput-object v0, p0, Lec/e;->m:Ljava/util/Set;

    .line 22
    iget-object v0, p0, Lec/e;->l:Lec/l;

    invoke-virtual {v0}, Lec/l;->t()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 23
    sget-object v0, Lec/e$b;->q:Lec/e$b;

    goto :goto_1

    .line 24
    :cond_5
    iget-boolean v0, p0, Lec/e;->h:Z

    if-eqz v0, :cond_6

    .line 25
    sget-object v0, Lec/e$b;->o:Lec/e$b;

    goto :goto_1

    .line 26
    :cond_6
    iget-object v0, p0, Lec/e;->j:Lec/e$b;

    .line 27
    :goto_1
    iget-object v4, p0, Lec/e;->k:Lec/e$b;

    if-ne v0, v4, :cond_7

    if-eqz v3, :cond_9

    .line 28
    :cond_7
    invoke-direct {p0, v0}, Lec/e;->t(Lec/e$b;)V

    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "New device status: available="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lec/e;->m:Ljava/util/Set;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    iget-object v0, p0, Lec/e;->c:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

    if-eqz v0, :cond_9

    .line 31
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 32
    iget-object v2, p0, Lec/e;->m:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lec/e$b;

    .line 33
    invoke-virtual {v3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 34
    :cond_8
    iget-object v2, p0, Lec/e;->c:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

    iget-object v3, p0, Lec/e;->k:Lec/e$b;

    invoke-virtual {v3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;->onAudioDeviceChanged(Ljava/lang/String;Ljava/util/Set;)V

    :cond_9
    const-string v0, "<--- updateAudioDeviceState done"

    .line 35
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public onDispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lec/e;->d:Lec/e$c;

    sget-object v1, Lec/e$c;->n:Lec/e$c;

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lec/e;->stopCommunication()V

    :cond_0
    return-void
.end method

.method public setActivityForPermissionRequest(Landroidx/appcompat/app/c;)V
    .locals 0

    return-void
.end method

.method public startCommunication(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V
    .locals 2

    const-string v0, "AppRtcAudioManager"

    const-string v1, "startCommunication"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget v0, p0, Lec/e;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lec/e;->i:I

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    new-instance v1, Lec/d;

    invoke-direct {v1, p0, p1}, Lec/d;-><init>(Lec/e;Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public stopCommunication()V
    .locals 2

    const-string v0, "AppRtcAudioManager"

    const-string v1, "stopCommunication"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget v0, p0, Lec/e;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lec/e;->i:I

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    new-instance v1, Lec/c;

    invoke-direct {v1, p0}, Lec/c;-><init>(Lec/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public w(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V
    .locals 3

    const-string v0, "AppRtcAudioManager"

    const-string v1, "start"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lfc/a;->f()V

    .line 3
    iget-object v1, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-nez v1, :cond_0

    const-string p1, "start: audioManager == null"

    .line 4
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_0
    iget-object v1, p0, Lec/e;->d:Lec/e$c;

    sget-object v2, Lec/e$c;->o:Lec/e$c;

    if-ne v1, v2, :cond_1

    const-string p1, "AudioManager is already active"

    .line 6
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string v1, "AudioManager starts..."

    .line 7
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    iput-object p1, p0, Lec/e;->c:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

    .line 9
    iput-object v2, p0, Lec/e;->d:Lec/e$c;

    .line 10
    iget-object p1, p0, Lec/e;->b:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->getMode()I

    move-result p1

    iput p1, p0, Lec/e;->e:I

    .line 11
    iget-object p1, p0, Lec/e;->b:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result p1

    iput-boolean p1, p0, Lec/e;->f:Z

    .line 12
    iget-object p1, p0, Lec/e;->b:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result p1

    iput-boolean p1, p0, Lec/e;->g:Z

    .line 13
    invoke-direct {p0}, Lec/e;->k()Z

    move-result p1

    iput-boolean p1, p0, Lec/e;->h:Z

    .line 14
    sget-object p1, Lec/a;->a:Lec/a;

    iput-object p1, p0, Lec/e;->o:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 15
    invoke-direct {p0}, Lec/e;->q()V

    .line 16
    iget-object p1, p0, Lec/e;->b:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setMode(I)V

    const/4 p1, 0x0

    .line 17
    invoke-direct {p0, p1}, Lec/e;->u(Z)V

    .line 18
    sget-object p1, Lec/e$b;->r:Lec/e$b;

    iput-object p1, p0, Lec/e;->k:Lec/e$b;

    .line 19
    iget-object p1, p0, Lec/e;->m:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 20
    iget-object p1, p0, Lec/e;->l:Lec/l;

    invoke-virtual {p1}, Lec/l;->E()V

    .line 21
    invoke-direct {p0}, Lec/e;->z()V

    .line 22
    iget-object p1, p0, Lec/e;->n:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.HEADSET_PLUG"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v1}, Lec/e;->p(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    const-string p1, "AudioManager started"

    .line 23
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public x()V
    .locals 3

    const-string v0, "AppRtcAudioManager"

    const-string v1, "stop"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lfc/a;->f()V

    .line 3
    iget-object v1, p0, Lec/e;->d:Lec/e$c;

    sget-object v2, Lec/e$c;->o:Lec/e$c;

    if-eq v1, v2, :cond_0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to stop AudioManager in incorrect state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lec/e;->d:Lec/e$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_0
    sget-object v1, Lec/e$c;->n:Lec/e$c;

    iput-object v1, p0, Lec/e;->d:Lec/e$c;

    .line 6
    iget-object v1, p0, Lec/e;->n:Landroid/content/BroadcastReceiver;

    invoke-direct {p0, v1}, Lec/e;->y(Landroid/content/BroadcastReceiver;)V

    .line 7
    iget-object v1, p0, Lec/e;->l:Lec/l;

    invoke-virtual {v1}, Lec/l;->I()V

    .line 8
    iget-object v1, p0, Lec/e;->b:Landroid/media/AudioManager;

    if-eqz v1, :cond_2

    .line 9
    iget-boolean v1, p0, Lec/e;->f:Z

    invoke-direct {p0, v1}, Lec/e;->v(Z)V

    .line 10
    iget-boolean v1, p0, Lec/e;->g:Z

    invoke-direct {p0, v1}, Lec/e;->u(Z)V

    .line 11
    iget v1, p0, Lec/e;->e:I

    const/4 v2, -0x2

    if-eq v1, v2, :cond_1

    .line 12
    iget-object v2, p0, Lec/e;->b:Landroid/media/AudioManager;

    invoke-virtual {v2, v1}, Landroid/media/AudioManager;->setMode(I)V

    .line 13
    :cond_1
    invoke-direct {p0}, Lec/e;->d()V

    :cond_2
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lec/e;->o:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const-string v2, "Abandoned audio focus for VOICE_CALL streams"

    .line 15
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    iput-object v1, p0, Lec/e;->c:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

    const-string v1, "AudioManager stopped"

    .line 17
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
