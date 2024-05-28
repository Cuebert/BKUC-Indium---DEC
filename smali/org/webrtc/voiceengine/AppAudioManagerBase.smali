.class public abstract Lorg/webrtc/voiceengine/AppAudioManagerBase;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;
    }
.end annotation


# static fields
.field private static sInstance:Lorg/webrtc/voiceengine/AppAudioManagerBase;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lorg/webrtc/voiceengine/AppAudioManagerBase;
    .locals 1

    sget-object v0, Lorg/webrtc/voiceengine/AppAudioManagerBase;->sInstance:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    return-object v0
.end method

.method public static hasInstance()Z
    .locals 1

    sget-object v0, Lorg/webrtc/voiceengine/AppAudioManagerBase;->sInstance:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public dispose()V
    .locals 1

    .line 1
    sget-object v0, Lorg/webrtc/voiceengine/AppAudioManagerBase;->sInstance:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    if-ne p0, v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lorg/webrtc/voiceengine/AppAudioManagerBase;->onDispose()V

    const/4 v0, 0x0

    .line 3
    sput-object v0, Lorg/webrtc/voiceengine/AppAudioManagerBase;->sInstance:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    :cond_0
    return-void
.end method

.method public abstract onDispose()V
.end method

.method public setActivityForPermissionRequest(Landroidx/appcompat/app/c;)V
    .locals 0

    return-void
.end method

.method public setCommunicationMute(Z)V
    .locals 0

    return-void
.end method

.method protected setInstance(Lorg/webrtc/voiceengine/AppAudioManagerBase;)V
    .locals 0

    sput-object p1, Lorg/webrtc/voiceengine/AppAudioManagerBase;->sInstance:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    return-void
.end method

.method public abstract startCommunication(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V
.end method

.method public abstract stopCommunication()V
.end method
