.class public abstract Lcom/roblox/engine/jni/autovalue/StartGameParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "StartGameParams"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 2

    .line 1
    new-instance v0, Lcom/roblox/engine/jni/autovalue/c$b;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/c$b;-><init>()V

    const-string v1, ""

    .line 2
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/c$b;->m(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    .line 3
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->n(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    .line 4
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->r(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    .line 5
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->d(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    .line 6
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->j(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    .line 7
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->k(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    .line 8
    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->i(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract accessCode()Ljava/lang/String;
.end method

.method public abstract callId()Ljava/lang/String;
.end method

.method public abstract conversationId()J
.end method

.method public abstract deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;
.end method

.method public abstract gameId()Ljava/lang/String;
.end method

.method public abstract isUnder13()Z
.end method

.method public abstract isoContext()Ljava/lang/String;
.end method

.method public abstract joinAttemptId()Ljava/lang/String;
.end method

.method public abstract joinAttemptOrigin()Ljava/lang/String;
.end method

.method public abstract joinRequestType()I
.end method

.method public abstract launchData()Ljava/lang/String;
.end method

.method public abstract linkCode()Ljava/lang/String;
.end method

.method public abstract placeId()J
.end method

.method public abstract platformParams()Lcom/roblox/engine/jni/model/PlatformParams;
.end method

.method public abstract referralPage()Ljava/lang/String;
.end method

.method public abstract reservedServerAccessCode()Ljava/lang/String;
.end method

.method public abstract surface()Landroid/view/Surface;
.end method

.method public abstract userId()J
.end method

.method public abstract username()Ljava/lang/String;
.end method

.method public abstract vrContext()Landroid/app/Activity;
.end method
