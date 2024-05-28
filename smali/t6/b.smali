.class public Lt6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lt6/b;


# instance fields
.field private a:Lh0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/d<",
            "Lt6/a;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field private c:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lt6/b;->c:Ljava/lang/Object;

    .line 3
    new-instance v0, Lh0/d;

    invoke-direct {v0}, Lh0/d;-><init>()V

    iput-object v0, p0, Lt6/b;->a:Lh0/d;

    return-void
.end method

.method public static b()Lt6/b;
    .locals 2

    .line 1
    sget-object v0, Lt6/b;->d:Lt6/b;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lt6/b;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lt6/b;->d:Lt6/b;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lt6/b;

    invoke-direct {v1}, Lt6/b;-><init>()V

    sput-object v1, Lt6/b;->d:Lt6/b;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lt6/b;->d:Lt6/b;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/b;->a:Lh0/d;

    invoke-virtual {v0}, Lh0/d;->d()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lt6/b;->b:I

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lt6/b;->b:I

    return v0
.end method

.method public d(J)Lt6/a;
    .locals 1

    iget-object v0, p0, Lt6/b;->a:Lh0/d;

    invoke-virtual {v0, p1, p2}, Lh0/d;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/a;

    return-object p1
.end method

.method public e(Lt6/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lt6/b;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lt6/b;->a:Lh0/d;

    invoke-virtual {p1}, Lt6/a;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lh0/d;->h(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/a;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1, p1}, Lt6/a;->i(Lt6/a;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lt6/b;->a:Lh0/d;

    invoke-virtual {p1}, Lt6/a;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3, p1}, Lh0/d;->n(JLjava/lang/Object;)V

    .line 5
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
