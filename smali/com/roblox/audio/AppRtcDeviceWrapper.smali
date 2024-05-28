.class public Lcom/roblox/audio/AppRtcDeviceWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/audio/AppRtcDeviceWrapper$b;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "AppRtcDeviceWrapper"


# instance fields
.field private final audioManagerEvents:Lcom/roblox/audio/AppRtcDeviceWrapper$b;

.field private final nativeReference:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/roblox/audio/AppRtcDeviceWrapper;->nativeReference:J

    const-string p1, "AppRtcDeviceWrapper"

    const-string p2, "ctor AppRtcDeviceWrapper"

    .line 3
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lcom/roblox/audio/a;->d()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 5
    new-instance p1, Lcom/roblox/audio/AppRtcDeviceWrapper$b;

    invoke-direct {p1, p0, p2}, Lcom/roblox/audio/AppRtcDeviceWrapper$b;-><init>(Lcom/roblox/audio/AppRtcDeviceWrapper;Lcom/roblox/audio/AppRtcDeviceWrapper$a;)V

    iput-object p1, p0, Lcom/roblox/audio/AppRtcDeviceWrapper;->audioManagerEvents:Lcom/roblox/audio/AppRtcDeviceWrapper$b;

    goto :goto_0

    .line 6
    :cond_0
    iput-object p2, p0, Lcom/roblox/audio/AppRtcDeviceWrapper;->audioManagerEvents:Lcom/roblox/audio/AppRtcDeviceWrapper$b;

    :goto_0
    return-void
.end method

.method static synthetic access$000(Lcom/roblox/audio/AppRtcDeviceWrapper;)J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/audio/AppRtcDeviceWrapper;->nativeReference:J

    return-wide v0
.end method

.method static synthetic access$100(Lcom/roblox/audio/AppRtcDeviceWrapper;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/audio/AppRtcDeviceWrapper;->nativeAudioDeviceChanged(IJ)V

    return-void
.end method

.method private native nativeAudioDeviceChanged(IJ)V
.end method


# virtual methods
.method public getSelectedAudioDeviceAsInt()I
    .locals 2

    .line 1
    invoke-static {}, Lcom/roblox/audio/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "AppRtcDeviceWrapper"

    const-string v1, "Warning: Native AppRtcDeviceWrapper invoked with invalid AppRtcAudioManager"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    sget-object v0, Lcom/roblox/audio/a$a;->r:Lcom/roblox/audio/a$a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0

    .line 4
    :cond_0
    invoke-static {}, Lcom/roblox/audio/a;->b()Lcom/roblox/audio/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/audio/a;->c()Lcom/roblox/audio/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public getSelectedAudioDeviceName()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/roblox/audio/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "AppRtcDeviceWrapper"

    const-string v1, "Warning: Native AppRtcDeviceWrapper invoked with invalid AppRtcAudioManager"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "INVALID INSTANCE"

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/roblox/audio/a;->b()Lcom/roblox/audio/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/audio/a;->c()Lcom/roblox/audio/a$a;

    move-result-object v0

    .line 4
    sget-object v1, Lcom/roblox/audio/a$a;->n:Lcom/roblox/audio/a$a;

    if-ne v0, v1, :cond_1

    const-string v0, "Android Audio (Speaker)"

    return-object v0

    .line 5
    :cond_1
    sget-object v1, Lcom/roblox/audio/a$a;->o:Lcom/roblox/audio/a$a;

    if-ne v0, v1, :cond_2

    const-string v0, "Android Audio (Wired Device)"

    return-object v0

    .line 6
    :cond_2
    sget-object v1, Lcom/roblox/audio/a$a;->p:Lcom/roblox/audio/a$a;

    if-ne v0, v1, :cond_3

    const-string v0, "Android Audio (Earpiece)"

    return-object v0

    .line 7
    :cond_3
    sget-object v1, Lcom/roblox/audio/a$a;->q:Lcom/roblox/audio/a$a;

    if-ne v0, v1, :cond_4

    const-string v0, "Android Audio (Bluetooth)"

    return-object v0

    :cond_4
    const-string v0, "Android Audio (NONE)"

    return-object v0
.end method

.method public isValid()Z
    .locals 1

    invoke-static {}, Lcom/roblox/audio/a;->d()Z

    move-result v0

    return v0
.end method

.method public wrapSetCommunicationMute(Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setMicrophoneMute("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcDeviceWrapper"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/roblox/audio/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/roblox/audio/a;->b()Lcom/roblox/audio/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/audio/a;->g(Z)V

    :cond_0
    return-void
.end method

.method public wrapStartCommunication()V
    .locals 2

    const-string v0, "AppRtcDeviceWrapper"

    const-string v1, "startCommunication()"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/roblox/audio/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/roblox/audio/a;->b()Lcom/roblox/audio/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/audio/AppRtcDeviceWrapper;->audioManagerEvents:Lcom/roblox/audio/AppRtcDeviceWrapper$b;

    invoke-virtual {v0, v1}, Lcom/roblox/audio/a;->i(Lcom/roblox/audio/a$b;)V

    :cond_0
    return-void
.end method

.method public wrapStopCommunication()V
    .locals 2

    const-string v0, "AppRtcDeviceWrapper"

    const-string v1, "stopCommunication()"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lcom/roblox/audio/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/roblox/audio/a;->b()Lcom/roblox/audio/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/audio/a;->j()V

    :cond_0
    return-void
.end method
