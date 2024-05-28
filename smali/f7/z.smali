.class public Lf7/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:J

.field private c:J

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lf7/z;->a:J

    .line 3
    iput-wide v0, p0, Lf7/z;->b:J

    .line 4
    iput-wide v0, p0, Lf7/z;->c:J

    const-string v0, ""

    .line 5
    iput-object v0, p0, Lf7/z;->d:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lf7/z;->e:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lf7/z;->f:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lf7/z;->g:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lf7/z;->h:Ljava/lang/String;

    .line 10
    iput-object v0, p0, Lf7/z;->i:Ljava/lang/String;

    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lf7/z;->j:I

    .line 12
    iput-object v0, p0, Lf7/z;->k:Ljava/lang/String;

    .line 13
    iput-object v0, p0, Lf7/z;->l:Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lf7/z;->m:Ljava/lang/String;

    .line 15
    iput-object v0, p0, Lf7/z;->n:Ljava/lang/String;

    return-void
.end method

.method public static F(Landroid/os/Bundle;Lf7/z;)Landroid/os/Bundle;
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    .line 1
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 2
    :cond_1
    invoke-virtual {p1}, Lf7/z;->m()J

    move-result-wide v0

    const-string v2, "mPlaceId"

    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 3
    invoke-virtual {p1}, Lf7/z;->q()J

    move-result-wide v0

    const-string v2, "mUserId"

    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 4
    invoke-virtual {p1}, Lf7/z;->f()J

    move-result-wide v0

    const-string v2, "mConversationId"

    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 5
    invoke-virtual {p1}, Lf7/z;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mAccessCode"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lf7/z;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mLinkCode"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Lf7/z;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mGameId"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Lf7/z;->o()I

    move-result v0

    const-string v1, "mRequestType"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 9
    invoke-virtual {p1}, Lf7/z;->n()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mReferralPage"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Lf7/z;->k()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mLaunchData"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Lf7/z;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mJoinAttemptId"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1}, Lf7/z;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mJoinAttemptOrigin"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Lf7/z;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mIsoContext"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->m1()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 15
    invoke-virtual {p1}, Lf7/z;->p()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mReservedServerAccessCode"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1}, Lf7/z;->e()Ljava/lang/String;

    move-result-object p1

    const-string v0, "mCallId"

    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-object p0
.end method

.method public static G(Lf7/z;)Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lf7/z;->F(Landroid/os/Bundle;Lf7/z;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf7/z;
    .locals 17

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    .line 1
    new-instance v10, Lf7/z;

    invoke-direct {v10}, Lf7/z;-><init>()V

    const-wide/16 v11, -0x1

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    goto :goto_0

    :cond_0
    move-wide v13, v11

    :goto_0
    if-eqz p1, :cond_1

    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    move-wide v8, v15

    goto :goto_1

    :cond_1
    move-wide v8, v11

    :goto_1
    const/4 v15, -0x1

    cmp-long v16, v8, v11

    if-eqz v16, :cond_3

    .line 4
    invoke-virtual {v10, v8, v9}, Lf7/z;->E(J)V

    cmp-long v0, v13, v11

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v10, v13, v14}, Lf7/z;->A(J)V

    :cond_2
    const/4 v15, 0x1

    goto :goto_4

    :cond_3
    cmp-long v8, v13, v11

    if-eqz v8, :cond_8

    .line 6
    invoke-virtual {v10, v13, v14}, Lf7/z;->A(J)V

    const/4 v8, 0x2

    if-eqz v1, :cond_4

    .line 7
    invoke-virtual {v10, v1}, Lf7/z;->z(Ljava/lang/String;)V

    :goto_2
    const/4 v15, 0x2

    goto :goto_3

    :cond_4
    if-eqz v0, :cond_5

    .line 8
    invoke-virtual {v10, v0}, Lf7/z;->r(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_6

    .line 9
    invoke-virtual {v10, v2}, Lf7/z;->u(Ljava/lang/String;)V

    const/4 v0, 0x3

    const/4 v15, 0x3

    goto :goto_3

    .line 10
    :cond_6
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->m1()Z

    move-result v0

    if-eqz v0, :cond_7

    if-eqz v3, :cond_7

    .line 11
    invoke-virtual {v10, v3}, Lf7/z;->D(Ljava/lang/String;)V

    const/16 v0, 0x8

    const/16 v15, 0x8

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    const/4 v15, 0x0

    .line 12
    :goto_3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->m1()Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz v4, :cond_8

    .line 13
    invoke-virtual {v10, v4}, Lf7/z;->s(Ljava/lang/String;)V

    :cond_8
    :goto_4
    if-eqz p7, :cond_9

    .line 14
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v10, v0}, Lf7/z;->C(I)V

    goto :goto_5

    .line 15
    :cond_9
    invoke-virtual {v10, v15}, Lf7/z;->C(I)V

    :goto_5
    if-eqz v5, :cond_a

    .line 16
    invoke-virtual {v10, v5}, Lf7/z;->B(Ljava/lang/String;)V

    :cond_a
    if-eqz v6, :cond_b

    .line 17
    invoke-virtual {v10, v6}, Lf7/z;->y(Ljava/lang/String;)V

    :cond_b
    if-eqz v7, :cond_c

    .line 18
    invoke-virtual {v10, v7}, Lf7/z;->w(Ljava/lang/String;)V

    :cond_c
    move-object/from16 v0, p11

    if-eqz v0, :cond_d

    .line 19
    invoke-virtual {v10, v0}, Lf7/z;->x(Ljava/lang/String;)V

    :cond_d
    move-object/from16 v0, p12

    if-eqz v0, :cond_e

    .line 20
    invoke-virtual {v10, v0}, Lf7/z;->v(Ljava/lang/String;)V

    :cond_e
    return-object v10
.end method

.method public static b(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf7/z;
    .locals 6

    .line 1
    new-instance v0, Lf7/z;

    invoke-direct {v0}, Lf7/z;-><init>()V

    const-wide/16 v1, -0x1

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    goto :goto_1

    :cond_1
    move-wide p0, v1

    :goto_1
    cmp-long v5, v3, v1

    if-eqz v5, :cond_2

    cmp-long v5, p0, v1

    if-eqz v5, :cond_2

    .line 4
    invoke-virtual {v0, p0, p1}, Lf7/z;->t(J)V

    .line 5
    invoke-virtual {v0, v3, v4}, Lf7/z;->A(J)V

    const/4 p0, 0x6

    .line 6
    invoke-virtual {v0, p0}, Lf7/z;->C(I)V

    :cond_2
    if-eqz p2, :cond_3

    .line 7
    invoke-virtual {v0, p2}, Lf7/z;->B(Ljava/lang/String;)V

    :cond_3
    if-eqz p3, :cond_4

    .line 8
    invoke-virtual {v0, p3}, Lf7/z;->w(Ljava/lang/String;)V

    :cond_4
    if-eqz p4, :cond_5

    .line 9
    invoke-virtual {v0, p4}, Lf7/z;->x(Ljava/lang/String;)V

    :cond_5
    return-object v0
.end method

.method public static c(Landroid/os/Bundle;)Lf7/z;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    new-instance v0, Lf7/z;

    invoke-direct {v0}, Lf7/z;-><init>()V

    const-string v1, "mPlaceId"

    const-wide/16 v2, 0x0

    .line 2
    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lf7/z;->A(J)V

    const-string v1, "mUserId"

    .line 3
    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lf7/z;->E(J)V

    const-string v1, "mConversationId"

    .line 4
    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lf7/z;->t(J)V

    const-string v1, "mAccessCode"

    const-string v2, ""

    .line 5
    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/z;->r(Ljava/lang/String;)V

    const-string v1, "mLinkCode"

    .line 6
    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/z;->z(Ljava/lang/String;)V

    const-string v1, "mGameId"

    .line 7
    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/z;->u(Ljava/lang/String;)V

    const/4 v1, -0x1

    const-string v3, "mRequestType"

    .line 8
    invoke-virtual {p0, v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lf7/z;->C(I)V

    const-string v1, "mReferralPage"

    .line 9
    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/z;->B(Ljava/lang/String;)V

    const-string v1, "mLaunchData"

    .line 10
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/z;->y(Ljava/lang/String;)V

    const-string v1, "mJoinAttemptId"

    .line 11
    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/z;->w(Ljava/lang/String;)V

    const-string v1, "mJoinAttemptOrigin"

    .line 12
    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/z;->x(Ljava/lang/String;)V

    const-string v1, "mIsoContext"

    .line 13
    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/z;->v(Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->m1()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "mReservedServerAccessCode"

    .line 15
    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/z;->D(Ljava/lang/String;)V

    const-string v1, "mCallId"

    .line 16
    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lf7/z;->s(Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method


# virtual methods
.method public A(J)V
    .locals 0

    iput-wide p1, p0, Lf7/z;->a:J

    return-void
.end method

.method public B(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/z;->i:Ljava/lang/String;

    return-void
.end method

.method public C(I)V
    .locals 0

    iput p1, p0, Lf7/z;->j:I

    return-void
.end method

.method public D(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/z;->g:Ljava/lang/String;

    return-void
.end method

.method public E(J)V
    .locals 0

    iput-wide p1, p0, Lf7/z;->b:J

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/z;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/z;->h:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lf7/z;->c:J

    return-wide v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/z;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/z;->n:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/z;->l:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/z;->m:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/z;->k:Ljava/lang/String;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/z;->e:Ljava/lang/String;

    return-object v0
.end method

.method public m()J
    .locals 2

    iget-wide v0, p0, Lf7/z;->a:J

    return-wide v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/z;->i:Ljava/lang/String;

    return-object v0
.end method

.method public o()I
    .locals 1

    iget v0, p0, Lf7/z;->j:I

    return v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/z;->g:Ljava/lang/String;

    return-object v0
.end method

.method public q()J
    .locals 2

    iget-wide v0, p0, Lf7/z;->b:J

    return-wide v0
.end method

.method public r(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/z;->d:Ljava/lang/String;

    return-void
.end method

.method public s(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/z;->h:Ljava/lang/String;

    return-void
.end method

.method public t(J)V
    .locals 0

    iput-wide p1, p0, Lf7/z;->c:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{ placeId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lf7/z;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", userId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lf7/z;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", conversationId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lf7/z;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", accessCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/z;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/z;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gameId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/z;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reservedServerAccessCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/z;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", callId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/z;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reqType:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lf7/z;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", referralPage:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/z;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", launchData:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/z;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinAttemptId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/z;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinAttemptOrigin:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/z;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mIsoContext:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/z;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/z;->f:Ljava/lang/String;

    return-void
.end method

.method public v(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/z;->n:Ljava/lang/String;

    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/z;->l:Ljava/lang/String;

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/z;->m:Ljava/lang/String;

    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/z;->k:Ljava/lang/String;

    return-void
.end method

.method public z(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/z;->e:Ljava/lang/String;

    return-void
.end method
