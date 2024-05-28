.class Lcom/roblox/client/i$b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "[",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Lcom/roblox/client/i;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/i$b;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/roblox/client/i$b;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    return-void
.end method


# virtual methods
.method protected varargs a([[Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 3
    new-instance p1, Ljava/io/File;

    iget-object v4, p0, Lcom/roblox/client/i$b;->b:Ljava/lang/String;

    invoke-direct {p1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_9

    .line 5
    :try_start_0
    new-instance v4, Ljava/util/zip/ZipFile;

    invoke-direct {v4, p1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9

    .line 6
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object p1

    const v6, 0x8000

    new-array v6, v6, [B

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v7

    const-string v8, "CrashLibFileHelper"

    if-eqz v7, :cond_7

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_7

    .line 8
    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/zip/ZipEntry;

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 10
    :cond_1
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    .line 11
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 12
    invoke-virtual {v7}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 13
    new-instance v11, Ljava/io/File;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, p0, Lcom/roblox/client/i$b;->a:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "/"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v11, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 15
    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    .line 16
    :cond_2
    :try_start_1
    new-instance v10, Ljava/io/FileOutputStream;

    invoke-direct {v10, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    :try_start_2
    invoke-virtual {v4, v7}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v11
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    :goto_2
    :try_start_3
    invoke-virtual {v11, v6}, Ljava/io/InputStream;->read([B)I

    move-result v12

    if-lez v12, :cond_3

    .line 19
    invoke-virtual {v10, v6, v1, v12}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    .line 20
    :cond_3
    :try_start_4
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_3

    :catch_0
    move-exception v10

    .line 21
    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    :goto_3
    :try_start_5
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_4

    :catch_1
    move-exception v10

    .line 23
    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :catch_2
    move-exception v7

    goto :goto_6

    :catchall_0
    move-exception p1

    move-object v11, v5

    :goto_5
    move-object v5, v10

    goto :goto_8

    :catch_3
    move-exception v7

    move-object v11, v5

    goto :goto_6

    :catchall_1
    move-exception p1

    move-object v11, v5

    goto :goto_8

    :catch_4
    move-exception v7

    move-object v10, v5

    move-object v11, v10

    .line 25
    :goto_6
    :try_start_6
    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v8, v7}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    iget-object v7, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    sget-object v9, Lcom/roblox/client/j;->q:Lcom/roblox/client/j;

    invoke-static {v7, v9}, Lcom/roblox/client/i;->b(Lcom/roblox/client/i;Lcom/roblox/client/j;)Lcom/roblox/client/j;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v10, :cond_4

    .line 27
    :try_start_7
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_7

    :catch_5
    move-exception v7

    .line 28
    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v8, v7}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_7
    if-eqz v11, :cond_0

    .line 29
    :try_start_8
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    goto/16 :goto_0

    :catch_6
    move-exception v7

    .line 30
    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v8, v7}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :catchall_2
    move-exception p1

    goto :goto_5

    :goto_8
    if-eqz v5, :cond_5

    .line 31
    :try_start_9
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7

    goto :goto_9

    :catch_7
    move-exception v0

    .line 32
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_9
    if-eqz v11, :cond_6

    .line 33
    :try_start_a
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    goto :goto_a

    :catch_8
    move-exception v0

    .line 34
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    :cond_6
    :goto_a
    throw p1

    .line 36
    :cond_7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 37
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Copy duration : "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v8, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    iget-object p1, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    invoke-static {p1}, Lcom/roblox/client/i;->c(Lcom/roblox/client/i;)V

    .line 39
    iget-object p1, p0, Lcom/roblox/client/i$b;->a:Ljava/lang/String;

    return-object p1

    .line 40
    :cond_8
    iget-object p1, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    sget-object v0, Lcom/roblox/client/j;->r:Lcom/roblox/client/j;

    invoke-static {p1, v0}, Lcom/roblox/client/i;->b(Lcom/roblox/client/i;Lcom/roblox/client/j;)Lcom/roblox/client/j;

    return-object v5

    .line 41
    :catch_9
    iget-object p1, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    sget-object v0, Lcom/roblox/client/j;->p:Lcom/roblox/client/j;

    invoke-static {p1, v0}, Lcom/roblox/client/i;->b(Lcom/roblox/client/i;Lcom/roblox/client/j;)Lcom/roblox/client/j;

    return-object v5

    .line 42
    :cond_9
    iget-object p1, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    sget-object v0, Lcom/roblox/client/j;->o:Lcom/roblox/client/j;

    invoke-static {p1, v0}, Lcom/roblox/client/i;->b(Lcom/roblox/client/i;Lcom/roblox/client/j;)Lcom/roblox/client/j;

    return-object v5
.end method

.method protected b(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    invoke-static {v0, p1}, Lcom/roblox/client/i;->d(Lcom/roblox/client/i;Ljava/lang/String;)V

    .line 2
    const-class v0, Lcom/roblox/client/i;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    invoke-static {v1}, Lcom/roblox/client/i;->e(Lcom/roblox/client/i;)Lcom/roblox/client/i$c;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    invoke-static {v1}, Lcom/roblox/client/i;->e(Lcom/roblox/client/i;)Lcom/roblox/client/i$c;

    move-result-object v1

    iget-object v2, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    invoke-static {v2}, Lcom/roblox/client/i;->a(Lcom/roblox/client/i;)Lcom/roblox/client/j;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Lcom/roblox/client/i$c;->a(Ljava/lang/String;Lcom/roblox/client/j;)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/i$b;->c:Lcom/roblox/client/i;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/roblox/client/i;->f(Lcom/roblox/client/i;Lcom/roblox/client/i$c;)Lcom/roblox/client/i$c;

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [[Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/roblox/client/i$b;->a([[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/roblox/client/i$b;->b(Ljava/lang/String;)V

    return-void
.end method
