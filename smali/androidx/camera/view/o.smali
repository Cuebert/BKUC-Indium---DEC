.class public final synthetic Landroidx/camera/view/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroidx/camera/view/q;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/o;->n:Landroidx/camera/view/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/o;->n:Landroidx/camera/view/q;

    invoke-virtual {v0}, Landroidx/camera/view/q;->o()V

    return-void
.end method
