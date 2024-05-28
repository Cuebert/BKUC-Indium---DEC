.class Lf7/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf7/b0;->k(Landroid/app/Activity;Lf7/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroid/app/Activity;

.field final synthetic o:Lf7/z;

.field final synthetic p:Lf7/b0;


# direct methods
.method constructor <init>(Lf7/b0;Landroid/app/Activity;Lf7/z;)V
    .locals 0

    iput-object p1, p0, Lf7/b0$a;->p:Lf7/b0;

    iput-object p2, p0, Lf7/b0$a;->n:Landroid/app/Activity;

    iput-object p3, p0, Lf7/b0$a;->o:Lf7/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lf7/b0$a;->n:Landroid/app/Activity;

    check-cast v0, Landroidx/fragment/app/d;

    invoke-virtual {v0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lf7/b0$a;->n:Landroid/app/Activity;

    check-cast v1, Landroidx/fragment/app/d;

    invoke-virtual {v1}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    const-class v2, Lb7/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    const-string v2, "Gaming protocol is trying to send launch request when game is running."

    const-string v3, "GameManager"

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->M0()Z

    move-result v4

    if-nez v4, :cond_0

    .line 4
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object v4

    .line 5
    invoke-virtual {v4, v1}, Landroidx/fragment/app/t;->n(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 6
    invoke-virtual {v4}, Landroidx/fragment/app/t;->h()I

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {v3, v2}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    :goto_0
    iget-object v1, p0, Lf7/b0$a;->p:Lf7/b0;

    invoke-static {v1}, Lf7/b0;->b(Lf7/b0;)Lf7/n;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->M0()Z

    move-result v0

    if-nez v0, :cond_1

    .line 9
    iget-object v0, p0, Lf7/b0$a;->p:Lf7/b0;

    iget-object v1, p0, Lf7/b0$a;->n:Landroid/app/Activity;

    iget-object v2, p0, Lf7/b0$a;->o:Lf7/z;

    invoke-static {v0, v1, v2}, Lf7/b0;->d(Lf7/b0;Landroid/content/Context;Lf7/z;)Lf7/n;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lf7/b0$a;->p:Lf7/b0;

    invoke-static {v1, v0}, Lf7/b0;->c(Lf7/b0;Lf7/n;)Lf7/n;

    .line 11
    iget-object v1, p0, Lf7/b0$a;->n:Landroid/app/Activity;

    check-cast v1, Lf7/n$d;

    invoke-virtual {v0, v1}, Lf7/n;->e0(Lf7/n$d;)V

    .line 12
    invoke-virtual {v0}, Lf7/n;->i0()V

    goto :goto_1

    .line 13
    :cond_1
    invoke-static {v3, v2}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method
