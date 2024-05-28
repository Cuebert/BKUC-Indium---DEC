.class final Lc4/b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lc4/a$a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lc4/a$a;)V
    .locals 0

    iput-object p1, p0, Lc4/b;->a:Landroid/content/Context;

    iput-object p2, p0, Lc4/b;->b:Lc4/a$a;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    :try_start_0
    iget-object p1, p0, Lc4/b;->a:Landroid/content/Context;

    .line 2
    invoke-static {p1}, Lc4/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Lw2/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lw2/c; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    iget p1, p1, Lw2/c;->n:I

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 6
    invoke-virtual {p1}, Lw2/d;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method protected final bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lc4/b;->b:Lc4/a$a;

    .line 3
    invoke-interface {p1}, Lc4/a$a;->onProviderInstalled()V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lc4/a;->c()Lcom/google/android/gms/common/b;

    move-result-object v0

    iget-object v1, p0, Lc4/b;->a:Landroid/content/Context;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "pi"

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/common/b;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lc4/b;->b:Lc4/a$a;

    .line 6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v1, p1, v0}, Lc4/a$a;->onProviderInstallFailed(ILandroid/content/Intent;)V

    return-void
.end method
