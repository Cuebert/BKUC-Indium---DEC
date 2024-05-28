.class public Ln9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ln9/b;

.field private static c:Lob/d0;

.field private static d:Lo9/e;

.field private static e:Ln9/f;

.field private static f:Ln9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln9/a;

    invoke-direct {v0}, Ln9/a;-><init>()V

    sput-object v0, Ln9/g;->e:Ln9/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ln9/i;

    invoke-direct {v0}, Ln9/i;-><init>()V

    .line 2
    invoke-static {}, Lx9/a;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ln9/i;->k(I)Ln9/i;

    move-result-object v0

    .line 3
    invoke-static {p0}, Lx9/a;->e(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln9/i;->m(Landroid/graphics/Point;)Ln9/i;

    move-result-object v0

    .line 4
    invoke-static {p0}, Lx9/a;->d(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln9/i;->g(Landroid/graphics/Point;)Ln9/i;

    move-result-object v0

    .line 5
    invoke-static {p0}, Lx9/a;->c(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p0

    invoke-virtual {v0, p0}, Ln9/i;->f(Landroid/graphics/Point;)Ln9/i;

    move-result-object p0

    .line 6
    invoke-static {p5}, Lx9/a;->a(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ln9/i;->d(Ljava/lang/String;)Ln9/i;

    move-result-object p0

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 7
    invoke-virtual {p0, v0}, Ln9/i;->a(Ljava/lang/String;)Ln9/i;

    move-result-object p0

    .line 8
    invoke-virtual {p0, p2}, Ln9/i;->o(Ljava/lang/String;)Ln9/i;

    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Ln9/i;->n(Ljava/lang/String;)Ln9/i;

    move-result-object p0

    .line 10
    invoke-virtual {p0, p3}, Ln9/i;->e(Ljava/lang/String;)Ln9/i;

    move-result-object p0

    .line 11
    invoke-virtual {p0, p4}, Ln9/i;->b(Ljava/lang/String;)Ln9/i;

    move-result-object p0

    .line 12
    invoke-virtual {p0, p5}, Ln9/i;->j(Z)Ln9/i;

    move-result-object p0

    .line 13
    invoke-virtual {p0, p6}, Ln9/i;->i(Z)Ln9/i;

    move-result-object p0

    .line 14
    invoke-virtual {p0, p7}, Ln9/i;->h(Z)Ln9/i;

    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ln9/i;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b()Lob/d0;
    .locals 2

    .line 1
    sget-object v0, Ln9/g;->c:Lob/d0;

    if-nez v0, :cond_2

    .line 2
    const-class v0, Ln9/g;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Ln9/g;->c:Lob/d0;

    if-nez v1, :cond_1

    .line 4
    sget-object v1, Ln9/g;->d:Lo9/e;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lo9/c;

    invoke-direct {v1}, Lo9/c;-><init>()V

    sput-object v1, Ln9/g;->d:Lo9/e;

    .line 6
    :cond_0
    sget-object v1, Ln9/g;->d:Lo9/e;

    invoke-interface {v1}, Lo9/e;->a()Lob/d0;

    move-result-object v1

    sput-object v1, Ln9/g;->c:Lob/d0;

    .line 7
    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 8
    :cond_2
    :goto_0
    sget-object v0, Ln9/g;->c:Lob/d0;

    return-object v0
.end method

.method public static c()Ln9/b;
    .locals 1

    sget-object v0, Ln9/g;->b:Ln9/b;

    return-object v0
.end method

.method public static d()Ln9/d;
    .locals 2

    .line 1
    sget-object v0, Ln9/g;->f:Ln9/d;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Ln9/g;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Ln9/g;->f:Ln9/d;

    if-nez v1, :cond_0

    .line 4
    sget-object v1, Ln9/g;->e:Ln9/f;

    invoke-interface {v1}, Ln9/f;->a()Ln9/d;

    move-result-object v1

    sput-object v1, Ln9/g;->f:Ln9/d;

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
    sget-object v0, Ln9/g;->f:Ln9/d;

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    sget-object v0, Ln9/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static f(Lo9/a;)V
    .locals 0

    invoke-static {p0}, Lo9/j;->b(Lo9/a;)V

    return-void
.end method

.method public static g(Ln9/b;)V
    .locals 0

    sput-object p0, Ln9/g;->b:Ln9/b;

    return-void
.end method

.method public static h(Lo9/e;)V
    .locals 0

    sput-object p0, Ln9/g;->d:Lo9/e;

    return-void
.end method

.method public static i(Ln9/f;)V
    .locals 1

    .line 1
    sput-object p0, Ln9/g;->e:Ln9/f;

    .line 2
    const-class p0, Ln9/g;

    monitor-enter p0

    const/4 v0, 0x0

    .line 3
    :try_start_0
    sput-object v0, Ln9/g;->f:Ln9/d;

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static j(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Ln9/g;->a:Ljava/lang/String;

    return-void
.end method
