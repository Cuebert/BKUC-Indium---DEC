.class public Lec/j;
.super Lcom/roblox/audio/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lec/j$c;,
        Lec/j$b;
    }
.end annotation


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/media/AudioManager;

.field private d:Lcom/roblox/audio/a$b;

.field private e:Lec/j$b;

.field private f:I

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:I

.field private final k:Lcom/roblox/audio/a$a;

.field private l:Lcom/roblox/audio/a$a;

.field private final m:Lec/l;

.field private n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/roblox/audio/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Landroid/content/BroadcastReceiver;

.field private p:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private q:Landroid/media/AudioFocusRequest;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/roblox/audio/a;-><init>()V

    const/4 v0, -0x2

    .line 2
    iput v0, p0, Lec/j;->f:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lec/j;->j:I

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lec/j;->n:Ljava/util/Set;

    const-string v0, "AppRtcAudioManagerNew"

    const-string v1, "ctor"

    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-static {}, Lfc/a;->f()V

    .line 7
    iput-object p1, p0, Lec/j;->b:Landroid/content/Context;

    const-string v1, "audio"

    .line 8
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/AudioManager;

    iput-object v1, p0, Lec/j;->c:Landroid/media/AudioManager;

    .line 9
    new-instance v1, Lec/g;

    invoke-direct {v1, p0}, Lec/g;-><init>(Lec/j;)V

    invoke-static {p1, v1}, Lec/l;->n(Landroid/content/Context;Lec/l$f;)Lec/l;

    move-result-object p1

    iput-object p1, p0, Lec/j;->m:Lec/l;

    .line 10
    new-instance p1, Lec/j$c;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1}, Lec/j$c;-><init>(Lec/j;Lec/j$a;)V

    iput-object p1, p0, Lec/j;->o:Landroid/content/BroadcastReceiver;

    .line 11
    sget-object p1, Lec/j$b;->n:Lec/j$b;

    iput-object p1, p0, Lec/j;->e:Lec/j$b;

    .line 12
    sget-object p1, Lcom/roblox/audio/a$a;->n:Lcom/roblox/audio/a$a;

    iput-object p1, p0, Lec/j;->k:Lcom/roblox/audio/a$a;

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
    invoke-virtual {p0, p0}, Lcom/roblox/audio/a;->h(Lcom/roblox/audio/a;)V

    return-void
.end method

.method private A()V
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
    invoke-direct {p0}, Lec/j;->C()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lec/j;->B()V

    :goto_0
    return-void
.end method

.method private B()V
    .locals 4

    .line 1
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lec/j;->p:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "AppRtcAudioManagerNew"

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

.method private C()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 1
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

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

    iget-object v1, p0, Lec/j;->p:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 10
    invoke-virtual {v0, v1}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object v0

    iput-object v0, p0, Lec/j;->q:Landroid/media/AudioFocusRequest;

    .line 12
    iget-object v1, p0, Lec/j;->c:Landroid/media/AudioManager;

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

    const-string v1, "AppRtcAudioManagerNew"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private D(Lcom/roblox/audio/a$a;)V
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

    const-string v1, "AppRtcAudioManagerNew"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lec/j;->n:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lfc/a;->a(Z)V

    .line 3
    sget-object v0, Lec/j$a;->a:[I

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
    invoke-direct {p0, v0}, Lec/j;->F(Z)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-direct {p0, v2}, Lec/j;->F(Z)V

    .line 7
    :goto_0
    iput-object p1, p0, Lec/j;->l:Lcom/roblox/audio/a$a;

    return-void
.end method

.method private E(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

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
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    return-void
.end method

.method private F(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

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
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    return-void
.end method

.method private I(Landroid/content/BroadcastReceiver;)V
    .locals 1

    iget-object v0, p0, Lec/j;->b:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method private J()V
    .locals 5

    .line 1
    invoke-static {}, Lfc/a;->f()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "---> updateAudioDeviceState: wired headset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lec/j;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", BT isHeadsetAvailable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lec/j;->m:Lec/l;

    .line 3
    invoke-virtual {v1}, Lec/l;->s()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcAudioManagerNew"

    .line 4
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device status: available="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lec/j;->n:Ljava/util/Set;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", selected="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lec/j;->l:Lcom/roblox/audio/a$a;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    const-string v0, "Mode != MODE_IN_COMMUNICATION"

    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    :cond_0
    iget-object v0, p0, Lec/j;->e:Lec/j$b;

    sget-object v3, Lec/j$b;->n:Lec/j$b;

    if-ne v0, v3, :cond_1

    const-string v0, "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED"

    .line 9
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 10
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 11
    iget-object v3, p0, Lec/j;->m:Lec/l;

    invoke-virtual {v3}, Lec/l;->t()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 12
    sget-object v3, Lcom/roblox/audio/a$a;->q:Lcom/roblox/audio/a$a;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    :cond_2
    iget-boolean v3, p0, Lec/j;->i:Z

    if-eqz v3, :cond_3

    .line 14
    sget-object v3, Lcom/roblox/audio/a$a;->o:Lcom/roblox/audio/a$a;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 15
    :cond_3
    sget-object v3, Lcom/roblox/audio/a$a;->n:Lcom/roblox/audio/a$a;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-direct {p0}, Lec/j;->t()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 17
    sget-object v3, Lcom/roblox/audio/a$a;->p:Lcom/roblox/audio/a$a;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    :cond_4
    :goto_0
    iget-object v3, p0, Lec/j;->n:Ljava/util/Set;

    invoke-interface {v3, v0}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    .line 19
    iput-object v0, p0, Lec/j;->n:Ljava/util/Set;

    .line 20
    iget-object v0, p0, Lec/j;->m:Lec/l;

    invoke-virtual {v0}, Lec/l;->t()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 21
    sget-object v0, Lcom/roblox/audio/a$a;->q:Lcom/roblox/audio/a$a;

    goto :goto_1

    .line 22
    :cond_5
    iget-boolean v0, p0, Lec/j;->i:Z

    if-eqz v0, :cond_6

    .line 23
    sget-object v0, Lcom/roblox/audio/a$a;->o:Lcom/roblox/audio/a$a;

    goto :goto_1

    .line 24
    :cond_6
    iget-object v0, p0, Lec/j;->k:Lcom/roblox/audio/a$a;

    .line 25
    :goto_1
    iget-object v4, p0, Lec/j;->l:Lcom/roblox/audio/a$a;

    if-ne v0, v4, :cond_7

    if-eqz v3, :cond_8

    .line 26
    :cond_7
    invoke-direct {p0, v0}, Lec/j;->D(Lcom/roblox/audio/a$a;)V

    .line 27
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "New device status: available="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lec/j;->n:Ljava/util/Set;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    iget-object v0, p0, Lec/j;->d:Lcom/roblox/audio/a$b;

    if-eqz v0, :cond_8

    .line 29
    iget-object v2, p0, Lec/j;->l:Lcom/roblox/audio/a$a;

    iget-object v3, p0, Lec/j;->n:Ljava/util/Set;

    invoke-interface {v0, v2, v3}, Lcom/roblox/audio/a$b;->a(Lcom/roblox/audio/a$a;Ljava/util/Set;)V

    :cond_8
    const-string v0, "<--- updateAudioDeviceState done"

    .line 30
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic k(I)V
    .locals 0

    invoke-static {p0}, Lec/j;->x(I)V

    return-void
.end method

.method public static synthetic l(Lec/j;)V
    .locals 0

    invoke-direct {p0}, Lec/j;->J()V

    return-void
.end method

.method public static synthetic m(Lec/j;Lcom/roblox/audio/a$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lec/j;->y(Lcom/roblox/audio/a$b;)V

    return-void
.end method

.method private n()V
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
    invoke-direct {p0}, Lec/j;->p()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lec/j;->o()V

    :goto_0
    return-void
.end method

.method private o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lec/j;->p:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    return-void
.end method

.method private p()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 1
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lec/j;->q:Landroid/media/AudioFocusRequest;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    return-void
.end method

.method static synthetic q(Lec/j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lec/j;->i:Z

    return p1
.end method

.method static synthetic r(Lec/j;)V
    .locals 0

    invoke-direct {p0}, Lec/j;->J()V

    return-void
.end method

.method public static s(Landroid/content/Context;)Lec/j;
    .locals 1

    new-instance v0, Lec/j;

    invoke-direct {v0, p0}, Lec/j;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private t()Z
    .locals 2

    iget-object v0, p0, Lec/j;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.telephony"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private u()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    .line 3
    invoke-direct {p0}, Lec/j;->v()Z

    move-result v0

    return v0

    .line 4
    :cond_1
    invoke-direct {p0}, Lec/j;->w()Z

    move-result v0

    return v0
.end method

.method private v()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->isWiredHeadsetOn()Z

    move-result v0

    return v0
.end method

.method private w()Z
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 1
    iget-object v0, p0, Lec/j;->c:Landroid/media/AudioManager;

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

    const-string v6, "AppRtcAudioManagerNew"

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

.method private static synthetic x(I)V
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

    const-string v0, "AppRtcAudioManagerNew"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private synthetic y(Lcom/roblox/audio/a$b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lec/j;->G(Lcom/roblox/audio/a$b;)V

    return-void
.end method

.method private z(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 1

    iget-object v0, p0, Lec/j;->b:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public G(Lcom/roblox/audio/a$b;)V
    .locals 3

    const-string v0, "AppRtcAudioManagerNew"

    const-string v1, "start"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lfc/a;->f()V

    .line 3
    iget-object v1, p0, Lec/j;->c:Landroid/media/AudioManager;

    if-nez v1, :cond_0

    const-string p1, "start: audioManager == null"

    .line 4
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_0
    iget-object v1, p0, Lec/j;->e:Lec/j$b;

    sget-object v2, Lec/j$b;->o:Lec/j$b;

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
    iput-object p1, p0, Lec/j;->d:Lcom/roblox/audio/a$b;

    .line 9
    iput-object v2, p0, Lec/j;->e:Lec/j$b;

    .line 10
    iget-object p1, p0, Lec/j;->c:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->getMode()I

    move-result p1

    iput p1, p0, Lec/j;->f:I

    .line 11
    iget-object p1, p0, Lec/j;->c:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result p1

    iput-boolean p1, p0, Lec/j;->g:Z

    .line 12
    iget-object p1, p0, Lec/j;->c:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result p1

    iput-boolean p1, p0, Lec/j;->h:Z

    .line 13
    invoke-direct {p0}, Lec/j;->u()Z

    move-result p1

    iput-boolean p1, p0, Lec/j;->i:Z

    .line 14
    sget-object p1, Lec/f;->a:Lec/f;

    iput-object p1, p0, Lec/j;->p:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 15
    invoke-direct {p0}, Lec/j;->A()V

    .line 16
    iget-object p1, p0, Lec/j;->c:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setMode(I)V

    const/4 p1, 0x0

    .line 17
    invoke-direct {p0, p1}, Lec/j;->E(Z)V

    .line 18
    sget-object p1, Lcom/roblox/audio/a$a;->r:Lcom/roblox/audio/a$a;

    iput-object p1, p0, Lec/j;->l:Lcom/roblox/audio/a$a;

    .line 19
    iget-object p1, p0, Lec/j;->n:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 20
    iget-object p1, p0, Lec/j;->m:Lec/l;

    invoke-virtual {p1}, Lec/l;->E()V

    .line 21
    invoke-direct {p0}, Lec/j;->J()V

    .line 22
    iget-object p1, p0, Lec/j;->o:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.HEADSET_PLUG"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v1}, Lec/j;->z(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    const-string p1, "AudioManager started"

    .line 23
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public H()V
    .locals 3

    const-string v0, "AppRtcAudioManagerNew"

    const-string v1, "stop"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lfc/a;->f()V

    .line 3
    iget-object v1, p0, Lec/j;->e:Lec/j$b;

    sget-object v2, Lec/j$b;->o:Lec/j$b;

    if-eq v1, v2, :cond_0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to stop AudioManager in incorrect state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lec/j;->e:Lec/j$b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_0
    sget-object v1, Lec/j$b;->n:Lec/j$b;

    iput-object v1, p0, Lec/j;->e:Lec/j$b;

    .line 6
    iget-object v1, p0, Lec/j;->o:Landroid/content/BroadcastReceiver;

    invoke-direct {p0, v1}, Lec/j;->I(Landroid/content/BroadcastReceiver;)V

    .line 7
    iget-object v1, p0, Lec/j;->m:Lec/l;

    invoke-virtual {v1}, Lec/l;->I()V

    .line 8
    iget-object v1, p0, Lec/j;->c:Landroid/media/AudioManager;

    if-eqz v1, :cond_2

    .line 9
    iget-boolean v1, p0, Lec/j;->g:Z

    invoke-direct {p0, v1}, Lec/j;->F(Z)V

    .line 10
    iget-boolean v1, p0, Lec/j;->h:Z

    invoke-direct {p0, v1}, Lec/j;->E(Z)V

    .line 11
    iget v1, p0, Lec/j;->f:I

    const/4 v2, -0x2

    if-eq v1, v2, :cond_1

    .line 12
    iget-object v2, p0, Lec/j;->c:Landroid/media/AudioManager;

    invoke-virtual {v2, v1}, Landroid/media/AudioManager;->setMode(I)V

    .line 13
    :cond_1
    invoke-direct {p0}, Lec/j;->n()V

    :cond_2
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lec/j;->p:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const-string v2, "Abandoned audio focus for VOICE_CALL streams"

    .line 15
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    iput-object v1, p0, Lec/j;->d:Lcom/roblox/audio/a$b;

    const-string v1, "AudioManager stopped"

    .line 17
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public c()Lcom/roblox/audio/a$a;
    .locals 1

    iget-object v0, p0, Lec/j;->l:Lcom/roblox/audio/a$a;

    return-object v0
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lec/j;->e:Lec/j$b;

    sget-object v1, Lec/j$b;->n:Lec/j$b;

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lec/j;->j()V

    :cond_0
    return-void
.end method

.method public f(Landroidx/appcompat/app/c;)V
    .locals 0

    return-void
.end method

.method public i(Lcom/roblox/audio/a$b;)V
    .locals 2

    const-string v0, "AppRtcAudioManagerNew"

    const-string v1, "startCommunication"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget v0, p0, Lec/j;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lec/j;->j:I

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    new-instance v1, Lec/i;

    invoke-direct {v1, p0, p1}, Lec/i;-><init>(Lec/j;Lcom/roblox/audio/a$b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public j()V
    .locals 2

    const-string v0, "AppRtcAudioManagerNew"

    const-string v1, "stopCommunication"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget v0, p0, Lec/j;->j:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lec/j;->j:I

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    new-instance v1, Lec/h;

    invoke-direct {v1, p0}, Lec/h;-><init>(Lec/j;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
