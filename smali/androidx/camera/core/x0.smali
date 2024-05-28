.class public final synthetic Landroidx/camera/core/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/e1;

.field public final synthetic b:Landroidx/camera/core/e1$h;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/e1;Landroidx/camera/core/e1$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/x0;->a:Landroidx/camera/core/e1;

    iput-object p2, p0, Landroidx/camera/core/x0;->b:Landroidx/camera/core/e1$h;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/x0;->a:Landroidx/camera/core/e1;

    iget-object v1, p0, Landroidx/camera/core/x0;->b:Landroidx/camera/core/e1$h;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/e1;->N(Landroidx/camera/core/e1;Landroidx/camera/core/e1$h;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
