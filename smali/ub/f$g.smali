.class Lub/f$g;
.super Lpb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/f;->s0(ILub/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:I

.field final synthetic p:Lub/b;

.field final synthetic q:Lub/f;


# direct methods
.method varargs constructor <init>(Lub/f;Ljava/lang/String;[Ljava/lang/Object;ILub/b;)V
    .locals 0

    iput-object p1, p0, Lub/f$g;->q:Lub/f;

    iput p4, p0, Lub/f$g;->o:I

    iput-object p5, p0, Lub/f$g;->p:Lub/b;

    invoke-direct {p0, p2, p3}, Lpb/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lub/f$g;->q:Lub/f;

    iget-object v0, v0, Lub/f;->w:Lub/l;

    iget v1, p0, Lub/f$g;->o:I

    iget-object v2, p0, Lub/f$g;->p:Lub/b;

    invoke-interface {v0, v1, v2}, Lub/l;->c(ILub/b;)V

    .line 2
    iget-object v0, p0, Lub/f$g;->q:Lub/f;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lub/f$g;->q:Lub/f;

    iget-object v1, v1, Lub/f;->L:Ljava/util/Set;

    iget v2, p0, Lub/f$g;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
