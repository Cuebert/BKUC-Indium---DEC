.class public Ln6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln6/d$a;
    }
.end annotation


# static fields
.field private static j:Ln6/d;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private d:Ln6/d$a;

.field private e:Z

.field private f:J

.field private g:J

.field private final h:Lc9/r;

.field private final i:Lx7/e;


# direct methods
.method constructor <init>(Lx7/e;Lc9/r;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "app_start_loadtime"

    .line 2
    iput-object v0, p0, Ln6/d;->a:Ljava/lang/String;

    const-string v0, "startup_to_lua"

    .line 3
    iput-object v0, p0, Ln6/d;->b:Ljava/lang/String;

    const-string v0, "startup_to_web"

    .line 4
    iput-object v0, p0, Ln6/d;->c:Ljava/lang/String;

    .line 5
    sget-object v0, Ln6/d$a;->n:Ln6/d$a;

    iput-object v0, p0, Ln6/d;->d:Ln6/d$a;

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Ln6/d;->e:Z

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Ln6/d;->f:J

    .line 8
    iput-wide v0, p0, Ln6/d;->g:J

    const-string v0, "LaunchTimeReporter"

    const-string v1, "[Constructor]: ENTER."

    .line 9
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    iput-object p1, p0, Ln6/d;->i:Lx7/e;

    .line 11
    iput-object p2, p0, Ln6/d;->h:Lc9/r;

    return-void
.end method

.method private a(J)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "target"

    const-string v3, "mobile"

    invoke-direct {v1, v2, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "event_type"

    const-string v3, "app_start_loadtime"

    invoke-direct {v1, v2, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "startup_state"

    const-string v3, "cold"

    invoke-direct {v1, v2, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    const-string p2, "startup_time"

    invoke-direct {v1, p2, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static b()Ln6/d;
    .locals 4

    .line 1
    sget-object v0, Ln6/d;->j:Ln6/d;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Ln6/d;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Ln6/d;->j:Ln6/d;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Ln6/d;

    .line 5
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v2

    new-instance v3, Lc9/s;

    invoke-direct {v3}, Lc9/s;-><init>()V

    invoke-direct {v1, v2, v3}, Ln6/d;-><init>(Lx7/e;Lc9/r;)V

    sput-object v1, Ln6/d;->j:Ln6/d;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_0
    sget-object v0, Ln6/d;->j:Ln6/d;

    return-object v0
.end method


# virtual methods
.method public c(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Ln6/d;->d:Ln6/d$a;

    sget-object v1, Ln6/d$a;->v:Ln6/d$a;

    if-eq v0, v1, :cond_0

    sget-object v1, Ln6/d$a;->p:Ln6/d$a;

    if-eq v0, v1, :cond_0

    sget-object v1, Ln6/d$a;->q:Ln6/d$a;

    if-eq v0, v1, :cond_0

    sget-object v1, Ln6/d$a;->s:Ln6/d$a;

    if-ne v0, v1, :cond_4

    .line 2
    :cond_0
    sget-object v0, Ln6/d$a;->w:Ln6/d$a;

    iput-object v0, p0, Ln6/d;->d:Ln6/d$a;

    .line 3
    iget-boolean v0, p0, Ln6/d;->e:Z

    if-eqz v0, :cond_1

    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Ln6/d;->h:Lc9/r;

    invoke-interface {v0}, Lc9/r;->b()J

    move-result-wide v0

    iget-wide v2, p0, Ln6/d;->f:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_2

    return-void

    .line 5
    :cond_2
    iget-object v2, p0, Ln6/d;->i:Lx7/e;

    const-string v3, "Android-AppStartup-Launch-To-Home-Time"

    invoke-virtual {v2, v3, v0, v1}, Lx7/e;->B(Ljava/lang/String;J)V

    .line 6
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v2

    const-string v3, "android_launch_time_reporter"

    invoke-virtual {v2, v3, v0, v1}, Lma/a;->c(Ljava/lang/String;J)V

    .line 7
    invoke-direct {p0, v0, v1}, Ln6/d;->a(J)Ljava/util/List;

    move-result-object v0

    if-eqz p1, :cond_3

    const-string p1, "startup_to_lua"

    goto :goto_0

    :cond_3
    const-string p1, "startup_to_web"

    :goto_0
    const-string v1, "app_start_loadtime"

    .line 8
    invoke-static {v1, p1, v0}, Lcom/roblox/client/f0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    :cond_4
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln6/d;->d:Ln6/d$a;

    sget-object v1, Ln6/d$a;->u:Ln6/d$a;

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Ln6/d$a;->v:Ln6/d$a;

    iput-object v0, p0, Ln6/d;->d:Ln6/d$a;

    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln6/d;->d:Ln6/d$a;

    sget-object v1, Ln6/d$a;->p:Ln6/d$a;

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_0

    .line 2
    sget-object p1, Ln6/d$a;->q:Ln6/d$a;

    goto :goto_0

    .line 3
    :cond_0
    sget-object p1, Ln6/d$a;->r:Ln6/d$a;

    :goto_0
    iput-object p1, p0, Ln6/d;->d:Ln6/d$a;

    .line 4
    iget-object p1, p0, Ln6/d;->h:Lc9/r;

    invoke-interface {p1}, Lc9/r;->b()J

    move-result-wide v0

    iput-wide v0, p0, Ln6/d;->g:J

    :cond_1
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln6/d;->d:Ln6/d$a;

    sget-object v1, Ln6/d$a;->n:Ln6/d$a;

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Ln6/d$a;->p:Ln6/d$a;

    iput-object v0, p0, Ln6/d;->d:Ln6/d$a;

    .line 3
    iget-object v0, p0, Ln6/d;->h:Lc9/r;

    invoke-interface {v0}, Lc9/r;->b()J

    move-result-wide v0

    iput-wide v0, p0, Ln6/d;->f:J

    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln6/d;->e:Z

    return-void
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln6/d;->d:Ln6/d$a;

    sget-object v1, Ln6/d$a;->s:Ln6/d$a;

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Ln6/d$a;->u:Ln6/d$a;

    iput-object v0, p0, Ln6/d;->d:Ln6/d$a;

    :cond_0
    return-void
.end method

.method public i(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln6/d;->d:Ln6/d$a;

    sget-object v1, Ln6/d$a;->q:Ln6/d$a;

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Ln6/d$a;->s:Ln6/d$a;

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Ln6/d$a;->t:Ln6/d$a;

    :goto_0
    iput-object v0, p0, Ln6/d;->d:Ln6/d$a;

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Ln6/d;->h:Lc9/r;

    invoke-interface {p1}, Lc9/r;->b()J

    :cond_1
    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln6/d;->d:Ln6/d$a;

    sget-object v1, Ln6/d$a;->v:Ln6/d$a;

    if-eq v0, v1, :cond_0

    .line 2
    sget-object v0, Ln6/d$a;->o:Ln6/d$a;

    iput-object v0, p0, Ln6/d;->d:Ln6/d$a;

    :cond_0
    return-void
.end method
