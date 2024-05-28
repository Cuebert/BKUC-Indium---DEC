.class public Lh7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh7/b$a;
    }
.end annotation


# static fields
.field private static a:Lo9/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    sput-object v0, Lh7/b;->a:Lo9/i;

    .line 2
    invoke-static {v0}, Ljava/net/CookieHandler;->setDefault(Ljava/net/CookieHandler;)V

    return-void
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;
    .locals 1

    .line 1
    invoke-static {}, Ln9/g;->b()Lob/d0;

    move-result-object v0

    .line 2
    invoke-static {v0, p0, p1, p2, p3}, Lh7/b;->d(Lob/d0;Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;

    move-result-object p0

    return-object p0
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;II)Lh7/j;
    .locals 3

    .line 1
    invoke-static {}, Ln9/g;->b()Lob/d0;

    move-result-object v0

    if-gez p4, :cond_0

    if-ltz p5, :cond_3

    .line 2
    :cond_0
    invoke-virtual {v0}, Lob/d0;->w()Lob/d0$b;

    move-result-object v0

    if-ltz p4, :cond_1

    int-to-long v1, p4

    .line 3
    sget-object p4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p4}, Lob/d0$b;->e(JLjava/util/concurrent/TimeUnit;)Lob/d0$b;

    :cond_1
    if-ltz p5, :cond_2

    int-to-long p4, p5

    .line 4
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p4, p5, v1}, Lob/d0$b;->i(JLjava/util/concurrent/TimeUnit;)Lob/d0$b;

    .line 5
    :cond_2
    invoke-virtual {v0}, Lob/d0$b;->c()Lob/d0;

    move-result-object v0

    .line 6
    :cond_3
    invoke-static {v0, p0, p1, p2, p3}, Lh7/b;->d(Lob/d0;Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;

    move-result-object p0

    return-object p0
.end method

.method private static d(Lob/d0;Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;
    .locals 10

    const-string v0, ", exception = "

    const-string v1, "rbx.httpagent"

    .line 1
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    if-eqz p3, :cond_1

    const/4 v2, 0x0

    .line 2
    :goto_0
    array-length v3, p3

    if-ge v2, v3, :cond_1

    .line 3
    aget-object v3, p3, v2

    .line 4
    iget-object v4, v3, Lh7/b$a;->a:Ljava/lang/String;

    if-eqz v4, :cond_0

    iget-object v3, v3, Lh7/b$a;->b:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 5
    invoke-virtual {v6, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_1
    new-instance p3, Lh7/j;

    invoke-direct {p3}, Lh7/j;-><init>()V

    if-nez p2, :cond_2

    .line 7
    sget-object v2, Lh7/j$a;->n:Lh7/j$a;

    goto :goto_1

    :cond_2
    sget-object v2, Lh7/j$a;->o:Lh7/j$a;

    :goto_1
    iput-object v2, p3, Lh7/j;->a:Lh7/j$a;

    .line 8
    iput-object p1, p3, Lh7/j;->c:Ljava/lang/String;

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 10
    :try_start_0
    new-instance v2, Lo9/f;

    invoke-direct {v2}, Lo9/f;-><init>()V

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v7, p4

    invoke-virtual/range {v2 .. v7}, Lo9/f;->a(Lob/d0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lob/i0;

    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lob/i0;->e()I

    move-result p2

    iput p2, p3, Lh7/j;->e:I

    .line 12
    invoke-virtual {p0}, Lob/i0;->b()Lob/j0;

    move-result-object p2

    invoke-virtual {p2}, Lob/j0;->T()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Lh7/j;->e(Ljava/lang/String;)V

    const-string p2, "Last-Modified"

    const-string p4, ""

    .line 13
    invoke-virtual {p0, p2, p4}, Lob/i0;->z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Lh7/j;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string p0, "null url in newCall()"

    .line 14
    invoke-static {v1, p0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catch_1
    move-exception p0

    .line 15
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "IOException initial newCall(): url = "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catch_2
    move-exception p0

    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "SSLHandshakeException initial newCall(): url = "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x1

    .line 17
    iput-boolean p0, p3, Lh7/j;->g:Z

    .line 18
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    sub-long/2addr p0, v8

    iput-wide p0, p3, Lh7/j;->f:J

    return-object p3
.end method

.method public static e(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lh7/b;->a:Lo9/i;

    if-nez v0, :cond_1

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->q0()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 4
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/webkit/CookieSyncManager;->startSync()V

    .line 5
    :cond_0
    invoke-static {}, Lo9/i;->e()Lo9/i;

    move-result-object p0

    sput-object p0, Lh7/b;->a:Lo9/i;

    .line 6
    invoke-static {p0}, Ljava/net/CookieHandler;->setDefault(Ljava/net/CookieHandler;)V

    :cond_1
    return-void
.end method

.method public static f(Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p0

    invoke-interface {p0}, Lc7/e;->q0()Z

    move-result p0

    if-nez p0, :cond_0

    .line 2
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/webkit/CookieSyncManager;->stopSync()V

    :cond_0
    return-void
.end method

.method public static g()V
    .locals 1

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->q0()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->startSync()V

    :cond_0
    return-void
.end method

.method public static h()V
    .locals 1

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->q0()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V

    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;)Lh7/j;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lh7/b;->k(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lh7/b;->k(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lh7/b;->b(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;II)Lh7/j;
    .locals 0

    invoke-static/range {p0 .. p5}, Lh7/b;->c(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;II)Lh7/j;

    move-result-object p0

    return-object p0
.end method
