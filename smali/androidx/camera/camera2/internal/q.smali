.class public final synthetic Landroidx/camera/camera2/internal/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw/h;


# direct methods
.method public synthetic constructor <init>(Lw/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/q;->n:Lw/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/q;->n:Lw/h;

    invoke-static {v0}, Landroidx/camera/camera2/internal/t$a;->e(Lw/h;)V

    return-void
.end method
