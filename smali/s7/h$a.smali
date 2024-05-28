.class Ls7/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls7/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls7/h;->b(Landroid/content/Context;ZLs7/h$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Ls7/h$c;

.field final synthetic d:Ls7/h;


# direct methods
.method constructor <init>(Ls7/h;ZLandroid/content/Context;Ls7/h$c;)V
    .locals 0

    iput-object p1, p0, Ls7/h$a;->d:Ls7/h;

    iput-boolean p2, p0, Ls7/h$a;->a:Z

    iput-object p3, p0, Ls7/h$a;->b:Landroid/content/Context;

    iput-object p4, p0, Ls7/h$a;->c:Ls7/h$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ls7/f;Ls7/f;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ls7/h$a;->a:Z

    if-nez v0, :cond_1

    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    invoke-virtual {v0}, Lx7/g;->i()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "persisting loginSignUpLocale locale: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.locale"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Ls7/h$a;->d:Ls7/h;

    iget-object v0, v0, Ls7/h;->b:Ls7/b;

    iget-object v1, p0, Ls7/h$a;->b:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Ls7/b;->o(Ls7/f;Landroid/content/Context;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Ls7/h$a;->d:Ls7/h;

    iget-object p1, p1, Ls7/h;->b:Ls7/b;

    iget-object v0, p0, Ls7/h$a;->b:Landroid/content/Context;

    invoke-virtual {p1, v0}, Ls7/b;->d(Landroid/content/Context;)Ls7/f;

    move-result-object p1

    .line 5
    :goto_0
    iget-object v0, p0, Ls7/h$a;->d:Ls7/h;

    iget-object v0, v0, Ls7/h;->b:Ls7/b;

    sget-object v1, Ls7/b$b;->n:Ls7/b$b;

    invoke-virtual {v0, v1}, Ls7/b;->s(Ls7/b$b;)V

    goto :goto_1

    .line 6
    :cond_1
    iget-object p1, p0, Ls7/h$a;->d:Ls7/h;

    iget-object p1, p1, Ls7/h;->b:Ls7/b;

    sget-object v0, Ls7/b$b;->o:Ls7/b$b;

    invoke-virtual {p1, v0}, Ls7/b;->s(Ls7/b$b;)V

    move-object p1, p2

    .line 7
    :goto_1
    iget-object v0, p0, Ls7/h$a;->d:Ls7/h;

    iget-object v0, v0, Ls7/h;->b:Ls7/b;

    iget-object v1, p0, Ls7/h$a;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, p3}, Ls7/b;->t(Landroid/content/Context;Ljava/lang/String;)V

    .line 8
    iget-object p3, p0, Ls7/h$a;->d:Ls7/h;

    iget-object p3, p3, Ls7/h;->b:Ls7/b;

    invoke-virtual {p3, p2}, Ls7/b;->r(Ls7/f;)V

    .line 9
    iget-object p2, p0, Ls7/h$a;->d:Ls7/h;

    iget-object p2, p2, Ls7/h;->b:Ls7/b;

    iget-object p3, p0, Ls7/h$a;->b:Landroid/content/Context;

    invoke-virtual {p2, p1, p3}, Ls7/b;->n(Ls7/f;Landroid/content/Context;)Z

    move-result p1

    .line 10
    iget-object p2, p0, Ls7/h$a;->c:Ls7/h$c;

    invoke-interface {p2, p1}, Ls7/h$c;->a(Z)V

    return-void
.end method
