.class public final synthetic Landroidx/camera/camera2/internal/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw/r0;


# direct methods
.method public synthetic constructor <init>(Lw/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/e2;->n:Lw/r0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/e2;->n:Lw/r0;

    invoke-static {v0}, Landroidx/camera/camera2/internal/h2;->j(Lw/r0;)V

    return-void
.end method
