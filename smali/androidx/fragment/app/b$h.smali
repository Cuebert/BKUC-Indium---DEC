.class Landroidx/fragment/app/b$h;
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
.field final synthetic n:Landroidx/fragment/app/w;

.field final synthetic o:Landroid/view/View;

.field final synthetic p:Landroid/graphics/Rect;

.field final synthetic q:Landroidx/fragment/app/b;


# direct methods
.method constructor <init>(Landroidx/fragment/app/b;Landroidx/fragment/app/w;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/b$h;->q:Landroidx/fragment/app/b;

    iput-object p2, p0, Landroidx/fragment/app/b$h;->n:Landroidx/fragment/app/w;

    iput-object p3, p0, Landroidx/fragment/app/b$h;->o:Landroid/view/View;

    iput-object p4, p0, Landroidx/fragment/app/b$h;->p:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b$h;->n:Landroidx/fragment/app/w;

    iget-object v1, p0, Landroidx/fragment/app/b$h;->o:Landroid/view/View;

    iget-object v2, p0, Landroidx/fragment/app/b$h;->p:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/w;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
