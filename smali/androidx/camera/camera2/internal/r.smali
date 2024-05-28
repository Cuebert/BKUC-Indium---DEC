.class public final synthetic Landroidx/camera/camera2/internal/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw/h;

.field public final synthetic o:Lw/j;


# direct methods
.method public synthetic constructor <init>(Lw/h;Lw/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/r;->n:Lw/h;

    iput-object p2, p0, Landroidx/camera/camera2/internal/r;->o:Lw/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/r;->n:Lw/h;

    iget-object v1, p0, Landroidx/camera/camera2/internal/r;->o:Lw/j;

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/t$a;->f(Lw/h;Lw/j;)V

    return-void
.end method
