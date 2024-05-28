.class public final synthetic Landroidx/camera/core/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/core/e1$h;

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/e1$h;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/f1;->n:Landroidx/camera/core/e1$h;

    iput p2, p0, Landroidx/camera/core/f1;->o:I

    iput-object p3, p0, Landroidx/camera/core/f1;->p:Ljava/lang/String;

    iput-object p4, p0, Landroidx/camera/core/f1;->q:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/core/f1;->n:Landroidx/camera/core/e1$h;

    iget v1, p0, Landroidx/camera/core/f1;->o:I

    iget-object v2, p0, Landroidx/camera/core/f1;->p:Ljava/lang/String;

    iget-object v3, p0, Landroidx/camera/core/f1;->q:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/core/e1$h;->a(Landroidx/camera/core/e1$h;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
