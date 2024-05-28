.class final Lcom/roblox/engine/jni/autovalue/c;
.super Lcom/roblox/engine/jni/autovalue/StartGameParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/c$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/view/Surface;

.field private final b:Lcom/roblox/engine/jni/model/PlatformParams;

.field private final c:Lcom/roblox/engine/jni/model/DeviceParams;

.field private final d:J

.field private final e:J

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Z

.field private final j:Ljava/lang/String;

.field private final k:J

.field private final l:Ljava/lang/String;

.field private final m:Ljava/lang/String;

.field private final n:I

.field private final o:Ljava/lang/String;

.field private final p:Ljava/lang/String;

.field private final q:Ljava/lang/String;

.field private final r:Ljava/lang/String;

.field private final s:Ljava/lang/String;

.field private final t:Landroid/app/Activity;


# direct methods
.method private constructor <init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/StartGameParams;-><init>()V

    move-object v1, p1

    .line 3
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->a:Landroid/view/Surface;

    move-object v1, p2

    .line 4
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    move-object v1, p3

    .line 5
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    move-wide v1, p4

    .line 6
    iput-wide v1, v0, Lcom/roblox/engine/jni/autovalue/c;->d:J

    move-wide v1, p6

    .line 7
    iput-wide v1, v0, Lcom/roblox/engine/jni/autovalue/c;->e:J

    move-object v1, p8

    .line 8
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->f:Ljava/lang/String;

    move-object v1, p9

    .line 9
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->g:Ljava/lang/String;

    move-object v1, p10

    .line 10
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->h:Ljava/lang/String;

    move v1, p11

    .line 11
    iput-boolean v1, v0, Lcom/roblox/engine/jni/autovalue/c;->i:Z

    move-object v1, p12

    .line 12
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->j:Ljava/lang/String;

    move-wide/from16 v1, p13

    .line 13
    iput-wide v1, v0, Lcom/roblox/engine/jni/autovalue/c;->k:J

    move-object/from16 v1, p15

    .line 14
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->l:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 15
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->m:Ljava/lang/String;

    move/from16 v1, p17

    .line 16
    iput v1, v0, Lcom/roblox/engine/jni/autovalue/c;->n:I

    move-object/from16 v1, p18

    .line 17
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->o:Ljava/lang/String;

    move-object/from16 v1, p19

    .line 18
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->p:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 19
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->q:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 20
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->r:Ljava/lang/String;

    move-object/from16 v1, p22

    .line 21
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->s:Ljava/lang/String;

    move-object/from16 v1, p23

    .line 22
    iput-object v1, v0, Lcom/roblox/engine/jni/autovalue/c;->t:Landroid/app/Activity;

    return-void
.end method

.method synthetic constructor <init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/c$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p23}, Lcom/roblox/engine/jni/autovalue/c;-><init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public accessCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public callId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->m:Ljava/lang/String;

    return-object v0
.end method

.method public conversationId()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/engine/jni/autovalue/c;->k:J

    return-wide v0
.end method

.method public deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/roblox/engine/jni/autovalue/StartGameParams;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 2
    check-cast p1, Lcom/roblox/engine/jni/autovalue/StartGameParams;

    .line 3
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->a:Landroid/view/Surface;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->surface()Landroid/view/Surface;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    .line 4
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->platformParams()Lcom/roblox/engine/jni/model/PlatformParams;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    if-nez v1, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-wide v3, p0, Lcom/roblox/engine/jni/autovalue/c;->d:J

    .line 6
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->placeId()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_3

    iget-wide v3, p0, Lcom/roblox/engine/jni/autovalue/c;->e:J

    .line 7
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->userId()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->f:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->accessCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->g:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->linkCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->h:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->gameId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/c;->i:Z

    .line 11
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->isUnder13()Z

    move-result v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->j:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->username()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-wide v3, p0, Lcom/roblox/engine/jni/autovalue/c;->k:J

    .line 13
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->conversationId()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->l:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->reservedServerAccessCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->m:Ljava/lang/String;

    .line 15
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->callId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget v1, p0, Lcom/roblox/engine/jni/autovalue/c;->n:I

    .line 16
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->joinRequestType()I

    move-result v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->o:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->referralPage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->p:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->launchData()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->q:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->joinAttemptId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->r:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->joinAttemptOrigin()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->s:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->isoContext()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->t:Landroid/app/Activity;

    if-nez v1, :cond_2

    .line 22
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->vrContext()Landroid/app/Activity;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->vrContext()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_4
    return v2
.end method

.method public gameId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->h:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->a:Landroid/view/Surface;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 2
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/c;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 3
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/c;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 4
    iget-wide v4, p0, Lcom/roblox/engine/jni/autovalue/c;->d:J

    const/16 v2, 0x20

    ushr-long v6, v4, v2

    xor-long/2addr v4, v6

    long-to-int v5, v4

    xor-int/2addr v0, v5

    mul-int v0, v0, v1

    .line 5
    iget-wide v4, p0, Lcom/roblox/engine/jni/autovalue/c;->e:J

    ushr-long v6, v4, v2

    xor-long/2addr v4, v6

    long-to-int v5, v4

    xor-int/2addr v0, v5

    mul-int v0, v0, v1

    .line 6
    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/c;->f:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int v0, v0, v1

    .line 7
    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/c;->g:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int v0, v0, v1

    .line 8
    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/c;->h:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int v0, v0, v1

    .line 9
    iget-boolean v4, p0, Lcom/roblox/engine/jni/autovalue/c;->i:Z

    if-eqz v4, :cond_1

    const/16 v4, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v4, 0x4d5

    :goto_1
    xor-int/2addr v0, v4

    mul-int v0, v0, v1

    .line 10
    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/c;->j:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int v0, v0, v1

    .line 11
    iget-wide v4, p0, Lcom/roblox/engine/jni/autovalue/c;->k:J

    ushr-long v6, v4, v2

    xor-long/2addr v4, v6

    long-to-int v2, v4

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 12
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/c;->l:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 13
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/c;->m:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 14
    iget v2, p0, Lcom/roblox/engine/jni/autovalue/c;->n:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 15
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/c;->o:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 16
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/c;->p:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 17
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/c;->q:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 18
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/c;->r:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 19
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/c;->s:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 20
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->t:Landroid/app/Activity;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    return v0
.end method

.method public isUnder13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/engine/jni/autovalue/c;->i:Z

    return v0
.end method

.method public isoContext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->s:Ljava/lang/String;

    return-object v0
.end method

.method public joinAttemptId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->q:Ljava/lang/String;

    return-object v0
.end method

.method public joinAttemptOrigin()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->r:Ljava/lang/String;

    return-object v0
.end method

.method public joinRequestType()I
    .locals 1

    iget v0, p0, Lcom/roblox/engine/jni/autovalue/c;->n:I

    return v0
.end method

.method public launchData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->p:Ljava/lang/String;

    return-object v0
.end method

.method public linkCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->g:Ljava/lang/String;

    return-object v0
.end method

.method public placeId()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/engine/jni/autovalue/c;->d:J

    return-wide v0
.end method

.method public platformParams()Lcom/roblox/engine/jni/model/PlatformParams;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object v0
.end method

.method public referralPage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->o:Ljava/lang/String;

    return-object v0
.end method

.method public reservedServerAccessCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->l:Ljava/lang/String;

    return-object v0
.end method

.method public surface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->a:Landroid/view/Surface;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartGameParams{surface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->a:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/engine/jni/autovalue/c;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/engine/jni/autovalue/c;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", accessCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gameId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isUnder13="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/c;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", username="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", conversationId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/engine/jni/autovalue/c;->k:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", reservedServerAccessCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", callId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinRequestType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/roblox/engine/jni/autovalue/c;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", referralPage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", launchData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinAttemptId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinAttemptOrigin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isoContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", vrContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/c;->t:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public userId()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/engine/jni/autovalue/c;->e:J

    return-wide v0
.end method

.method public username()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->j:Ljava/lang/String;

    return-object v0
.end method

.method public vrContext()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/c;->t:Landroid/app/Activity;

    return-object v0
.end method
