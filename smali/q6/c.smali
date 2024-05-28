.class public Lq6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/a;


# instance fields
.field final a:Lorg/webrtc/voiceengine/AppAudioManagerBase;

.field final b:Lcom/roblox/audio/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->S0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p1}, Lec/j;->s(Landroid/content/Context;)Lec/j;

    move-result-object p1

    iput-object p1, p0, Lq6/c;->b:Lcom/roblox/audio/a;

    .line 4
    iput-object v1, p0, Lq6/c;->a:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    goto :goto_0

    .line 5
    :cond_0
    iput-object v1, p0, Lq6/c;->b:Lcom/roblox/audio/a;

    .line 6
    invoke-static {p1}, Lec/e;->i(Landroid/content/Context;)Lec/e;

    move-result-object p1

    iput-object p1, p0, Lq6/c;->a:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroidx/appcompat/app/c;)V
    .locals 1

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->S0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lq6/c;->b:Lcom/roblox/audio/a;

    invoke-virtual {v0, p1}, Lcom/roblox/audio/a;->f(Landroidx/appcompat/app/c;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lq6/c;->a:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    invoke-virtual {v0, p1}, Lorg/webrtc/voiceengine/AppAudioManagerBase;->setActivityForPermissionRequest(Landroidx/appcompat/app/c;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->S0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lq6/c;->b:Lcom/roblox/audio/a;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/roblox/audio/a;->a()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lq6/c;->a:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lorg/webrtc/voiceengine/AppAudioManagerBase;->dispose()V

    :cond_1
    :goto_0
    return-void
.end method
