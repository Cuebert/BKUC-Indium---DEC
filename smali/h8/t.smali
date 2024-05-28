.class public abstract Lh8/t;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lqa/e0;

.field private b:Landroid/content/Context;

.field private c:J


# direct methods
.method public constructor <init>(Landroid/content/Context;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    new-instance v0, Lc9/i$a;

    invoke-direct {v0}, Lc9/i$a;-><init>()V

    iput-object v0, p0, Lh8/t;->a:Lqa/e0;

    .line 3
    iput-object p1, p0, Lh8/t;->b:Landroid/content/Context;

    .line 4
    iput-wide p2, p0, Lh8/t;->c:J

    return-void
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {p1}, Lqa/t;->p(Landroid/content/Context;)Lqa/t;

    move-result-object p1

    invoke-virtual {p1, p2}, Lqa/t;->k(Ljava/lang/String;)Lqa/x;

    move-result-object p1

    iget-object p2, p0, Lh8/t;->a:Lqa/e0;

    .line 3
    invoke-virtual {p1, p2}, Lqa/x;->g(Lqa/e0;)Lqa/x;

    move-result-object p1

    new-instance p2, Lh8/t$a;

    invoke-direct {p2, p0, v0}, Lh8/t$a;-><init>(Lh8/t;Landroid/widget/ImageView;)V

    .line 4
    invoke-virtual {p1, v0, p2}, Lqa/x;->d(Landroid/widget/ImageView;Lqa/e;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object p1

    iget-wide v0, p0, Lh8/t;->c:J

    invoke-virtual {p1, v0, v1}, Lh8/p;->f(J)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2
    iget-wide v0, p0, Lh8/t;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 3
    :try_start_0
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-interface {v0}, Ln9/d;->g()Lr9/l;

    move-result-object v0

    iget-wide v1, p0, Lh8/t;->c:J

    .line 4
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "150x150"

    const-string v3, "Png"

    .line 5
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    invoke-interface {v0, v1, v2, v3, v4}, Lr9/l;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lgc/b;

    move-result-object v0

    .line 7
    invoke-interface {v0}, Lgc/b;->c()Lgc/t;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lgc/t;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 9
    invoke-virtual {v0}, Lgc/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw9/b;

    if-eqz v0, :cond_0

    .line 10
    iget-object v1, v0, Lw9/b;->data:Ljava/util/List;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 11
    iget-object v0, v0, Lw9/b;->data:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw9/a;

    iget-object p1, v0, Lw9/a;->imageUrl:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :cond_0
    :goto_0
    return-object p1
.end method

.method public abstract c(Landroid/graphics/Bitmap;)V
.end method

.method protected d(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v0

    iget-wide v1, p0, Lh8/t;->c:J

    invoke-virtual {v0, v1, v2, p1}, Lh8/p;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lh8/t;->b:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lh8/t;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Lh8/t;->c(Landroid/graphics/Bitmap;)V

    :goto_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lh8/t;->a([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lh8/t;->d(Ljava/lang/String;)V

    return-void
.end method
