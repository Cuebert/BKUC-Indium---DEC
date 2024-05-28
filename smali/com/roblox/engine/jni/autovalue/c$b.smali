.class final Lcom/roblox/engine/jni/autovalue/c$b;
.super Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/view/Surface;

.field private b:Lcom/roblox/engine/jni/model/PlatformParams;

.field private c:Lcom/roblox/engine/jni/model/DeviceParams;

.field private d:Ljava/lang/Long;

.field private e:Ljava/lang/Long;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/Boolean;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/Long;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/Integer;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Landroid/app/Activity;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method a()Lcom/roblox/engine/jni/autovalue/StartGameParams;
    .locals 28

    move-object/from16 v0, p0

    .line 1
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->a:Landroid/view/Surface;

    if-eqz v2, :cond_1

    iget-object v3, v0, Lcom/roblox/engine/jni/autovalue/c$b;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    if-eqz v3, :cond_1

    iget-object v5, v0, Lcom/roblox/engine/jni/autovalue/c$b;->d:Ljava/lang/Long;

    if-eqz v5, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->e:Ljava/lang/Long;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->f:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->g:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->h:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->i:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->j:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->k:Ljava/lang/Long;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->l:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->m:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->n:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->o:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->p:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->q:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->r:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->s:Ljava/lang/String;

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v26, Lcom/roblox/engine/jni/autovalue/c;

    move-object/from16 v1, v26

    iget-object v4, v0, Lcom/roblox/engine/jni/autovalue/c$b;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    .line 3
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v7, v0, Lcom/roblox/engine/jni/autovalue/c$b;->e:Ljava/lang/Long;

    .line 4
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v9, v0, Lcom/roblox/engine/jni/autovalue/c$b;->f:Ljava/lang/String;

    iget-object v10, v0, Lcom/roblox/engine/jni/autovalue/c$b;->g:Ljava/lang/String;

    iget-object v11, v0, Lcom/roblox/engine/jni/autovalue/c$b;->h:Ljava/lang/String;

    iget-object v12, v0, Lcom/roblox/engine/jni/autovalue/c$b;->i:Ljava/lang/Boolean;

    .line 5
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    iget-object v13, v0, Lcom/roblox/engine/jni/autovalue/c$b;->j:Ljava/lang/String;

    iget-object v14, v0, Lcom/roblox/engine/jni/autovalue/c$b;->k:Ljava/lang/Long;

    .line 6
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    move-object/from16 v27, v1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->l:Ljava/lang/String;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->m:Ljava/lang/String;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->n:Ljava/lang/Integer;

    .line 7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v18

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->o:Ljava/lang/String;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->p:Ljava/lang/String;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->q:Ljava/lang/String;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->r:Ljava/lang/String;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->s:Ljava/lang/String;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/c$b;->t:Landroid/app/Activity;

    move-object/from16 v24, v1

    const/16 v25, 0x0

    move-object/from16 v1, v27

    invoke-direct/range {v1 .. v25}, Lcom/roblox/engine/jni/autovalue/c;-><init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/c$a;)V

    return-object v26

    .line 8
    :cond_1
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->a:Landroid/view/Surface;

    if-nez v2, :cond_2

    const-string v2, " surface"

    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    :cond_2
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    if-nez v2, :cond_3

    const-string v2, " platformParams"

    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    :cond_3
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->d:Ljava/lang/Long;

    if-nez v2, :cond_4

    const-string v2, " placeId"

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    :cond_4
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->e:Ljava/lang/Long;

    if-nez v2, :cond_5

    const-string v2, " userId"

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    :cond_5
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->f:Ljava/lang/String;

    if-nez v2, :cond_6

    const-string v2, " accessCode"

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    :cond_6
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->g:Ljava/lang/String;

    if-nez v2, :cond_7

    const-string v2, " linkCode"

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    :cond_7
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->h:Ljava/lang/String;

    if-nez v2, :cond_8

    const-string v2, " gameId"

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    :cond_8
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->i:Ljava/lang/Boolean;

    if-nez v2, :cond_9

    const-string v2, " isUnder13"

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    :cond_9
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->j:Ljava/lang/String;

    if-nez v2, :cond_a

    const-string v2, " username"

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    :cond_a
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->k:Ljava/lang/Long;

    if-nez v2, :cond_b

    const-string v2, " conversationId"

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    :cond_b
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->l:Ljava/lang/String;

    if-nez v2, :cond_c

    const-string v2, " reservedServerAccessCode"

    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    :cond_c
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->m:Ljava/lang/String;

    if-nez v2, :cond_d

    const-string v2, " callId"

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    :cond_d
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->n:Ljava/lang/Integer;

    if-nez v2, :cond_e

    const-string v2, " joinRequestType"

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    :cond_e
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->o:Ljava/lang/String;

    if-nez v2, :cond_f

    const-string v2, " referralPage"

    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    :cond_f
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->p:Ljava/lang/String;

    if-nez v2, :cond_10

    const-string v2, " launchData"

    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    :cond_10
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->q:Ljava/lang/String;

    if-nez v2, :cond_11

    const-string v2, " joinAttemptId"

    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    :cond_11
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->r:Ljava/lang/String;

    if-nez v2, :cond_12

    const-string v2, " joinAttemptOrigin"

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    :cond_12
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/c$b;->s:Ljava/lang/String;

    if-nez v2, :cond_13

    const-string v2, " isoContext"

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    :cond_13
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null accessCode"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null callId"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->m:Ljava/lang/String;

    return-object p0
.end method

.method public e(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->k:Ljava/lang/Long;

    return-object p0
.end method

.method public f(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null gameId"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public h(Z)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public i(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null isoContext"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->s:Ljava/lang/String;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null joinAttemptId"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->q:Ljava/lang/String;

    return-object p0
.end method

.method public k(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null joinAttemptOrigin"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->r:Ljava/lang/String;

    return-object p0
.end method

.method public l(I)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->n:Ljava/lang/Integer;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null launchData"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->p:Ljava/lang/String;

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null linkCode"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public o(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public p(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null platformParams"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object p0
.end method

.method public q(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null referralPage"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->o:Ljava/lang/String;

    return-object p0
.end method

.method public r(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null reservedServerAccessCode"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->l:Ljava/lang/String;

    return-object p0
.end method

.method public s(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null surface"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->a:Landroid/view/Surface;

    return-object p0
.end method

.method public t(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->e:Ljava/lang/Long;

    return-object p0
.end method

.method public u(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    const-string v0, "Null username"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method public v(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/c$b;->t:Landroid/app/Activity;

    return-object p0
.end method
