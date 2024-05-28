.class Ln7/b$b$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln7/b$b;->b(Lw6/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lw6/a;

.field final synthetic b:Ln7/b$b;


# direct methods
.method constructor <init>(Ln7/b$b;Lw6/a;)V
    .locals 0

    iput-object p1, p0, Ln7/b$b$a;->b:Ln7/b$b;

    iput-object p2, p0, Ln7/b$b$a;->a:Lw6/a;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    .line 1
    iget-object p1, p0, Ln7/b$b$a;->b:Ln7/b$b;

    iget-object p1, p1, Ln7/b$b;->a:Ln7/b;

    invoke-static {p1}, Ln7/b;->e(Ln7/b;)Ln7/b$d;

    move-result-object p1

    iget-object p1, p1, Ln7/b$d;->c:Ljava/net/Socket;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Close-connection-item] Error closing socket: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "InfluxV2Queue"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    :goto_0
    iget-object p1, p0, Ln7/b$b$a;->b:Ln7/b$b;

    iget-object p1, p1, Ln7/b$b;->a:Ln7/b;

    invoke-static {p1}, Ln7/b;->e(Ln7/b;)Ln7/b$d;

    move-result-object p1

    iput-object v0, p1, Ln7/b$d;->c:Ljava/net/Socket;

    .line 5
    :cond_0
    iget-object p1, p0, Ln7/b$b$a;->b:Ln7/b$b;

    iget-object p1, p1, Ln7/b$b;->a:Ln7/b;

    invoke-static {p1, v0}, Ln7/b;->f(Ln7/b;Ln7/b$d;)Ln7/b$d;

    return-object v0
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ln7/b$b$a;->a:Lw6/a;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lw6/a;->a()V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Ln7/b$b$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Ln7/b$b$a;->b(Ljava/lang/Void;)V

    return-void
.end method
