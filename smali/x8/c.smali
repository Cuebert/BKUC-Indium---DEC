.class public Lx8/c;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lx8/d;",
        ">;"
    }
.end annotation


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:I

.field protected c:Ljava/lang/String;

.field d:Lx8/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Lx8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    iput-object p4, p0, Lx8/c;->d:Lx8/a;

    .line 3
    iput-object p1, p0, Lx8/c;->a:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lx8/c;->c:Ljava/lang/String;

    .line 5
    iput p2, p0, Lx8/c;->b:I

    if-nez p3, :cond_0

    const-string p1, ""

    .line 6
    iput-object p1, p0, Lx8/c;->c:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private static c(Ln7/b$d;Ljava/lang/String;)Lx8/d;
    .locals 4

    .line 1
    new-instance v0, Lx8/d;

    iget-object v1, p0, Ln7/b$d;->a:Ljava/lang/String;

    iget v2, p0, Ln7/b$d;->b:I

    invoke-direct {v0, v1, v2}, Lx8/d;-><init>(Ljava/lang/String;I)V

    .line 2
    invoke-virtual {v0, p1}, Lx8/d;->a(Ljava/lang/String;)V

    .line 3
    iget-object p0, p0, Ln7/b$d;->c:Ljava/net/Socket;

    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Ljava/io/PrintWriter;

    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;Z)V

    .line 5
    invoke-virtual {v2}, Ljava/io/PrintWriter;->checkError()Z

    move-result p0

    if-nez p0, :cond_0

    .line 6
    invoke-virtual {v2, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2}, Ljava/io/PrintWriter;->flush()V

    const-string p0, ""

    .line 8
    invoke-virtual {v0, p0}, Lx8/d;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0, v1}, Lx8/d;->b(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error sending influx data over TCP = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "RbxTcpRequest"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    invoke-virtual {v0, v1}, Lx8/d;->b(Z)V

    :goto_0
    return-object v0
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lx8/d;
    .locals 4

    const-string p1, "RbxTcpRequest"

    .line 1
    invoke-static {}, Ln7/b;->d()Ln7/b;

    move-result-object v0

    invoke-virtual {v0}, Ln7/b;->g()Ln7/b$d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v1, v0, Ln7/b$d;->c:Ljava/net/Socket;

    if-nez v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v1, p0, Lx8/c;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lx8/c;->c(Ln7/b$d;Ljava/lang/String;)Lx8/d;

    move-result-object v1

    .line 4
    iget v2, v0, Ln7/b$d;->d:I

    if-nez v2, :cond_1

    :try_start_0
    const-string v2, "doInBackground: timeToLive is 0. Close socket immediately..."

    .line 5
    invoke-static {p1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object v0, v0, Ln7/b$d;->c:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error closing the socket: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-object v1

    .line 8
    :cond_2
    :goto_1
    new-instance p1, Lx8/d;

    iget-object v0, p0, Lx8/c;->a:Ljava/lang/String;

    iget v1, p0, Lx8/c;->b:I

    invoke-direct {p1, v0, v1}, Lx8/d;-><init>(Ljava/lang/String;I)V

    .line 9
    iget-object v0, p0, Lx8/c;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lx8/d;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Lx8/d;->b(Z)V

    return-object p1
.end method

.method protected b(Lx8/d;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lx8/d;

    iget-object v0, p0, Lx8/c;->a:Ljava/lang/String;

    iget v1, p0, Lx8/c;->b:I

    invoke-direct {p1, v0, v1}, Lx8/d;-><init>(Ljava/lang/String;I)V

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Lx8/d;->b(Z)V

    .line 4
    :cond_0
    iget-object v0, p0, Lx8/c;->d:Lx8/a;

    if-eqz v0, :cond_1

    .line 5
    invoke-interface {v0, p1}, Lx8/a;->a(Lx8/d;)V

    :cond_1
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lx8/c;->a([Ljava/lang/Void;)Lx8/d;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lx8/d;

    invoke-virtual {p0, p1}, Lx8/c;->b(Lx8/d;)V

    return-void
.end method
