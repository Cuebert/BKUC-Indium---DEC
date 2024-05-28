.class public La2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La2/s;


# static fields
.field private static volatile e:La2/u;


# instance fields
.field private final a:Lk2/a;

.field private final b:Lk2/a;

.field private final c:Lg2/e;

.field private final d:Lh2/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lk2/a;Lk2/a;Lg2/e;Lh2/r;Lh2/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La2/t;->a:Lk2/a;

    .line 3
    iput-object p2, p0, La2/t;->b:Lk2/a;

    .line 4
    iput-object p3, p0, La2/t;->c:Lg2/e;

    .line 5
    iput-object p4, p0, La2/t;->d:Lh2/r;

    .line 6
    invoke-virtual {p5}, Lh2/v;->c()V

    return-void
.end method

.method private b(La2/n;)La2/i;
    .locals 4

    .line 1
    invoke-static {}, La2/i;->a()La2/i$a;

    move-result-object v0

    iget-object v1, p0, La2/t;->a:Lk2/a;

    .line 2
    invoke-interface {v1}, Lk2/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, La2/i$a;->i(J)La2/i$a;

    move-result-object v0

    iget-object v1, p0, La2/t;->b:Lk2/a;

    .line 3
    invoke-interface {v1}, Lk2/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, La2/i$a;->k(J)La2/i$a;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, La2/n;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La2/i$a;->j(Ljava/lang/String;)La2/i$a;

    move-result-object v0

    new-instance v1, La2/h;

    .line 5
    invoke-virtual {p1}, La2/n;->b()Ly1/b;

    move-result-object v2

    invoke-virtual {p1}, La2/n;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, La2/h;-><init>(Ly1/b;[B)V

    invoke-virtual {v0, v1}, La2/i$a;->h(La2/h;)La2/i$a;

    move-result-object v0

    .line 6
    invoke-virtual {p1}, La2/n;->c()Ly1/c;

    move-result-object p1

    invoke-virtual {p1}, Ly1/c;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, La2/i$a;->g(Ljava/lang/Integer;)La2/i$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, La2/i$a;->d()La2/i;

    move-result-object p1

    return-object p1
.end method

.method public static c()La2/t;
    .locals 2

    .line 1
    sget-object v0, La2/t;->e:La2/u;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, La2/u;->c()La2/t;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static d(La2/f;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/f;",
            ")",
            "Ljava/util/Set<",
            "Ly1/b;",
            ">;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, La2/g;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, La2/g;

    .line 3
    invoke-interface {p0}, La2/g;->a()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    .line 4
    invoke-static {p0}, Ly1/b;->b(Ljava/lang/String;)Ly1/b;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, La2/t;->e:La2/u;

    if-nez v0, :cond_1

    .line 2
    const-class v0, La2/t;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, La2/t;->e:La2/u;

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, La2/e;->e()La2/u$a;

    move-result-object v1

    .line 5
    invoke-interface {v1, p0}, La2/u$a;->b(Landroid/content/Context;)La2/u$a;

    move-result-object p0

    .line 6
    invoke-interface {p0}, La2/u$a;->a()La2/u;

    move-result-object p0

    sput-object p0, La2/t;->e:La2/u;

    .line 7
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
    return-void
.end method


# virtual methods
.method public a(La2/n;Ly1/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, La2/t;->c:Lg2/e;

    .line 2
    invoke-virtual {p1}, La2/n;->f()La2/o;

    move-result-object v1

    invoke-virtual {p1}, La2/n;->c()Ly1/c;

    move-result-object v2

    invoke-virtual {v2}, Ly1/c;->c()Ly1/d;

    move-result-object v2

    invoke-virtual {v1, v2}, La2/o;->f(Ly1/d;)La2/o;

    move-result-object v1

    .line 3
    invoke-direct {p0, p1}, La2/t;->b(La2/n;)La2/i;

    move-result-object p1

    .line 4
    invoke-interface {v0, v1, p1, p2}, Lg2/e;->a(La2/o;La2/i;Ly1/h;)V

    return-void
.end method

.method public e()Lh2/r;
    .locals 1

    iget-object v0, p0, La2/t;->d:Lh2/r;

    return-object v0
.end method

.method public g(La2/f;)Ly1/g;
    .locals 4

    .line 1
    new-instance v0, La2/p;

    .line 2
    invoke-static {p1}, La2/t;->d(La2/f;)Ljava/util/Set;

    move-result-object v1

    .line 3
    invoke-static {}, La2/o;->a()La2/o$a;

    move-result-object v2

    .line 4
    invoke-interface {p1}, La2/f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, La2/o$a;->b(Ljava/lang/String;)La2/o$a;

    move-result-object v2

    .line 5
    invoke-interface {p1}, La2/f;->getExtras()[B

    move-result-object p1

    invoke-virtual {v2, p1}, La2/o$a;->c([B)La2/o$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, La2/o$a;->a()La2/o;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, La2/p;-><init>(Ljava/util/Set;La2/o;La2/s;)V

    return-object v0
.end method
