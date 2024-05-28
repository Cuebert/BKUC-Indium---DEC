.class Landroidx/camera/core/e1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/e1;->n0(Landroidx/camera/core/e1$h;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/concurrent/futures/c$a;

.field final synthetic b:Landroidx/camera/core/e1;


# direct methods
.method constructor <init>(Landroidx/camera/core/e1;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/e1$d;->b:Landroidx/camera/core/e1;

    iput-object p2, p0, Landroidx/camera/core/e1$d;->a:Landroidx/concurrent/futures/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/e1$d;->b:Landroidx/camera/core/e1;

    invoke-virtual {v0}, Landroidx/camera/core/e1;->s0()V

    .line 2
    iget-object v0, p0, Landroidx/camera/core/e1$d;->a:Landroidx/concurrent/futures/c$a;

    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Landroidx/camera/core/e1$d;->b:Landroidx/camera/core/e1;

    invoke-virtual {p1}, Landroidx/camera/core/e1;->s0()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/core/e1$d;->b(Ljava/lang/Void;)V

    return-void
.end method
