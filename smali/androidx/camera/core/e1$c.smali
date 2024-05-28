.class Landroidx/camera/core/e1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/e1$i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/e1;->W(Ljava/lang/String;Lw/a1;Landroid/util/Size;)Lw/c2$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/p;

.field final synthetic b:Landroidx/camera/core/e1;


# direct methods
.method constructor <init>(Landroidx/camera/core/e1;Lz/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/e1$c;->b:Landroidx/camera/core/e1;

    iput-object p2, p0, Landroidx/camera/core/e1$c;->a:Lz/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/e1$h;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/camera/core/e1$c;->a:Lz/p;

    iget v1, p1, Landroidx/camera/core/e1$h;->b:I

    invoke-virtual {v0, v1}, Lz/p;->h(I)V

    .line 3
    iget-object v0, p0, Landroidx/camera/core/e1$c;->a:Lz/p;

    iget p1, p1, Landroidx/camera/core/e1$h;->a:I

    invoke-virtual {v0, p1}, Lz/p;->i(I)V

    :cond_0
    return-void
.end method
