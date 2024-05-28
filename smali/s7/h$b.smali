.class Ls7/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls7/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls7/h;->c(Landroid/content/Context;Ls7/h$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ls7/h$d;

.field final synthetic c:Ls7/h;


# direct methods
.method constructor <init>(Ls7/h;Landroid/content/Context;Ls7/h$d;)V
    .locals 0

    iput-object p1, p0, Ls7/h$b;->c:Ls7/h;

    iput-object p2, p0, Ls7/h$b;->a:Landroid/content/Context;

    iput-object p3, p0, Ls7/h$b;->b:Ls7/h$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ls7/f;Ls7/f;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    invoke-virtual {v0}, Lx7/g;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Ls7/h$b;->c:Ls7/h;

    iget-object v0, v0, Ls7/h;->b:Ls7/b;

    invoke-virtual {v0}, Ls7/b;->g()Ls7/b$b;

    move-result-object v0

    sget-object v1, Ls7/b$b;->o:Ls7/b$b;

    if-ne v0, v1, :cond_1

    :goto_0
    move-object p1, p2

    .line 3
    :cond_1
    iget-object p2, p0, Ls7/h$b;->c:Ls7/h;

    iget-object p2, p2, Ls7/h;->b:Ls7/b;

    iget-object v0, p0, Ls7/h$b;->a:Landroid/content/Context;

    invoke-virtual {p2, v0, p3}, Ls7/b;->t(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    iget-object p2, p0, Ls7/h$b;->b:Ls7/h$d;

    iget-object p3, p0, Ls7/h$b;->c:Ls7/h;

    iget-object p3, p3, Ls7/h;->b:Ls7/b;

    iget-object v0, p0, Ls7/h$b;->a:Landroid/content/Context;

    invoke-virtual {p3, p1, v0}, Ls7/b;->n(Ls7/f;Landroid/content/Context;)Z

    move-result p1

    invoke-interface {p2, p1}, Ls7/h$d;->a(Z)V

    return-void
.end method
