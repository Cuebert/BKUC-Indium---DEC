.class public Ln7/b;
.super Lw6/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln7/b$b;,
        Ln7/b$d;,
        Ln7/b$c;
    }
.end annotation


# instance fields
.field private f:Ln7/b$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lw6/b;-><init>()V

    return-void
.end method

.method public static d()Ln7/b;
    .locals 1

    sget-object v0, Ln7/b$c;->a:Ln7/b;

    return-object v0
.end method

.method static synthetic e(Ln7/b;)Ln7/b$d;
    .locals 0

    iget-object p0, p0, Ln7/b;->f:Ln7/b$d;

    return-object p0
.end method

.method static synthetic f(Ln7/b;Ln7/b$d;)Ln7/b$d;
    .locals 0

    iput-object p1, p0, Ln7/b;->f:Ln7/b$d;

    return-object p1
.end method


# virtual methods
.method public g()Ln7/b$d;
    .locals 6

    const-string v0, "InfluxV2Queue"

    .line 1
    iget-object v1, p0, Ln7/b;->f:Ln7/b$d;

    if-eqz v1, :cond_0

    iget-object v2, v1, Ln7/b$d;->c:Ljava/net/Socket;

    if-eqz v2, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->A0()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->c1()I

    move-result v2

    .line 4
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v3

    invoke-interface {v3}, Lc7/e;->Z0()I

    move-result v3

    .line 5
    new-instance v4, Ln7/b$d;

    invoke-direct {v4, p0}, Ln7/b$d;-><init>(Ln7/b;)V

    iput-object v4, p0, Ln7/b;->f:Ln7/b$d;

    .line 6
    iput-object v1, v4, Ln7/b$d;->a:Ljava/lang/String;

    .line 7
    iput v2, v4, Ln7/b$d;->b:I

    .line 8
    iput v3, v4, Ln7/b$d;->d:I

    .line 9
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getSocketInfo: Create a socket to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "..."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    invoke-static {v1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v1

    .line 11
    new-instance v3, Ljava/net/Socket;

    invoke-direct {v3, v1, v2}, Ljava/net/Socket;-><init>(Ljava/net/InetAddress;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    iget-object v1, p0, Ln7/b;->f:Ln7/b$d;

    iput-object v3, v1, Ln7/b$d;->c:Ljava/net/Socket;

    .line 13
    iget v1, v1, Ln7/b$d;->d:I

    if-lez v1, :cond_1

    .line 14
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Schedule a special close-connection item with delay="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ln7/b;->f:Ln7/b$d;

    iget v3, v3, Ln7/b$d;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "s..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    new-instance v0, Ln7/b$a;

    invoke-direct {v0, p0}, Ln7/b$a;-><init>(Ln7/b;)V

    iget-object v2, p0, Ln7/b;->f:Ln7/b$d;

    iget v2, v2, Ln7/b$d;->d:I

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long v2, v2, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 17
    :cond_1
    iget-object v0, p0, Ln7/b;->f:Ln7/b$d;

    return-object v0

    :catch_0
    move-exception v1

    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error creating the socket: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    iget-object v0, p0, Ln7/b;->f:Ln7/b$d;

    return-object v0
.end method
