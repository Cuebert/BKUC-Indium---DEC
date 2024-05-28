.class public final synthetic Landroidx/camera/core/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/e1$i$b;


# instance fields
.field public final synthetic a:Landroidx/camera/core/e1;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/v0;->a:Landroidx/camera/core/e1;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/e1$h;)Lcom/google/common/util/concurrent/m;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/v0;->a:Landroidx/camera/core/e1;

    invoke-static {v0, p1}, Landroidx/camera/core/e1;->P(Landroidx/camera/core/e1;Landroidx/camera/core/e1$h;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method
