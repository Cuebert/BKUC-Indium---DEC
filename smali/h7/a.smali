.class public abstract Lh7/a;
.super Landroid/os/AsyncTask;
.source "SourceFile"

# interfaces
.implements Lh7/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lh7/j;",
        ">;",
        "Lh7/e;"
    }
.end annotation


# instance fields
.field protected a:Lh7/j;

.field protected b:Ljava/lang/String;

.field protected c:[Lh7/b$a;

.field protected d:Lh7/l;

.field protected e:Ljava/lang/String;

.field protected f:Ljava/lang/String;

.field protected g:Lj7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj7/d<",
            "Lh7/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lh7/l;[Lh7/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    iput-object p2, p0, Lh7/a;->d:Lh7/l;

    .line 3
    iput-object p1, p0, Lh7/a;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lh7/a;->c:[Lh7/b$a;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lh7/a;->e:Ljava/lang/String;

    .line 6
    iput-object p1, p0, Lh7/a;->f:Ljava/lang/String;

    .line 7
    new-instance p1, Lj7/c;

    invoke-direct {p1}, Lj7/c;-><init>()V

    invoke-virtual {p0, p1}, Lh7/a;->g(Lj7/d;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lh7/j;
    .locals 3

    .line 1
    iget-object p1, p0, Lh7/a;->b:Ljava/lang/String;

    iget-object v0, p0, Lh7/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lh7/a;->c:[Lh7/b$a;

    iget-object v2, p0, Lh7/a;->f:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lh7/b;->j(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;

    move-result-object p1

    iput-object p1, p0, Lh7/a;->a:Lh7/j;

    .line 2
    :cond_0
    iget-object p1, p0, Lh7/a;->g:Lj7/d;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lh7/a;->a:Lh7/j;

    invoke-interface {p1, v0}, Lj7/d;->d(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lh7/a;->g:Lj7/d;

    invoke-interface {p1}, Lj7/d;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3
    iget-object p1, p0, Lh7/a;->g:Lj7/d;

    invoke-interface {p1}, Lj7/d;->c()I

    move-result p1

    if-lez p1, :cond_1

    .line 4
    :try_start_0
    iget-object p1, p0, Lh7/a;->g:Lj7/d;

    invoke-interface {p1}, Lj7/d;->c()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread sleep error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.httprequest"

    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    :cond_1
    :goto_0
    iget-object p1, p0, Lh7/a;->b:Ljava/lang/String;

    iget-object v0, p0, Lh7/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lh7/a;->c:[Lh7/b$a;

    iget-object v2, p0, Lh7/a;->f:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lh7/b;->j(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;

    move-result-object p1

    iput-object p1, p0, Lh7/a;->a:Lh7/j;

    .line 7
    iget-object p1, p0, Lh7/a;->g:Lj7/d;

    invoke-interface {p1}, Lj7/d;->a()V

    .line 8
    invoke-virtual {p0}, Lh7/a;->f()V

    .line 9
    invoke-virtual {p0}, Lh7/a;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 10
    :cond_2
    iget-object p1, p0, Lh7/a;->a:Lh7/j;

    return-object p1
.end method

.method public b()Z
    .locals 1

    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public c()V
    .locals 2

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p0, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method protected d(Lh7/j;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lh7/a;->d:Lh7/l;

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lh7/a;->a:Lh7/j;

    invoke-interface {p1, v0}, Lh7/l;->b(Lh7/j;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lh7/a;->a([Ljava/lang/Void;)Lh7/j;

    move-result-object p1

    return-object p1
.end method

.method protected varargs e([Ljava/lang/Void;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lh7/a;->d:Lh7/l;

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lh7/a;->a:Lh7/j;

    invoke-interface {p1, v0}, Lh7/l;->a(Lh7/j;)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method

.method public g(Lj7/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj7/d<",
            "Lh7/j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lh7/a;->g:Lj7/d;

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lh7/j;

    invoke-virtual {p0, p1}, Lh7/a;->d(Lh7/j;)V

    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lh7/a;->e([Ljava/lang/Void;)V

    return-void
.end method
