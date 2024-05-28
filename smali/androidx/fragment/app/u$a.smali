.class Landroidx/fragment/app/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/u;->o(Landroid/view/ViewGroup;Landroidx/fragment/app/u$h;Landroid/view/View;Lh0/a;Landroidx/fragment/app/u$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroidx/fragment/app/u$g;

.field final synthetic o:Landroidx/fragment/app/Fragment;

.field final synthetic p:Landroidx/core/os/b;


# direct methods
.method constructor <init>(Landroidx/fragment/app/u$g;Landroidx/fragment/app/Fragment;Landroidx/core/os/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/u$a;->n:Landroidx/fragment/app/u$g;

    iput-object p2, p0, Landroidx/fragment/app/u$a;->o:Landroidx/fragment/app/Fragment;

    iput-object p3, p0, Landroidx/fragment/app/u$a;->p:Landroidx/core/os/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/u$a;->n:Landroidx/fragment/app/u$g;

    iget-object v1, p0, Landroidx/fragment/app/u$a;->o:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Landroidx/fragment/app/u$a;->p:Landroidx/core/os/b;

    invoke-interface {v0, v1, v2}, Landroidx/fragment/app/u$g;->a(Landroidx/fragment/app/Fragment;Landroidx/core/os/b;)V

    return-void
.end method
