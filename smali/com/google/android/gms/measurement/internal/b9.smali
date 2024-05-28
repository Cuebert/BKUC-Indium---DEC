.class public final Lcom/google/android/gms/measurement/internal/b9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/measurement/internal/i5;


# static fields
.field private static volatile C:Lcom/google/android/gms/measurement/internal/b9;


# instance fields
.field private final A:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb4/a;",
            ">;"
        }
    .end annotation
.end field

.field private final B:Lcom/google/android/gms/measurement/internal/g9;

.field private final a:Lcom/google/android/gms/measurement/internal/g4;

.field private final b:Lcom/google/android/gms/measurement/internal/n3;

.field private c:Lcom/google/android/gms/measurement/internal/i;

.field private d:Lcom/google/android/gms/measurement/internal/p3;

.field private e:Lcom/google/android/gms/measurement/internal/q8;

.field private f:Lcom/google/android/gms/measurement/internal/t9;

.field private final g:Lcom/google/android/gms/measurement/internal/d9;

.field private h:Lcom/google/android/gms/measurement/internal/q6;

.field private i:Lcom/google/android/gms/measurement/internal/z7;

.field private final j:Lcom/google/android/gms/measurement/internal/t8;

.field private k:Lcom/google/android/gms/measurement/internal/z3;

.field private final l:Lcom/google/android/gms/measurement/internal/m4;

.field private m:Z

.field private n:Z

.field o:J

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private q:I

.field private r:I

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Ljava/nio/channels/FileLock;

.field private w:Ljava/nio/channels/FileChannel;

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private z:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/c9;Lcom/google/android/gms/measurement/internal/m4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/b9;->m:Z

    new-instance p2, Lcom/google/android/gms/measurement/internal/z8;

    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/z8;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->B:Lcom/google/android/gms/measurement/internal/g9;

    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lcom/google/android/gms/measurement/internal/c9;->a:Landroid/content/Context;

    const/4 v0, 0x0

    .line 2
    invoke-static {p2, v0, v0}, Lcom/google/android/gms/measurement/internal/m4;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)Lcom/google/android/gms/measurement/internal/m4;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/b9;->z:J

    new-instance p2, Lcom/google/android/gms/measurement/internal/t8;

    .line 3
    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/t8;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->j:Lcom/google/android/gms/measurement/internal/t8;

    new-instance p2, Lcom/google/android/gms/measurement/internal/d9;

    .line 4
    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    .line 5
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/s8;->j()V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    new-instance p2, Lcom/google/android/gms/measurement/internal/n3;

    .line 6
    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/n3;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    .line 7
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/s8;->j()V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->b:Lcom/google/android/gms/measurement/internal/n3;

    new-instance p2, Lcom/google/android/gms/measurement/internal/g4;

    .line 8
    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/g4;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    .line 9
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/s8;->j()V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    new-instance p2, Ljava/util/HashMap;

    .line 10
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->A:Ljava/util/Map;

    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/measurement/internal/u8;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/u8;-><init>(Lcom/google/android/gms/measurement/internal/b9;Lcom/google/android/gms/measurement/internal/c9;)V

    .line 12
    invoke-virtual {p2, v0}, Lcom/google/android/gms/measurement/internal/k4;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method static final D(Lcom/google/android/gms/internal/measurement/c4;ILjava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/c4;->L()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const-string v3, "_err"

    if-ge v1, v2, :cond_1

    .line 3
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/h4;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/h4;->C()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/h4;->A()Lcom/google/android/gms/internal/measurement/g4;

    move-result-object v0

    .line 5
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/g4;->F(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/g4;

    int-to-long v1, p1

    .line 6
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/g4;->E(J)Lcom/google/android/gms/internal/measurement/g4;

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/h4;

    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/h4;->A()Lcom/google/android/gms/internal/measurement/g4;

    move-result-object v0

    const-string v1, "_ev"

    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/g4;->F(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/g4;

    .line 10
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/g4;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/g4;

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/h4;

    .line 12
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/c4;->B(Lcom/google/android/gms/internal/measurement/h4;)Lcom/google/android/gms/internal/measurement/c4;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/c4;->B(Lcom/google/android/gms/internal/measurement/h4;)Lcom/google/android/gms/internal/measurement/c4;

    return-void
.end method

.method static final E(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/c4;->L()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 3
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/h4;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/h4;->C()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/c4;->D(I)Lcom/google/android/gms/internal/measurement/c4;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final G(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzp;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 2
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->h0()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/b9;->H(Lcom/google/android/gms/measurement/internal/r4;)Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 5
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "App version does not match; dropping. appId"

    .line 8
    invoke-virtual {v1, v4, v2}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v3

    .line 9
    :cond_2
    :goto_0
    new-instance v30, Lcom/google/android/gms/measurement/internal/zzp;

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->k0()Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->h0()Ljava/lang/String;

    move-result-object v5

    .line 12
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->M()J

    move-result-wide v6

    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->g0()Ljava/lang/String;

    move-result-object v8

    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->X()J

    move-result-wide v9

    .line 15
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->U()J

    move-result-wide v15

    .line 16
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->K()Z

    move-result v13

    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->i0()Ljava/lang/String;

    move-result-object v17

    .line 18
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->A()J

    move-result-wide v23

    .line 19
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->J()Z

    move-result v21

    .line 20
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->c0()Ljava/lang/String;

    move-result-object v25

    .line 21
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->b0()Ljava/lang/Boolean;

    move-result-object v26

    .line 22
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->V()J

    move-result-wide v27

    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->c()Ljava/util/List;

    move-result-object v31

    .line 24
    invoke-static {}, Lcom/google/android/gms/internal/measurement/hd;->b()Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v11

    sget-object v12, Lcom/google/android/gms/measurement/internal/x2;->e0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v11, v2, v12}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 25
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r4;->j0()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v32, v1

    goto :goto_1

    :cond_3
    move-object/from16 v32, v3

    :goto_1
    const/4 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    .line 26
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/measurement/internal/b9;->U(Ljava/lang/String;)Lb4/a;

    move-result-object v1

    invoke-virtual {v1}, Lb4/a;->i()Ljava/lang/String;

    move-result-object v29

    move-object/from16 v1, v30

    move-object/from16 v2, p1

    move-object v3, v4

    move-object v4, v5

    move-wide v5, v6

    move-object v7, v8

    move-wide v8, v9

    move-wide v10, v15

    move-object/from16 v15, v17

    move-wide/from16 v16, v23

    move-object/from16 v23, v25

    move-object/from16 v24, v26

    move-wide/from16 v25, v27

    move-object/from16 v27, v31

    move-object/from16 v28, v32

    invoke-direct/range {v1 .. v29}, Lcom/google/android/gms/measurement/internal/zzp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v30

    .line 27
    :cond_4
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v4, "No app data available; dropping"

    invoke-virtual {v1, v4, v2}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v3
.end method

.method private final H(Lcom/google/android/gms/measurement/internal/r4;)Ljava/lang/Boolean;
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->M()J

    move-result-wide v0

    const-wide/32 v2, -0x80000000

    const/4 v4, 0x0

    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->c()Landroid/content/Context;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lh3/c;->a(Landroid/content/Context;)Lh3/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lh3/b;->d(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->M()J

    move-result-wide v1

    int-to-long v3, v0

    cmp-long p1, v1, v3

    if-nez p1, :cond_1

    .line 5
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->c()Landroid/content/Context;

    move-result-object v0

    .line 8
    invoke-static {v0}, Lh3/c;->a(Landroid/content/Context;)Lh3/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lh3/b;->d(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->h0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 11
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 12
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final I()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/b9;->s:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/b9;->t:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/b9;->u:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v1, "Stopping uploading service(s)"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->p:Ljava/util/List;

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 4
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->p:Ljava/util/List;

    .line 5
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    .line 6
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/b9;->s:Z

    .line 8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/b9;->t:Z

    .line 9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v3, p0, Lcom/google/android/gms/measurement/internal/b9;->u:Z

    .line 10
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "Not stopping services. fetch, network, upload"

    .line 11
    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private final J(Lcom/google/android/gms/internal/measurement/m4;JZ)V
    .locals 10

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    const-string v1, "_lte"

    goto :goto_0

    :cond_0
    const-string v1, "_se"

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/m4;->n0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/measurement/internal/i;->Z(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    if-nez v3, :cond_1

    goto :goto_1

    .line 3
    :cond_1
    new-instance v9, Lcom/google/android/gms/measurement/internal/f9;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/m4;->n0()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v4

    invoke-interface {v4}, Lf3/d;->a()J

    move-result-wide v6

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    .line 6
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v4, p2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v4, "auto"

    move-object v2, v9

    move-object v5, v1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    goto :goto_2

    .line 7
    :cond_2
    :goto_1
    new-instance v9, Lcom/google/android/gms/measurement/internal/f9;

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/m4;->n0()Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v2

    invoke-interface {v2}, Lf3/d;->a()J

    move-result-wide v6

    .line 10
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v4, "auto"

    move-object v2, v9

    move-object v5, v1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 11
    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/x4;->z()Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v2

    .line 12
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/w4;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v3

    invoke-interface {v3}, Lf3/d;->a()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/w4;->C(J)Lcom/google/android/gms/internal/measurement/w4;

    iget-object v3, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    .line 14
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/w4;->A(J)Lcom/google/android/gms/internal/measurement/w4;

    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/x4;

    .line 16
    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/d9;->x(Lcom/google/android/gms/internal/measurement/m4;Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_3

    .line 17
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/m4;->k0(ILcom/google/android/gms/internal/measurement/x4;)Lcom/google/android/gms/internal/measurement/m4;

    goto :goto_3

    .line 18
    :cond_3
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/m4;->C0(Lcom/google/android/gms/internal/measurement/x4;)Lcom/google/android/gms/internal/measurement/m4;

    :goto_3
    const-wide/16 v1, 0x0

    cmp-long p1, p2, v1

    if-lez p1, :cond_5

    .line 19
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 20
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 21
    invoke-virtual {p1, v9}, Lcom/google/android/gms/measurement/internal/i;->z(Lcom/google/android/gms/measurement/internal/f9;)Z

    if-eq v0, p4, :cond_4

    const-string p1, "lifetime"

    goto :goto_4

    :cond_4
    const-string p1, "session-scoped"

    .line 22
    :goto_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p2

    .line 23
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p2

    iget-object p3, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    const-string p4, "Updated engagement user property. scope, value"

    .line 24
    invoke-virtual {p2, p4, p1, p3}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method private final K(Lcom/google/android/gms/internal/measurement/c4;Lcom/google/android/gms/internal/measurement/c4;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_e"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 2
    invoke-static {v0}, Lz2/j;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    const-string v1, "_et"

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/h4;->U()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/h4;->z()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-gtz v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/h4;->z()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 6
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/h4;->z()J

    move-result-wide v6

    cmp-long v8, v6, v4

    if-lez v8, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/h4;->z()J

    move-result-wide v4

    add-long/2addr v2, v4

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 7
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 8
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p2, v1, v0}, Lcom/google/android/gms/measurement/internal/d9;->m(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 9
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    const-wide/16 v0, 0x1

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string v0, "_fr"

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/measurement/internal/d9;->m(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final L()V
    .locals 20

    move-object/from16 v0, p0

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    iget-wide v1, v0, Lcom/google/android/gms/measurement/internal/b9;->o:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    const-wide/32 v1, 0x36ee80

    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v5

    invoke-interface {v5}, Lf3/d;->b()J

    move-result-wide v5

    iget-wide v7, v0, Lcom/google/android/gms/measurement/internal/b9;->o:J

    sub-long/2addr v5, v7

    .line 4
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    sub-long/2addr v1, v5

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 6
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    .line 7
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Upload has been suspended. Will update scheduling later in approximately ms"

    .line 8
    invoke-virtual {v3, v2, v1}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->Y()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p3;->c()V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/b9;->e:Lcom/google/android/gms/measurement/internal/q8;

    .line 10
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 11
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q8;->m()V

    return-void

    :cond_0
    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/b9;->o:J

    :cond_1
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 12
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m4;->r()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->O()Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_4

    .line 13
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v1

    invoke-interface {v1}, Lf3/d;->a()J

    move-result-wide v1

    .line 14
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    .line 15
    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->B:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 16
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 17
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i;->v()Z

    move-result v5

    const/4 v10, 0x1

    if-nez v5, :cond_4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 18
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 19
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i;->u()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v10, 0x0

    :cond_4
    :goto_0
    if-eqz v10, :cond_6

    .line 20
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f;->u()Ljava/lang/String;

    move-result-object v5

    .line 21
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_5

    const-string v11, ".none."

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 22
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->w:Lcom/google/android/gms/measurement/internal/w2;

    .line 23
    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    goto :goto_1

    .line 24
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->v:Lcom/google/android/gms/measurement/internal/w2;

    .line 25
    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    goto :goto_1

    .line 26
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->u:Lcom/google/android/gms/measurement/internal/w2;

    .line 27
    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    .line 28
    :goto_1
    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 29
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/z7;->i:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/s3;->a()J

    move-result-wide v13

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 30
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/z7;->j:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/s3;->a()J

    move-result-wide v15

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 31
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    move/from16 v17, v10

    .line 32
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i;->O()J

    move-result-wide v9

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 33
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    move-wide/from16 v18, v7

    .line 34
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i;->P()J

    move-result-wide v6

    .line 35
    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    cmp-long v7, v5, v3

    if-nez v7, :cond_8

    :cond_7
    move-wide v7, v3

    goto/16 :goto_3

    :cond_8
    sub-long/2addr v5, v1

    .line 36
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    sub-long v5, v1, v5

    sub-long/2addr v13, v1

    .line 37
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    sub-long/2addr v15, v1

    .line 38
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    sub-long v9, v1, v9

    sub-long/2addr v1, v7

    .line 39
    invoke-static {v1, v2, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-long v7, v5, v18

    if-eqz v17, :cond_9

    cmp-long v13, v1, v3

    if-lez v13, :cond_9

    .line 40
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    add-long/2addr v7, v11

    :cond_9
    iget-object v13, v0, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 41
    invoke-static {v13}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 42
    invoke-virtual {v13, v1, v2, v11, v12}, Lcom/google/android/gms/measurement/internal/d9;->O(JJ)Z

    move-result v13

    if-nez v13, :cond_a

    add-long v7, v1, v11

    :cond_a
    cmp-long v1, v9, v3

    if-eqz v1, :cond_b

    cmp-long v1, v9, v5

    if-ltz v1, :cond_b

    const/4 v1, 0x0

    .line 43
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    const/16 v2, 0x14

    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->D:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v6, 0x0

    .line 44
    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v11, 0x0

    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v1, v2, :cond_7

    .line 45
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    sget-object v2, Lcom/google/android/gms/measurement/internal/x2;->C:Lcom/google/android/gms/measurement/internal/w2;

    .line 46
    invoke-virtual {v2, v6}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    const-wide/16 v12, 0x1

    shl-long/2addr v12, v1

    mul-long v5, v5, v12

    add-long/2addr v7, v5

    cmp-long v2, v7, v9

    if-gtz v2, :cond_b

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_b
    :goto_3
    cmp-long v1, v7, v3

    if-eqz v1, :cond_f

    .line 47
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/b9;->b:Lcom/google/android/gms/measurement/internal/n3;

    .line 48
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 49
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/n3;->m()Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 50
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/z7;->h:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/s3;->a()J

    move-result-wide v1

    .line 51
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->s:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v6, 0x0

    .line 52
    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 53
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 54
    invoke-virtual {v9, v1, v2, v5, v6}, Lcom/google/android/gms/measurement/internal/d9;->O(JJ)Z

    move-result v9

    if-nez v9, :cond_c

    add-long/2addr v1, v5

    .line 55
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    .line 56
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->Y()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p3;->c()V

    .line 57
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v1

    invoke-interface {v1}, Lf3/d;->a()J

    move-result-wide v1

    sub-long/2addr v7, v1

    cmp-long v1, v7, v3

    if-gtz v1, :cond_d

    .line 58
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    sget-object v1, Lcom/google/android/gms/measurement/internal/x2;->x:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v2, 0x0

    .line 59
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 60
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/z7;->i:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v2

    invoke-interface {v2}, Lf3/d;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/s3;->b(J)V

    .line 61
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "Upload scheduled in approximately ms"

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/b9;->e:Lcom/google/android/gms/measurement/internal/q8;

    .line 62
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 63
    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/measurement/internal/q8;->n(J)V

    return-void

    .line 64
    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v2, "No network"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 65
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->Y()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p3;->b()V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/b9;->e:Lcom/google/android/gms/measurement/internal/q8;

    .line 66
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 67
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q8;->m()V

    return-void

    .line 68
    :cond_f
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v2, "Next upload time is 0"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 69
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->Y()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p3;->c()V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/b9;->e:Lcom/google/android/gms/measurement/internal/q8;

    .line 70
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 71
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q8;->m()V

    return-void

    .line 72
    :cond_10
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v2, "Nothing to upload or uploading impossible"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 73
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->Y()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p3;->c()V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/b9;->e:Lcom/google/android/gms/measurement/internal/q8;

    .line 74
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 75
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q8;->m()V

    return-void
.end method

.method private final M(Lcom/google/android/gms/measurement/internal/zzp;)Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/hd;->b()Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/measurement/internal/x2;->e0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzp;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzp;->H:Ljava/lang/String;

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzp;->D:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    return v2

    .line 5
    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzp;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzp;->D:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    return v1

    :cond_4
    :goto_1
    return v2
.end method

.method private final N(Ljava/lang/String;J)Z
    .locals 47

    move-object/from16 v1, p0

    const-string v2, "_sn"

    const-string v3, "_npa"

    const-string v4, "_ai"

    .line 1
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 2
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i;->g0()V

    :try_start_0
    new-instance v5, Lcom/google/android/gms/measurement/internal/a9;

    const/4 v13, 0x0

    invoke-direct {v5, v1, v13}, Lcom/google/android/gms/measurement/internal/a9;-><init>(Lcom/google/android/gms/measurement/internal/b9;Lb4/w;)V

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 3
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    const/4 v7, 0x0

    iget-wide v10, v1, Lcom/google/android/gms/measurement/internal/b9;->z:J

    move-wide/from16 v8, p2

    move-object v12, v5

    .line 4
    invoke-virtual/range {v6 .. v12}, Lcom/google/android/gms/measurement/internal/i;->I(Ljava/lang/String;JJLcom/google/android/gms/measurement/internal/a9;)V

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/a9;->c:Ljava/util/List;

    if-eqz v6, :cond_69

    .line 5
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_3d

    .line 6
    :cond_0
    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 7
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/p8;->q()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/m4;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/m4;->G0()Lcom/google/android/gms/internal/measurement/m4;

    .line 8
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v8

    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lcom/google/android/gms/measurement/internal/x2;->V:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v8

    move-object/from16 v17, v13

    move-object/from16 v18, v17

    const/4 v7, -0x1

    const/4 v12, 0x0

    const/4 v13, -0x1

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    :goto_0
    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/a9;->c:Ljava/util/List;

    .line 9
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v10, "_fr"

    const-string v11, "_et"

    move-object/from16 v23, v3

    const-string v3, "_e"

    move-wide/from16 v24, v14

    if-ge v12, v9, :cond_33

    :try_start_1
    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/a9;->c:Ljava/util/List;

    .line 10
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/p8;->q()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/c4;

    iget-object v15, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 11
    invoke-static {v15}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v14, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 12
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v14

    move/from16 v28, v12

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v15, v14, v12}, Lcom/google/android/gms/measurement/internal/g4;->x(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v14, "_err"

    if-eqz v12, :cond_3

    .line 13
    :try_start_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 14
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v10, "Dropping blocked raw event. appId"

    iget-object v11, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 15
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 16
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v12

    .line 17
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12, v15}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 18
    invoke-virtual {v3, v10, v11, v12}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 19
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v10, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 20
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Lcom/google/android/gms/measurement/internal/g4;->v(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 21
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v10, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 22
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Lcom/google/android/gms/measurement/internal/g4;->y(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 24
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v29

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->B:Lcom/google/android/gms/measurement/internal/g9;

    iget-object v10, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 25
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v31

    const/16 v32, 0xb

    const-string v33, "_ev"

    .line 26
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v34

    const/16 v35, 0x0

    move-object/from16 v30, v3

    .line 27
    invoke-virtual/range {v29 .. v35}, Lcom/google/android/gms/measurement/internal/h9;->A(Lcom/google/android/gms/measurement/internal/g9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_2
    :goto_1
    move-object/from16 v30, v4

    move-object v4, v6

    move/from16 v29, v8

    move-wide/from16 v14, v24

    move/from16 v10, v28

    const/4 v3, -0x1

    move-object v8, v2

    goto/16 :goto_1d

    .line 28
    :cond_3
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v12

    .line 29
    invoke-static {v4}, Lb4/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 30
    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/c4;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c4;

    .line 31
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v12

    const-string v15, "Renaming ad_impression to _ai"

    invoke-virtual {v12, v15}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 32
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/i3;->C()Ljava/lang/String;

    move-result-object v12

    const/4 v15, 0x5

    .line 33
    invoke-static {v12, v15}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v12

    if-eqz v12, :cond_5

    const/4 v12, 0x0

    .line 34
    :goto_2
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->v()I

    move-result v15

    if-ge v12, v15, :cond_5

    const-string v15, "ad_platform"

    .line 35
    invoke-virtual {v9, v12}, Lcom/google/android/gms/internal/measurement/c4;->J(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v29

    move-object/from16 v30, v4

    invoke-virtual/range {v29 .. v29}, Lcom/google/android/gms/internal/measurement/h4;->C()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 36
    invoke-virtual {v9, v12}, Lcom/google/android/gms/internal/measurement/c4;->J(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/h4;->D()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "admob"

    .line 37
    invoke-virtual {v9, v12}, Lcom/google/android/gms/internal/measurement/c4;->J(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v15

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/h4;->D()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 38
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v4

    .line 39
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/i3;->x()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v4

    const-string v15, "AdMob ad impression logged from app. Potentially duplicative."

    .line 40
    invoke-virtual {v4, v15}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    :cond_4
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v4, v30

    goto :goto_2

    :cond_5
    move-object/from16 v30, v4

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 41
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v12, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 42
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4, v12, v15}, Lcom/google/android/gms/measurement/internal/g4;->w(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v12, "_c"

    if-nez v4, :cond_a

    :try_start_3
    iget-object v15, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 43
    invoke-static {v15}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 44
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v15

    .line 45
    invoke-static {v15}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move/from16 v29, v8

    .line 46
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v31, v2

    const v2, 0x171c4

    if-eq v8, v2, :cond_8

    const v2, 0x17331

    if-eq v8, v2, :cond_7

    const v2, 0x17333

    if-eq v8, v2, :cond_6

    goto :goto_3

    :cond_6
    const-string v2, "_ui"

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v2, 0x1

    goto :goto_4

    :cond_7
    const-string v2, "_ug"

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v2, 0x2

    goto :goto_4

    :cond_8
    const-string v2, "_in"

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v2, 0x0

    goto :goto_4

    :cond_9
    :goto_3
    const/4 v2, -0x1

    :goto_4
    if-eqz v2, :cond_b

    const/4 v8, 0x1

    if-eq v2, v8, :cond_b

    const/4 v8, 0x2

    if-eq v2, v8, :cond_b

    move/from16 v33, v7

    move-object v8, v10

    move-object/from16 v32, v11

    move/from16 v22, v13

    const/4 v4, 0x0

    move-object v10, v3

    move-object v13, v6

    goto/16 :goto_b

    :cond_a
    move-object/from16 v31, v2

    move/from16 v29, v8

    :cond_b
    move/from16 v22, v13

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v15, 0x0

    .line 47
    :goto_5
    :try_start_4
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->v()I

    move-result v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v32, v11

    const-string v11, "_r"

    if-ge v2, v13, :cond_e

    .line 48
    :try_start_5
    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/c4;->J(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/h4;->C()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    .line 49
    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/c4;->J(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/p8;->q()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/g4;

    move-object v13, v6

    move/from16 v33, v7

    const-wide/16 v6, 0x1

    .line 50
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/measurement/g4;->E(J)Lcom/google/android/gms/internal/measurement/g4;

    .line 51
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/h4;

    .line 52
    invoke-virtual {v9, v2, v6}, Lcom/google/android/gms/internal/measurement/c4;->G(ILcom/google/android/gms/internal/measurement/h4;)Lcom/google/android/gms/internal/measurement/c4;

    move-object v7, v10

    const/4 v8, 0x1

    goto :goto_6

    :cond_c
    move-object v13, v6

    move/from16 v33, v7

    .line 53
    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/c4;->J(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/h4;->C()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 54
    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/c4;->J(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/p8;->q()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/g4;

    move-object v7, v10

    const-wide/16 v10, 0x1

    .line 55
    invoke-virtual {v6, v10, v11}, Lcom/google/android/gms/internal/measurement/g4;->E(J)Lcom/google/android/gms/internal/measurement/g4;

    .line 56
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/h4;

    .line 57
    invoke-virtual {v9, v2, v6}, Lcom/google/android/gms/internal/measurement/c4;->G(ILcom/google/android/gms/internal/measurement/h4;)Lcom/google/android/gms/internal/measurement/c4;

    const/4 v15, 0x1

    goto :goto_6

    :cond_d
    move-object v7, v10

    :goto_6
    add-int/lit8 v2, v2, 0x1

    move-object v10, v7

    move-object v6, v13

    move-object/from16 v11, v32

    move/from16 v7, v33

    goto :goto_5

    :cond_e
    move-object v13, v6

    move/from16 v33, v7

    move-object v7, v10

    if-nez v8, :cond_f

    if-eqz v4, :cond_f

    .line 58
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 59
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v6, "Marking event as conversion"

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 60
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v8

    .line 61
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 62
    invoke-virtual {v2, v6, v8}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    invoke-static {}, Lcom/google/android/gms/internal/measurement/h4;->A()Lcom/google/android/gms/internal/measurement/g4;

    move-result-object v2

    .line 64
    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/measurement/g4;->F(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/g4;

    move-object v8, v7

    const-wide/16 v6, 0x1

    .line 65
    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/internal/measurement/g4;->E(J)Lcom/google/android/gms/internal/measurement/g4;

    .line 66
    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/c4;->A(Lcom/google/android/gms/internal/measurement/g4;)Lcom/google/android/gms/internal/measurement/c4;

    goto :goto_7

    :cond_f
    move-object v8, v7

    :goto_7
    if-nez v15, :cond_10

    .line 67
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 68
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v6, "Marking event as real-time"

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 69
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v7

    .line 70
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 71
    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    invoke-static {}, Lcom/google/android/gms/internal/measurement/h4;->A()Lcom/google/android/gms/internal/measurement/g4;

    move-result-object v2

    .line 73
    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/measurement/g4;->F(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/g4;

    const-wide/16 v6, 0x1

    .line 74
    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/internal/measurement/g4;->E(J)Lcom/google/android/gms/internal/measurement/g4;

    .line 75
    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/c4;->A(Lcom/google/android/gms/internal/measurement/g4;)Lcom/google/android/gms/internal/measurement/c4;

    :cond_10
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 76
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 77
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->F()J

    move-result-wide v35

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 78
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v37

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x1

    move-object/from16 v34, v2

    .line 79
    invoke-virtual/range {v34 .. v42}, Lcom/google/android/gms/measurement/internal/i;->V(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/measurement/internal/g;

    move-result-object v2

    iget-wide v6, v2, Lcom/google/android/gms/measurement/internal/g;->e:J

    .line 80
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v2

    iget-object v10, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v10

    sget-object v15, Lcom/google/android/gms/measurement/internal/x2;->p:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v2, v10, v15}, Lcom/google/android/gms/measurement/internal/f;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)I

    move-result v2

    move-object v10, v3

    int-to-long v2, v2

    cmp-long v15, v6, v2

    if-lez v15, :cond_11

    .line 81
    invoke-static {v9, v11}, Lcom/google/android/gms/measurement/internal/b9;->E(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;)V

    goto :goto_8

    :cond_11
    const/16 v19, 0x1

    .line 82
    :goto_8
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/h9;->W(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_18

    if-eqz v4, :cond_18

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 83
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 84
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->F()J

    move-result-wide v35

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 85
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v37

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x1

    const/16 v41, 0x0

    const/16 v42, 0x0

    move-object/from16 v34, v2

    .line 86
    invoke-virtual/range {v34 .. v42}, Lcom/google/android/gms/measurement/internal/i;->V(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/measurement/internal/g;

    move-result-object v2

    iget-wide v2, v2, Lcom/google/android/gms/measurement/internal/g;->c:J

    .line 87
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v6

    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v7

    sget-object v11, Lcom/google/android/gms/measurement/internal/x2;->o:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v6, v7, v11}, Lcom/google/android/gms/measurement/internal/f;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)I

    move-result v6

    int-to-long v6, v6

    cmp-long v11, v2, v6

    if-lez v11, :cond_18

    .line 88
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 89
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Too many conversions. Not logging as conversion. appId"

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 90
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 91
    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, -0x1

    .line 92
    :goto_9
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->v()I

    move-result v11

    if-ge v3, v11, :cond_14

    .line 93
    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/c4;->J(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v11

    .line 94
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/h4;->C()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_12

    .line 95
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/p8;->q()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/g4;

    move v7, v3

    goto :goto_a

    .line 96
    :cond_12
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/h4;->C()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    const/4 v6, 0x1

    :cond_13
    :goto_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_14
    if-eqz v6, :cond_16

    if-eqz v2, :cond_15

    .line 97
    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/measurement/c4;->D(I)Lcom/google/android/gms/internal/measurement/c4;

    goto :goto_b

    :cond_15
    const/4 v2, 0x0

    :cond_16
    if-eqz v2, :cond_17

    .line 98
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m8;->s()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/g4;

    .line 99
    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/measurement/g4;->F(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/g4;

    const-wide/16 v14, 0xa

    .line 100
    invoke-virtual {v2, v14, v15}, Lcom/google/android/gms/internal/measurement/g4;->E(J)Lcom/google/android/gms/internal/measurement/g4;

    .line 101
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/h4;

    .line 102
    invoke-virtual {v9, v7, v2}, Lcom/google/android/gms/internal/measurement/c4;->G(ILcom/google/android/gms/internal/measurement/h4;)Lcom/google/android/gms/internal/measurement/c4;

    goto :goto_b

    .line 103
    :cond_17
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 104
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Did not find conversion parameter. appId"

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 105
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 106
    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_18
    :goto_b
    if-eqz v4, :cond_20

    .line 107
    new-instance v2, Ljava/util/ArrayList;

    .line 108
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->L()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v6, -0x1

    .line 109
    :goto_c
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v11, "currency"

    const-string v14, "value"

    if-ge v3, v7, :cond_1b

    .line 110
    :try_start_6
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/h4;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/h4;->C()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_19

    move v4, v3

    goto :goto_d

    .line 111
    :cond_19
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/h4;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/h4;->C()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1a

    move v6, v3

    :cond_1a
    :goto_d
    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_1b
    const/4 v3, -0x1

    if-ne v4, v3, :cond_1c

    goto/16 :goto_11

    .line 112
    :cond_1c
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/h4;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/h4;->U()Z

    move-result v3

    if-nez v3, :cond_1d

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/h4;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/h4;->R()Z

    move-result v3

    if-nez v3, :cond_1d

    .line 113
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->x()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Value must be specified with a numeric type."

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/c4;->D(I)Lcom/google/android/gms/internal/measurement/c4;

    .line 115
    invoke-static {v9, v12}, Lcom/google/android/gms/measurement/internal/b9;->E(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;)V

    const/16 v2, 0x12

    .line 116
    invoke-static {v9, v2, v14}, Lcom/google/android/gms/measurement/internal/b9;->D(Lcom/google/android/gms/internal/measurement/c4;ILjava/lang/String;)V

    goto :goto_10

    :cond_1d
    const/4 v3, -0x1

    if-ne v6, v3, :cond_1e

    goto :goto_f

    .line 117
    :cond_1e
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/h4;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/h4;->D()Ljava/lang/String;

    move-result-object v2

    .line 118
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x3

    if-ne v6, v7, :cond_1f

    const/4 v6, 0x0

    .line 119
    :goto_e
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_21

    .line 120
    invoke-virtual {v2, v6}, Ljava/lang/String;->codePointAt(I)I

    move-result v7

    .line 121
    invoke-static {v7}, Ljava/lang/Character;->isLetter(I)Z

    move-result v14

    if-eqz v14, :cond_1f

    .line 122
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    add-int/2addr v6, v7

    goto :goto_e

    .line 123
    :cond_1f
    :goto_f
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 124
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->x()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v6, "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."

    .line 125
    invoke-virtual {v2, v6}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/c4;->D(I)Lcom/google/android/gms/internal/measurement/c4;

    .line 127
    invoke-static {v9, v12}, Lcom/google/android/gms/measurement/internal/b9;->E(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;)V

    const/16 v2, 0x13

    .line 128
    invoke-static {v9, v2, v11}, Lcom/google/android/gms/measurement/internal/b9;->D(Lcom/google/android/gms/internal/measurement/c4;ILjava/lang/String;)V

    goto :goto_11

    :cond_20
    :goto_10
    const/4 v3, -0x1

    .line 129
    :cond_21
    :goto_11
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-wide/16 v6, 0x3e8

    if-eqz v2, :cond_25

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 130
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 131
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v2, v8}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v2

    if-nez v2, :cond_24

    if-eqz v18, :cond_23

    .line 132
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/c4;->x()J

    move-result-wide v11

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->x()J

    move-result-wide v14

    sub-long/2addr v11, v14

    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    move-result-wide v11

    cmp-long v2, v11, v6

    if-gtz v2, :cond_23

    .line 133
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/m8;->s()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/c4;

    .line 134
    invoke-direct {v1, v9, v2}, Lcom/google/android/gms/measurement/internal/b9;->P(Lcom/google/android/gms/internal/measurement/c4;Lcom/google/android/gms/internal/measurement/c4;)Z

    move-result v4

    if-eqz v4, :cond_22

    move-object v4, v13

    move/from16 v11, v33

    .line 135
    invoke-virtual {v4, v11, v2}, Lcom/google/android/gms/internal/measurement/m4;->K(ILcom/google/android/gms/internal/measurement/c4;)Lcom/google/android/gms/internal/measurement/m4;

    move/from16 v13, v22

    const/4 v2, 0x0

    const/16 v18, 0x0

    goto :goto_12

    :cond_22
    move-object v4, v13

    move/from16 v11, v33

    move-object v2, v9

    move/from16 v13, v16

    :goto_12
    move-object/from16 v17, v2

    move v7, v11

    goto :goto_13

    :cond_23
    move-object v4, v13

    move/from16 v11, v33

    move-object/from16 v17, v9

    move v7, v11

    move/from16 v13, v16

    :goto_13
    move-object/from16 v8, v31

    move-object/from16 v12, v32

    goto/16 :goto_1a

    :cond_24
    move-object v4, v13

    move/from16 v11, v33

    move/from16 v6, v22

    move-object/from16 v8, v31

    move-object/from16 v12, v32

    goto/16 :goto_19

    :cond_25
    move-object v4, v13

    move/from16 v11, v33

    const-string v2, "_vs"

    .line 136
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 137
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 138
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/d4;

    move-object/from16 v12, v32

    invoke-static {v2, v12}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v2

    if-nez v2, :cond_28

    if-eqz v17, :cond_27

    .line 139
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/c4;->x()J

    move-result-wide v13

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->x()J

    move-result-wide v26

    sub-long v13, v13, v26

    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v13

    cmp-long v2, v13, v6

    if-gtz v2, :cond_27

    .line 140
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/m8;->s()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/c4;

    .line 141
    invoke-direct {v1, v2, v9}, Lcom/google/android/gms/measurement/internal/b9;->P(Lcom/google/android/gms/internal/measurement/c4;Lcom/google/android/gms/internal/measurement/c4;)Z

    move-result v6

    if-eqz v6, :cond_26

    move/from16 v6, v22

    .line 142
    invoke-virtual {v4, v6, v2}, Lcom/google/android/gms/internal/measurement/m4;->K(ILcom/google/android/gms/internal/measurement/c4;)Lcom/google/android/gms/internal/measurement/m4;

    move v7, v11

    const/4 v2, 0x0

    const/16 v17, 0x0

    goto :goto_14

    :cond_26
    move/from16 v6, v22

    move-object v2, v9

    move/from16 v7, v16

    :goto_14
    move-object/from16 v18, v2

    move v13, v6

    goto :goto_15

    :cond_27
    move/from16 v6, v22

    move v13, v6

    move-object/from16 v18, v9

    move/from16 v7, v16

    :goto_15
    move-object/from16 v8, v31

    goto/16 :goto_1a

    :cond_28
    move/from16 v6, v22

    goto/16 :goto_18

    :cond_29
    move/from16 v6, v22

    move-object/from16 v12, v32

    .line 143
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v2

    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 144
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/measurement/internal/x2;->h0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v2, v7, v8}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v2

    if-eqz v2, :cond_2f

    const-string v2, "_ab"

    .line 145
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2f

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 146
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 147
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v2, v12}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v2

    if-nez v2, :cond_2f

    if-eqz v17, :cond_2f

    .line 148
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/c4;->x()J

    move-result-wide v7

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->x()J

    move-result-wide v13

    sub-long/2addr v7, v13

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    const-wide/16 v13, 0xfa0

    cmp-long v2, v7, v13

    if-gtz v2, :cond_2f

    .line 149
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/m8;->s()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/c4;

    .line 150
    invoke-direct {v1, v2, v9}, Lcom/google/android/gms/measurement/internal/b9;->K(Lcom/google/android/gms/internal/measurement/c4;Lcom/google/android/gms/internal/measurement/c4;)V

    .line 151
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    .line 152
    invoke-static {v7}, Lz2/j;->a(Z)V

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 153
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 154
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/d4;

    move-object/from16 v8, v31

    invoke-static {v7, v8}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v7

    iget-object v13, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 155
    invoke-static {v13}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 156
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/d4;

    const-string v14, "_sc"

    invoke-static {v13, v14}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v13

    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 157
    invoke-static {v14}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 158
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/measurement/d4;

    const-string v15, "_si"

    invoke-static {v14, v15}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v14

    if-eqz v7, :cond_2a

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/h4;->D()Ljava/lang/String;

    move-result-object v7

    goto :goto_16

    :cond_2a
    const-string v7, ""

    .line 159
    :goto_16
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_2b

    iget-object v15, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 160
    invoke-static {v15}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 161
    invoke-static {v9, v8, v7}, Lcom/google/android/gms/measurement/internal/d9;->m(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2b
    if-eqz v13, :cond_2c

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/h4;->D()Ljava/lang/String;

    move-result-object v7

    goto :goto_17

    :cond_2c
    const-string v7, ""

    .line 162
    :goto_17
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_2d

    iget-object v13, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 163
    invoke-static {v13}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    const-string v13, "_sc"

    .line 164
    invoke-static {v9, v13, v7}, Lcom/google/android/gms/measurement/internal/d9;->m(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2d
    if-eqz v14, :cond_2e

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 165
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    const-string v7, "_si"

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/h4;->z()J

    move-result-wide v13

    .line 166
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-static {v9, v7, v13}, Lcom/google/android/gms/measurement/internal/d9;->m(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;Ljava/lang/Object;)V

    .line 167
    :cond_2e
    invoke-virtual {v4, v6, v2}, Lcom/google/android/gms/internal/measurement/m4;->K(ILcom/google/android/gms/internal/measurement/c4;)Lcom/google/android/gms/internal/measurement/m4;

    move v13, v6

    move v7, v11

    const/16 v17, 0x0

    goto :goto_1a

    :cond_2f
    :goto_18
    move-object/from16 v8, v31

    :goto_19
    move v13, v6

    move v7, v11

    :goto_1a
    if-nez v29, :cond_32

    .line 168
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_32

    .line 169
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/c4;->v()I

    move-result v2

    if-nez v2, :cond_30

    .line 170
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 171
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v6, "Engagement event does not contain any parameters. appId"

    iget-object v10, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 172
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    .line 173
    invoke-virtual {v2, v6, v10}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1b

    .line 174
    :cond_30
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 175
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 176
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v2, v12}, Lcom/google/android/gms/measurement/internal/d9;->p(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-nez v2, :cond_31

    .line 177
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 178
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v6, "Engagement event does not include duration. appId"

    iget-object v10, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 179
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    .line 180
    invoke-virtual {v2, v6, v10}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1b

    .line 181
    :cond_31
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    add-long v14, v24, v10

    goto :goto_1c

    :cond_32
    :goto_1b
    move-wide/from16 v14, v24

    .line 182
    :goto_1c
    iget-object v2, v5, Lcom/google/android/gms/measurement/internal/a9;->c:Ljava/util/List;

    .line 183
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/d4;

    move/from16 v10, v28

    invoke-interface {v2, v10, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v16, v16, 0x1

    .line 184
    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/measurement/m4;->A0(Lcom/google/android/gms/internal/measurement/c4;)Lcom/google/android/gms/internal/measurement/m4;

    :goto_1d
    add-int/lit8 v12, v10, 0x1

    move-object v6, v4

    move-object v2, v8

    move-object/from16 v3, v23

    move/from16 v8, v29

    move-object/from16 v4, v30

    goto/16 :goto_0

    :cond_33
    move-object v4, v6

    move/from16 v29, v8

    move-object v8, v10

    move-object v12, v11

    move-object v10, v3

    if-eqz v29, :cond_37

    move/from16 v3, v16

    move-wide/from16 v14, v24

    const/4 v2, 0x0

    :goto_1e
    if-ge v2, v3, :cond_38

    .line 185
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/measurement/m4;->v0(I)Lcom/google/android/gms/internal/measurement/d4;

    move-result-object v6

    .line 186
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d4;->D()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_34

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 187
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 188
    invoke-static {v6, v8}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v7

    if-eqz v7, :cond_34

    .line 189
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/measurement/m4;->N0(I)Lcom/google/android/gms/internal/measurement/m4;

    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v2, v2, -0x1

    goto :goto_20

    :cond_34
    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 190
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 191
    invoke-static {v6, v12}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v6

    if-eqz v6, :cond_36

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/h4;->U()Z

    move-result v7

    if-eqz v7, :cond_35

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/h4;->z()J

    move-result-wide v6

    .line 192
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_1f

    :cond_35
    const/4 v6, 0x0

    :goto_1f
    if-eqz v6, :cond_36

    .line 193
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    const-wide/16 v20, 0x0

    cmp-long v7, v16, v20

    if-lez v7, :cond_36

    .line 194
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    add-long/2addr v14, v6

    :cond_36
    :goto_20
    const/4 v6, 0x1

    add-int/2addr v2, v6

    goto :goto_1e

    :cond_37
    move-wide/from16 v14, v24

    :cond_38
    const/4 v2, 0x0

    .line 195
    invoke-direct {v1, v4, v14, v15, v2}, Lcom/google/android/gms/measurement/internal/b9;->J(Lcom/google/android/gms/internal/measurement/m4;JZ)V

    .line 196
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->q0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_39
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const-string v6, "_se"

    if-eqz v3, :cond_3a

    :try_start_7
    const-string v3, "_s"

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/d4;

    .line 197
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/d4;->D()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_39

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 198
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 199
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->n0()Ljava/lang/String;

    move-result-object v3

    .line 200
    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/measurement/internal/i;->n(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3a
    const-string v2, "_sid"

    .line 201
    invoke-static {v4, v2}, Lcom/google/android/gms/measurement/internal/d9;->x(Lcom/google/android/gms/internal/measurement/m4;Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_3b

    const/4 v2, 0x1

    .line 202
    invoke-direct {v1, v4, v14, v15, v2}, Lcom/google/android/gms/measurement/internal/b9;->J(Lcom/google/android/gms/internal/measurement/m4;JZ)V

    goto :goto_21

    .line 203
    :cond_3b
    invoke-static {v4, v6}, Lcom/google/android/gms/measurement/internal/d9;->x(Lcom/google/android/gms/internal/measurement/m4;Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_3c

    .line 204
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/measurement/m4;->O0(I)Lcom/google/android/gms/internal/measurement/m4;

    .line 205
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 206
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Session engagement user property is in the bundle without session ID. appId"

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 207
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 208
    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 209
    :cond_3c
    :goto_21
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 210
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 211
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 212
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v6, "Checking account type status for ad personalization signals"

    invoke-virtual {v3, v6}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/r8;->b:Lcom/google/android/gms/measurement/internal/b9;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 213
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 214
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->n0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/google/android/gms/measurement/internal/g4;->t(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3f

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/r8;->b:Lcom/google/android/gms/measurement/internal/b9;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 215
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 216
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->n0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v3

    if-eqz v3, :cond_3f

    .line 217
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/r4;->J()Z

    move-result v3

    if-eqz v3, :cond_3f

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 218
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->A()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v3

    .line 219
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m;->s()Z

    move-result v3

    if-eqz v3, :cond_3f

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 220
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 221
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v6, "Turning off ad personalization due to account type"

    invoke-virtual {v3, v6}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 222
    invoke-static {}, Lcom/google/android/gms/internal/measurement/x4;->z()Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v3

    move-object/from16 v6, v23

    .line 223
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/measurement/w4;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 224
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->A()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    .line 225
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m;->o()J

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Lcom/google/android/gms/internal/measurement/w4;->C(J)Lcom/google/android/gms/internal/measurement/w4;

    const-wide/16 v7, 0x1

    .line 226
    invoke-virtual {v3, v7, v8}, Lcom/google/android/gms/internal/measurement/w4;->A(J)Lcom/google/android/gms/internal/measurement/w4;

    .line 227
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/x4;

    const/4 v3, 0x0

    .line 228
    :goto_22
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->s0()I

    move-result v7

    if-ge v3, v7, :cond_3e

    .line 229
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/measurement/m4;->m0(I)Lcom/google/android/gms/internal/measurement/x4;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/x4;->B()Ljava/lang/String;

    move-result-object v7

    .line 230
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3d

    .line 231
    invoke-virtual {v4, v3, v2}, Lcom/google/android/gms/internal/measurement/m4;->k0(ILcom/google/android/gms/internal/measurement/x4;)Lcom/google/android/gms/internal/measurement/m4;

    goto :goto_23

    :cond_3d
    add-int/lit8 v3, v3, 0x1

    goto :goto_22

    .line 232
    :cond_3e
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/measurement/m4;->C0(Lcom/google/android/gms/internal/measurement/x4;)Lcom/google/android/gms/internal/measurement/m4;

    :cond_3f
    :goto_23
    const-wide v2, 0x7fffffffffffffffL

    .line 233
    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/measurement/m4;->g0(J)Lcom/google/android/gms/internal/measurement/m4;

    const-wide/high16 v2, -0x8000000000000000L

    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/measurement/m4;->J(J)Lcom/google/android/gms/internal/measurement/m4;

    const/4 v2, 0x0

    .line 234
    :goto_24
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->b0()I

    move-result v3

    if-ge v2, v3, :cond_42

    .line 235
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/measurement/m4;->v0(I)Lcom/google/android/gms/internal/measurement/d4;

    move-result-object v3

    .line 236
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d4;->z()J

    move-result-wide v6

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->u0()J

    move-result-wide v8

    cmp-long v10, v6, v8

    if-gez v10, :cond_40

    .line 237
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d4;->z()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/measurement/m4;->g0(J)Lcom/google/android/gms/internal/measurement/m4;

    .line 238
    :cond_40
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d4;->z()J

    move-result-wide v6

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->t0()J

    move-result-wide v8

    cmp-long v10, v6, v8

    if-lez v10, :cond_41

    .line 239
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d4;->z()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/measurement/m4;->J(J)Lcom/google/android/gms/internal/measurement/m4;

    :cond_41
    add-int/lit8 v2, v2, 0x1

    goto :goto_24

    .line 240
    :cond_42
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->M0()Lcom/google/android/gms/internal/measurement/m4;

    .line 241
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->E0()Lcom/google/android/gms/internal/measurement/m4;

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/b9;->f:Lcom/google/android/gms/measurement/internal/t9;

    .line 242
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 243
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->n0()Ljava/lang/String;

    move-result-object v7

    .line 244
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->q0()Ljava/util/List;

    move-result-object v8

    .line 245
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->r0()Ljava/util/List;

    move-result-object v9

    .line 246
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->u0()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    .line 247
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->t0()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    .line 248
    invoke-virtual/range {v6 .. v11}, Lcom/google/android/gms/measurement/internal/t9;->m(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;

    move-result-object v2

    .line 249
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/measurement/m4;->w0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/m4;

    .line 250
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v2

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/f;->F(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5b

    new-instance v2, Ljava/util/HashMap;

    .line 251
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    .line 252
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 253
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/h9;->t()Ljava/security/SecureRandom;

    move-result-object v6

    const/4 v7, 0x0

    .line 254
    :goto_25
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->b0()I

    move-result v8

    if-ge v7, v8, :cond_58

    .line 255
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/measurement/m4;->v0(I)Lcom/google/android/gms/internal/measurement/d4;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/p8;->q()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/c4;

    .line 256
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v9

    const-string v10, "_ep"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v10, "_sr"

    if-eqz v9, :cond_47

    :try_start_8
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 257
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 258
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/d4;

    const-string v11, "_en"

    invoke-static {v9, v11}, Lcom/google/android/gms/measurement/internal/d9;->p(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 259
    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/measurement/internal/o;

    if-nez v11, :cond_43

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 260
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v12, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 261
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v12

    invoke-static {v9}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 262
    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/measurement/internal/i;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v11

    if-eqz v11, :cond_43

    .line 263
    invoke-interface {v2, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_43
    if-eqz v11, :cond_46

    iget-object v9, v11, Lcom/google/android/gms/measurement/internal/o;->i:Ljava/lang/Long;

    if-nez v9, :cond_46

    iget-object v9, v11, Lcom/google/android/gms/measurement/internal/o;->j:Ljava/lang/Long;

    if-eqz v9, :cond_44

    .line 264
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    const-wide/16 v14, 0x1

    cmp-long v9, v12, v14

    if-lez v9, :cond_44

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 265
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v9, v11, Lcom/google/android/gms/measurement/internal/o;->j:Ljava/lang/Long;

    .line 266
    invoke-static {v8, v10, v9}, Lcom/google/android/gms/measurement/internal/d9;->m(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_44
    iget-object v9, v11, Lcom/google/android/gms/measurement/internal/o;->k:Ljava/lang/Boolean;

    if-eqz v9, :cond_45

    .line 267
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_45

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 268
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    const-string v9, "_efs"

    const-wide/16 v10, 0x1

    .line 269
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-static {v8, v9, v12}, Lcom/google/android/gms/measurement/internal/d9;->m(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;Ljava/lang/Object;)V

    .line 270
    :cond_45
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/d4;

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 271
    :cond_46
    invoke-virtual {v4, v7, v8}, Lcom/google/android/gms/internal/measurement/m4;->K(ILcom/google/android/gms/internal/measurement/c4;)Lcom/google/android/gms/internal/measurement/m4;

    :goto_26
    move-object/from16 v16, v5

    move-object/from16 p3, v6

    const-wide/16 v5, 0x1

    goto/16 :goto_31

    :cond_47
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 272
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v11, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 273
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v11

    const-string v12, "measurement.account.time_zone_offset_minutes"

    .line 274
    invoke-virtual {v9, v11, v12}, Lcom/google/android/gms/measurement/internal/g4;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 275
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-nez v13, :cond_48

    .line 276
    :try_start_9
    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_27

    :catch_0
    move-exception v0

    move-object v12, v0

    .line 277
    :try_start_a
    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 278
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v9

    .line 279
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v9

    const-string v13, "Unable to parse timezone offset. appId"

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    .line 280
    invoke-virtual {v9, v13, v11, v12}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_48
    const-wide/16 v11, 0x0

    .line 281
    :goto_27
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v9

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->x()J

    move-result-wide v13

    invoke-virtual {v9, v13, v14, v11, v12}, Lcom/google/android/gms/measurement/internal/h9;->s0(JJ)J

    move-result-wide v13

    .line 282
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/d4;

    move-wide/from16 v17, v11

    const-wide/16 v15, 0x1

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    const-string v12, "_dbg"

    .line 283
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_4b

    .line 284
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d4;->E()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_28
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_4b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/google/android/gms/internal/measurement/h4;

    move-object/from16 p3, v9

    .line 285
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/h4;->C()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4a

    .line 286
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/h4;->z()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_49

    goto :goto_29

    :cond_49
    const/4 v9, 0x1

    goto :goto_2a

    :cond_4a
    move-object/from16 v9, p3

    goto :goto_28

    :cond_4b
    :goto_29
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 287
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v11, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 288
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Lcom/google/android/gms/measurement/internal/g4;->m(Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    :goto_2a
    if-gtz v9, :cond_4c

    .line 289
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v10

    .line 290
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v10

    const-string v11, "Sample rate must be positive. event, rate"

    .line 291
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v12

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v10, v11, v12, v9}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 292
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/d4;

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    invoke-virtual {v4, v7, v8}, Lcom/google/android/gms/internal/measurement/m4;->K(ILcom/google/android/gms/internal/measurement/c4;)Lcom/google/android/gms/internal/measurement/m4;

    goto/16 :goto_26

    .line 294
    :cond_4c
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v2, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/measurement/internal/o;

    if-nez v11, :cond_4d

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 295
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v12, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 296
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11, v12, v15}, Lcom/google/android/gms/measurement/internal/i;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v11

    if-nez v11, :cond_4d

    .line 297
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v11

    .line 298
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v11

    const-string v12, "Event being bundled has no eventAggregate. appId, eventName"

    iget-object v15, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 299
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v15

    move-wide/from16 v23, v13

    .line 300
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v13

    .line 301
    invoke-virtual {v11, v12, v15, v13}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Lcom/google/android/gms/measurement/internal/o;

    iget-object v12, v5, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 302
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v29

    .line 303
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v30

    const-wide/16 v31, 0x1

    const-wide/16 v33, 0x1

    const-wide/16 v35, 0x1

    .line 304
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->x()J

    move-result-wide v37

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    move-object/from16 v28, v11

    invoke-direct/range {v28 .. v44}, Lcom/google/android/gms/measurement/internal/o;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_2b

    :cond_4d
    move-wide/from16 v23, v13

    :goto_2b
    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 305
    invoke-static {v12}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 306
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/d4;

    const-string v13, "_eid"

    invoke-static {v12, v13}, Lcom/google/android/gms/measurement/internal/d9;->p(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    if-eqz v12, :cond_4e

    const/4 v13, 0x1

    goto :goto_2c

    :cond_4e
    const/4 v13, 0x0

    .line 307
    :goto_2c
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    const/4 v14, 0x1

    if-ne v9, v14, :cond_51

    .line 308
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/d4;

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_50

    iget-object v9, v11, Lcom/google/android/gms/measurement/internal/o;->i:Ljava/lang/Long;

    if-nez v9, :cond_4f

    iget-object v9, v11, Lcom/google/android/gms/measurement/internal/o;->j:Ljava/lang/Long;

    if-nez v9, :cond_4f

    iget-object v9, v11, Lcom/google/android/gms/measurement/internal/o;->k:Ljava/lang/Boolean;

    if-eqz v9, :cond_50

    :cond_4f
    const/4 v9, 0x0

    .line 310
    invoke-virtual {v11, v9, v9, v9}, Lcom/google/android/gms/measurement/internal/o;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v10

    .line 311
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    :cond_50
    invoke-virtual {v4, v7, v8}, Lcom/google/android/gms/internal/measurement/m4;->K(ILcom/google/android/gms/internal/measurement/c4;)Lcom/google/android/gms/internal/measurement/m4;

    goto/16 :goto_26

    .line 313
    :cond_51
    invoke-virtual {v6, v9}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v14

    if-nez v14, :cond_53

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 314
    invoke-static {v12}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    int-to-long v14, v9

    .line 315
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-static {v8, v10, v9}, Lcom/google/android/gms/measurement/internal/d9;->m(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;Ljava/lang/Object;)V

    .line 316
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/d4;

    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_52

    const/4 v10, 0x0

    .line 318
    invoke-virtual {v11, v10, v9, v10}, Lcom/google/android/gms/measurement/internal/o;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v11

    .line 319
    :cond_52
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v9

    .line 320
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->x()J

    move-result-wide v12

    move-wide/from16 v14, v23

    invoke-virtual {v11, v12, v13, v14, v15}, Lcom/google/android/gms/measurement/internal/o;->b(JJ)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v10

    .line 321
    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v16, v5

    move-object/from16 p3, v6

    const-wide/16 v5, 0x1

    goto/16 :goto_30

    :cond_53
    move-object/from16 p3, v6

    move-wide/from16 v14, v23

    .line 322
    iget-object v6, v11, Lcom/google/android/gms/measurement/internal/o;->h:Ljava/lang/Long;

    if-eqz v6, :cond_54

    .line 323
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    move-object/from16 v23, v4

    move-object/from16 v25, v11

    move-object/from16 v24, v12

    move-wide/from16 v45, v16

    move-object/from16 v16, v5

    move-wide/from16 v4, v45

    goto :goto_2d

    .line 324
    :cond_54
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v6

    move-object/from16 v23, v4

    move-object/from16 v16, v5

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->w()J

    move-result-wide v4

    move-object/from16 v25, v11

    move-object/from16 v24, v12

    move-wide/from16 v11, v17

    invoke-virtual {v6, v4, v5, v11, v12}, Lcom/google/android/gms/measurement/internal/h9;->s0(JJ)J

    move-result-wide v4

    :goto_2d
    cmp-long v6, v4, v14

    if-eqz v6, :cond_56

    .line 325
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 326
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    const-string v4, "_efs"

    const-wide/16 v5, 0x1

    .line 327
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-static {v8, v4, v11}, Lcom/google/android/gms/measurement/internal/d9;->m(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 328
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    int-to-long v11, v9

    .line 329
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v8, v10, v4}, Lcom/google/android/gms/measurement/internal/d9;->m(Lcom/google/android/gms/internal/measurement/c4;Ljava/lang/String;Ljava/lang/Object;)V

    .line 330
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/d4;

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 331
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_55

    .line 332
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v11, v25

    const/4 v10, 0x0

    invoke-virtual {v11, v10, v4, v9}, Lcom/google/android/gms/measurement/internal/o;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v11

    goto :goto_2e

    :cond_55
    move-object/from16 v11, v25

    .line 333
    :goto_2e
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v4

    .line 334
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->x()J

    move-result-wide v9

    invoke-virtual {v11, v9, v10, v14, v15}, Lcom/google/android/gms/measurement/internal/o;->b(JJ)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v9

    .line 335
    invoke-interface {v2, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2f

    :cond_56
    move-object/from16 v11, v25

    const-wide/16 v5, 0x1

    .line 336
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_57

    .line 337
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v12, v24

    const/4 v9, 0x0

    invoke-virtual {v11, v12, v9, v9}, Lcom/google/android/gms/measurement/internal/o;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v10

    .line 338
    invoke-interface {v2, v4, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_57
    :goto_2f
    move-object/from16 v4, v23

    .line 339
    :goto_30
    invoke-virtual {v4, v7, v8}, Lcom/google/android/gms/internal/measurement/m4;->K(ILcom/google/android/gms/internal/measurement/c4;)Lcom/google/android/gms/internal/measurement/m4;

    :goto_31
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v6, p3

    move-object/from16 v5, v16

    goto/16 :goto_25

    :cond_58
    move-object/from16 v16, v5

    .line 340
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->b0()I

    move-result v6

    if-ge v5, v6, :cond_59

    .line 341
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->G0()Lcom/google/android/gms/internal/measurement/m4;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/measurement/m4;->x0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/m4;

    .line 342
    :cond_59
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_32
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 343
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 344
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/o;

    invoke-virtual {v5, v3}, Lcom/google/android/gms/measurement/internal/i;->r(Lcom/google/android/gms/measurement/internal/o;)V

    goto :goto_32

    :cond_5a
    move-object/from16 v2, v16

    goto :goto_33

    :cond_5b
    move-object v2, v5

    :goto_33
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 345
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v3

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 346
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 347
    invoke-virtual {v5, v3}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v5

    if-nez v5, :cond_5c

    .line 348
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v5

    .line 349
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v5

    const-string v6, "Bundling raw events w/o app info. appId"

    iget-object v7, v2, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 350
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    .line 351
    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_38

    .line 352
    :cond_5c
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->b0()I

    move-result v6

    if-lez v6, :cond_61

    .line 353
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/r4;->Y()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-eqz v10, :cond_5d

    .line 354
    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/measurement/m4;->Z(J)Lcom/google/android/gms/internal/measurement/m4;

    goto :goto_34

    .line 355
    :cond_5d
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->J0()Lcom/google/android/gms/internal/measurement/m4;

    .line 356
    :goto_34
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/r4;->a0()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-nez v12, :cond_5e

    goto :goto_35

    :cond_5e
    move-wide v6, v8

    :goto_35
    cmp-long v8, v6, v10

    if-eqz v8, :cond_5f

    .line 357
    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/measurement/m4;->a0(J)Lcom/google/android/gms/internal/measurement/m4;

    goto :goto_36

    .line 358
    :cond_5f
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->K0()Lcom/google/android/gms/internal/measurement/m4;

    .line 359
    :goto_36
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/r4;->e()V

    .line 360
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/r4;->Z()J

    move-result-wide v6

    long-to-int v7, v6

    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/measurement/m4;->B(I)Lcom/google/android/gms/internal/measurement/m4;

    .line 361
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->u0()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/measurement/internal/r4;->E(J)V

    .line 362
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->t0()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/measurement/internal/r4;->C(J)V

    .line 363
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/r4;->d0()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_60

    .line 364
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/measurement/m4;->R(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    goto :goto_37

    .line 365
    :cond_60
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->H0()Lcom/google/android/gms/internal/measurement/m4;

    .line 366
    :goto_37
    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 367
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 368
    invoke-virtual {v6, v5}, Lcom/google/android/gms/measurement/internal/i;->q(Lcom/google/android/gms/measurement/internal/r4;)V

    .line 369
    :cond_61
    :goto_38
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m4;->b0()I

    move-result v5

    if-lez v5, :cond_68

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 370
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m4;->f()Lcom/google/android/gms/measurement/internal/b;

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 371
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 372
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/g4;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r3;

    move-result-object v5

    const-wide/16 v6, -0x1

    if-eqz v5, :cond_63

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/r3;->L()Z

    move-result v8

    if-nez v8, :cond_62

    goto :goto_39

    .line 373
    :cond_62
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/r3;->y()J

    move-result-wide v8

    .line 374
    invoke-virtual {v4, v8, v9}, Lcom/google/android/gms/internal/measurement/m4;->D(J)Lcom/google/android/gms/internal/measurement/m4;

    goto :goto_3a

    .line 375
    :cond_63
    :goto_39
    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 376
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/n4;->D()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_64

    .line 377
    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/measurement/m4;->D(J)Lcom/google/android/gms/internal/measurement/m4;

    goto :goto_3a

    .line 378
    :cond_64
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v5

    .line 379
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v5

    const-string v8, "Did not find measurement config or missing version info. appId"

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/internal/measurement/n4;

    .line 380
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    .line 381
    invoke-virtual {v5, v8, v9}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 382
    :goto_3a
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 383
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 384
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/n4;

    .line 385
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 386
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    .line 387
    invoke-static {v4}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 389
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->g1()Z

    move-result v8

    invoke-static {v8}, Lz2/j;->m(Z)V

    .line 390
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i;->m()V

    iget-object v8, v5, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 391
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/m4;->e()Lf3/d;

    move-result-object v8

    .line 392
    invoke-interface {v8}, Lf3/d;->a()J

    move-result-wide v8

    .line 393
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->B1()J

    move-result-wide v10

    iget-object v12, v5, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 394
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    .line 395
    invoke-static {}, Lcom/google/android/gms/measurement/internal/f;->i()J

    move-result-wide v12

    sub-long v12, v8, v12

    cmp-long v14, v10, v12

    if-ltz v14, :cond_65

    .line 396
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->B1()J

    move-result-wide v10

    iget-object v12, v5, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 397
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    .line 398
    invoke-static {}, Lcom/google/android/gms/measurement/internal/f;->i()J

    move-result-wide v12

    add-long/2addr v12, v8

    cmp-long v14, v10, v12

    if-lez v14, :cond_66

    :cond_65
    iget-object v10, v5, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 399
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v10

    .line 400
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v10

    const-string v11, "Storing bundle outside of the max uploading time span. appId, now, timestamp"

    .line 401
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    .line 402
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    .line 403
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->B1()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    .line 404
    invoke-virtual {v10, v11, v12, v8, v9}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 405
    :cond_66
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->i()[B

    move-result-object v8
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/r8;->b:Lcom/google/android/gms/measurement/internal/b9;

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 406
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 407
    invoke-virtual {v9, v8}, Lcom/google/android/gms/measurement/internal/d9;->Q([B)[B

    move-result-object v8
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 408
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v9

    .line 409
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v9

    const-string v10, "Saving bundle, size"

    array-length v11, v8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v9, Landroid/content/ContentValues;

    .line 410
    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    const-string v10, "app_id"

    .line 411
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "bundle_end_timestamp"

    .line 412
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->B1()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v10, "data"

    .line 413
    invoke-virtual {v9, v10, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v8, "has_realtime"

    .line 414
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v8, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 415
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->m1()Z

    move-result v8

    if-eqz v8, :cond_67

    const-string v8, "retry_count"

    .line 416
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->u1()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v8, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 417
    :cond_67
    :try_start_d
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    const-string v10, "queue"

    const/4 v11, 0x0

    .line 418
    invoke-virtual {v8, v10, v11, v9}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v8

    cmp-long v10, v8, v6

    if-nez v10, :cond_68

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 419
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v6

    .line 420
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v6

    const-string v7, "Failed to insert bundle (got -1). appId"

    .line 421
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_3b

    :catch_1
    move-exception v0

    move-object v6, v0

    .line 422
    :try_start_e
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 423
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v5

    .line 424
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v5

    const-string v7, "Error storing bundle. appId"

    .line 425
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5, v7, v4, v6}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3b

    :catch_2
    move-exception v0

    move-object v6, v0

    .line 426
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 427
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v5

    .line 428
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v5

    const-string v7, "Data loss. Failed to serialize bundle. appId"

    .line 429
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 430
    invoke-virtual {v5, v7, v4, v6}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 431
    :cond_68
    :goto_3b
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 432
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/a9;->b:Ljava/util/List;

    .line 433
    invoke-virtual {v4, v2}, Lcom/google/android/gms/measurement/internal/i;->h0(Ljava/util/List;)V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 434
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 435
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    const/4 v5, 0x2

    :try_start_f
    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const/4 v6, 0x1

    aput-object v3, v5, v6

    const-string v6, "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"

    .line 436
    invoke-virtual {v4, v6, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    goto :goto_3c

    :catch_3
    move-exception v0

    move-object v4, v0

    .line 437
    :try_start_10
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 438
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 439
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v5, "Failed to remove unused event metadata. appId"

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 440
    invoke-virtual {v2, v5, v3, v4}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 441
    :goto_3c
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 442
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 443
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 444
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 445
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    const/4 v2, 0x1

    return v2

    .line 446
    :cond_69
    :goto_3d
    :try_start_11
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 447
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 448
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 449
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 450
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    const/4 v2, 0x0

    return v2

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 451
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 452
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 453
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 454
    throw v2
.end method

.method private final O()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->b0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private final P(Lcom/google/android/gms/internal/measurement/c4;Lcom/google/android/gms/internal/measurement/c4;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/c4;->K()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_e"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 2
    invoke-static {v0}, Lz2/j;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    const-string v1, "_sc"

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/h4;->D()Ljava/lang/String;

    move-result-object v0

    .line 6
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 7
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 8
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/d4;

    const-string v3, "_pc"

    invoke-static {v2, v3}, Lcom/google/android/gms/measurement/internal/d9;->o(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/h4;->D()Ljava/lang/String;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/b9;->K(Lcom/google/android/gms/internal/measurement/c4;Lcom/google/android/gms/internal/measurement/c4;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private static final Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/s8;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    .line 2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Component not initialized: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Upload Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static bridge synthetic a0(Lcom/google/android/gms/measurement/internal/b9;)Lcom/google/android/gms/measurement/internal/m4;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    return-object p0
.end method

.method public static e0(Landroid/content/Context;)Lcom/google/android/gms/measurement/internal/b9;
    .locals 3

    .line 1
    invoke-static {p0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/measurement/internal/b9;->C:Lcom/google/android/gms/measurement/internal/b9;

    if-nez v0, :cond_1

    const-class v0, Lcom/google/android/gms/measurement/internal/b9;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/measurement/internal/b9;->C:Lcom/google/android/gms/measurement/internal/b9;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/measurement/internal/c9;

    .line 3
    invoke-direct {v1, p0}, Lcom/google/android/gms/measurement/internal/c9;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-static {v1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/measurement/internal/c9;

    new-instance v1, Lcom/google/android/gms/measurement/internal/b9;

    const/4 v2, 0x0

    .line 5
    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/measurement/internal/b9;-><init>(Lcom/google/android/gms/measurement/internal/c9;Lcom/google/android/gms/measurement/internal/m4;)V

    sput-object v1, Lcom/google/android/gms/measurement/internal/b9;->C:Lcom/google/android/gms/measurement/internal/b9;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/measurement/internal/b9;->C:Lcom/google/android/gms/measurement/internal/b9;

    return-object p0
.end method

.method static bridge synthetic j0(Lcom/google/android/gms/measurement/internal/b9;Lcom/google/android/gms/measurement/internal/c9;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    new-instance p1, Lcom/google/android/gms/measurement/internal/z3;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/z3;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->k:Lcom/google/android/gms/measurement/internal/z3;

    .line 2
    new-instance p1, Lcom/google/android/gms/measurement/internal/i;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/i;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/s8;->j()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/e;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/f;->z(Lcom/google/android/gms/measurement/internal/e;)V

    new-instance p1, Lcom/google/android/gms/measurement/internal/z7;

    .line 5
    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/z7;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/s8;->j()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    new-instance p1, Lcom/google/android/gms/measurement/internal/t9;

    .line 7
    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/t9;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/s8;->j()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->f:Lcom/google/android/gms/measurement/internal/t9;

    new-instance p1, Lcom/google/android/gms/measurement/internal/q6;

    .line 9
    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/q6;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/s8;->j()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->h:Lcom/google/android/gms/measurement/internal/q6;

    new-instance p1, Lcom/google/android/gms/measurement/internal/q8;

    .line 11
    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/q8;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/s8;->j()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->e:Lcom/google/android/gms/measurement/internal/q8;

    .line 13
    new-instance p1, Lcom/google/android/gms/measurement/internal/p3;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/p3;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->d:Lcom/google/android/gms/measurement/internal/p3;

    iget p1, p0, Lcom/google/android/gms/measurement/internal/b9;->q:I

    iget v0, p0, Lcom/google/android/gms/measurement/internal/b9;->r:I

    if-eq p1, v0, :cond_0

    .line 14
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/b9;->q:I

    .line 16
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/measurement/internal/b9;->r:I

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Not all upload components initialized"

    .line 18
    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/b9;->m:Z

    return-void
.end method


# virtual methods
.method final A()V
    .locals 22

    move-object/from16 v1, p0

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/google/android/gms/measurement/internal/b9;->u:Z

    const/4 v3, 0x0

    :try_start_0
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->f()Lcom/google/android/gms/measurement/internal/b;

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->L()Lcom/google/android/gms/measurement/internal/y7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/y7;->J()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_0

    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v2, "Upload data called on the client side before use of service was decided"

    .line 7
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    iput-boolean v3, v1, Lcom/google/android/gms/measurement/internal/b9;->u:Z

    .line 8
    :goto_0
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->I()V

    return-void

    .line 9
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v2, "Upload called in the client side when service should be used"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    iput-boolean v3, v1, Lcom/google/android/gms/measurement/internal/b9;->u:Z

    goto :goto_0

    .line 11
    :cond_1
    :try_start_2
    iget-wide v4, v1, Lcom/google/android/gms/measurement/internal/b9;->o:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_2

    .line 12
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->L()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    iput-boolean v3, v1, Lcom/google/android/gms/measurement/internal/b9;->u:Z

    goto :goto_0

    .line 13
    :cond_2
    :try_start_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->x:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 14
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v2, "Uploading requested multiple times"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    iput-boolean v3, v1, Lcom/google/android/gms/measurement/internal/b9;->u:Z

    goto :goto_0

    .line 15
    :cond_3
    :try_start_4
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->b:Lcom/google/android/gms/measurement/internal/n3;

    .line 16
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/n3;->m()Z

    move-result v0

    if-nez v0, :cond_4

    .line 18
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v2, "Network not connected, ignoring upload request"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 19
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->L()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    iput-boolean v3, v1, Lcom/google/android/gms/measurement/internal/b9;->u:Z

    goto :goto_0

    .line 20
    :cond_4
    :try_start_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v0

    invoke-interface {v0}, Lf3/d;->a()J

    move-result-wide v4

    .line 21
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    sget-object v8, Lcom/google/android/gms/measurement/internal/x2;->R:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v9, 0x0

    invoke-virtual {v0, v9, v8}, Lcom/google/android/gms/measurement/internal/f;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)I

    move-result v0

    .line 22
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/f;->I()J

    move-result-wide v10

    sub-long v10, v4, v10

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v0, :cond_5

    .line 23
    invoke-direct {v1, v9, v10, v11}, Lcom/google/android/gms/measurement/internal/b9;->N(Ljava/lang/String;J)Z

    move-result v12

    if-eqz v12, :cond_5

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 24
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/z7;->i:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s3;->a()J

    move-result-wide v10

    cmp-long v0, v10, v6

    if-eqz v0, :cond_6

    .line 25
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v6, "Uploading events. Elapsed time since last upload attempt (ms)"

    sub-long v7, v4, v10

    .line 27
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    .line 28
    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 29
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->b0()Ljava/lang/String;

    move-result-object v6

    .line 31
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-wide/16 v7, -0x1

    if-nez v0, :cond_23

    iget-wide v10, v1, Lcom/google/android/gms/measurement/internal/b9;->z:J

    cmp-long v0, v10, v7

    if-nez v0, :cond_a

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 32
    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 33
    :try_start_6
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v11, "select rowid from raw_events order by rowid desc limit 1;"

    .line 34
    invoke-virtual {v0, v11, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 35
    :try_start_7
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-nez v0, :cond_7

    .line 36
    :goto_2
    :try_start_8
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    goto :goto_4

    .line 37
    :cond_7
    :try_start_9
    invoke-interface {v11, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    move-object v11, v9

    .line 38
    :goto_3
    :try_start_a
    iget-object v10, v10, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 39
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v10

    .line 40
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v10

    const-string v12, "Error querying raw events"

    invoke-virtual {v10, v12, v0}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    if-eqz v11, :cond_8

    goto :goto_2

    .line 41
    :cond_8
    :goto_4
    :try_start_b
    iput-wide v7, v1, Lcom/google/android/gms/measurement/internal/b9;->z:J

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v9, v11

    :goto_5
    if-eqz v9, :cond_9

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 42
    :cond_9
    throw v0

    .line 43
    :cond_a
    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    sget-object v7, Lcom/google/android/gms/measurement/internal/x2;->h:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/measurement/internal/f;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)I

    move-result v0

    .line 44
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/measurement/internal/x2;->i:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v7, v6, v8}, Lcom/google/android/gms/measurement/internal/f;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)I

    move-result v7

    .line 45
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 46
    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 47
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 48
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    if-lez v0, :cond_b

    const/4 v10, 0x1

    goto :goto_7

    :cond_b
    const/4 v10, 0x0

    .line 49
    :goto_7
    invoke-static {v10}, Lz2/j;->a(Z)V

    if-lez v7, :cond_c

    const/4 v10, 0x1

    goto :goto_8

    :cond_c
    const/4 v10, 0x0

    .line 50
    :goto_8
    invoke-static {v10}, Lz2/j;->a(Z)V

    .line 51
    invoke-static {v6}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 52
    :try_start_c
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v11

    const-string v12, "rowid"

    const-string v13, "data"

    const-string v14, "retry_count"

    filled-new-array {v12, v13, v14}, [Ljava/lang/String;

    move-result-object v13

    new-array v15, v2, [Ljava/lang/String;

    aput-object v6, v15, v3

    const-string v12, "queue"

    const-string v14, "app_id=?"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v18, "rowid"

    .line 53
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v19

    .line 54
    invoke-virtual/range {v11 .. v19}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_9
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 55
    :try_start_d
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_d

    .line 56
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 57
    :try_start_e
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    move-wide/from16 v20, v4

    goto/16 :goto_10

    .line 58
    :cond_d
    :try_start_f
    new-instance v12, Ljava/util/ArrayList;

    .line 59
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    .line 60
    :goto_9
    invoke-interface {v11, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 61
    :try_start_10
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    iget-object v2, v8, Lcom/google/android/gms/measurement/internal/r8;->b:Lcom/google/android/gms/measurement/internal/b9;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 62
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    :try_start_11
    new-instance v9, Ljava/io/ByteArrayInputStream;

    .line 63
    invoke-direct {v9, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    .line 64
    invoke-direct {v0, v9}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 65
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v10, 0x400

    new-array v10, v10, [B
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    move-wide/from16 v20, v4

    .line 66
    :goto_a
    :try_start_12
    invoke-virtual {v0, v10}, Ljava/util/zip/GZIPInputStream;->read([B)I

    move-result v4

    if-gtz v4, :cond_10

    .line 67
    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 68
    invoke-virtual {v9}, Ljava/io/ByteArrayInputStream;->close()V

    .line 69
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 70
    :try_start_13
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e

    array-length v2, v0
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_7
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    add-int/2addr v2, v13

    if-le v2, v7, :cond_e

    goto/16 :goto_e

    .line 71
    :cond_e
    :try_start_14
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n4;->J1()Lcom/google/android/gms/internal/measurement/m4;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/google/android/gms/measurement/internal/d9;->D(Lcom/google/android/gms/internal/measurement/t9;[B)Lcom/google/android/gms/internal/measurement/t9;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/m4;
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_7
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    const/4 v3, 0x2

    .line 72
    :try_start_15
    invoke-interface {v11, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-nez v4, :cond_f

    .line 73
    invoke-interface {v11, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/m4;->e0(I)Lcom/google/android/gms/internal/measurement/m4;

    .line 74
    :cond_f
    array-length v0, v0

    add-int/2addr v13, v0

    .line 75
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/n4;

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :catch_2
    move-exception v0

    .line 76
    iget-object v2, v8, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 77
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 78
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Failed to merge queued bundle. appId"

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 79
    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_7
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    goto :goto_d

    :cond_10
    const/4 v5, 0x0

    .line 80
    :try_start_16
    invoke-virtual {v3, v10, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_16 .. :try_end_16} :catch_7
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    goto :goto_a

    :catch_3
    move-exception v0

    goto :goto_b

    :catch_4
    move-exception v0

    move-wide/from16 v20, v4

    .line 81
    :goto_b
    :try_start_17
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 82
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 83
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Failed to ungzip content"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 84
    throw v0
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_7
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    :catch_5
    move-exception v0

    goto :goto_c

    :catch_6
    move-exception v0

    move-wide/from16 v20, v4

    .line 85
    :goto_c
    :try_start_18
    iget-object v2, v8, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 86
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 87
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Failed to unzip queued bundle. appId"

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 88
    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    :goto_d
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_18 .. :try_end_18} :catch_7
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    if-eqz v0, :cond_12

    if-le v13, v7, :cond_11

    goto :goto_e

    :cond_11
    move-wide/from16 v4, v20

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v9, 0x0

    goto/16 :goto_9

    .line 90
    :cond_12
    :goto_e
    :try_start_19
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_6

    move-object v0, v12

    goto :goto_10

    :catch_7
    move-exception v0

    goto :goto_f

    :catch_8
    move-exception v0

    move-wide/from16 v20, v4

    goto :goto_f

    :catchall_2
    move-exception v0

    const/4 v9, 0x0

    goto/16 :goto_19

    :catch_9
    move-exception v0

    move-wide/from16 v20, v4

    const/4 v11, 0x0

    .line 91
    :goto_f
    :try_start_1a
    iget-object v2, v8, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 92
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 93
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Error querying bundles. appId"

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    if-eqz v11, :cond_13

    .line 95
    :try_start_1b
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 96
    :cond_13
    :goto_10
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_26

    .line 97
    invoke-virtual {v1, v6}, Lcom/google/android/gms/measurement/internal/b9;->U(Ljava/lang/String;)Lb4/a;

    move-result-object v2

    invoke-virtual {v2}, Lb4/a;->j()Z

    move-result v2

    if-eqz v2, :cond_18

    .line 98
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    .line 99
    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/internal/measurement/n4;

    .line 100
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/n4;->H()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_14

    .line 101
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/n4;->H()Ljava/lang/String;

    move-result-object v2

    goto :goto_11

    :cond_15
    const/4 v2, 0x0

    :goto_11
    if-eqz v2, :cond_18

    const/4 v3, 0x0

    .line 102
    :goto_12
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_18

    .line 103
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Pair;

    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Lcom/google/android/gms/internal/measurement/n4;

    .line 104
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->H()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_16

    goto :goto_13

    .line 105
    :cond_16
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n4;->H()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    const/4 v4, 0x0

    .line 106
    invoke-interface {v0, v4, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    goto :goto_14

    :cond_17
    :goto_13
    add-int/lit8 v3, v3, 0x1

    goto :goto_12

    .line 107
    :cond_18
    :goto_14
    invoke-static {}, Lcom/google/android/gms/internal/measurement/l4;->w()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v2

    .line 108
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    .line 109
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/f;->C(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_19

    .line 111
    invoke-virtual {v1, v6}, Lcom/google/android/gms/measurement/internal/b9;->U(Ljava/lang/String;)Lb4/a;

    move-result-object v5

    invoke-virtual {v5}, Lb4/a;->j()Z

    move-result v5

    if-eqz v5, :cond_19

    const/4 v5, 0x1

    goto :goto_15

    :cond_19
    const/4 v5, 0x0

    .line 112
    :goto_15
    invoke-virtual {v1, v6}, Lcom/google/android/gms/measurement/internal/b9;->U(Ljava/lang/String;)Lb4/a;

    move-result-object v7

    invoke-virtual {v7}, Lb4/a;->j()Z

    move-result v7

    .line 113
    invoke-virtual {v1, v6}, Lcom/google/android/gms/measurement/internal/b9;->U(Ljava/lang/String;)Lb4/a;

    move-result-object v8

    invoke-virtual {v8}, Lb4/a;->k()Z

    move-result v8

    const/4 v9, 0x0

    :goto_16
    if-ge v9, v3, :cond_1e

    .line 114
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/util/Pair;

    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Lcom/google/android/gms/internal/measurement/n4;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/p8;->q()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/m4;

    .line 115
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/util/Pair;

    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Long;

    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/f;->q()J

    const-wide/32 v11, 0xb3b0

    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/internal/measurement/m4;->j0(J)Lcom/google/android/gms/internal/measurement/m4;

    move-wide/from16 v11, v20

    .line 117
    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/internal/measurement/m4;->i0(J)Lcom/google/android/gms/internal/measurement/m4;

    iget-object v13, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 118
    invoke-virtual {v13}, Lcom/google/android/gms/measurement/internal/m4;->f()Lcom/google/android/gms/measurement/internal/b;

    const/4 v13, 0x0

    .line 119
    invoke-virtual {v10, v13}, Lcom/google/android/gms/internal/measurement/m4;->f0(Z)Lcom/google/android/gms/internal/measurement/m4;

    if-nez v5, :cond_1a

    .line 120
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/m4;->F0()Lcom/google/android/gms/internal/measurement/m4;

    :cond_1a
    if-nez v7, :cond_1b

    .line 121
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/m4;->L0()Lcom/google/android/gms/internal/measurement/m4;

    .line 122
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/m4;->I0()Lcom/google/android/gms/internal/measurement/m4;

    :cond_1b
    if-nez v8, :cond_1c

    .line 123
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/m4;->D0()Lcom/google/android/gms/internal/measurement/m4;

    .line 124
    :cond_1c
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v13

    sget-object v14, Lcom/google/android/gms/measurement/internal/x2;->X:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v13, v6, v14}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v13

    if-eqz v13, :cond_1d

    .line 125
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/n4;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/z6;->i()[B

    move-result-object v13

    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 126
    invoke-static {v14}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 127
    invoke-virtual {v14, v13}, Lcom/google/android/gms/measurement/internal/d9;->y([B)J

    move-result-wide v13

    invoke-virtual {v10, v13, v14}, Lcom/google/android/gms/internal/measurement/m4;->C(J)Lcom/google/android/gms/internal/measurement/m4;

    .line 128
    :cond_1d
    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/measurement/k4;->v(Lcom/google/android/gms/internal/measurement/m4;)Lcom/google/android/gms/internal/measurement/k4;

    add-int/lit8 v9, v9, 0x1

    move-wide/from16 v20, v11

    goto :goto_16

    :cond_1e
    move-wide/from16 v11, v20

    .line 129
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->C()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x2

    .line 130
    invoke-static {v0, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1f

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 131
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 132
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/l4;

    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/d9;->E(Lcom/google/android/gms/internal/measurement/l4;)Ljava/lang/String;

    move-result-object v0

    goto :goto_17

    :cond_1f
    const/4 v0, 0x0

    :goto_17
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 133
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 134
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/l4;

    .line 135
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/z6;->i()[B

    move-result-object v14

    .line 136
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->r:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v9, 0x0

    .line 137
    invoke-virtual {v5, v9}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_6

    .line 138
    :try_start_1c
    new-instance v13, Ljava/net/URL;

    invoke-direct {v13, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 139
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v7

    const/4 v8, 0x1

    xor-int/2addr v7, v8

    invoke-static {v7}, Lz2/j;->a(Z)V

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/b9;->x:Ljava/util/List;

    if-eqz v7, :cond_20

    .line 140
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v4

    const-string v7, "Set uploading progress before finishing the previous upload"

    invoke-virtual {v4, v7}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    goto :goto_18

    .line 141
    :cond_20
    new-instance v7, Ljava/util/ArrayList;

    .line 142
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v7, v1, Lcom/google/android/gms/measurement/internal/b9;->x:Ljava/util/List;

    .line 143
    :goto_18
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 144
    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/z7;->j:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {v4, v11, v12}, Lcom/google/android/gms/measurement/internal/s3;->b(J)V

    const-string v4, "?"

    if-lez v3, :cond_21

    const/4 v3, 0x0

    .line 145
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/k4;->w(I)Lcom/google/android/gms/internal/measurement/n4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v4

    .line 146
    :cond_21
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 147
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Uploading data. app, uncompressed size, data"

    array-length v7, v14

    .line 148
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v3, v4, v7, v0}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/google/android/gms/measurement/internal/b9;->t:Z

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->b:Lcom/google/android/gms/measurement/internal/n3;

    .line 149
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    new-instance v0, Lcom/google/android/gms/measurement/internal/v8;

    invoke-direct {v0, v1, v6}, Lcom/google/android/gms/measurement/internal/v8;-><init>(Lcom/google/android/gms/measurement/internal/b9;Ljava/lang/String;)V

    .line 150
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 151
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    .line 152
    invoke-static {v13}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    invoke-static {v14}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v11, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 155
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/measurement/internal/m3;

    const/4 v15, 0x0

    move-object v10, v3

    move-object v12, v6

    move-object/from16 v16, v0

    .line 156
    invoke-direct/range {v10 .. v16}, Lcom/google/android/gms/measurement/internal/m3;-><init>(Lcom/google/android/gms/measurement/internal/n3;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/k3;)V

    .line 157
    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/k4;->y(Ljava/lang/Runnable;)V
    :try_end_1c
    .catch Ljava/net/MalformedURLException; {:try_start_1c .. :try_end_1c} :catch_a
    .catchall {:try_start_1c .. :try_end_1c} :catchall_6

    goto/16 :goto_1d

    .line 158
    :catch_a
    :try_start_1d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v2, "Failed to parse upload URL. Not uploading. appId"

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 160
    invoke-virtual {v0, v2, v3, v5}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1d

    :catchall_3
    move-exception v0

    move-object v9, v11

    :goto_19
    if-eqz v9, :cond_22

    .line 161
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 162
    :cond_22
    throw v0

    :cond_23
    move-wide v11, v4

    .line 163
    iput-wide v7, v1, Lcom/google/android/gms/measurement/internal/b9;->z:J

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 164
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 165
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/f;->I()J

    move-result-wide v3

    sub-long v4, v11, v3

    .line 166
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 167
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/s8;->i()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_6

    .line 168
    :try_start_1e
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    .line 169
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"

    .line 170
    invoke-virtual {v0, v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_1e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1e .. :try_end_1e} :catch_c
    .catchall {:try_start_1e .. :try_end_1e} :catchall_4

    .line 171
    :try_start_1f
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_24

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 172
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 173
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v4, "No expired configs for apps with pending events"

    invoke-virtual {v0, v4}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V
    :try_end_1f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1f .. :try_end_1f} :catch_b
    .catchall {:try_start_1f .. :try_end_1f} :catchall_5

    .line 174
    :goto_1a
    :try_start_20
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_6

    goto :goto_1c

    :cond_24
    const/4 v4, 0x0

    .line 175
    :try_start_21
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9
    :try_end_21
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_21 .. :try_end_21} :catch_b
    .catchall {:try_start_21 .. :try_end_21} :catchall_5

    goto :goto_1a

    :catch_b
    move-exception v0

    goto :goto_1b

    :catchall_4
    move-exception v0

    goto :goto_1e

    :catch_c
    move-exception v0

    move-object v3, v9

    .line 176
    :goto_1b
    :try_start_22
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 177
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 178
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v4, "Error selecting expired configs"

    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_5

    if-eqz v3, :cond_25

    goto :goto_1a

    .line 179
    :cond_25
    :goto_1c
    :try_start_23
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_26

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 180
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 181
    invoke-virtual {v0, v9}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v0

    if-eqz v0, :cond_26

    .line 182
    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/b9;->h(Lcom/google/android/gms/measurement/internal/r4;)V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_6

    :cond_26
    :goto_1d
    const/4 v2, 0x0

    .line 183
    iput-boolean v2, v1, Lcom/google/android/gms/measurement/internal/b9;->u:Z

    goto/16 :goto_0

    :catchall_5
    move-exception v0

    move-object v9, v3

    :goto_1e
    if-eqz v9, :cond_27

    .line 184
    :try_start_24
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 185
    :cond_27
    throw v0
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_6

    :catchall_6
    move-exception v0

    const/4 v2, 0x0

    .line 186
    iput-boolean v2, v1, Lcom/google/android/gms/measurement/internal/b9;->u:Z

    .line 187
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->I()V

    .line 188
    throw v0
.end method

.method final B(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v4, "metadata_fingerprint"

    const-string v5, "app_id"

    const-string v6, "raw_events"

    const-string v7, "_sno"

    .line 1
    invoke-static/range {p2 .. p2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v8}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    .line 6
    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 7
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 8
    invoke-static/range {p1 .. p2}, Lcom/google/android/gms/measurement/internal/d9;->n(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)Z

    move-result v11

    if-nez v11, :cond_0

    return-void

    .line 9
    :cond_0
    iget-boolean v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->u:Z

    if-eqz v11, :cond_3e

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 10
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 11
    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    invoke-virtual {v11, v10, v12}, Lcom/google/android/gms/measurement/internal/g4;->x(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    const-string v15, "_err"

    const/4 v14, 0x0

    if-eqz v11, :cond_4

    .line 12
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 13
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 14
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    .line 15
    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Dropping blocked event. appId"

    .line 16
    invoke-virtual {v3, v6, v4, v5}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 17
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 18
    invoke-virtual {v3, v10}, Lcom/google/android/gms/measurement/internal/g4;->v(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 19
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 20
    invoke-virtual {v3, v10}, Lcom/google/android/gms/measurement/internal/g4;->y(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 21
    :cond_1
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 22
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/b9;->B:Lcom/google/android/gms/measurement/internal/g9;

    const/16 v14, 0xb

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    const/16 v17, 0x0

    const-string v15, "_ev"

    move-object v13, v10

    move-object/from16 v16, v2

    .line 23
    invoke-virtual/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/h9;->A(Lcom/google/android/gms/measurement/internal/g9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    .line 24
    :cond_2
    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 25
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 26
    invoke-virtual {v2, v10}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 27
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->W()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->N()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 28
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v5

    invoke-interface {v5}, Lf3/d;->a()J

    move-result-wide v5

    sub-long/2addr v5, v3

    .line 29
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    .line 30
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    .line 31
    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->A:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v5, v14}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-lez v7, :cond_3

    .line 32
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v4, "Fetching config for blocked app"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/b9;->h(Lcom/google/android/gms/measurement/internal/r4;)V

    :cond_3
    return-void

    .line 34
    :cond_4
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/j3;->b(Lcom/google/android/gms/measurement/internal/zzat;)Lcom/google/android/gms/measurement/internal/j3;

    move-result-object v2

    .line 35
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v11

    .line 36
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v12

    invoke-virtual {v12, v10}, Lcom/google/android/gms/measurement/internal/f;->n(Ljava/lang/String;)I

    move-result v12

    .line 37
    invoke-virtual {v11, v2, v12}, Lcom/google/android/gms/measurement/internal/h9;->z(Lcom/google/android/gms/measurement/internal/j3;I)V

    .line 38
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j3;->a()Lcom/google/android/gms/measurement/internal/zzat;

    move-result-object v2

    .line 39
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/i3;->C()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x2

    .line 40
    invoke-static {v11, v13}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 41
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v11

    .line 42
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 43
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v12

    .line 44
    invoke-virtual {v12, v2}, Lcom/google/android/gms/measurement/internal/d3;->c(Lcom/google/android/gms/measurement/internal/zzat;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "Logging event"

    invoke-virtual {v11, v13, v12}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 45
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 46
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/i;->g0()V

    .line 47
    :try_start_0
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    .line 48
    invoke-static {}, Lcom/google/android/gms/internal/measurement/mb;->b()Z

    .line 49
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v11

    sget-object v12, Lcom/google/android/gms/measurement/internal/x2;->x0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v11, v14, v12}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v11

    if-nez v11, :cond_6

    .line 50
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v11

    sget-object v12, Lcom/google/android/gms/measurement/internal/x2;->y0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v11, v14, v12}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v11

    if-eqz v11, :cond_6

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 51
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 52
    iget-object v12, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const-string v13, "_lair"

    .line 53
    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/measurement/internal/i;->n(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    const-string v11, "ecommerce_purchase"

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    .line 54
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v12, "refund"

    move-wide/from16 v28, v8

    if-nez v11, :cond_8

    :try_start_1
    const-string v9, "purchase"

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    .line 55
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    .line 56
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_1

    :cond_7
    const/4 v9, 0x0

    goto :goto_2

    :cond_8
    :goto_1
    const/4 v9, 0x1

    :goto_2
    const-string v11, "_iap"

    iget-object v13, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    .line 57
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    if-eqz v9, :cond_9

    const/4 v9, 0x1

    goto :goto_4

    :cond_9
    move-object/from16 v33, v4

    move-object v8, v15

    :goto_3
    const/4 v4, 0x2

    goto/16 :goto_d

    :cond_a
    :goto_4
    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzat;->o:Lcom/google/android/gms/measurement/internal/zzar;

    const-string v13, "currency"

    .line 58
    invoke-virtual {v11, v13}, Lcom/google/android/gms/measurement/internal/zzar;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v13, "value"

    if-eqz v9, :cond_d

    :try_start_2
    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzat;->o:Lcom/google/android/gms/measurement/internal/zzar;

    .line 59
    invoke-virtual {v9, v13}, Lcom/google/android/gms/measurement/internal/zzar;->A(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v17

    const-wide v19, 0x412e848000000000L    # 1000000.0

    mul-double v17, v17, v19

    const-wide/16 v21, 0x0

    cmpl-double v9, v17, v21

    if-nez v9, :cond_b

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzat;->o:Lcom/google/android/gms/measurement/internal/zzar;

    .line 60
    invoke-virtual {v9, v13}, Lcom/google/android/gms/measurement/internal/zzar;->B(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    move-object/from16 v21, v15

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    long-to-double v13, v14

    mul-double v17, v13, v19

    goto :goto_5

    :cond_b
    move-object/from16 v21, v15

    :goto_5
    const-wide/high16 v13, 0x43e0000000000000L    # 9.223372036854776E18

    cmpg-double v9, v17, v13

    if-gtz v9, :cond_c

    const-wide/high16 v13, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v9, v17, v13

    if-ltz v9, :cond_c

    .line 61
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    .line 62
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    neg-long v13, v13

    goto :goto_6

    .line 63
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 64
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Data lost. Currency value is too big. appId"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 65
    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    .line 66
    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 67
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 68
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 69
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 70
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :cond_d
    move-object/from16 v21, v15

    :try_start_3
    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzat;->o:Lcom/google/android/gms/measurement/internal/zzar;

    .line 71
    invoke-virtual {v9, v13}, Lcom/google/android/gms/measurement/internal/zzar;->B(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    .line 72
    :cond_e
    :goto_6
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_12

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 73
    invoke-virtual {v11, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "[A-Z]{3}"

    .line 74
    invoke-virtual {v9, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_12

    const-string v11, "_ltv_"

    .line 75
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v12

    if-eqz v12, :cond_f

    invoke-virtual {v11, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_7

    .line 76
    :cond_f
    new-instance v9, Ljava/lang/String;

    .line 77
    invoke-direct {v9, v11}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_7
    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 78
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 79
    invoke-virtual {v11, v10, v9}, Lcom/google/android/gms/measurement/internal/i;->Z(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v11

    if-eqz v11, :cond_11

    iget-object v11, v11, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    .line 80
    instance-of v12, v11, Ljava/lang/Long;

    if-nez v12, :cond_10

    goto :goto_8

    .line 81
    :cond_10
    check-cast v11, Ljava/lang/Long;

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    new-instance v18, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v15, v2, Lcom/google/android/gms/measurement/internal/zzat;->p:Ljava/lang/String;

    .line 82
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Lf3/d;->a()J

    move-result-wide v19

    add-long/2addr v11, v13

    .line 83
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move-object/from16 v11, v18

    move-object v12, v10

    const/4 v14, 0x0

    move-object v13, v15

    const/4 v8, 0x0

    const/4 v15, 0x0

    move-object v14, v9

    move-object/from16 v9, v21

    move-wide/from16 v15, v19

    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object/from16 v33, v4

    move-object v8, v9

    move-object/from16 v9, v18

    const/4 v4, 0x2

    goto/16 :goto_c

    :cond_11
    :goto_8
    move-object/from16 v15, v21

    const/4 v8, 0x0

    .line 84
    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 85
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 86
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v12

    sget-object v8, Lcom/google/android/gms/measurement/internal/x2;->F:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v12, v10, v8}, Lcom/google/android/gms/measurement/internal/f;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    .line 87
    invoke-static {v10}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 89
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/s8;->i()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 90
    :try_start_4
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v12
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v21, v15

    const/4 v15, 0x3

    :try_start_5
    new-array v15, v15, [Ljava/lang/String;

    const/16 v16, 0x0

    aput-object v10, v15, v16

    const/16 v16, 0x1

    aput-object v10, v15, v16

    .line 91
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v33, v4

    const/4 v4, 0x2

    :try_start_6
    aput-object v8, v15, v4

    const-string v8, "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'_ltv_%\' order by set_timestamp desc limit ?,10);"

    .line 92
    invoke-virtual {v12, v8, v15}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_b

    :catch_0
    move-exception v0

    goto :goto_a

    :catch_1
    move-exception v0

    move-object/from16 v33, v4

    goto :goto_9

    :catch_2
    move-exception v0

    move-object/from16 v33, v4

    move-object/from16 v21, v15

    :goto_9
    const/4 v4, 0x2

    :goto_a
    move-object v8, v0

    .line 93
    :try_start_7
    iget-object v11, v11, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 94
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v11

    .line 95
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v11

    const-string v12, "Error pruning currencies. appId"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v11, v12, v15, v8}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    :goto_b
    new-instance v18, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzat;->p:Ljava/lang/String;

    .line 97
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v11

    invoke-interface {v11}, Lf3/d;->a()J

    move-result-wide v15

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move-object/from16 v11, v18

    move-object v12, v10

    move-object v13, v8

    move-object v14, v9

    move-object/from16 v8, v21

    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object/from16 v9, v18

    :goto_c
    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 98
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 99
    invoke-virtual {v11, v9}, Lcom/google/android/gms/measurement/internal/i;->z(Lcom/google/android/gms/measurement/internal/f9;)Z

    move-result v11

    if-nez v11, :cond_13

    .line 100
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v11

    .line 101
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v11

    const-string v12, "Too many unique user properties are set. Ignoring user property. appId"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 102
    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v14

    iget-object v15, v9, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    .line 103
    invoke-virtual {v14, v15}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    .line 104
    invoke-virtual {v11, v12, v13, v14, v9}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/b9;->B:Lcom/google/android/gms/measurement/internal/g9;

    const/16 v14, 0x9

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v13, v10

    .line 106
    invoke-virtual/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/h9;->A(Lcom/google/android/gms/measurement/internal/g9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_d

    :cond_12
    move-object/from16 v33, v4

    move-object/from16 v8, v21

    goto/16 :goto_3

    :cond_13
    :goto_d
    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    .line 107
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/h9;->W(Ljava/lang/String;)Z

    move-result v9

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    .line 108
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    .line 109
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzat;->o:Lcom/google/android/gms/measurement/internal/zzar;

    if-nez v11, :cond_14

    const-wide/16 v16, 0x0

    goto :goto_f

    .line 110
    :cond_14
    new-instance v12, Lcom/google/android/gms/measurement/internal/p;

    .line 111
    invoke-direct {v12, v11}, Lcom/google/android/gms/measurement/internal/p;-><init>(Lcom/google/android/gms/measurement/internal/zzar;)V

    const-wide/16 v16, 0x0

    .line 112
    :cond_15
    :goto_e
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_16

    .line 113
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/p;->a()Ljava/lang/String;

    move-result-object v13

    .line 114
    invoke-virtual {v11, v13}, Lcom/google/android/gms/measurement/internal/zzar;->C(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    .line 115
    instance-of v14, v13, [Landroid/os/Parcelable;

    if-eqz v14, :cond_15

    .line 116
    check-cast v13, [Landroid/os/Parcelable;

    array-length v13, v13

    int-to-long v13, v13

    add-long v16, v16, v13

    goto :goto_e

    :cond_16
    :goto_f
    const-wide/16 v22, 0x1

    add-long v15, v16, v22

    .line 117
    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 118
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 119
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->F()J

    move-result-wide v12

    const/16 v17, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v30, v5

    const-wide/16 v4, 0x0

    move-object v14, v10

    move/from16 v18, v9

    move/from16 v19, v20

    move/from16 v20, v8

    .line 120
    invoke-virtual/range {v11 .. v21}, Lcom/google/android/gms/measurement/internal/i;->W(JLjava/lang/String;JZZZZZ)Lcom/google/android/gms/measurement/internal/g;

    move-result-object v11

    iget-wide v12, v11, Lcom/google/android/gms/measurement/internal/g;->b:J

    .line 121
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    sget-object v14, Lcom/google/android/gms/measurement/internal/x2;->l:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v15, 0x0

    .line 122
    invoke-virtual {v14, v15}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    int-to-long v4, v14

    sub-long/2addr v12, v4

    const-wide/16 v4, 0x3e8

    const-wide/16 v16, 0x0

    cmp-long v14, v12, v16

    if-lez v14, :cond_18

    rem-long/2addr v12, v4

    cmp-long v2, v12, v22

    if-nez v2, :cond_17

    .line 123
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 124
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Data loss. Too many events logged. appId, count"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v11, Lcom/google/android/gms/measurement/internal/g;->b:J

    .line 125
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 126
    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_17
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 127
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 128
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 129
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 130
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :cond_18
    if-eqz v9, :cond_1a

    :try_start_8
    iget-wide v12, v11, Lcom/google/android/gms/measurement/internal/g;->a:J

    .line 131
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    sget-object v14, Lcom/google/android/gms/measurement/internal/x2;->n:Lcom/google/android/gms/measurement/internal/w2;

    .line 132
    invoke-virtual {v14, v15}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    int-to-long v4, v14

    sub-long/2addr v12, v4

    const-wide/16 v4, 0x0

    cmp-long v14, v12, v4

    if-lez v14, :cond_1a

    const-wide/16 v4, 0x3e8

    rem-long/2addr v12, v4

    cmp-long v3, v12, v22

    if-nez v3, :cond_19

    .line 133
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 134
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v4, "Data loss. Too many public events logged. appId, count"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-wide v6, v11, Lcom/google/android/gms/measurement/internal/g;->a:J

    .line 135
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 136
    invoke-virtual {v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    :cond_19
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/b9;->B:Lcom/google/android/gms/measurement/internal/g9;

    const/16 v14, 0x10

    const-string v15, "_ev"

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    const/16 v17, 0x0

    move-object v13, v10

    move-object/from16 v16, v2

    .line 138
    invoke-virtual/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/h9;->A(Lcom/google/android/gms/measurement/internal/g9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 139
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 140
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 141
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 142
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :cond_1a
    const v4, 0xf4240

    if-eqz v8, :cond_1c

    :try_start_9
    iget-wide v12, v11, Lcom/google/android/gms/measurement/internal/g;->d:J

    .line 143
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v5

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    sget-object v14, Lcom/google/android/gms/measurement/internal/x2;->m:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v5, v8, v14}, Lcom/google/android/gms/measurement/internal/f;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)I

    move-result v5

    .line 144
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v8, 0x0

    .line 145
    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    int-to-long v4, v5

    sub-long/2addr v12, v4

    const-wide/16 v4, 0x0

    cmp-long v14, v12, v4

    if-lez v14, :cond_1c

    cmp-long v2, v12, v22

    if-nez v2, :cond_1b

    .line 146
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 147
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Too many error events logged. appId, count"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v11, Lcom/google/android/gms/measurement/internal/g;->d:J

    .line 148
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 149
    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1b
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 150
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 151
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 152
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 153
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :cond_1c
    :try_start_a
    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzat;->o:Lcom/google/android/gms/measurement/internal/zzar;

    .line 154
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzar;->z()Landroid/os/Bundle;

    move-result-object v4

    .line 155
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v5

    const-string v11, "_o"

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzat;->p:Ljava/lang/String;

    invoke-virtual {v5, v4, v11, v12}, Lcom/google/android/gms/measurement/internal/h9;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 156
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v5

    invoke-virtual {v5, v10}, Lcom/google/android/gms/measurement/internal/h9;->S(Ljava/lang/String;)Z

    move-result v5
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    const-string v14, "_r"

    if-eqz v5, :cond_1d

    .line 157
    :try_start_b
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v5

    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    const-string v12, "_dbg"

    invoke-virtual {v5, v4, v12, v11}, Lcom/google/android/gms/measurement/internal/h9;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 158
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v5

    invoke-virtual {v5, v4, v14, v11}, Lcom/google/android/gms/measurement/internal/h9;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1d
    const-string v5, "_s"

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    .line 159
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 160
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 161
    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    .line 162
    invoke-virtual {v5, v11, v7}, Lcom/google/android/gms/measurement/internal/i;->Z(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v5

    if-eqz v5, :cond_1e

    iget-object v11, v5, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    .line 163
    instance-of v11, v11, Ljava/lang/Long;

    if-eqz v11, :cond_1e

    .line 164
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v11

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    invoke-virtual {v11, v4, v7, v5}, Lcom/google/android/gms/measurement/internal/h9;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1e
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 165
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 166
    invoke-static {v10}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 168
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/s8;->i()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 169
    :try_start_c
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v7

    iget-object v11, v5, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 170
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v11

    sget-object v12, Lcom/google/android/gms/measurement/internal/x2;->q:Lcom/google/android/gms/measurement/internal/w2;

    .line 171
    invoke-virtual {v11, v10, v12}, Lcom/google/android/gms/measurement/internal/f;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)I

    move-result v11

    const v8, 0xf4240

    .line 172
    invoke-static {v8, v11}, Ljava/lang/Math;->min(II)I

    move-result v8
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    const/4 v13, 0x0

    .line 173
    :try_start_d
    invoke-static {v13, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 174
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x2

    new-array v11, v11, [Ljava/lang/String;

    aput-object v10, v11, v13

    const/4 v12, 0x1

    aput-object v8, v11, v12

    const-string v8, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"

    .line 175
    invoke-virtual {v7, v6, v8, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    int-to-long v7, v5

    goto :goto_11

    :catch_3
    move-exception v0

    goto :goto_10

    :catch_4
    move-exception v0

    const/4 v13, 0x0

    :goto_10
    move-object v7, v0

    .line 176
    :try_start_e
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 177
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v5

    .line 178
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v5

    const-string v8, "Error deleting over the limit events. appId"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    .line 179
    invoke-virtual {v5, v8, v11, v7}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v7, 0x0

    :goto_11
    const-wide/16 v11, 0x0

    cmp-long v5, v7, v11

    if-lez v5, :cond_1f

    .line 180
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v5

    .line 181
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v5

    const-string v11, "Data lost. Too many events stored on disk, deleted. appId"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    .line 182
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    .line 183
    invoke-virtual {v5, v11, v12, v7}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1f
    new-instance v5, Lcom/google/android/gms/measurement/internal/n;

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    iget-object v7, v2, Lcom/google/android/gms/measurement/internal/zzat;->p:Ljava/lang/String;

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    iget-wide v2, v2, Lcom/google/android/gms/measurement/internal/zzat;->q:J

    const-wide/16 v18, 0x0

    move-object v11, v5

    const/16 v31, 0x0

    move-object v13, v7

    move-object v7, v14

    move-object v14, v10

    move-object/from16 v32, v6

    move-object v6, v15

    move-object v15, v8

    move-wide/from16 v16, v2

    move-object/from16 v20, v4

    .line 184
    invoke-direct/range {v11 .. v20}, Lcom/google/android/gms/measurement/internal/n;-><init>(Lcom/google/android/gms/measurement/internal/m4;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 185
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/n;->b:Ljava/lang/String;

    .line 186
    invoke-virtual {v2, v10, v3}, Lcom/google/android/gms/measurement/internal/i;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v2

    if-nez v2, :cond_21

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 187
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 188
    invoke-virtual {v2, v10}, Lcom/google/android/gms/measurement/internal/i;->Q(Ljava/lang/String;)J

    move-result-wide v2

    .line 189
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/measurement/internal/f;->l(Ljava/lang/String;)I

    move-result v4

    int-to-long v11, v4

    cmp-long v4, v2, v11

    if-ltz v4, :cond_20

    if-eqz v9, :cond_20

    .line 190
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 191
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Too many event names used, ignoring event. appId, name, supported count"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 192
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v6

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/n;->b:Ljava/lang/String;

    .line 193
    invoke-virtual {v6, v5}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 194
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v6

    invoke-virtual {v6, v10}, Lcom/google/android/gms/measurement/internal/f;->l(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 195
    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 196
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/b9;->B:Lcom/google/android/gms/measurement/internal/g9;

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v13, v10

    .line 197
    invoke-virtual/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/h9;->A(Lcom/google/android/gms/measurement/internal/g9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 198
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 199
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :cond_20
    :try_start_f
    new-instance v2, Lcom/google/android/gms/measurement/internal/o;

    iget-object v13, v5, Lcom/google/android/gms/measurement/internal/n;->b:Ljava/lang/String;

    iget-wide v3, v5, Lcom/google/android/gms/measurement/internal/n;->d:J

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object v11, v2

    move-object v12, v10

    move-wide/from16 v20, v3

    .line 200
    invoke-direct/range {v11 .. v27}, Lcom/google/android/gms/measurement/internal/o;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_12

    .line 201
    :cond_21
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    iget-wide v8, v2, Lcom/google/android/gms/measurement/internal/o;->f:J

    .line 202
    invoke-virtual {v5, v3, v8, v9}, Lcom/google/android/gms/measurement/internal/n;->a(Lcom/google/android/gms/measurement/internal/m4;J)Lcom/google/android/gms/measurement/internal/n;

    move-result-object v5

    iget-wide v3, v5, Lcom/google/android/gms/measurement/internal/n;->d:J

    .line 203
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/o;->c(J)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v2

    .line 204
    :goto_12
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 205
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 206
    invoke-virtual {v3, v2}, Lcom/google/android/gms/measurement/internal/i;->r(Lcom/google/android/gms/measurement/internal/o;)V

    .line 207
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 208
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    .line 209
    invoke-static {v5}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    invoke-static/range {p2 .. p2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v5, Lcom/google/android/gms/measurement/internal/n;->a:Ljava/lang/String;

    .line 211
    invoke-static {v2}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v2, v5, Lcom/google/android/gms/measurement/internal/n;->a:Ljava/lang/String;

    move-object/from16 v3, p2

    .line 212
    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Lz2/j;->a(Z)V

    .line 213
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n4;->J1()Lcom/google/android/gms/internal/measurement/m4;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/m4;->c0(I)Lcom/google/android/gms/internal/measurement/m4;

    const-string v8, "android"

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->V(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 214
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_22

    .line 215
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->v(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 216
    :cond_22
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->q:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_23

    .line 217
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->q:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->x(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 218
    :cond_23
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->p:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_24

    .line 219
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->p:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->y(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 220
    :cond_24
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->w:J

    const-wide/32 v10, -0x80000000

    cmp-long v12, v8, v10

    if-eqz v12, :cond_25

    long-to-int v9, v8

    .line 221
    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/m4;->A(I)Lcom/google/android/gms/internal/measurement/m4;

    .line 222
    :cond_25
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->r:J

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/m4;->P(J)Lcom/google/android/gms/internal/measurement/m4;

    .line 223
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->o:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_26

    .line 224
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->o:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->N(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 225
    :cond_26
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    .line 226
    invoke-static {v8}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1, v8}, Lcom/google/android/gms/measurement/internal/b9;->U(Ljava/lang/String;)Lb4/a;

    move-result-object v8

    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/zzp;->I:Ljava/lang/String;

    .line 227
    invoke-static {v9}, Lb4/a;->b(Ljava/lang/String;)Lb4/a;

    move-result-object v9

    invoke-virtual {v8, v9}, Lb4/a;->c(Lb4/a;)Lb4/a;

    move-result-object v8

    .line 228
    invoke-virtual {v8}, Lb4/a;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 229
    invoke-static {}, Lcom/google/android/gms/internal/measurement/hd;->b()Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v8

    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    sget-object v10, Lcom/google/android/gms/measurement/internal/x2;->e0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v8

    if-eqz v8, :cond_28

    .line 230
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m4;->p0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_27

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->H:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_27

    .line 231
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->H:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->M(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 232
    :cond_27
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m4;->p0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_29

    .line 233
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m4;->o0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_29

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->D:Ljava/lang/String;

    .line 234
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_29

    .line 235
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->D:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->P0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    goto :goto_13

    .line 236
    :cond_28
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m4;->p0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_29

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->D:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_29

    .line 237
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->D:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->P0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 238
    :cond_29
    :goto_13
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->s:J

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-eqz v12, :cond_2a

    .line 239
    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/m4;->F(J)Lcom/google/android/gms/internal/measurement/m4;

    .line 240
    :cond_2a
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->F:J

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/m4;->I(J)Lcom/google/android/gms/internal/measurement/m4;

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 241
    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/r8;->b:Lcom/google/android/gms/measurement/internal/b9;

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 242
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->c()Landroid/content/Context;

    move-result-object v9

    .line 243
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/x2;->c(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v9

    if-eqz v9, :cond_2e

    .line 244
    invoke-interface {v9}, Ljava/util/Map;->size()I

    move-result v10

    if-nez v10, :cond_2b

    goto/16 :goto_16

    .line 245
    :cond_2b
    new-instance v14, Ljava/util/ArrayList;

    .line 246
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    sget-object v10, Lcom/google/android/gms/measurement/internal/x2;->Q:Lcom/google/android/gms/measurement/internal/w2;

    .line 247
    invoke-virtual {v10, v6}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 248
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2c
    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    .line 249
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    const-string v13, "measurement.id."

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    if-eqz v12, :cond_2c

    .line 250
    :try_start_10
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    if-eqz v11, :cond_2c

    .line 251
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v14, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v11

    if-lt v11, v10, :cond_2c

    iget-object v11, v8, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 253
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v11

    .line 254
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v11

    const-string v12, "Too many experiment IDs. Number of IDs"

    .line 255
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/lang/NumberFormatException; {:try_start_10 .. :try_end_10} :catch_5
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    goto :goto_15

    :catch_5
    move-exception v0

    move-object v11, v0

    .line 256
    :try_start_11
    iget-object v12, v8, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 257
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v12

    .line 258
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v12

    const-string v13, "Experiment ID NumberFormatException"

    invoke-virtual {v12, v13, v11}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_14

    .line 259
    :cond_2d
    :goto_15
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v8

    if-nez v8, :cond_2f

    :cond_2e
    :goto_16
    move-object v14, v6

    :cond_2f
    if-eqz v14, :cond_30

    .line 260
    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/measurement/m4;->y0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/m4;

    .line 261
    :cond_30
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    .line 262
    invoke-static {v8}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1, v8}, Lcom/google/android/gms/measurement/internal/b9;->U(Ljava/lang/String;)Lb4/a;

    move-result-object v8

    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/zzp;->I:Ljava/lang/String;

    .line 263
    invoke-static {v9}, Lb4/a;->b(Ljava/lang/String;)Lb4/a;

    move-result-object v9

    invoke-virtual {v8, v9}, Lb4/a;->c(Lb4/a;)Lb4/a;

    move-result-object v8

    .line 264
    invoke-virtual {v8}, Lb4/a;->j()Z

    move-result v9

    if-eqz v9, :cond_31

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 265
    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    .line 266
    invoke-virtual {v9, v10, v8}, Lcom/google/android/gms/measurement/internal/z7;->n(Ljava/lang/String;Lb4/a;)Landroid/util/Pair;

    move-result-object v9

    .line 267
    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_31

    .line 268
    iget-boolean v10, v3, Lcom/google/android/gms/measurement/internal/zzp;->B:Z

    if-eqz v10, :cond_31

    .line 269
    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/measurement/m4;->d0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 270
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v9, :cond_31

    .line 271
    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/m4;->S(Z)Lcom/google/android/gms/internal/measurement/m4;

    :cond_31
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 272
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->A()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v9

    .line 273
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/h5;->k()V

    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/m4;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 274
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->A()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v9

    .line 275
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/h5;->k()V

    sget-object v9, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/m4;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 276
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->A()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v9

    .line 277
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m;->p()J

    move-result-wide v9

    long-to-int v10, v9

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/measurement/m4;->h0(I)Lcom/google/android/gms/internal/measurement/m4;

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 278
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->A()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v9

    .line 279
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m;->q()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/m4;->l0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 280
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v9

    sget-object v10, Lcom/google/android/gms/measurement/internal/x2;->o0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v9, v6, v10}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v9

    if-nez v9, :cond_32

    .line 281
    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->y:J

    invoke-virtual {v2, v11, v12}, Lcom/google/android/gms/internal/measurement/m4;->Q0(J)Lcom/google/android/gms/internal/measurement/m4;

    :cond_32
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 282
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->o()Z

    move-result v9

    if-eqz v9, :cond_33

    .line 283
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m4;->n0()Ljava/lang/String;

    .line 284
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_33

    .line 285
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/measurement/m4;->H(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    :cond_33
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 286
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 287
    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v9, v11}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v9

    if-nez v9, :cond_36

    new-instance v9, Lcom/google/android/gms/measurement/internal/r4;

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 288
    iget-object v12, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-direct {v9, v11, v12}, Lcom/google/android/gms/measurement/internal/r4;-><init>(Lcom/google/android/gms/measurement/internal/m4;Ljava/lang/String;)V

    .line 289
    invoke-virtual {v1, v8}, Lcom/google/android/gms/measurement/internal/b9;->h0(Lb4/a;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Lcom/google/android/gms/measurement/internal/r4;->i(Ljava/lang/String;)V

    .line 290
    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->x:Ljava/lang/String;

    invoke-virtual {v9, v11}, Lcom/google/android/gms/measurement/internal/r4;->w(Ljava/lang/String;)V

    .line 291
    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->o:Ljava/lang/String;

    invoke-virtual {v9, v11}, Lcom/google/android/gms/measurement/internal/r4;->y(Ljava/lang/String;)V

    .line 292
    invoke-virtual {v8}, Lb4/a;->j()Z

    move-result v11

    if-eqz v11, :cond_34

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 293
    iget-object v12, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v11, v12}, Lcom/google/android/gms/measurement/internal/z7;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 294
    invoke-virtual {v9, v11}, Lcom/google/android/gms/measurement/internal/r4;->H(Ljava/lang/String;)V

    :cond_34
    const-wide/16 v11, 0x0

    .line 295
    invoke-virtual {v9, v11, v12}, Lcom/google/android/gms/measurement/internal/r4;->D(J)V

    .line 296
    invoke-virtual {v9, v11, v12}, Lcom/google/android/gms/measurement/internal/r4;->E(J)V

    .line 297
    invoke-virtual {v9, v11, v12}, Lcom/google/android/gms/measurement/internal/r4;->C(J)V

    .line 298
    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->p:Ljava/lang/String;

    invoke-virtual {v9, v11}, Lcom/google/android/gms/measurement/internal/r4;->k(Ljava/lang/String;)V

    .line 299
    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->w:J

    invoke-virtual {v9, v11, v12}, Lcom/google/android/gms/measurement/internal/r4;->l(J)V

    .line 300
    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->q:Ljava/lang/String;

    invoke-virtual {v9, v11}, Lcom/google/android/gms/measurement/internal/r4;->j(Ljava/lang/String;)V

    .line 301
    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->r:J

    invoke-virtual {v9, v11, v12}, Lcom/google/android/gms/measurement/internal/r4;->z(J)V

    .line 302
    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->s:J

    invoke-virtual {v9, v11, v12}, Lcom/google/android/gms/measurement/internal/r4;->t(J)V

    .line 303
    iget-boolean v11, v3, Lcom/google/android/gms/measurement/internal/zzp;->u:Z

    invoke-virtual {v9, v11}, Lcom/google/android/gms/measurement/internal/r4;->F(Z)V

    .line 304
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v11

    invoke-virtual {v11, v6, v10}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v10

    if-nez v10, :cond_35

    .line 305
    iget-wide v10, v3, Lcom/google/android/gms/measurement/internal/zzp;->y:J

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/measurement/internal/r4;->h(J)V

    .line 306
    :cond_35
    iget-wide v10, v3, Lcom/google/android/gms/measurement/internal/zzp;->F:J

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/measurement/internal/r4;->u(J)V

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 307
    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 308
    invoke-virtual {v10, v9}, Lcom/google/android/gms/measurement/internal/i;->q(Lcom/google/android/gms/measurement/internal/r4;)V

    .line 309
    :cond_36
    invoke-virtual {v8}, Lb4/a;->k()Z

    move-result v8

    if-eqz v8, :cond_37

    .line 310
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/r4;->f0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_37

    .line 311
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/r4;->f0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->w(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    .line 312
    :cond_37
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/r4;->i0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_38

    .line 313
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/r4;->i0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/m4;

    :cond_38
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 314
    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 315
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v8, v3}, Lcom/google/android/gms/measurement/internal/i;->e0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    const/4 v13, 0x0

    .line 316
    :goto_17
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    if-ge v13, v8, :cond_39

    .line 317
    invoke-static {}, Lcom/google/android/gms/internal/measurement/x4;->z()Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v8

    .line 318
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/w4;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    .line 319
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/measurement/internal/f9;

    iget-wide v9, v9, Lcom/google/android/gms/measurement/internal/f9;->d:J

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/w4;->C(J)Lcom/google/android/gms/internal/measurement/w4;

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 320
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 321
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v10, v10, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    invoke-virtual {v9, v8, v10}, Lcom/google/android/gms/measurement/internal/d9;->M(Lcom/google/android/gms/internal/measurement/w4;Ljava/lang/Object;)V

    .line 322
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/m4;->B0(Lcom/google/android/gms/internal/measurement/w4;)Lcom/google/android/gms/internal/measurement/m4;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    add-int/lit8 v13, v13, 0x1

    goto :goto_17

    :cond_39
    :try_start_12
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 323
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 324
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/n4;

    .line 325
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 326
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    .line 327
    invoke-static {v8}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/z6;->i()[B

    move-result-object v9

    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/r8;->b:Lcom/google/android/gms/measurement/internal/b9;

    iget-object v10, v10, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 330
    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 331
    invoke-virtual {v10, v9}, Lcom/google/android/gms/measurement/internal/d9;->y([B)J

    move-result-wide v10

    new-instance v12, Landroid/content/ContentValues;

    .line 332
    invoke-direct {v12}, Landroid/content/ContentValues;-><init>()V

    .line 333
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v14, v30

    invoke-virtual {v12, v14, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    move-object/from16 v15, v33

    invoke-virtual {v12, v15, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v13, "metadata"

    .line 335
    invoke-virtual {v12, v13, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_8
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 336
    :try_start_13
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v9

    const-string v13, "raw_events_metadata"

    const/4 v4, 0x4

    .line 337
    invoke-virtual {v9, v13, v6, v12, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_7
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_8
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    :try_start_14
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 338
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/n;->f:Lcom/google/android/gms/measurement/internal/zzar;

    new-instance v4, Lcom/google/android/gms/measurement/internal/p;

    .line 339
    invoke-direct {v4, v3}, Lcom/google/android/gms/measurement/internal/p;-><init>(Lcom/google/android/gms/measurement/internal/zzar;)V

    .line 340
    :cond_3a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3b

    .line 341
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/p;->a()Ljava/lang/String;

    move-result-object v3

    .line 342
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3a

    :goto_18
    const/4 v13, 0x1

    goto :goto_19

    .line 343
    :cond_3b
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 344
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v4, v5, Lcom/google/android/gms/measurement/internal/n;->a:Ljava/lang/String;

    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/n;->b:Ljava/lang/String;

    .line 345
    invoke-virtual {v3, v4, v7}, Lcom/google/android/gms/measurement/internal/g4;->w(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 346
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 347
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->F()J

    move-result-wide v17

    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/n;->a:Ljava/lang/String;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v16, v4

    move-object/from16 v19, v7

    invoke-virtual/range {v16 .. v24}, Lcom/google/android/gms/measurement/internal/i;->V(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/measurement/internal/g;

    move-result-object v4

    if-eqz v3, :cond_3c

    iget-wide v3, v4, Lcom/google/android/gms/measurement/internal/g;->e:J

    .line 348
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v7

    iget-object v8, v5, Lcom/google/android/gms/measurement/internal/n;->a:Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/measurement/internal/x2;->p:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/measurement/internal/f;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)I

    move-result v7

    int-to-long v7, v7

    cmp-long v9, v3, v7

    if-gez v9, :cond_3c

    goto :goto_18

    :cond_3c
    const/4 v13, 0x0

    .line 349
    :goto_19
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 350
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    .line 351
    invoke-static {v5}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/n;->a:Ljava/lang/String;

    .line 352
    invoke-static {v3}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/r8;->b:Lcom/google/android/gms/measurement/internal/b9;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 353
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 354
    invoke-virtual {v3, v5}, Lcom/google/android/gms/measurement/internal/d9;->C(Lcom/google/android/gms/measurement/internal/n;)Lcom/google/android/gms/internal/measurement/d4;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/z6;->i()[B

    move-result-object v3

    new-instance v4, Landroid/content/ContentValues;

    .line 355
    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/n;->a:Ljava/lang/String;

    .line 356
    invoke-virtual {v4, v14, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "name"

    iget-object v8, v5, Lcom/google/android/gms/measurement/internal/n;->b:Ljava/lang/String;

    .line 357
    invoke-virtual {v4, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "timestamp"

    iget-wide v8, v5, Lcom/google/android/gms/measurement/internal/n;->d:J

    .line 358
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 359
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v4, v15, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v7, "data"

    .line 360
    invoke-virtual {v4, v7, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v3, "realtime"

    .line 361
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v3, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 362
    :try_start_15
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    move-object/from16 v7, v32

    .line 363
    invoke-virtual {v3, v7, v6, v4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v3

    const-wide/16 v6, -0x1

    cmp-long v8, v3, v6

    if-nez v8, :cond_3d

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 364
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 365
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v4, "Failed to insert raw event (got -1). appId"

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/n;->a:Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 366
    invoke-virtual {v3, v4, v6}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_6
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    goto :goto_1a

    :cond_3d
    const-wide/16 v3, 0x0

    .line 367
    :try_start_16
    iput-wide v3, v1, Lcom/google/android/gms/measurement/internal/b9;->o:J

    goto :goto_1a

    :catch_6
    move-exception v0

    move-object v3, v0

    .line 368
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 369
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 370
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v4, "Error storing raw event. appId"

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/n;->a:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 371
    invoke-virtual {v2, v4, v5, v3}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    goto :goto_1a

    :catch_7
    move-exception v0

    move-object v4, v0

    .line 372
    :try_start_17
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 373
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 374
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v5, "Error storing raw event metadata. appId"

    .line 375
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n4;->N1()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 376
    invoke-virtual {v3, v5, v6, v4}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 377
    throw v4
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_8
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    :catch_8
    move-exception v0

    move-object v3, v0

    .line 378
    :try_start_18
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v4

    .line 379
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v4

    const-string v5, "Data loss. Failed to insert raw event metadata. appId"

    .line 380
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/m4;->n0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 381
    invoke-virtual {v4, v5, v2, v3}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 382
    :goto_1a
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 383
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 384
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 385
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 386
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 387
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->L()V

    .line 388
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 389
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    .line 390
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long v3, v3, v28

    const-wide/32 v5, 0x7a120

    add-long/2addr v3, v5

    const-wide/32 v5, 0xf4240

    div-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "Background event processing time, ms"

    .line 391
    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 392
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 393
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 394
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 395
    throw v2

    .line 396
    :cond_3e
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    return-void
.end method

.method final C()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->v:Ljava/nio/channels/FileLock;

    const/4 v1, 0x1

    const-string v2, "Storage concurrent access okay"

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    return v1

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->c()Landroid/content/Context;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    new-instance v3, Ljava/io/File;

    const-string v4, "google_app_measurement.db"

    .line 8
    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v4, "rw"

    .line 9
    invoke-direct {v0, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->w:Ljava/nio/channels/FileChannel;

    .line 10
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->v:Ljava/nio/channels/FileLock;

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    return v1

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v1, "Storage concurrent data access panic"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v2, "Storage lock already acquired"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception v0

    .line 14
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v2, "Failed to access storage lock file"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :catch_2
    move-exception v0

    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v2, "Failed to acquire storage lock"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method final F()J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v0

    invoke-interface {v0}, Lf3/d;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/z7;->k:Lcom/google/android/gms/measurement/internal/s3;

    .line 2
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/s3;->a()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 3
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->N()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v3

    .line 4
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/h9;->t()Ljava/security/SecureRandom;

    move-result-object v3

    const v4, 0x5265c00

    invoke-virtual {v3, v4}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v3

    int-to-long v3, v3

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/z7;->k:Lcom/google/android/gms/measurement/internal/s3;

    .line 5
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/s3;->b(J)V

    :cond_0
    add-long/2addr v0, v3

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    div-long/2addr v0, v2

    const-wide/16 v2, 0x18

    div-long/2addr v0, v2

    return-wide v0
.end method

.method final R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    .line 3
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v0}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 6
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v0

    .line 7
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    .line 8
    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/b9;->U(Ljava/lang/String;)Lb4/a;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzp;->I:Ljava/lang/String;

    .line 9
    invoke-static {v2}, Lb4/a;->b(Ljava/lang/String;)Lb4/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb4/a;->c(Lb4/a;)Lb4/a;

    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lb4/a;->j()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 11
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/z7;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    const/4 v3, 0x0

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/measurement/internal/r4;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 12
    iget-object v5, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-direct {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/r4;-><init>(Lcom/google/android/gms/measurement/internal/m4;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v1}, Lb4/a;->k()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 14
    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/b9;->h0(Lb4/a;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/measurement/internal/r4;->i(Ljava/lang/String;)V

    .line 15
    :cond_1
    invoke-virtual {v1}, Lb4/a;->j()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 16
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/r4;->H(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 17
    :cond_2
    invoke-virtual {v1}, Lb4/a;->j()Z

    move-result v4

    if-eqz v4, :cond_5

    if-eqz v2, :cond_5

    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/r4;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 19
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/r4;->H(Ljava/lang/String;)V

    .line 20
    invoke-static {}, Lcom/google/android/gms/internal/measurement/mb;->b()Z

    .line 21
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v2

    sget-object v4, Lcom/google/android/gms/measurement/internal/x2;->x0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v2

    const-string v5, "00000000-0000-0000-0000-000000000000"

    if-eqz v2, :cond_3

    .line 22
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v2

    sget-object v6, Lcom/google/android/gms/measurement/internal/x2;->B0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 23
    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    .line 24
    invoke-virtual {v2, v6, v1}, Lcom/google/android/gms/measurement/internal/z7;->n(Ljava/lang/String;Lb4/a;)Landroid/util/Pair;

    move-result-object v2

    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 25
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 26
    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/b9;->h0(Lb4/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/r4;->i(Ljava/lang/String;)V

    goto :goto_1

    .line 27
    :cond_3
    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/b9;->h0(Lb4/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/r4;->i(Ljava/lang/String;)V

    .line 28
    :cond_4
    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/mb;->b()Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 29
    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    .line 30
    invoke-virtual {v2, v4, v1}, Lcom/google/android/gms/measurement/internal/z7;->n(Ljava/lang/String;Lb4/a;)Landroid/util/Pair;

    move-result-object v1

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 31
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 32
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 33
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const-string v4, "_id"

    .line 34
    invoke-virtual {v1, v2, v4}, Lcom/google/android/gms/measurement/internal/i;->Z(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 35
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 36
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const-string v4, "_lair"

    .line 37
    invoke-virtual {v1, v2, v4}, Lcom/google/android/gms/measurement/internal/i;->Z(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v1

    if-nez v1, :cond_6

    .line 38
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v1

    invoke-interface {v1}, Lf3/d;->a()J

    move-result-wide v8

    new-instance v1, Lcom/google/android/gms/measurement/internal/f9;

    .line 39
    iget-object v5, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const-wide/16 v6, 0x1

    .line 40
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const-string v6, "auto"

    const-string v7, "_lair"

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 41
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 42
    invoke-virtual {v2, v1}, Lcom/google/android/gms/measurement/internal/i;->z(Lcom/google/android/gms/measurement/internal/f9;)Z

    goto :goto_2

    .line 43
    :cond_5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/r4;->f0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 44
    invoke-virtual {v1}, Lb4/a;->k()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 45
    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/b9;->h0(Lb4/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->i(Ljava/lang/String;)V

    .line 46
    :cond_6
    :goto_2
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->y(Ljava/lang/String;)V

    .line 47
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->f(Ljava/lang/String;)V

    .line 48
    invoke-static {}, Lcom/google/android/gms/internal/measurement/hd;->b()Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lcom/google/android/gms/measurement/internal/x2;->e0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v1, v2, v4}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 49
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->x(Ljava/lang/String;)V

    .line 50
    :cond_7
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->x:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 51
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->w(Ljava/lang/String;)V

    .line 52
    :cond_8
    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->r:J

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-eqz v6, :cond_9

    .line 53
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/r4;->z(J)V

    .line 54
    :cond_9
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->p:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 55
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->k(Ljava/lang/String;)V

    .line 56
    :cond_a
    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->w:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/r4;->l(J)V

    .line 57
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->q:Ljava/lang/String;

    if-eqz v1, :cond_b

    .line 58
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->j(Ljava/lang/String;)V

    .line 59
    :cond_b
    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->s:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/r4;->t(J)V

    .line 60
    iget-boolean v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->u:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->F(Z)V

    .line 61
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->t:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 62
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->B(Ljava/lang/String;)V

    .line 63
    :cond_c
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/measurement/internal/x2;->o0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v1

    if-nez v1, :cond_d

    .line 64
    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->y:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/r4;->h(J)V

    .line 65
    :cond_d
    iget-boolean v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->B:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->g(Z)V

    .line 66
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->E:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->G(Ljava/lang/Boolean;)V

    .line 67
    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzp;->F:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/r4;->u(J)V

    .line 68
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/r4;->L()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 69
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 70
    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/i;->q(Lcom/google/android/gms/measurement/internal/r4;)V

    :cond_e
    return-object v0
.end method

.method public final S()Lcom/google/android/gms/measurement/internal/t9;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->f:Lcom/google/android/gms/measurement/internal/t9;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    return-object v0
.end method

.method public final T()Lcom/google/android/gms/measurement/internal/f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/m4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    return-object v0
.end method

.method final U(Ljava/lang/String;)Lb4/a;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->A:Ljava/util/Map;

    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb4/a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 4
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 5
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v4, "select consent_state from consent_settings where app_id=? limit 1;"

    const/4 v5, 0x0

    .line 9
    :try_start_0
    invoke-virtual {v3, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 10
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 11
    invoke-interface {v5, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_0
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    const-string v0, "G1"

    .line 13
    :goto_0
    invoke-static {v0}, Lb4/a;->b(Ljava/lang/String;)Lb4/a;

    move-result-object v0

    .line 14
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/b9;->y(Ljava/lang/String;Lb4/a;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 15
    :try_start_1
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v1, "Database error"

    invoke-virtual {v0, v1, v4, p1}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    if-eqz v5, :cond_1

    .line 19
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 20
    :cond_1
    throw p1

    :cond_2
    :goto_2
    return-object v0
.end method

.method public final V()Lcom/google/android/gms/measurement/internal/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    return-object v0
.end method

.method public final W()Lcom/google/android/gms/measurement/internal/d3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    return-object v0
.end method

.method public final X()Lcom/google/android/gms/measurement/internal/n3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->b:Lcom/google/android/gms/measurement/internal/n3;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    return-object v0
.end method

.method public final Y()Lcom/google/android/gms/measurement/internal/p3;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->d:Lcom/google/android/gms/measurement/internal/p3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Network broadcast receiver not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final Z()Lcom/google/android/gms/measurement/internal/g4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    return-object v0
.end method

.method final a()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/b9;->n:Z

    if-nez v0, :cond_8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/b9;->n:Z

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->C()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->w:Ljava/nio/channels/FileChannel;

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    const-wide/16 v2, 0x0

    const-string v4, "Bad channel to read from"

    const/4 v5, 0x4

    const/4 v6, 0x0

    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 7
    :try_start_0
    invoke-virtual {v1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 8
    invoke-virtual {v1, v7}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v1

    if-eq v1, v5, :cond_1

    const/4 v7, -0x1

    if-eq v1, v7, :cond_3

    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v7

    const-string v8, "Unexpected data length. Bytes read"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v8, v1}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 11
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 12
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v7

    const-string v8, "Failed to read from channel"

    invoke-virtual {v7, v8, v1}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 13
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m4;->B()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a3;->p()I

    move-result v1

    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    if-le v6, v1, :cond_4

    .line 16
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    .line 18
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Panic: can\'t downgrade version. Previous, current version"

    .line 20
    invoke-virtual {v0, v3, v2, v1}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    if-ge v6, v1, :cond_8

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/b9;->w:Ljava/nio/channels/FileChannel;

    .line 21
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    if-eqz v7, :cond_7

    .line 22
    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_2

    .line 23
    :cond_5
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 24
    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 25
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 26
    :try_start_1
    invoke-virtual {v7, v2, v3}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 27
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/measurement/internal/x2;->m0:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v3}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v2

    .line 28
    invoke-virtual {v7, v4}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 29
    invoke-virtual {v7, v0}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 30
    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    cmp-long v0, v2, v4

    if-eqz v0, :cond_6

    .line 31
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v2, "Error writing to channel. Bytes written"

    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 32
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    .line 34
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Storage version upgraded. Previous, current version"

    invoke-virtual {v0, v3, v2, v1}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catch_1
    move-exception v0

    .line 35
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Failed to write to channel"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    .line 36
    :cond_7
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 37
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    .line 39
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Storage version upgrade failed. Previous, current version"

    .line 41
    invoke-virtual {v0, v3, v2, v1}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method public final b()Lcom/google/android/gms/measurement/internal/k4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/m4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    return-object v0
.end method

.method final b0()Lcom/google/android/gms/measurement/internal/m4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    return-object v0
.end method

.method public final c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->c()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final c0()Lcom/google/android/gms/measurement/internal/q6;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->h:Lcom/google/android/gms/measurement/internal/q6;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/measurement/internal/i3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/m4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    return-object v0
.end method

.method public final d0()Lcom/google/android/gms/measurement/internal/z7;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    return-object v0
.end method

.method public final e()Lf3/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/m4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->e()Lf3/d;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/measurement/internal/b;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final f0()Lcom/google/android/gms/measurement/internal/d9;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    return-object v0
.end method

.method final g()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/b9;->m:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UploadController is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g0()Lcom/google/android/gms/measurement/internal/h9;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/m4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->N()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v0

    return-object v0
.end method

.method final h(Lcom/google/android/gms/measurement/internal/r4;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/hd;->b()Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/measurement/internal/x2;->e0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->c0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0xcc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 7
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/b9;->m(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void

    .line 8
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->c0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0xcc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 10
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/b9;->m(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void

    .line 11
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->j:Lcom/google/android/gms/measurement/internal/t8;

    new-instance v1, Landroid/net/Uri$Builder;

    .line 12
    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    .line 13
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->k0()Ljava/lang/String;

    move-result-object v3

    .line 14
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 15
    invoke-static {}, Lcom/google/android/gms/internal/measurement/hd;->b()Z

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 16
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v3

    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 18
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->j0()Ljava/lang/String;

    move-result-object v3

    .line 19
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->c0()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 21
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->c0()Ljava/lang/String;

    move-result-object v3

    .line 22
    :cond_4
    :goto_1
    sget-object v2, Lcom/google/android/gms/measurement/internal/x2;->f:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v4, 0x0

    .line 23
    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->g:Lcom/google/android/gms/measurement/internal/w2;

    .line 24
    invoke-virtual {v5, v4}, Lcom/google/android/gms/measurement/internal/w2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "config/app/"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    .line 25
    :cond_5
    new-instance v3, Ljava/lang/String;

    .line 26
    invoke-direct {v3, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 27
    :goto_2
    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    .line 28
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->f0()Ljava/lang/String;

    move-result-object v3

    const-string v5, "app_instance_id"

    invoke-virtual {v2, v5, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "platform"

    const-string v5, "android"

    .line 29
    invoke-virtual {v2, v3, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 30
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f;->q()J

    const-wide/32 v5, 0xb3b0

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const-string v5, "gmp_version"

    invoke-virtual {v2, v5, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 32
    invoke-static {}, Lcom/google/android/gms/internal/measurement/ae;->b()Z

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 33
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    .line 34
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/measurement/internal/x2;->v0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "runtime_version"

    const-string v2, "0"

    .line 35
    invoke-virtual {v1, v0, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 36
    :cond_6
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    .line 37
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    .line 38
    new-instance v8, Ljava/net/URL;

    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 39
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v2, "Fetching remote configuration"

    invoke-virtual {v1, v2, v7}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 40
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 41
    invoke-virtual {v1, v7}, Lcom/google/android/gms/measurement/internal/g4;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r3;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 42
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 43
    invoke-virtual {v2, v7}, Lcom/google/android/gms/measurement/internal/g4;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_7

    .line 44
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 45
    new-instance v4, Lh0/a;

    invoke-direct {v4}, Lh0/a;-><init>()V

    const-string v1, "If-Modified-Since"

    .line 46
    invoke-interface {v4, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    move-object v10, v4

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/measurement/internal/b9;->s:Z

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/b9;->b:Lcom/google/android/gms/measurement/internal/n3;

    .line 47
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    new-instance v11, Lcom/google/android/gms/measurement/internal/w8;

    invoke-direct {v11, p0}, Lcom/google/android/gms/measurement/internal/w8;-><init>(Lcom/google/android/gms/measurement/internal/b9;)V

    .line 48
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 49
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    .line 50
    invoke-static {v8}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    invoke-static {v11}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v6, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 52
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m4;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/measurement/internal/m3;

    const/4 v9, 0x0

    move-object v5, v2

    .line 53
    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/measurement/internal/m3;-><init>(Lcom/google/android/gms/measurement/internal/n3;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/k3;)V

    .line 54
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/k4;->y(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 55
    :catch_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    .line 56
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    .line 57
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to parse config URL. Not fetching. appId"

    .line 58
    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method final h0(Lb4/a;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lb4/a;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x10

    new-array p1, p1, [B

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/h9;->t()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    new-instance v3, Ljava/math/BigInteger;

    .line 3
    invoke-direct {v3, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    const/4 p1, 0x0

    aput-object v3, v2, p1

    const-string p1, "%032x"

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method final i(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    .line 1
    invoke-static/range {p2 .. p2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v2}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    .line 5
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    move-object/from16 v3, p1

    .line 6
    iget-wide v10, v3, Lcom/google/android/gms/measurement/internal/zzat;->q:J

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/je;->b()Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->C0:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v5}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    .line 8
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/j3;->b(Lcom/google/android/gms/measurement/internal/zzat;)Lcom/google/android/gms/measurement/internal/j3;

    move-result-object v3

    .line 9
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/j3;->d:Landroid/os/Bundle;

    .line 10
    invoke-static {v6, v4, v5}, Lcom/google/android/gms/measurement/internal/h9;->x(Lcom/google/android/gms/measurement/internal/r6;Landroid/os/Bundle;Z)V

    .line 11
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/j3;->a()Lcom/google/android/gms/measurement/internal/zzat;

    move-result-object v3

    :cond_0
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/b9;->g:Lcom/google/android/gms/measurement/internal/d9;

    .line 12
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 13
    invoke-static {v3, v0}, Lcom/google/android/gms/measurement/internal/d9;->n(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)Z

    move-result v4

    if-nez v4, :cond_1

    return-void

    .line 14
    :cond_1
    iget-boolean v4, v0, Lcom/google/android/gms/measurement/internal/zzp;->u:Z

    if-nez v4, :cond_2

    .line 15
    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    return-void

    .line 16
    :cond_2
    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzp;->G:Ljava/util/List;

    if-eqz v4, :cond_4

    .line 17
    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 18
    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/zzat;->o:Lcom/google/android/gms/measurement/internal/zzar;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzar;->z()Landroid/os/Bundle;

    move-result-object v4

    const-wide/16 v6, 0x1

    const-string v8, "ga_safelisted"

    .line 19
    invoke-virtual {v4, v8, v6, v7}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v6, Lcom/google/android/gms/measurement/internal/zzat;

    .line 20
    iget-object v13, v3, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    new-instance v14, Lcom/google/android/gms/measurement/internal/zzar;

    invoke-direct {v14, v4}, Lcom/google/android/gms/measurement/internal/zzar;-><init>(Landroid/os/Bundle;)V

    iget-object v15, v3, Lcom/google/android/gms/measurement/internal/zzat;->p:Ljava/lang/String;

    iget-wide v3, v3, Lcom/google/android/gms/measurement/internal/zzat;->q:J

    move-object v12, v6

    move-wide/from16 v16, v3

    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/measurement/internal/zzat;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzar;Ljava/lang/String;J)V

    goto :goto_0

    .line 21
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzat;->p:Ljava/lang/String;

    const-string v5, "Dropping non-safelisted event. appId, event name, origin"

    .line 23
    invoke-virtual {v0, v5, v2, v4, v3}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    move-object v12, v3

    .line 24
    :goto_0
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 25
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 26
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i;->g0()V

    :try_start_0
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 27
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 28
    invoke-static {v2}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 30
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    const-wide/16 v6, 0x0

    const/4 v4, 0x2

    const/4 v13, 0x1

    cmp-long v8, v10, v6

    if-gez v8, :cond_5

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 31
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v6, "Invalid time querying timed out conditional properties"

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    .line 33
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    .line 34
    invoke-virtual {v3, v6, v7, v9}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :cond_5
    new-array v6, v4, [Ljava/lang/String;

    aput-object v2, v6, v5

    .line 36
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v13

    const-string v7, "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"

    .line 37
    invoke-virtual {v3, v7, v6}, Lcom/google/android/gms/measurement/internal/i;->d0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 38
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/measurement/internal/zzab;

    if-eqz v6, :cond_6

    .line 39
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v7

    .line 40
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v7

    const-string v9, "User property timed out"

    iget-object v14, v6, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    iget-object v15, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 41
    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v15

    iget-object v13, v6, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 42
    iget-object v13, v13, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v15, v13}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iget-object v15, v6, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 43
    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object v15

    .line 44
    invoke-virtual {v7, v9, v14, v13, v15}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v7, v6, Lcom/google/android/gms/measurement/internal/zzab;->t:Lcom/google/android/gms/measurement/internal/zzat;

    if-eqz v7, :cond_7

    new-instance v9, Lcom/google/android/gms/measurement/internal/zzat;

    .line 45
    invoke-direct {v9, v7, v10, v11}, Lcom/google/android/gms/measurement/internal/zzat;-><init>(Lcom/google/android/gms/measurement/internal/zzat;J)V

    invoke-virtual {v1, v9, v0}, Lcom/google/android/gms/measurement/internal/b9;->B(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    :cond_7
    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 46
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 47
    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v7, v2, v6}, Lcom/google/android/gms/measurement/internal/i;->K(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v13, 0x1

    goto :goto_2

    :cond_8
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 48
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 49
    invoke-static {v2}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 51
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    if-gez v8, :cond_9

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 52
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 53
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v6, "Invalid time querying expired conditional properties"

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    .line 54
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    .line 55
    invoke-virtual {v3, v6, v7, v9}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_3

    :cond_9
    new-array v6, v4, [Ljava/lang/String;

    aput-object v2, v6, v5

    .line 57
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x1

    aput-object v7, v6, v9

    const-string v7, "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"

    .line 58
    invoke-virtual {v3, v7, v6}, Lcom/google/android/gms/measurement/internal/i;->d0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 59
    :goto_3
    new-instance v6, Ljava/util/ArrayList;

    .line 60
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_a
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/measurement/internal/zzab;

    if-eqz v7, :cond_a

    .line 62
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v9

    .line 63
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v9

    const-string v13, "User property expired"

    iget-object v14, v7, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    iget-object v15, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 64
    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v15

    iget-object v4, v7, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 65
    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v15, v4}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v15, v7, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 66
    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object v15

    .line 67
    invoke-virtual {v9, v13, v14, v4, v15}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 68
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v9, v7, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 69
    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v4, v2, v9}, Lcom/google/android/gms/measurement/internal/i;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v7, Lcom/google/android/gms/measurement/internal/zzab;->x:Lcom/google/android/gms/measurement/internal/zzat;

    if-eqz v4, :cond_b

    .line 70
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 71
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 72
    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v4, v2, v7}, Lcom/google/android/gms/measurement/internal/i;->K(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v4, 0x2

    goto :goto_4

    .line 73
    :cond_c
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/measurement/internal/zzat;

    new-instance v6, Lcom/google/android/gms/measurement/internal/zzat;

    .line 74
    invoke-direct {v6, v4, v10, v11}, Lcom/google/android/gms/measurement/internal/zzat;-><init>(Lcom/google/android/gms/measurement/internal/zzat;J)V

    invoke-virtual {v1, v6, v0}, Lcom/google/android/gms/measurement/internal/b9;->B(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    goto :goto_5

    :cond_d
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 75
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 76
    iget-object v4, v12, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    .line 77
    invoke-static {v2}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    invoke-static {v4}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 80
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    if-gez v8, :cond_e

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 81
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v5

    .line 82
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v5

    const-string v6, "Invalid time querying triggered conditional properties"

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 83
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    .line 84
    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 85
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 86
    invoke-virtual {v5, v6, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_6

    :cond_e
    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/String;

    aput-object v2, v6, v5

    const/4 v2, 0x1

    aput-object v4, v6, v2

    .line 88
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x2

    aput-object v2, v6, v4

    const-string v2, "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"

    .line 89
    invoke-virtual {v3, v2, v6}, Lcom/google/android/gms/measurement/internal/i;->d0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 90
    :goto_6
    new-instance v13, Ljava/util/ArrayList;

    .line 91
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_f
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lcom/google/android/gms/measurement/internal/zzab;

    if-eqz v14, :cond_f

    iget-object v3, v14, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    new-instance v15, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v4, v14, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    .line 93
    invoke-static {v4}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v14, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    .line 94
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v3, v15

    move-wide v7, v10

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 95
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 96
    invoke-virtual {v3, v15}, Lcom/google/android/gms/measurement/internal/i;->z(Lcom/google/android/gms/measurement/internal/f9;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 97
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 98
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v4, "User property triggered"

    iget-object v5, v14, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 99
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v6

    iget-object v7, v15, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    .line 100
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v15, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    .line 101
    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    .line 102
    :cond_10
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 103
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    const-string v4, "Too many active user properties, ignoring"

    iget-object v5, v14, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 104
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v6

    iget-object v7, v15, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    .line 105
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v15, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    .line 106
    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    :goto_8
    iget-object v3, v14, Lcom/google/android/gms/measurement/internal/zzab;->v:Lcom/google/android/gms/measurement/internal/zzat;

    if-eqz v3, :cond_11

    .line 108
    invoke-interface {v13, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_11
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzkv;

    .line 109
    invoke-direct {v3, v15}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Lcom/google/android/gms/measurement/internal/f9;)V

    iput-object v3, v14, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    const/4 v3, 0x1

    iput-boolean v3, v14, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 110
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 111
    invoke-virtual {v4, v14}, Lcom/google/android/gms/measurement/internal/i;->y(Lcom/google/android/gms/measurement/internal/zzab;)Z

    goto/16 :goto_7

    .line 112
    :cond_12
    invoke-virtual {v1, v12, v0}, Lcom/google/android/gms/measurement/internal/b9;->B(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    .line 113
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/zzat;

    new-instance v4, Lcom/google/android/gms/measurement/internal/zzat;

    .line 114
    invoke-direct {v4, v3, v10, v11}, Lcom/google/android/gms/measurement/internal/zzat;-><init>(Lcom/google/android/gms/measurement/internal/zzat;J)V

    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/measurement/internal/b9;->B(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    goto :goto_9

    :cond_13
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 115
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 116
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 117
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 118
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :catchall_0
    move-exception v0

    .line 119
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 120
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 121
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 122
    throw v0
.end method

.method final i0(Lcom/google/android/gms/measurement/internal/zzp;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/x8;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/x8;-><init>(Lcom/google/android/gms/measurement/internal/b9;Lcom/google/android/gms/measurement/internal/zzp;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/k4;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    const-wide/16 v1, 0x7530

    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 3
    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    .line 4
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to get app instance id. appId"

    .line 6
    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method final j(Lcom/google/android/gms/measurement/internal/zzat;Ljava/lang/String;)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    .line 1
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 2
    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 3
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->h0()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-direct {v0, v2}, Lcom/google/android/gms/measurement/internal/b9;->H(Lcom/google/android/gms/measurement/internal/r4;)Ljava/lang/Boolean;

    move-result-object v4

    if-nez v4, :cond_1

    .line 5
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    const-string v5, "_ui"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v4

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "Could not find package. appId"

    invoke-virtual {v4, v6, v5}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_2

    .line 8
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "App version does not match; dropping event. appId"

    .line 10
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 11
    :cond_2
    :goto_0
    new-instance v14, Lcom/google/android/gms/measurement/internal/zzp;

    .line 12
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->k0()Ljava/lang/String;

    move-result-object v4

    .line 13
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->h0()Ljava/lang/String;

    move-result-object v5

    .line 14
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->M()J

    move-result-wide v6

    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->g0()Ljava/lang/String;

    move-result-object v8

    .line 16
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->X()J

    move-result-wide v9

    .line 17
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->U()J

    move-result-wide v11

    .line 18
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->K()Z

    move-result v16

    .line 19
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->i0()Ljava/lang/String;

    move-result-object v17

    .line 20
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->A()J

    move-result-wide v24

    .line 21
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->J()Z

    move-result v22

    .line 22
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->c0()Ljava/lang/String;

    move-result-object v26

    .line 23
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->b0()Ljava/lang/Boolean;

    move-result-object v27

    .line 24
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->V()J

    move-result-wide v28

    .line 25
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->c()Ljava/util/List;

    move-result-object v31

    .line 26
    invoke-static {}, Lcom/google/android/gms/internal/measurement/hd;->b()Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v13

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object v15

    sget-object v1, Lcom/google/android/gms/measurement/internal/x2;->e0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v13, v15, v1}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 27
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r4;->j0()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    const/4 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    .line 28
    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/b9;->U(Ljava/lang/String;)Lb4/a;

    move-result-object v2

    invoke-virtual {v2}, Lb4/a;->i()Ljava/lang/String;

    move-result-object v30

    move-object v2, v14

    move-object/from16 v3, p2

    move-object/from16 v32, v14

    move/from16 v14, v16

    move-object/from16 v16, v17

    move-wide/from16 v17, v24

    move-object/from16 v24, v26

    move-object/from16 v25, v27

    move-wide/from16 v26, v28

    move-object/from16 v28, v31

    move-object/from16 v29, v1

    invoke-direct/range {v2 .. v30}, Lcom/google/android/gms/measurement/internal/zzp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p1

    move-object/from16 v2, v32

    .line 29
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/b9;->k(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    return-void

    .line 30
    :cond_4
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v2, "No app data available; dropping event"

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method final k(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V
    .locals 8

    .line 1
    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v0}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/j3;->b(Lcom/google/android/gms/measurement/internal/zzat;)Lcom/google/android/gms/measurement/internal/j3;

    move-result-object p1

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/j3;->d:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 4
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 5
    iget-object v3, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/i;->S(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/h9;->y(Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v1

    iget-object v2, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/f;->n(Ljava/lang/String;)I

    move-result v1

    .line 9
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/measurement/internal/h9;->z(Lcom/google/android/gms/measurement/internal/j3;I)V

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/j3;->a()Lcom/google/android/gms/measurement/internal/zzat;

    move-result-object p1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    const-string v1, "_cmp"

    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzat;->o:Lcom/google/android/gms/measurement/internal/zzar;

    const-string v1, "_cis"

    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzar;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "referrer API v2"

    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzat;->o:Lcom/google/android/gms/measurement/internal/zzar;

    const-string v1, "gclid"

    .line 15
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzar;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 16
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 17
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzkv;

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/zzat;->q:J

    const-string v3, "_lgclid"

    const-string v7, "auto"

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/measurement/internal/b9;->z(Lcom/google/android/gms/measurement/internal/zzkv;Lcom/google/android/gms/measurement/internal/zzp;)V

    .line 19
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/b9;->i(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    return-void
.end method

.method final k0(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->p:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    .line 2
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->p:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->p:Ljava/util/List;

    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final l()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/b9;->r:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/measurement/internal/b9;->r:I

    return-void
.end method

.method final m(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Throwable;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    .line 3
    invoke-static {p1}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p4, :cond_0

    :try_start_0
    new-array p4, v0, [B

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    array-length v2, p4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "onConfigFetched. Response size"

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 5
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 6
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i;->g0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 7
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 8
    invoke-virtual {v1, p1}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v1

    const/16 v3, 0xc8

    const/16 v4, 0x130

    if-eq p2, v3, :cond_1

    const/16 v3, 0xcc

    if-eq p2, v3, :cond_1

    if-ne p2, v4, :cond_2

    const/16 p2, 0x130

    :cond_1
    if-nez p3, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-nez v1, :cond_3

    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p2

    .line 10
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p2

    const-string p3, "App does not exist in onConfigFetched. appId"

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    .line 11
    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    const/16 v5, 0x194

    if-nez v3, :cond_7

    if-ne p2, v5, :cond_4

    goto :goto_1

    .line 12
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object p4

    invoke-interface {p4}, Lf3/d;->a()J

    move-result-wide p4

    invoke-virtual {v1, p4, p5}, Lcom/google/android/gms/measurement/internal/r4;->v(J)V

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 13
    invoke-static {p4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 14
    invoke-virtual {p4, v1}, Lcom/google/android/gms/measurement/internal/i;->q(Lcom/google/android/gms/measurement/internal/r4;)V

    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p4

    const-string p5, "Fetching config failed. code, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p4, p5, v1, p3}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 16
    invoke-static {p3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 17
    invoke-virtual {p3, p1}, Lcom/google/android/gms/measurement/internal/g4;->r(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 18
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/z7;->j:Lcom/google/android/gms/measurement/internal/s3;

    .line 19
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object p3

    invoke-interface {p3}, Lf3/d;->a()J

    move-result-wide p3

    invoke-virtual {p1, p3, p4}, Lcom/google/android/gms/measurement/internal/s3;->b(J)V

    const/16 p1, 0x1f7

    if-eq p2, p1, :cond_5

    const/16 p1, 0x1ad

    if-ne p2, p1, :cond_6

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 20
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/z7;->h:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object p2

    invoke-interface {p2}, Lf3/d;->a()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/measurement/internal/s3;->b(J)V

    .line 21
    :cond_6
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->L()V

    goto/16 :goto_7

    :cond_7
    :goto_1
    const/4 p3, 0x0

    if-eqz p5, :cond_8

    const-string v3, "Last-Modified"

    .line 22
    invoke-interface {p5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/util/List;

    goto :goto_2

    :cond_8
    move-object p5, p3

    :goto_2
    if-eqz p5, :cond_9

    .line 23
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_9

    .line 24
    invoke-interface {p5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/String;

    goto :goto_3

    :cond_9
    move-object p5, p3

    :goto_3
    if-eq p2, v5, :cond_b

    if-ne p2, v4, :cond_a

    goto :goto_5

    .line 25
    :cond_a
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 26
    invoke-static {p3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 27
    invoke-virtual {p3, p1, p4, p5}, Lcom/google/android/gms/measurement/internal/g4;->z(Ljava/lang/String;[BLjava/lang/String;)Z

    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p3, :cond_c

    :try_start_2
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 28
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 29
    :goto_4
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->i0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/b9;->s:Z

    .line 30
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->I()V

    return-void

    .line 31
    :cond_b
    :goto_5
    :try_start_3
    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 32
    invoke-static {p4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 33
    invoke-virtual {p4, p1}, Lcom/google/android/gms/measurement/internal/g4;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r3;

    move-result-object p4

    if-nez p4, :cond_c

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 34
    invoke-static {p4}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 35
    invoke-virtual {p4, p1, p3, p3}, Lcom/google/android/gms/measurement/internal/g4;->z(Ljava/lang/String;[BLjava/lang/String;)Z

    move-result p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez p3, :cond_c

    :try_start_4
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 36
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    .line 37
    :cond_c
    :try_start_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object p3

    invoke-interface {p3}, Lf3/d;->a()J

    move-result-wide p3

    invoke-virtual {v1, p3, p4}, Lcom/google/android/gms/measurement/internal/r4;->m(J)V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 38
    invoke-static {p3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 39
    invoke-virtual {p3, v1}, Lcom/google/android/gms/measurement/internal/i;->q(Lcom/google/android/gms/measurement/internal/r4;)V

    if-ne p2, v5, :cond_d

    .line 40
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p2

    .line 41
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i3;->x()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p2

    const-string p3, "Config not found. Using empty config. appId"

    .line 42
    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    .line 43
    :cond_d
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p1

    const-string p3, "Successfully fetched config. Got network response. code, size"

    .line 45
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 46
    invoke-virtual {p1, p3, p2, v2}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    :goto_6
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->b:Lcom/google/android/gms/measurement/internal/n3;

    .line 48
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 49
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/n3;->m()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->O()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 50
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->A()V

    goto :goto_7

    .line 51
    :cond_e
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->L()V

    .line 52
    :goto_7
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 53
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 54
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 55
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    goto :goto_4

    :catchall_0
    move-exception p1

    .line 56
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 57
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 58
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 59
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p1

    .line 60
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/b9;->s:Z

    .line 61
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->I()V

    .line 62
    throw p1
.end method

.method final n(Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->L()V

    return-void
.end method

.method final o(ILjava/lang/Throwable;[BLjava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    const/4 p4, 0x0

    if-nez p3, :cond_0

    :try_start_0
    new-array p3, p4, [B

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->x:Ljava/util/List;

    .line 3
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->x:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v2, 0xc8

    const/16 v3, 0xcc

    if-eq p1, v2, :cond_1

    if-ne p1, v3, :cond_6

    const/16 p1, 0xcc

    :cond_1
    if-nez p2, :cond_6

    :try_start_1
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 4
    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/z7;->i:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v2

    invoke-interface {v2}, Lf3/d;->a()J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/measurement/internal/s3;->b(J)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 5
    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/z7;->j:Lcom/google/android/gms/measurement/internal/s3;

    const-wide/16 v2, 0x0

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/measurement/internal/s3;->b(J)V

    .line 6
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->L()V

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p2

    .line 8
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p2

    const-string v4, "Successful upload. Got network response. code, size"

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    array-length p3, p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v4, p1, p3}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 10
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->g0()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 12
    :try_start_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 13
    invoke-static {p3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 14
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 15
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 16
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    .line 17
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/String;

    .line 18
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v7, p4
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    const-string v4, "queue"

    const-string v5, "rowid=?"

    .line 19
    invoke-virtual {v0, v4, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-ne v0, v6, :cond_2

    goto :goto_0

    .line 20
    :cond_2
    new-instance v0, Landroid/database/sqlite/SQLiteException;

    const-string v4, "Deleted fewer rows from queue than expected"

    invoke-direct {v0, v4}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_0
    move-exception v0

    .line 21
    :try_start_5
    iget-object p3, p3, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 22
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p3

    .line 23
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p3

    const-string v4, "Failed to delete a bundle in a queue table"

    invoke-virtual {p3, v4, v0}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    throw v0
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_1
    move-exception p3

    .line 25
    :try_start_6
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->y:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 26
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    .line 27
    :cond_3
    throw p3

    .line 28
    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 29
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 30
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 31
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 32
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->y:Ljava/util/List;

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->b:Lcom/google/android/gms/measurement/internal/n3;

    .line 33
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 34
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/n3;->m()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 35
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->A()V

    goto :goto_1

    :cond_5
    const-wide/16 p1, -0x1

    .line 36
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/b9;->z:J

    .line 37
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->L()V

    .line 38
    :goto_1
    iput-wide v2, p0, Lcom/google/android/gms/measurement/internal/b9;->o:J

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 39
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 40
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 41
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 42
    throw p1
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catch_2
    move-exception p1

    .line 43
    :try_start_8
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p2

    const-string p3, "Database error while trying to delete uploaded bundles"

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object p1

    invoke-interface {p1}, Lf3/d;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/b9;->o:J

    .line 45
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p1

    const-string p2, "Disable upload, time"

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/b9;->o:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    .line 46
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p3

    .line 47
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p3

    const-string v1, "Network upload failed. Will retry later. code, error"

    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p3, v1, v2, p2}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 49
    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/z7;->j:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object p3

    invoke-interface {p3}, Lf3/d;->a()J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/measurement/internal/s3;->b(J)V

    const/16 p2, 0x1f7

    if-eq p1, p2, :cond_7

    const/16 p2, 0x1ad

    if-ne p1, p2, :cond_8

    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 50
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/z7;->h:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object p2

    invoke-interface {p2}, Lf3/d;->a()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/measurement/internal/s3;->b(J)V

    :cond_8
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 51
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 52
    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/i;->j0(Ljava/util/List;)V

    .line 53
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->L()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 54
    :goto_2
    iput-boolean p4, p0, Lcom/google/android/gms/measurement/internal/b9;->t:Z

    .line 55
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->I()V

    return-void

    :catchall_1
    move-exception p1

    .line 56
    iput-boolean p4, p0, Lcom/google/android/gms/measurement/internal/b9;->t:Z

    .line 57
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->I()V

    .line 58
    throw p1
.end method

.method final p(Lcom/google/android/gms/measurement/internal/zzp;)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "_sysu"

    const-string v4, "_sys"

    const-string v5, "com.android.vending"

    const-string v6, "_pfo"

    const-string v7, "_uwa"

    const-string v0, "app_id=?"

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    .line 3
    invoke-static/range {p1 .. p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v8}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/measurement/internal/b9;->M(Lcom/google/android/gms/measurement/internal/zzp;)Z

    move-result v8

    if-eqz v8, :cond_28

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 6
    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 7
    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v8

    const-wide/16 v9, 0x0

    if-eqz v8, :cond_0

    .line 8
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/r4;->k0()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_0

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzp;->o:Ljava/lang/String;

    .line 9
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_0

    .line 10
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/measurement/internal/r4;->m(J)V

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 11
    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 12
    invoke-virtual {v11, v8}, Lcom/google/android/gms/measurement/internal/i;->q(Lcom/google/android/gms/measurement/internal/r4;)V

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/b9;->a:Lcom/google/android/gms/measurement/internal/g4;

    .line 13
    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 14
    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-virtual {v8, v11}, Lcom/google/android/gms/measurement/internal/g4;->s(Ljava/lang/String;)V

    .line 15
    :cond_0
    iget-boolean v8, v2, Lcom/google/android/gms/measurement/internal/zzp;->u:Z

    if-nez v8, :cond_1

    .line 16
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    return-void

    .line 17
    :cond_1
    iget-wide v11, v2, Lcom/google/android/gms/measurement/internal/zzp;->z:J

    cmp-long v8, v11, v9

    if-nez v8, :cond_2

    .line 18
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v8

    invoke-interface {v8}, Lf3/d;->a()J

    move-result-wide v11

    :cond_2
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 19
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/m4;->A()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v8

    .line 20
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/m;->r()V

    .line 21
    iget v8, v2, Lcom/google/android/gms/measurement/internal/zzp;->A:I

    const/4 v15, 0x1

    if-eqz v8, :cond_3

    if-eq v8, v15, :cond_3

    .line 22
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v13

    .line 23
    invoke-virtual {v13}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v13

    iget-object v14, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v14}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    .line 24
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "Incorrect app type, assuming installed app. appId, appType"

    .line 25
    invoke-virtual {v13, v9, v14, v8}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v8, 0x0

    :cond_3
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 26
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 27
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/i;->g0()V

    :try_start_0
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 28
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 29
    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const-string v13, "_npa"

    .line 30
    invoke-virtual {v9, v10, v13}, Lcom/google/android/gms/measurement/internal/i;->Z(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v9

    if-eqz v9, :cond_5

    const-string v10, "auto"

    iget-object v13, v9, Lcom/google/android/gms/measurement/internal/f9;->b:Ljava/lang/String;

    .line 31
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    goto :goto_0

    :cond_4
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    const/4 v4, 0x1

    goto :goto_2

    .line 32
    :cond_5
    :goto_0
    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/zzp;->E:Ljava/lang/Boolean;

    if-eqz v10, :cond_8

    .line 33
    new-instance v14, Lcom/google/android/gms/measurement/internal/zzkv;

    const-string v19, "_npa"

    .line 34
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eq v15, v10, :cond_6

    const-wide/16 v20, 0x0

    goto :goto_1

    :cond_6
    const-wide/16 v20, 0x1

    :goto_1
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const-string v20, "auto"

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    const-wide/16 v3, 0x1

    move-object v13, v14

    move-object v3, v14

    const/4 v4, 0x0

    move-object/from16 v14, v19

    const/4 v4, 0x1

    move-wide v15, v11

    move-object/from16 v17, v10

    move-object/from16 v18, v20

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    if-eqz v9, :cond_7

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/zzkv;->q:Ljava/lang/Long;

    .line 35
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    .line 36
    :cond_7
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/b9;->z(Lcom/google/android/gms/measurement/internal/zzkv;Lcom/google/android/gms/measurement/internal/zzp;)V

    goto :goto_2

    :cond_8
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    const/4 v4, 0x1

    if-eqz v9, :cond_9

    .line 37
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzkv;

    const-string v14, "_npa"

    const/16 v17, 0x0

    const-string v18, "auto"

    move-object v13, v3

    move-wide v15, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/b9;->t(Lcom/google/android/gms/measurement/internal/zzkv;Lcom/google/android/gms/measurement/internal/zzp;)V

    .line 39
    :cond_9
    :goto_2
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 40
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 41
    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v9}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v3, v9}, Lcom/google/android/gms/measurement/internal/i;->T(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r4;

    move-result-object v3

    if-eqz v3, :cond_b

    .line 42
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v10

    iget-object v13, v2, Lcom/google/android/gms/measurement/internal/zzp;->o:Ljava/lang/String;

    .line 43
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/r4;->k0()Ljava/lang/String;

    move-result-object v14

    iget-object v15, v2, Lcom/google/android/gms/measurement/internal/zzp;->D:Ljava/lang/String;

    .line 44
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/r4;->c0()Ljava/lang/String;

    move-result-object v9

    .line 45
    invoke-virtual {v10, v13, v14, v15, v9}, Lcom/google/android/gms/measurement/internal/h9;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_b

    .line 46
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v9

    .line 47
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v9

    const-string v10, "New GMP App Id passed in. Removing cached database data. appId"

    .line 48
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    .line 49
    invoke-virtual {v9, v10, v13}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 50
    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 51
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/r4;->e0()Ljava/lang/String;

    move-result-object v3

    .line 52
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    .line 53
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 54
    invoke-static {v3}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :try_start_1
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v10

    new-array v13, v4, [Ljava/lang/String;

    const/4 v14, 0x0

    aput-object v3, v13, v14

    const-string v14, "events"

    .line 56
    invoke-virtual {v10, v14, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v14

    const-string v15, "user_attributes"

    .line 57
    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "conditional_properties"

    .line 58
    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "apps"

    .line 59
    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "raw_events"

    .line 60
    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "raw_events_metadata"

    .line 61
    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "event_filters"

    .line 62
    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "property_filters"

    .line 63
    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "audience_filter_values"

    .line 64
    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "consent_settings"

    .line 65
    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v14, v0

    if-lez v14, :cond_a

    iget-object v0, v9, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 66
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v10, "Deleted application data. app, records"

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v0, v10, v3, v13}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 68
    :try_start_2
    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 69
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v9

    .line 70
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v9

    const-string v10, "Error deleting application data. appId, error"

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 71
    invoke-virtual {v9, v10, v3, v0}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_a
    :goto_3
    const/4 v3, 0x0

    :cond_b
    if-eqz v3, :cond_f

    .line 72
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/r4;->M()J

    move-result-wide v9

    const-wide/32 v13, -0x80000000

    cmp-long v0, v9, v13

    if-eqz v0, :cond_c

    .line 73
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/r4;->M()J

    move-result-wide v9

    move-object/from16 v23, v5

    iget-wide v4, v2, Lcom/google/android/gms/measurement/internal/zzp;->w:J

    cmp-long v0, v9, v4

    if-eqz v0, :cond_d

    const/4 v15, 0x1

    goto :goto_4

    :cond_c
    move-object/from16 v23, v5

    :cond_d
    const/4 v15, 0x0

    .line 74
    :goto_4
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/r4;->h0()Ljava/lang/String;

    move-result-object v0

    .line 75
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/r4;->M()J

    move-result-wide v3

    cmp-long v5, v3, v13

    if-nez v5, :cond_e

    if-eqz v0, :cond_e

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzp;->p:Ljava/lang/String;

    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    const/4 v3, 0x1

    goto :goto_5

    :cond_e
    const/4 v3, 0x0

    :goto_5
    or-int/2addr v3, v15

    if-eqz v3, :cond_10

    new-instance v3, Landroid/os/Bundle;

    .line 77
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "_pv"

    .line 78
    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzat;

    new-instance v15, Lcom/google/android/gms/measurement/internal/zzar;

    invoke-direct {v15, v3}, Lcom/google/android/gms/measurement/internal/zzar;-><init>(Landroid/os/Bundle;)V

    const-string v14, "_au"

    const-string v16, "auto"

    move-object v13, v0

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzat;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzar;Ljava/lang/String;J)V

    .line 80
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/b9;->i(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    goto :goto_6

    :cond_f
    move-object/from16 v23, v5

    .line 81
    :cond_10
    :goto_6
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    if-nez v8, :cond_11

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 82
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 83
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const-string v4, "_f"

    .line 84
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/i;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v0

    const/4 v15, 0x0

    goto :goto_7

    .line 85
    :cond_11
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 86
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 87
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const-string v4, "_v"

    .line 88
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/i;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v0

    const/4 v15, 0x1

    :goto_7
    if-nez v0, :cond_26

    const-wide/32 v3, 0x36ee80

    .line 89
    div-long v8, v11, v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-wide/16 v13, 0x1

    add-long/2addr v8, v13

    mul-long v8, v8, v3

    const-string v3, "_dac"

    const-string v4, "_r"

    const-string v5, "_c"

    const-string v10, "_et"

    if-nez v15, :cond_24

    .line 90
    :try_start_3
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzkv;

    const-string v14, "_fot"

    .line 91
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    const-string v18, "auto"

    move-object v13, v0

    move-wide v15, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 92
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/b9;->z(Lcom/google/android/gms/measurement/internal/zzkv;Lcom/google/android/gms/measurement/internal/zzp;)V

    .line 93
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->k:Lcom/google/android/gms/measurement/internal/z3;

    .line 94
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/google/android/gms/measurement/internal/z3;

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    if-eqz v0, :cond_18

    .line 95
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_12

    goto/16 :goto_9

    .line 96
    :cond_12
    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 97
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v9

    .line 98
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 99
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/z3;->a()Z

    move-result v9

    if-nez v9, :cond_13

    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 100
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->u()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v8, "Install Referrer Reporter is not available"

    invoke-virtual {v0, v8}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    goto/16 :goto_a

    :cond_13
    new-instance v9, Lcom/google/android/gms/measurement/internal/y3;

    invoke-direct {v9, v8, v0}, Lcom/google/android/gms/measurement/internal/y3;-><init>(Lcom/google/android/gms/measurement/internal/z3;Ljava/lang/String;)V

    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 101
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    new-instance v0, Landroid/content/Intent;

    const-string v13, "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"

    .line 103
    invoke-direct {v0, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v13, Landroid/content/ComponentName;

    const-string v14, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"

    move-object/from16 v15, v23

    .line 104
    invoke-direct {v13, v15, v14}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v13, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 105
    invoke-virtual {v13}, Lcom/google/android/gms/measurement/internal/m4;->c()Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    if-nez v13, :cond_14

    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 106
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 107
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->y()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v8, "Failed to obtain Package Manager to verify binding conditions for Install Referrer"

    .line 108
    invoke-virtual {v0, v8}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    goto/16 :goto_a

    :cond_14
    const/4 v14, 0x0

    .line 109
    invoke-virtual {v13, v0, v14}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v13

    if-eqz v13, :cond_17

    .line 110
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_17

    .line 111
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/pm/ResolveInfo;

    .line 112
    iget-object v13, v13, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v13, :cond_19

    .line 113
    iget-object v14, v13, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 114
    iget-object v13, v13, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    if-eqz v13, :cond_16

    .line 115
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_16

    .line 116
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/z3;->a()Z

    move-result v13

    if-eqz v13, :cond_16

    new-instance v13, Landroid/content/Intent;

    .line 117
    invoke-direct {v13, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 118
    :try_start_4
    invoke-static {}, Le3/a;->b()Le3/a;

    move-result-object v0

    iget-object v14, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 119
    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m4;->c()Landroid/content/Context;

    move-result-object v14

    const/4 v15, 0x1

    .line 120
    invoke-virtual {v0, v14, v13, v9, v15}, Le3/a;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 121
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v9

    .line 122
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v9

    const-string v13, "Install Referrer Service is"
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    const-string v14, "available"

    const-string v15, "not available"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v16, v14

    const/4 v14, 0x1

    if-eq v14, v0, :cond_15

    move-object v14, v15

    goto :goto_8

    :cond_15
    move-object/from16 v14, v16

    .line 123
    :goto_8
    :try_start_6
    invoke-virtual {v9, v13, v14}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_a

    :catch_1
    move-exception v0

    .line 124
    :try_start_7
    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 125
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v8

    .line 126
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v8

    const-string v9, "Exception occurred while binding to Install Referrer Service"

    .line 127
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 128
    invoke-virtual {v8, v9, v0}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_a

    .line 129
    :cond_16
    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 130
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 131
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v8, "Play Store version 8.3.73 or higher required for Install Referrer"

    .line 132
    invoke-virtual {v0, v8}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    goto :goto_a

    :cond_17
    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 133
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->u()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v8, "Play Service for fetching Install Referrer is unavailable on device"

    .line 135
    invoke-virtual {v0, v8}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    goto :goto_a

    .line 136
    :cond_18
    :goto_9
    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/z3;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 137
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 138
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->y()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v8, "Install Referrer Reporter was called with invalid app package name"

    .line 139
    invoke-virtual {v0, v8}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    .line 140
    :cond_19
    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 141
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    new-instance v8, Landroid/os/Bundle;

    .line 142
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v13, 0x1

    .line 143
    invoke-virtual {v8, v5, v13, v14}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 144
    invoke-virtual {v8, v4, v13, v14}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v4, 0x0

    .line 145
    invoke-virtual {v8, v7, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 146
    invoke-virtual {v8, v6, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v9, v22

    .line 147
    invoke-virtual {v8, v9, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v15, v21

    .line 148
    invoke-virtual {v8, v15, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v4, 0x1

    .line 149
    invoke-virtual {v8, v10, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 150
    iget-boolean v0, v2, Lcom/google/android/gms/measurement/internal/zzp;->C:Z

    if-eqz v0, :cond_1a

    .line 151
    invoke-virtual {v8, v3, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 152
    :cond_1a
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 153
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 154
    invoke-static {v3}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 156
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    const-string v4, "first_open_count"

    .line 157
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/i;->N(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v4

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 158
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->c()Landroid/content/Context;

    move-result-object v0

    .line 159
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-nez v0, :cond_1c

    .line 160
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 161
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v7, "PackageManager is null, first open report might be inaccurate. appId"

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 162
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-object/from16 v22, v10

    :cond_1b
    :goto_b
    const-wide/16 v9, 0x0

    goto/16 :goto_12

    .line 163
    :cond_1c
    :try_start_8
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 164
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->c()Landroid/content/Context;

    move-result-object v0

    .line 165
    invoke-static {v0}, Lh3/c;->a(Landroid/content/Context;)Lh3/b;

    move-result-object v0

    const/4 v13, 0x0

    invoke-virtual {v0, v3, v13}, Lh3/b;->d(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_8
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-object/from16 v21, v15

    goto :goto_c

    :catch_2
    move-exception v0

    .line 166
    :try_start_9
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v13

    .line 167
    invoke-virtual {v13}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v13

    const-string v14, "Package info is null, first open report might be inaccurate. appId"

    move-object/from16 v21, v15

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    .line 168
    invoke-virtual {v13, v14, v15, v0}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_c
    if-eqz v0, :cond_21

    .line 169
    iget-wide v13, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-wide/16 v15, 0x0

    cmp-long v17, v13, v15

    if-eqz v17, :cond_21

    move-object/from16 v23, v9

    move-object/from16 v22, v10

    .line 170
    iget-wide v9, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v0, v13, v9

    if-eqz v0, :cond_1f

    .line 171
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    sget-object v9, Lcom/google/android/gms/measurement/internal/x2;->i0:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v10, 0x0

    invoke-virtual {v0, v10, v9}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v0

    if-eqz v0, :cond_1e

    const-wide/16 v13, 0x0

    cmp-long v0, v4, v13

    if-nez v0, :cond_1d

    const-wide/16 v13, 0x1

    .line 172
    invoke-virtual {v8, v7, v13, v14}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v4, 0x0

    :cond_1d
    :goto_d
    const/4 v15, 0x0

    goto :goto_e

    :cond_1e
    const-wide/16 v13, 0x1

    .line 173
    invoke-virtual {v8, v7, v13, v14}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto :goto_d

    :cond_1f
    const/4 v10, 0x0

    const/4 v15, 0x1

    .line 174
    :goto_e
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzkv;

    const-string v14, "_fi"

    const/4 v7, 0x1

    if-eq v7, v15, :cond_20

    const-wide/16 v15, 0x0

    goto :goto_f

    :cond_20
    const-wide/16 v15, 0x1

    .line 175
    :goto_f
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    const-string v18, "auto"

    move-object v13, v0

    move-object/from16 v7, v21

    move-wide v15, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 176
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/b9;->z(Lcom/google/android/gms/measurement/internal/zzkv;Lcom/google/android/gms/measurement/internal/zzp;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_10

    :cond_21
    move-object/from16 v23, v9

    move-object/from16 v22, v10

    move-object/from16 v7, v21

    const/4 v10, 0x0

    :goto_10
    :try_start_a
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 177
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->c()Landroid/content/Context;

    move-result-object v0

    .line 178
    invoke-static {v0}, Lh3/c;->a(Landroid/content/Context;)Lh3/b;

    move-result-object v0

    const/4 v9, 0x0

    invoke-virtual {v0, v3, v9}, Lh3/b;->b(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v9
    :try_end_a
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_11

    :catch_3
    move-exception v0

    .line 179
    :try_start_b
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v9

    .line 180
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v9

    const-string v13, "Application info is null, first open report might be inaccurate. appId"

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 181
    invoke-virtual {v9, v13, v3, v0}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v9, v10

    :goto_11
    if-eqz v9, :cond_1b

    .line 182
    iget v0, v9, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v3, 0x1

    and-int/2addr v0, v3

    if-eqz v0, :cond_22

    move-object/from16 v3, v23

    const-wide/16 v13, 0x1

    .line 183
    invoke-virtual {v8, v3, v13, v14}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 184
    :cond_22
    iget v0, v9, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1b

    const-wide/16 v9, 0x1

    .line 185
    invoke-virtual {v8, v7, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto/16 :goto_b

    :goto_12
    cmp-long v0, v4, v9

    if-ltz v0, :cond_23

    .line 186
    invoke-virtual {v8, v6, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 187
    :cond_23
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzat;

    new-instance v15, Lcom/google/android/gms/measurement/internal/zzar;

    invoke-direct {v15, v8}, Lcom/google/android/gms/measurement/internal/zzar;-><init>(Landroid/os/Bundle;)V

    const-string v14, "_f"

    const-string v16, "auto"

    move-object v13, v0

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzat;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzar;Ljava/lang/String;J)V

    .line 188
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/b9;->k(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    move-object/from16 v4, v22

    goto :goto_13

    :cond_24
    move-object/from16 v22, v10

    .line 189
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzkv;

    const-string v14, "_fvt"

    .line 190
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    const-string v18, "auto"

    move-object v13, v0

    move-wide v15, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 191
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/b9;->z(Lcom/google/android/gms/measurement/internal/zzkv;Lcom/google/android/gms/measurement/internal/zzp;)V

    .line 192
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 193
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    new-instance v0, Landroid/os/Bundle;

    .line 194
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v6, 0x1

    .line 195
    invoke-virtual {v0, v5, v6, v7}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 196
    invoke-virtual {v0, v4, v6, v7}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v4, v22

    .line 197
    invoke-virtual {v0, v4, v6, v7}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 198
    iget-boolean v5, v2, Lcom/google/android/gms/measurement/internal/zzp;->C:Z

    if-eqz v5, :cond_25

    .line 199
    invoke-virtual {v0, v3, v6, v7}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 200
    :cond_25
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzat;

    new-instance v15, Lcom/google/android/gms/measurement/internal/zzar;

    invoke-direct {v15, v0}, Lcom/google/android/gms/measurement/internal/zzar;-><init>(Landroid/os/Bundle;)V

    const-string v14, "_v"

    const-string v16, "auto"

    move-object v13, v3

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzat;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzar;Ljava/lang/String;J)V

    .line 201
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/b9;->k(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    .line 202
    :goto_13
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    sget-object v5, Lcom/google/android/gms/measurement/internal/x2;->V:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v0, v3, v5}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v0

    if-nez v0, :cond_27

    new-instance v0, Landroid/os/Bundle;

    .line 203
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v5, 0x1

    .line 204
    invoke-virtual {v0, v4, v5, v6}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v3, "_fr"

    .line 205
    invoke-virtual {v0, v3, v5, v6}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v3, Lcom/google/android/gms/measurement/internal/zzat;

    const-string v14, "_e"

    new-instance v15, Lcom/google/android/gms/measurement/internal/zzar;

    .line 206
    invoke-direct {v15, v0}, Lcom/google/android/gms/measurement/internal/zzar;-><init>(Landroid/os/Bundle;)V

    const-string v16, "auto"

    move-object v13, v3

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzat;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzar;Ljava/lang/String;J)V

    .line 207
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/b9;->k(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    goto :goto_14

    .line 208
    :cond_26
    iget-boolean v0, v2, Lcom/google/android/gms/measurement/internal/zzp;->v:Z

    if-eqz v0, :cond_27

    new-instance v0, Landroid/os/Bundle;

    .line 209
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 210
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzat;

    new-instance v15, Lcom/google/android/gms/measurement/internal/zzar;

    invoke-direct {v15, v0}, Lcom/google/android/gms/measurement/internal/zzar;-><init>(Landroid/os/Bundle;)V

    const-string v14, "_cd"

    const-string v16, "auto"

    move-object v13, v3

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzat;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzar;Ljava/lang/String;J)V

    .line 211
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/b9;->k(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    .line 212
    :cond_27
    :goto_14
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 213
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 214
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 215
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 216
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :catchall_0
    move-exception v0

    .line 217
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 218
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 219
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 220
    throw v0

    :cond_28
    return-void
.end method

.method final q()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/b9;->q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/measurement/internal/b9;->q:I

    return-void
.end method

.method final r(Lcom/google/android/gms/measurement/internal/zzab;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/b9;->G(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/b9;->s(Lcom/google/android/gms/measurement/internal/zzab;Lcom/google/android/gms/measurement/internal/zzp;)V

    :cond_0
    return-void
.end method

.method final s(Lcom/google/android/gms/measurement/internal/zzab;Lcom/google/android/gms/measurement/internal/zzp;)V
    .locals 10

    .line 1
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 3
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 4
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-static {v0}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    .line 7
    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->M(Lcom/google/android/gms/measurement/internal/zzp;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 8
    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzp;->u:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 9
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->g0()V

    .line 11
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    .line 12
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 13
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 14
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/i;->U(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzab;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v3, "Removing conditional user property"

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 17
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 18
    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 19
    invoke-virtual {v1, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 20
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 21
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/i;->K(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v1, v0, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 22
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 23
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/i;->n(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzab;->x:Lcom/google/android/gms/measurement/internal/zzat;

    if-eqz v1, :cond_4

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzat;->o:Lcom/google/android/gms/measurement/internal/zzar;

    if-eqz v1, :cond_2

    .line 24
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzar;->z()Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    move-object v4, v1

    .line 25
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v1

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzab;->x:Lcom/google/android/gms/measurement/internal/zzat;

    .line 26
    invoke-static {v3}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/zzat;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzat;->n:Ljava/lang/String;

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzab;->x:Lcom/google/android/gms/measurement/internal/zzat;

    iget-wide v6, p1, Lcom/google/android/gms/measurement/internal/zzat;->q:J

    const/4 v8, 0x1

    const/4 v9, 0x1

    .line 27
    invoke-virtual/range {v1 .. v9}, Lcom/google/android/gms/measurement/internal/h9;->w0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/zzat;

    move-result-object p1

    .line 28
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/measurement/internal/zzat;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/b9;->B(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    goto :goto_1

    .line 29
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p2

    .line 30
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p2

    const-string v0, "Conditional user property doesn\'t exist"

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 31
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 32
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 33
    invoke-virtual {p2, v0, v1, p1}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 35
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 36
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 37
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 38
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :catchall_0
    move-exception p1

    .line 39
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 40
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 41
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 42
    throw p1

    .line 43
    :cond_5
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    return-void
.end method

.method final t(Lcom/google/android/gms/measurement/internal/zzkv;Lcom/google/android/gms/measurement/internal/zzp;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    .line 3
    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->M(Lcom/google/android/gms/measurement/internal/zzp;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzp;->u:Z

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    return-void

    .line 6
    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    const-string v1, "_npa"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/zzp;->E:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p1

    const-string v0, "Falling back to manifest metadata value for ad personalization"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/g3;->a(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/measurement/internal/zzkv;

    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v0

    invoke-interface {v0}, Lf3/d;->a()J

    move-result-wide v3

    const/4 v0, 0x1

    .line 9
    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzp;->E:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v0, v1, :cond_2

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x1

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v2, "_npa"

    const-string v6, "auto"

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/b9;->z(Lcom/google/android/gms/measurement/internal/zzkv;Lcom/google/android/gms/measurement/internal/zzp;)V

    return-void

    .line 11
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    .line 14
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Removing user property"

    .line 15
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 16
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->g0()V

    .line 18
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/measurement/mb;->b()Z

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/x2;->x0:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/x2;->z0:Lcom/google/android/gms/measurement/internal/w2;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "_id"

    .line 22
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 23
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 24
    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    .line 25
    invoke-static {v1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "_lair"

    .line 26
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/i;->n(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 27
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 28
    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    .line 29
    invoke-static {p2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    .line 30
    invoke-virtual {v0, p2, v1}, Lcom/google/android/gms/measurement/internal/i;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 31
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 32
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i;->p()V

    .line 33
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p2

    .line 34
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p2

    const-string v0, "User property removed"

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 35
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    .line 36
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 37
    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 39
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 40
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :catchall_0
    move-exception p1

    .line 41
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 42
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 43
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 44
    throw p1
.end method

.method final u(Lcom/google/android/gms/measurement/internal/zzp;)V
    .locals 7

    const-string v0, "app_id=?"

    .line 1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->x:Ljava/util/List;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->y:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->x:Ljava/util/List;

    .line 2
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 3
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 4
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 5
    invoke-static {v2}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    .line 8
    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v5, "apps"

    .line 9
    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    const-string v6, "events"

    .line 10
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "user_attributes"

    .line 11
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "conditional_properties"

    .line 12
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "raw_events"

    .line 13
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "raw_events_metadata"

    .line 14
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "queue"

    .line 15
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "audience_filter_values"

    .line 16
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "main_event_params"

    .line 17
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "default_event_params"

    .line 18
    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v5, v0

    if-lez v5, :cond_1

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    const-string v3, "Reset analytics data. app, records"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v2, v4}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 21
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 22
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Error resetting analytics data. appId, error"

    .line 24
    invoke-virtual {v1, v3, v2, v0}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    :cond_1
    :goto_0
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/zzp;->u:Z

    if-eqz v0, :cond_2

    .line 26
    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/b9;->p(Lcom/google/android/gms/measurement/internal/zzp;)V

    :cond_2
    return-void
.end method

.method protected final v()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->m()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 4
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/z7;->i:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s3;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->i:Lcom/google/android/gms/measurement/internal/z7;

    .line 5
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/z7;->i:Lcom/google/android/gms/measurement/internal/s3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->e()Lf3/d;

    move-result-object v1

    invoke-interface {v1}, Lf3/d;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/s3;->b(J)V

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/b9;->L()V

    return-void
.end method

.method final w(Lcom/google/android/gms/measurement/internal/zzab;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/b9;->G(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/b9;->x(Lcom/google/android/gms/measurement/internal/zzab;Lcom/google/android/gms/measurement/internal/zzp;)V

    :cond_0
    return-void
.end method

.method final x(Lcom/google/android/gms/measurement/internal/zzab;Lcom/google/android/gms/measurement/internal/zzp;)V
    .locals 10

    .line 1
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    .line 3
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 4
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 5
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-static {v0}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    .line 8
    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->M(Lcom/google/android/gms/measurement/internal/zzp;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 9
    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzp;->u:Z

    if-nez v0, :cond_1

    .line 10
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzab;

    .line 11
    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/zzab;-><init>(Lcom/google/android/gms/measurement/internal/zzab;)V

    const/4 p1, 0x0

    iput-boolean p1, v0, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 12
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i;->g0()V

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 14
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    .line 15
    invoke-static {v2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    .line 16
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/i;->U(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzab;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 18
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v2

    .line 19
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    const-string v3, "Updating a conditional user property with different origin. name, origin, origin (from DB)"

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 20
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 21
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    .line 22
    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    const/4 v2, 0x1

    if-eqz v1, :cond_3

    iget-boolean v3, v1, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    if-eqz v3, :cond_3

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzab;->q:J

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->q:J

    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzab;->u:J

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->u:J

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzab;->s:Ljava/lang/String;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->s:Ljava/lang/String;

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzab;->v:Lcom/google/android/gms/measurement/internal/zzat;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->v:Lcom/google/android/gms/measurement/internal/zzat;

    iput-boolean v2, v0, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    new-instance v2, Lcom/google/android/gms/measurement/internal/zzkv;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 23
    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    iget-wide v6, v4, Lcom/google/android/gms/measurement/internal/zzkv;->p:J

    .line 24
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object v8

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/zzkv;->s:Ljava/lang/String;

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    goto :goto_0

    .line 25
    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzab;->s:Ljava/lang/String;

    .line 26
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance p1, Lcom/google/android/gms/measurement/internal/zzkv;

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 27
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/zzab;->q:J

    .line 28
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object v7

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzkv;->s:Ljava/lang/String;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    iput-boolean v2, v0, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    const/4 p1, 0x1

    .line 29
    :cond_4
    :goto_0
    iget-boolean v1, v0, Lcom/google/android/gms/measurement/internal/zzab;->r:Z

    if-eqz v1, :cond_6

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    new-instance v9, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    .line 30
    invoke-static {v2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzab;->o:Ljava/lang/String;

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    iget-wide v6, v1, Lcom/google/android/gms/measurement/internal/zzkv;->p:J

    .line 31
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 32
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 33
    invoke-virtual {v1, v9}, Lcom/google/android/gms/measurement/internal/i;->z(Lcom/google/android/gms/measurement/internal/f9;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 34
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v2, "User property updated immediately"

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 36
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    .line 37
    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    .line 38
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    .line 39
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v1

    const-string v2, "(2)Too many active user properties, ignoring"

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 41
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    .line 42
    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    .line 43
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    if-eqz p1, :cond_6

    .line 44
    iget-object p1, v0, Lcom/google/android/gms/measurement/internal/zzab;->v:Lcom/google/android/gms/measurement/internal/zzat;

    if-eqz p1, :cond_6

    new-instance v1, Lcom/google/android/gms/measurement/internal/zzat;

    iget-wide v2, v0, Lcom/google/android/gms/measurement/internal/zzab;->q:J

    .line 45
    invoke-direct {v1, p1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzat;-><init>(Lcom/google/android/gms/measurement/internal/zzat;J)V

    .line 46
    invoke-virtual {p0, v1, p2}, Lcom/google/android/gms/measurement/internal/b9;->B(Lcom/google/android/gms/measurement/internal/zzat;Lcom/google/android/gms/measurement/internal/zzp;)V

    :cond_6
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 47
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 48
    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/i;->y(Lcom/google/android/gms/measurement/internal/zzab;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 49
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i3;->q()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p1

    const-string p2, "Conditional property added"

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 51
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 52
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 53
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object v0

    .line 54
    invoke-virtual {p1, p2, v1, v2, v0}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    .line 55
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p1

    const-string p2, "Too many conditional properties, ignoring"

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzab;->n:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 57
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 58
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzab;->p:Lcom/google/android/gms/measurement/internal/zzkv;

    .line 59
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object v0

    .line 60
    invoke-virtual {p1, p2, v1, v2, v0}, Lcom/google/android/gms/measurement/internal/g3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    :goto_2
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 62
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 63
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 64
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 65
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :catchall_0
    move-exception p1

    .line 66
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 67
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 68
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 69
    throw p1
.end method

.method final y(Ljava/lang/String;Lb4/a;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->A:Ljava/util/Map;

    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 4
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 5
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-static {p2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s8;->i()V

    new-instance v1, Landroid/content/ContentValues;

    .line 9
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "app_id"

    .line 10
    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p2}, Lb4/a;->i()Ljava/lang/String;

    move-result-object p2

    const-string v2, "consent_state"

    invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->R()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    const-string v2, "consent_settings"

    const/4 v3, 0x0

    const/4 v4, 0x5

    .line 13
    invoke-virtual {p2, v2, v3, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long p2, v1, v3

    if-nez p2, :cond_0

    iget-object p2, v0, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 14
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p2

    .line 15
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p2

    const-string v1, "Failed to insert/update consent setting (got -1). appId"

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 16
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m4;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/i3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Error storing consent setting. appId, error"

    .line 19
    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method final z(Lcom/google/android/gms/measurement/internal/zzkv;Lcom/google/android/gms/measurement/internal/zzp;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g5;->h()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g()V

    .line 3
    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->M(Lcom/google/android/gms/measurement/internal/zzp;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzp;->u:Z

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    return-void

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/h9;->n0(Ljava/lang/String;)I

    move-result v5

    const/4 v0, 0x1

    const/16 v1, 0x18

    const/4 v2, 0x0

    if-eqz v5, :cond_3

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v3

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    .line 9
    invoke-virtual {v3, v4, v1, v0}, Lcom/google/android/gms/measurement/internal/h9;->q(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v7

    .line 10
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    move v8, p1

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    .line 11
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/b9;->B:Lcom/google/android/gms/measurement/internal/g9;

    iget-object v4, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const-string v6, "_ev"

    .line 12
    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/h9;->A(Lcom/google/android/gms/measurement/internal/g9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    .line 13
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v3

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/measurement/internal/h9;->j0(Ljava/lang/String;Ljava/lang/Object;)I

    move-result v9

    if-eqz v9, :cond_6

    .line 14
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v3

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->T()Lcom/google/android/gms/measurement/internal/f;

    .line 16
    invoke-virtual {v3, v4, v1, v0}, Lcom/google/android/gms/measurement/internal/h9;->q(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v11

    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 18
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_4

    instance-of v0, p1, Ljava/lang/CharSequence;

    if-eqz v0, :cond_5

    .line 19
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    move v12, v2

    goto :goto_1

    :cond_5
    const/4 v12, 0x0

    .line 20
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v6

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/b9;->B:Lcom/google/android/gms/measurement/internal/g9;

    iget-object v8, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const-string v10, "_ev"

    .line 21
    invoke-virtual/range {v6 .. v12}, Lcom/google/android/gms/measurement/internal/h9;->A(Lcom/google/android/gms/measurement/internal/g9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    .line 22
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    .line 23
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzkv;->x()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/h9;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 24
    :cond_7
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    const-string v2, "_sid"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 25
    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/zzkv;->p:J

    iget-object v7, p1, Lcom/google/android/gms/measurement/internal/zzkv;->s:Ljava/lang/String;

    .line 26
    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    invoke-static {v1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 27
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    const-string v3, "_sno"

    .line 28
    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/measurement/internal/i;->Z(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    .line 29
    instance-of v6, v3, Ljava/lang/Long;

    if-eqz v6, :cond_8

    .line 30
    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_2

    :cond_8
    if-eqz v2, :cond_9

    .line 31
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->w()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    const-string v6, "Retrieved last session number from database does not contain a valid (long) value"

    .line 33
    invoke-virtual {v3, v6, v2}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 34
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    const-string v3, "_s"

    .line 35
    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/measurement/internal/i;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v1

    if-eqz v1, :cond_a

    iget-wide v1, v1, Lcom/google/android/gms/measurement/internal/o;->c:J

    .line 36
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object v3

    .line 37
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    .line 38
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v8, "Backfill the session number. Last used session number"

    invoke-virtual {v3, v8, v6}, Lcom/google/android/gms/measurement/internal/g3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_a
    const-wide/16 v1, 0x0

    .line 39
    :goto_2
    new-instance v8, Lcom/google/android/gms/measurement/internal/zzkv;

    const-wide/16 v9, 0x1

    add-long/2addr v1, v9

    .line 40
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v3, "_sno"

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzkv;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0, v8, p2}, Lcom/google/android/gms/measurement/internal/b9;->z(Lcom/google/android/gms/measurement/internal/zzkv;Lcom/google/android/gms/measurement/internal/zzp;)V

    :cond_b
    new-instance v1, Lcom/google/android/gms/measurement/internal/f9;

    .line 42
    iget-object v2, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    .line 43
    invoke-static {v2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzkv;->s:Ljava/lang/String;

    .line 44
    invoke-static {v2}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzkv;->o:Ljava/lang/String;

    iget-wide v7, p1, Lcom/google/android/gms/measurement/internal/zzkv;->p:J

    move-object v3, v1

    move-object v9, v0

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 45
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i3;->v()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 47
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    .line 48
    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Setting user property"

    .line 49
    invoke-virtual {p1, v3, v2, v0}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 50
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 51
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->g0()V

    .line 52
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/mb;->b()Z

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/measurement/internal/x2;->x0:Lcom/google/android/gms/measurement/internal/w2;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/measurement/internal/f;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)Z

    move-result p1

    if-eqz p1, :cond_c

    const-string p1, "_id"

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 54
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 55
    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const-string v2, "_lair"

    .line 56
    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/measurement/internal/i;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    :cond_c
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/b9;->R(Lcom/google/android/gms/measurement/internal/zzp;)Lcom/google/android/gms/measurement/internal/r4;

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 58
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 59
    invoke-virtual {p1, v1}, Lcom/google/android/gms/measurement/internal/i;->z(Lcom/google/android/gms/measurement/internal/f9;)Z

    move-result p1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 60
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 61
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->p()V

    if-nez p1, :cond_d

    .line 62
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->d()Lcom/google/android/gms/measurement/internal/i3;

    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i3;->r()Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p1

    const-string v0, "Too many unique user properties are set. Ignoring user property"

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b9;->l:Lcom/google/android/gms/measurement/internal/m4;

    .line 64
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->D()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    .line 65
    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/d3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    .line 66
    invoke-virtual {p1, v0, v2, v1}, Lcom/google/android/gms/measurement/internal/g3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/b9;->g0()Lcom/google/android/gms/measurement/internal/h9;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/b9;->B:Lcom/google/android/gms/measurement/internal/g9;

    iget-object v5, p2, Lcom/google/android/gms/measurement/internal/zzp;->n:Ljava/lang/String;

    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 68
    invoke-virtual/range {v3 .. v9}, Lcom/google/android/gms/measurement/internal/h9;->A(Lcom/google/android/gms/measurement/internal/g9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_d
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 69
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 70
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    return-void

    :catchall_0
    move-exception p1

    .line 71
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/b9;->c:Lcom/google/android/gms/measurement/internal/i;

    .line 72
    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/b9;->Q(Lcom/google/android/gms/measurement/internal/s8;)Lcom/google/android/gms/measurement/internal/s8;

    .line 73
    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/i;->i0()V

    .line 74
    throw p1
.end method
