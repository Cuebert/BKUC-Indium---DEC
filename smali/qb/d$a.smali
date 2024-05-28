.class Lqb/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqb/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lqb/d;


# direct methods
.method constructor <init>(Lqb/d;)V
    .locals 0

    iput-object p1, p0, Lqb/d$a;->n:Lqb/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lqb/d$a;->n:Lqb/d;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lqb/d$a;->n:Lqb/d;

    iget-boolean v2, v1, Lqb/d;->A:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-boolean v5, v1, Lqb/d;->B:Z

    or-int/2addr v2, v5

    if-eqz v2, :cond_1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 4
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Lqb/d;->n0()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 5
    :catch_0
    :try_start_2
    iget-object v1, p0, Lqb/d$a;->n:Lqb/d;

    iput-boolean v4, v1, Lqb/d;->C:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 6
    :goto_1
    :try_start_3
    iget-object v1, p0, Lqb/d$a;->n:Lqb/d;

    invoke-virtual {v1}, Lqb/d;->W()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v1, p0, Lqb/d$a;->n:Lqb/d;

    invoke-virtual {v1}, Lqb/d;->k0()V

    .line 8
    iget-object v1, p0, Lqb/d$a;->n:Lqb/d;

    iput v3, v1, Lqb/d;->y:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    .line 9
    :catch_1
    :try_start_4
    iget-object v1, p0, Lqb/d$a;->n:Lqb/d;

    iput-boolean v4, v1, Lqb/d;->D:Z

    .line 10
    invoke-static {}, Lac/l;->b()Lac/s;

    move-result-object v2

    invoke-static {v2}, Lac/l;->c(Lac/s;)Lac/d;

    move-result-object v2

    iput-object v2, v1, Lqb/d;->w:Lac/d;

    .line 11
    :cond_2
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method
