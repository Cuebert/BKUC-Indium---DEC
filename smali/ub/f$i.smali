.class final Lub/f$i;
.super Lpb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "i"
.end annotation


# instance fields
.field final synthetic o:Lub/f;


# direct methods
.method constructor <init>(Lub/f;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lub/f$i;->o:Lub/f;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lub/f;->q:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s ping"

    invoke-direct {p0, p1, v0}, Lpb/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 8

    .line 1
    iget-object v0, p0, Lub/f$i;->o:Lub/f;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lub/f$i;->o:Lub/f;

    invoke-static {v1}, Lub/f;->c(Lub/f;)J

    move-result-wide v1

    iget-object v3, p0, Lub/f$i;->o:Lub/f;

    invoke-static {v3}, Lub/f;->i(Lub/f;)J

    move-result-wide v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    cmp-long v7, v1, v3

    if-gez v7, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lub/f$i;->o:Lub/f;

    invoke-static {v1}, Lub/f;->l(Lub/f;)J

    const/4 v1, 0x0

    .line 4
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 5
    iget-object v0, p0, Lub/f$i;->o:Lub/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lub/f;->b(Lub/f;Ljava/io/IOException;)V

    goto :goto_1

    .line 6
    :cond_1
    iget-object v0, p0, Lub/f$i;->o:Lub/f;

    invoke-virtual {v0, v6, v5, v6}, Lub/f;->C0(ZII)V

    :goto_1
    return-void

    :catchall_0
    move-exception v1

    .line 7
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
