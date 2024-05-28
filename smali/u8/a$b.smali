.class Lu8/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu8/a;->c(Landroid/app/Activity;ILv6/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg4/f<",
        "Lp2/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lv6/a$b;

.field final synthetic b:I

.field final synthetic c:Lu8/a;


# direct methods
.method constructor <init>(Lu8/a;Lv6/a$b;I)V
    .locals 0

    iput-object p1, p0, Lu8/a$b;->c:Lu8/a;

    iput-object p2, p0, Lu8/a$b;->a:Lv6/a$b;

    iput p3, p0, Lu8/a$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg4/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg4/l<",
            "Lp2/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lg4/l;->o()Z

    move-result v0

    const-string v1, "SmartLockManager"

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "result: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lg4/l;->k()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp2/a;

    invoke-virtual {v2}, Lp2/a;->c()Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Lu8/a$b;->c:Lu8/a;

    invoke-static {v0}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object v0

    const-string v1, "credentialSelectedNoDialog"

    invoke-virtual {v0, v1}, Lv6/b;->c(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lu8/a$b;->a:Lv6/a$b;

    iget-object v1, p0, Lu8/a$b;->c:Lu8/a;

    invoke-virtual {p1}, Lg4/l;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp2/a;

    invoke-virtual {p1}, Lp2/a;->c()Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object p1

    invoke-static {v1, p1}, Lu8/a;->j(Lu8/a;Lcom/google/android/gms/auth/api/credentials/Credential;)Lv6/d;

    move-result-object p1

    invoke-interface {v0, p1}, Lv6/a$b;->a(Lv6/d;)V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p1}, Lg4/l;->j()Ljava/lang/Exception;

    move-result-object p1

    .line 6
    instance-of v0, p1, Lx2/k;

    const-string v2, "dialogNotShown"

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lu8/a$b;->c:Lu8/a;

    iget-object v0, v0, Lu8/a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 8
    move-object v0, p1

    check-cast v0, Lx2/k;

    .line 9
    :try_start_0
    check-cast p1, Lx2/k;

    invoke-virtual {p1}, Lx2/b;->b()I

    move-result p1

    const/4 v3, 0x6

    if-ne p1, v3, :cond_4

    .line 10
    iget-object p1, p0, Lu8/a$b;->c:Lu8/a;

    iget-object p1, p1, Lu8/a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    iget v3, p0, Lu8/a$b;->b:I

    invoke-virtual {v0, p1, v3}, Lx2/k;->c(Landroid/app/Activity;I)V

    .line 11
    iget-object p1, p0, Lu8/a$b;->c:Lu8/a;

    invoke-static {p1}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object p1

    const-string v0, "dialogShown"

    invoke-virtual {p1, v0}, Lv6/b;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to send resolution."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    iget-object v0, p0, Lu8/a$b;->c:Lu8/a;

    invoke-static {v0}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/IntentSender$SendIntentException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lv6/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 14
    :cond_1
    iget-object p1, p0, Lu8/a$b;->c:Lu8/a;

    invoke-static {p1}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object p1

    const-string v0, "nullActivity"

    invoke-virtual {p1, v2, v0}, Lv6/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_2
    instance-of v0, p1, Lx2/b;

    if-eqz v0, :cond_3

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsuccessful credential request."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    check-cast p1, Lx2/b;

    .line 18
    invoke-virtual {p1}, Lx2/b;->b()I

    move-result p1

    .line 19
    iget-object v0, p0, Lu8/a$b;->c:Lu8/a;

    invoke-static {v0}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lv6/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 20
    :cond_3
    iget-object p1, p0, Lu8/a$b;->c:Lu8/a;

    invoke-static {p1}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object p1

    const-string v0, "unknown"

    invoke-virtual {p1, v2, v0}, Lv6/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method
