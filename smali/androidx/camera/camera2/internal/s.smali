.class public final synthetic Landroidx/camera/camera2/internal/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw/h;

.field public final synthetic o:Lw/q;


# direct methods
.method public synthetic constructor <init>(Lw/h;Lw/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/s;->n:Lw/h;

    iput-object p2, p0, Landroidx/camera/camera2/internal/s;->o:Lw/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->n:Lw/h;

    iget-object v1, p0, Landroidx/camera/camera2/internal/s;->o:Lw/q;

    invoke-static {v0, v1}, Landroidx/camera/camera2/internal/t$a;->d(Lw/h;Lw/q;)V

    return-void
.end method
