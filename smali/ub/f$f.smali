.class Lub/f$f;
.super Lpb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/f;->o0(ILac/e;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:I

.field final synthetic p:Lac/c;

.field final synthetic q:I

.field final synthetic r:Z

.field final synthetic s:Lub/f;


# direct methods
.method varargs constructor <init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;ILac/c;IZ)V
    .locals 0

    iput-object p1, p0, Lub/f$f;->s:Lub/f;

    iput p4, p0, Lub/f$f;->o:I

    iput-object p5, p0, Lub/f$f;->p:Lac/c;

    iput p6, p0, Lub/f$f;->q:I

    iput-boolean p7, p0, Lub/f$f;->r:Z

    invoke-direct {p0, p2, p3}, Lpb/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lub/f$f;->s:Lub/f;

    iget-object v0, v0, Lub/f;->w:Lub/l;

    iget v1, p0, Lub/f$f;->o:I

    iget-object v2, p0, Lub/f$f;->p:Lac/c;

    iget v3, p0, Lub/f$f;->q:I

    iget-boolean v4, p0, Lub/f$f;->r:Z

    invoke-interface {v0, v1, v2, v3, v4}, Lub/l;->d(ILac/e;IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lub/f$f;->s:Lub/f;

    iget-object v1, v1, Lub/f;->J:Lub/j;

    iget v2, p0, Lub/f$f;->o:I

    sget-object v3, Lub/b;->t:Lub/b;

    invoke-virtual {v1, v2, v3}, Lub/j;->X(ILub/b;)V

    :cond_0
    if-nez v0, :cond_1

    .line 3
    iget-boolean v0, p0, Lub/f$f;->r:Z

    if-eqz v0, :cond_2

    .line 4
    :cond_1
    iget-object v0, p0, Lub/f$f;->s:Lub/f;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    :try_start_1
    iget-object v1, p0, Lub/f$f;->s:Lub/f;

    iget-object v1, v1, Lub/f;->L:Ljava/util/Set;

    iget v2, p0, Lub/f$f;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 6
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method
