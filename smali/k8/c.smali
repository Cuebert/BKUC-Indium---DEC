.class public abstract Lk8/c;
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

.field private d:Ll8/b;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;JLl8/b;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    new-instance v0, Lc9/i$a;

    invoke-direct {v0}, Lc9/i$a;-><init>()V

    iput-object v0, p0, Lk8/c;->a:Lqa/e0;

    .line 3
    iput-object p1, p0, Lk8/c;->b:Landroid/content/Context;

    .line 4
    iput-wide p2, p0, Lk8/c;->c:J

    .line 5
    iput-object p4, p0, Lk8/c;->d:Ll8/b;

    .line 6
    iput-object p5, p0, Lk8/c;->e:Ljava/lang/String;

    return-void
.end method

.method private a(JLjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh8/p;->f(J)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-lez v3, :cond_2

    .line 2
    :try_start_0
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v1

    invoke-interface {v1}, Ln9/d;->g()Lr9/l;

    move-result-object v1

    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    const-string p2, "150x150"

    const-string v2, "Png"

    .line 4
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    invoke-interface {v1, p1, p2, v2, v3}, Lr9/l;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lgc/b;

    move-result-object p1

    .line 6
    invoke-interface {p1}, Lgc/b;->c()Lgc/t;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lgc/t;->f()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 8
    invoke-virtual {p1}, Lgc/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw9/b;

    if-eqz p1, :cond_1

    .line 9
    iget-object p2, p1, Lw9/b;->data:Ljava/util/List;

    if-eqz p2, :cond_1

    .line 10
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_1

    iget-object p2, p1, Lw9/b;->data:Ljava/util/List;

    const/4 p3, 0x0

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 11
    iget-object p1, p1, Lw9/b;->data:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw9/a;

    iget-object p1, p1, Lw9/a;->imageUrl:Ljava/lang/String;

    move-object p3, p1

    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p3}, Lf3/m;->a(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object p3, v0

    :goto_0
    move-object v0, p3

    goto :goto_1

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    :cond_2
    :goto_1
    return-object v0
.end method

.method private c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lk8/c$a;

    invoke-direct {v0, p0}, Lk8/c$a;-><init>(Lk8/c;)V

    .line 2
    invoke-static {p1}, Lqa/t;->p(Landroid/content/Context;)Lqa/t;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p2}, Lqa/t;->k(Ljava/lang/String;)Lqa/x;

    move-result-object p1

    iget-object p2, p0, Lk8/c;->a:Lqa/e0;

    .line 4
    invoke-virtual {p1, p2}, Lqa/x;->g(Lqa/e0;)Lqa/x;

    move-result-object p1

    .line 5
    invoke-virtual {p1, v0}, Lqa/x;->e(Lqa/c0;)V

    return-void
.end method


# virtual methods
.method protected varargs b([Ljava/lang/Void;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object p1, p0, Lk8/c;->d:Ll8/b;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    :try_start_0
    sget-object v1, Lk8/c$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    .line 3
    iget-object p1, p0, Lk8/c;->e:Ljava/lang/String;

    :goto_0
    move-object v0, p1

    goto :goto_1

    .line 4
    :cond_1
    iget-wide v1, p0, Lk8/c;->c:J

    iget-object p1, p0, Lk8/c;->e:Ljava/lang/String;

    invoke-direct {p0, v1, v2, p1}, Lk8/c;->a(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "failed to retrieve thumbnail. Exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc9/k;->b(Ljava/lang/String;)I

    :goto_1
    return-object v0
.end method

.method public abstract d(Landroid/graphics/Bitmap;)V
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lk8/c;->b([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected e(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lk8/c;->b:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lk8/c;->c(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lk8/c;->d(Landroid/graphics/Bitmap;)V

    :goto_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lk8/c;->e(Ljava/lang/String;)V

    return-void
.end method
