.class Lu8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu8/a;->f(Landroid/app/Activity;ILv6/d;Lv6/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg4/f<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lv6/a$a;

.field final synthetic b:I

.field final synthetic c:Lu8/a;


# direct methods
.method constructor <init>(Lu8/a;Lv6/a$a;I)V
    .locals 0

    iput-object p1, p0, Lu8/a$a;->c:Lu8/a;

    iput-object p2, p0, Lu8/a$a;->a:Lv6/a$a;

    iput p3, p0, Lu8/a$a;->b:I

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
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCompleted: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lg4/l;->j()Ljava/lang/Exception;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SmartLockManager"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p1}, Lg4/l;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "SAVE: OK"

    .line 3
    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lu8/a$a;->c:Lu8/a;

    invoke-static {p1}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object p1

    const-string v0, "credentialSavedNoDialog"

    invoke-virtual {p1, v0}, Lv6/b;->a(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lu8/a$a;->a:Lv6/a$a;

    invoke-interface {p1}, Lv6/a$a;->c()V

    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Lg4/l;->j()Ljava/lang/Exception;

    move-result-object p1

    .line 7
    instance-of v0, p1, Lx2/k;

    const-string v2, "dialogNotShown"

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lu8/a$a;->c:Lu8/a;

    iget-object v0, v0, Lu8/a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    check-cast p1, Lx2/k;

    .line 10
    :try_start_0
    iget-object v0, p0, Lu8/a$a;->c:Lu8/a;

    iget-object v0, v0, Lu8/a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    iget v3, p0, Lu8/a$a;->b:I

    invoke-virtual {p1, v0, v3}, Lx2/k;->c(Landroid/app/Activity;I)V

    .line 11
    iget-object p1, p0, Lu8/a$a;->a:Lv6/a$a;

    invoke-interface {p1}, Lv6/a$a;->b()V

    .line 12
    iget-object p1, p0, Lu8/a$a;->c:Lu8/a;

    invoke-static {p1}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object p1

    const-string v0, "dialogShown"

    invoke-virtual {p1, v0}, Lv6/b;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to send resolution. "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/IntentSender$SendIntentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    iget-object v0, p0, Lu8/a$a;->c:Lu8/a;

    invoke-static {v0}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/IntentSender$SendIntentException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lv6/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lu8/a$a;->a:Lv6/a$a;

    invoke-interface {p1}, Lv6/a$a;->a()V

    goto :goto_1

    .line 16
    :cond_1
    iget-object p1, p0, Lu8/a$a;->c:Lu8/a;

    invoke-static {p1}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object p1

    const-string v0, "nullActivity"

    invoke-virtual {p1, v2, v0}, Lv6/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lu8/a$a;->a:Lv6/a$a;

    invoke-interface {p1}, Lv6/a$a;->a()V

    goto :goto_1

    .line 18
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Task exception. "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    iget-object p1, p0, Lu8/a$a;->c:Lu8/a;

    invoke-static {p1}, Lu8/a;->i(Lu8/a;)Lv6/b;

    move-result-object p1

    const-string v0, "noResolution"

    invoke-virtual {p1, v2, v0}, Lv6/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object p1, p0, Lu8/a$a;->a:Lv6/a$a;

    invoke-interface {p1}, Lv6/a$a;->a()V

    :goto_1
    return-void
.end method
