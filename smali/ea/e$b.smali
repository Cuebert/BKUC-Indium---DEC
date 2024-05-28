.class Lea/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/e;->c(Landroid/app/Activity;Ls0/b;Lea/e$c;Ls0/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ls0/l<",
        "Ls0/c;",
        "Lt0/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lea/e$c;

.field final synthetic b:Lea/e;


# direct methods
.method constructor <init>(Lea/e;Lea/e$c;)V
    .locals 0

    iput-object p1, p0, Lea/e$b;->b:Lea/e;

    iput-object p2, p0, Lea/e$b;->a:Lea/e$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lt0/e;

    invoke-virtual {p0, p1}, Lea/e$b;->b(Lt0/e;)V

    return-void
.end method

.method public b(Lt0/e;)V
    .locals 4

    .line 1
    invoke-static {}, Lea/e;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Error registering credentials "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2
    instance-of v0, p1, Lv0/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    move-object v0, p1

    check-cast v0, Lv0/a;

    invoke-virtual {v0}, Lv0/a;->b()Lu0/e;

    move-result-object v0

    instance-of v0, v0, Lu0/l;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lea/e$b;->a:Lea/e$c;

    const/16 v1, 0xb

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lea/e$b;->a:Lea/e$c;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    instance-of v0, p1, Lt0/c;

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lea/e$b;->a:Lea/e$c;

    const/4 v1, 0x1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    return-void

    .line 8
    :cond_2
    instance-of v0, p1, Lt0/f;

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lea/e$b;->a:Lea/e$c;

    const/4 v1, 0x2

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    return-void

    .line 10
    :cond_3
    invoke-static {}, Lea/e;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected exception type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    iget-object v0, p0, Lea/e$b;->a:Lea/e$c;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lea/e$c;->b(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public c(Ls0/c;)V
    .locals 2

    .line 1
    instance-of v0, p1, Ls0/h;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lea/e$b;->a:Lea/e$c;

    check-cast p1, Ls0/h;

    .line 3
    invoke-virtual {p1}, Ls0/h;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "FIDO2"

    .line 4
    invoke-interface {v0, p1, v1}, Lea/e$c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    instance-of p1, p1, Ls0/f;

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lea/e$b;->a:Lea/e$c;

    const-string v0, ""

    const-string v1, "password"

    invoke-interface {p1, v0, v1}, Lea/e$c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lea/e$b;->a:Lea/e$c;

    const/4 v0, 0x0

    const-string v1, "Unexpected CreateCredentialResponse"

    invoke-interface {p1, v0, v1}, Lea/e$c;->b(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ls0/c;

    invoke-virtual {p0, p1}, Lea/e$b;->c(Ls0/c;)V

    return-void
.end method
