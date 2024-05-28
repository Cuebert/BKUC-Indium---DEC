.class public final synthetic Landroidx/camera/core/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/d2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/a2;->a:Landroidx/camera/core/d2;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/a2;->a:Landroidx/camera/core/d2;

    invoke-static {v0, p1}, Landroidx/camera/core/d2;->b(Landroidx/camera/core/d2;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
