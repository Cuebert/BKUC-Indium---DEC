.class public final synthetic Landroidx/camera/core/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/core/x2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/x2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/u2;->n:Landroidx/camera/core/x2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/u2;->n:Landroidx/camera/core/x2;

    invoke-static {v0}, Landroidx/camera/core/x2;->e(Landroidx/camera/core/x2;)V

    return-void
.end method
