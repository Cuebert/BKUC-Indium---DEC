.class Landroidx/appcompat/widget/m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic n:Landroidx/appcompat/widget/m;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/m;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/m$b;->n:Landroidx/appcompat/widget/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/m$b;->n:Landroidx/appcompat/widget/m;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/m;->mResolveHoverRunnable:Landroidx/appcompat/widget/m$b;

    .line 2
    invoke-virtual {v0, p0}, Landroid/widget/ListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/m$b;->n:Landroidx/appcompat/widget/m;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/m$b;->n:Landroidx/appcompat/widget/m;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/m;->mResolveHoverRunnable:Landroidx/appcompat/widget/m$b;

    .line 2
    invoke-virtual {v0}, Landroidx/appcompat/widget/m;->drawableStateChanged()V

    return-void
.end method
