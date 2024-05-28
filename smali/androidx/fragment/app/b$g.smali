.class Landroidx/fragment/app/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/b;->x(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/z$e;Landroidx/fragment/app/z$e;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroidx/fragment/app/z$e;

.field final synthetic o:Landroidx/fragment/app/z$e;

.field final synthetic p:Z

.field final synthetic q:Lh0/a;

.field final synthetic r:Landroidx/fragment/app/b;


# direct methods
.method constructor <init>(Landroidx/fragment/app/b;Landroidx/fragment/app/z$e;Landroidx/fragment/app/z$e;ZLh0/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/b$g;->r:Landroidx/fragment/app/b;

    iput-object p2, p0, Landroidx/fragment/app/b$g;->n:Landroidx/fragment/app/z$e;

    iput-object p3, p0, Landroidx/fragment/app/b$g;->o:Landroidx/fragment/app/z$e;

    iput-boolean p4, p0, Landroidx/fragment/app/b$g;->p:Z

    iput-object p5, p0, Landroidx/fragment/app/b$g;->q:Lh0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b$g;->n:Landroidx/fragment/app/z$e;

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/b$g;->o:Landroidx/fragment/app/z$e;

    invoke-virtual {v1}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/fragment/app/b$g;->p:Z

    iget-object v3, p0, Landroidx/fragment/app/b$g;->q:Lh0/a;

    const/4 v4, 0x0

    .line 3
    invoke-static {v0, v1, v2, v3, v4}, Landroidx/fragment/app/u;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLh0/a;Z)V

    return-void
.end method
